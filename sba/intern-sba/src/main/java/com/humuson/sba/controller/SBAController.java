package com.humuson.sba.controller;

import com.humuson.sba.service.SBAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBAController {

    @Autowired
    private SBAService actuatorService;

    @DeleteMapping("/applications/{app_name}")
    public void shutdownAllApplications(@PathVariable String app_name) {
        actuatorService.shutdownApplication(app_name);
    }

}
