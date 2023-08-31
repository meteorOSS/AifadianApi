package com.meteor.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Orders {
    @JsonProperty("list")
    private List<Order> orderList;
    @JsonProperty("total_count")
    private int totalCount;
    @JsonProperty("total_page")
    private int totalPage;
    @JsonProperty
    private Object requst;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Object getRequst() {
        return requst;
    }

    public void setRequst(Object requst) {
        this.requst = requst;
    }
}
