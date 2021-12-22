package com.sonx196.micro.limitsservice.controller;



import com.sonx196.micro.limitsservice.bean.Limits;
import com.sonx196.micro.limitsservice.configratuon.Configratuon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configratuon configratuon;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
       return new Limits(configratuon.getMinimum(),
               configratuon.getMaximum());
        // return new Limits(1,1000);
    }
}
