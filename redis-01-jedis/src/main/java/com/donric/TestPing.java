package com.donric;

import redis.clients.jedis.Jedis;

public class TestPing {
    public static void main(String[] args) {
        // 1、 new Jedis对象即可
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        // jedis 所有命令就是我们之前学的所有指令
        System.out.println(jedis.ping());
jedis.close();
    }
}
