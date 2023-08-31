# AifadianApi
爱发电api的java包装

```java
public class Test {
    public static void main(String[] args) {
        AifadianApi aifadianApi = new AifadianApi("0736f39e716111ed97ca52540025c377","BF3eu7AKJaMUHS5kGrQYND4qEy8dXvfs");
        // 按订单号查询
        Order order = aifadianApi.queryOrder("20230831105742549710252875");
        // 按页数查询
        List<Order> orders = aifadianApi.queryOrders(1);
    }
}
```

基于爱发电平台在spigot服务器中实现全自动充值发货:
https://github.com/meteorOSS/AifadianPay
