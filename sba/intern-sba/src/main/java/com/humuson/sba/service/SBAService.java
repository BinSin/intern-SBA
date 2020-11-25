package com.humuson.sba.service;

import com.humuson.sba.utiliy.ApiCall;
import org.springframework.stereotype.Service;

@Service
public class SBAService {
    public void shutdownApplication(String app_name) {
        String port = null;
        if (app_name.equals("intern-web")) {
            port = "8080";
        } else if (app_name.equals("intern-admin")) {
            port = "8081";
        } else if (app_name.equals("intern-kafka-api")) {
            port = "8082";
        } else if (app_name.equals("intern-consumer-client")) {
            port = "8083";
        } else if (app_name.equals("intern-producer-batch")) {
            port = "8084";
        } else {
            return;
        }

        String url = "http://localhost:" + port + "/sba/shutdown";
        ApiCall.get(url);
    }
}
