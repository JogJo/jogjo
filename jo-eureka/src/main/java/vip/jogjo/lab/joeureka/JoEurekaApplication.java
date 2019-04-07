package vip.jogjo.lab.joeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoEurekaApplication.class, args);
    }

}
