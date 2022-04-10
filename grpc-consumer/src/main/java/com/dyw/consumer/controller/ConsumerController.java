package com.dyw.consumer.controller;

import com.dyw.consumer.service.MyGrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Devil
 * @date 2022/04/10/23:55
 */
@RestController
public class ConsumerController {
    @Autowired
    private MyGrpcService myGrpcService;

    @GetMapping("grpc")
    public String doGrpc(String name){
        return myGrpcService.doGrpcService(name);
    }
}
