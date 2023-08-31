package com.meteor.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SkuDetail {
    @JsonProperty("sku_id")
    private String skuId;

    @JsonProperty("count")
    private int count;

    @JsonProperty("name")
    private String name;
    
    @JsonProperty("album_id")
    private String albumId;

    @JsonProperty("pic")
    private String pic;
    
    // Getters and Setters
    
    public String getSkuId() {
        return skuId;
    }
    
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAlbumId() {
        return albumId;
    }
    
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    @Override
    public String toString() {
        return "SkuDetail{" +
                "skuId='" + skuId + '\'' +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", albumId='" + albumId + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }

    public String getPic() {
        return pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }
}