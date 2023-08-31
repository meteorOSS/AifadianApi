package com.meteor.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {


    public static final String ORDER_URL = "https://afdian.net/api/open/query-order";

    @JsonProperty("out_trade_no")
    private String outTradeNo;
    
    @JsonProperty("custom_order_id")
    private String customOrderId;
    
    @JsonProperty("user_id")
    private String userId;
    
    @JsonProperty("user_private_id")
    private String userPrivateId;
    
    @JsonProperty("plan_id")
    private String planId;
    
    private int month;
    @JsonProperty("plan_title")
    private String planTitle;
    
    @JsonProperty("total_amount")
    private String totalAmount;
    
    @JsonProperty("show_amount")
    private String showAmount;
    
    private int status;
    private String remark;
    
    @JsonProperty("redeem_id")
    private String redeemId;
    
    @JsonProperty("product_type")
    private int productType;
    private String discount;
    
    @JsonProperty("sku_detail")
    private List<SkuDetail> skuDetail;
    
    @JsonProperty("address_person")
    private String addressPerson;
    
    @JsonProperty("address_phone")
    private String addressPhone;
    
    @JsonProperty("address_address")
    private String addressAddress;
    
    // Getters and Setters
    
    public String getOutTradeNo() {
        return outTradeNo;
    }
    
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
    
    public String getCustomOrderId() {
        return customOrderId;
    }
    
    public void setCustomOrderId(String customOrderId) {
        this.customOrderId = customOrderId;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getUserPrivateId() {
        return userPrivateId;
    }
    
    public void setUserPrivateId(String userPrivateId) {
        this.userPrivateId = userPrivateId;
    }
    
    public String getPlanId() {
        return planId;
    }
    
    public void setPlanId(String planId) {
        this.planId = planId;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public String getTotalAmount() {
        return totalAmount;
    }
    
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPlanTitle() {
        return planTitle;
    }

    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
    }

    public String getShowAmount() {
        return showAmount;
    }
    
    public void setShowAmount(String showAmount) {
        this.showAmount = showAmount;
    }
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getRemark() {
        return remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getRedeemId() {
        return redeemId;
    }
    
    public void setRedeemId(String redeemId) {
        this.redeemId = redeemId;
    }
    
    public int getProductType() {
        return productType;
    }
    
    public void setProductType(int productType) {
        this.productType = productType;
    }
    
    public String getDiscount() {
        return discount;
    }
    
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    
    public List<SkuDetail> getSkuDetail() {
        return skuDetail;
    }
    
    public void setSkuDetail(List<SkuDetail> skuDetail) {
        this.skuDetail = skuDetail;
    }
    
    public String getAddressPerson() {
        return addressPerson;
    }
    
    public void setAddressPerson(String addressPerson) {
        this.addressPerson = addressPerson;
    }
    
    public String getAddressPhone() {
        return addressPhone;
    }
    
    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }
    
    public String getAddressAddress() {
        return addressAddress;
    }
    
    public void setAddressAddress(String addressAddress) {
        this.addressAddress = addressAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "outTradeNo='" + outTradeNo + '\'' +
                ", customOrderId='" + customOrderId + '\'' +
                ", userId='" + userId + '\'' +
                ", userPrivateId='" + userPrivateId + '\'' +
                ", planId='" + planId + '\'' +
                ", month=" + month +
                ", totalAmount='" + totalAmount + '\'' +
                ", showAmount='" + showAmount + '\'' +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", redeemId='" + redeemId + '\'' +
                ", productType=" + productType +
                ", discount='" + discount + '\'' +
                ", skuDetail=" + skuDetail +
                ", addressPerson='" + addressPerson + '\'' +
                ", addressPhone='" + addressPhone + '\'' +
                ", addressAddress='" + addressAddress + '\'' +
                '}';
    }
}

