package com.meteor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.meteor.data.AfdOrderReq;
import com.meteor.data.Order;
import com.meteor.data.Orders;
import com.meteor.request.AfadianRequest;
import com.meteor.request.AfadianResponseData;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AifadianApi {
    private String user_id;
    private String token;

    private OkHttpClient okHttpClient;
    public AifadianApi(String user_id,String token){
        this.user_id = user_id;
        this.token = token;
        this.okHttpClient = new OkHttpClient();
    }



    private String response(String json,String url){
        RequestBody requestBody=RequestBody.create(json, MediaType.parse("application/json; charset=utf-8"));;
        Request request = new Request.Builder().post(requestBody)
                .url(url).build();
        Call call = okHttpClient.newCall(request);
        Response execute = null;
        try {
            execute = call.execute();
            String data = execute.body().string();
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Order> queryOrders(int page){
        return queryOrders(page,null);
    }

    private List<Order> queryOrders(int page,String tradeNo){
        List<Order> orderList = new ArrayList<>();
        AfadianRequest afdRequest =
                new AfadianRequest();
        AfdOrderReq afdOrderReq = new AfdOrderReq(page);
        if(tradeNo!=null) afdOrderReq.setOut_trade_no(tradeNo);
        afdRequest.setUser_id(this.user_id);
        afdRequest.setToken(this.token);
        afdRequest.setParam(afdOrderReq);
        try {
            String json = AfadianRequest.mapper.writeValueAsString(afdRequest.init());
            String res = response(json, Order.ORDER_URL);
            AfadianResponseData afadianResponseData = AfadianRequest.mapper.readValue(res, AfadianResponseData.class);
            System.out.println(afadianResponseData.getData());
            if(afadianResponseData.getEc()==200){
                Orders orders = AfadianRequest.mapper
                        .convertValue(afadianResponseData.getData(),
                                Orders.class);
                if(!orders.getOrderList().isEmpty()){
                    orderList = orders.getOrderList();
                }
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return orderList;
    }

    public Order queryOrder(String tradeNo){
        List<Order> orders = queryOrders(1, tradeNo);
        return orders.isEmpty()?null:orders.get(0);
    }
}
