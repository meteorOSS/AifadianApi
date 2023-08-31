package com.meteor;

import com.meteor.data.Order;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AifadianApi aifadianApi = new AifadianApi("0736f39e716111ed97ca52540025c377","BF3eu7AKJaMUHS5kGrQYND4qEy8dXvfs");
        Order order = aifadianApi.queryOrder("20230831105742549710252875");
        System.out.println(order.getSkuDetail().get(0));
    }
}
