package com.meteor.data;

import com.fasterxml.jackson.annotation.JsonInclude;

public class AfdOrderReq {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer page;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String out_trade_no;

    public AfdOrderReq(Integer page) {
        this.page = page;
    }

    public AfdOrderReq(Integer page, String out_trade_no) {
        this.page = page;
        this.out_trade_no = out_trade_no;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public Integer getPage() {
        return page;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }
}