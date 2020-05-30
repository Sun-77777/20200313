package edu.xalead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class TaobaoGateWay {
    public static void main(String[] args) {
        SpringApplication.run(TaobaoGateWay.class);
    }
}
