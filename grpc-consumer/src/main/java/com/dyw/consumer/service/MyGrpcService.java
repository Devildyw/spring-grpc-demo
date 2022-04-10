package com.dyw.consumer.service;

import com.dyw.grpc.proto.HelloGrpcGrpc;
import com.dyw.grpc.proto.HelloRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

/**
 * @author Devil
 * @date 2022/04/10/23:56
 */
@Service
public class MyGrpcService {
    @GrpcClient("myGrpcClient")
    private HelloGrpcGrpc.HelloGrpcBlockingStub helloGrpcBlockingStub;

    /**
     * 调用远程服务的api
     * @param name 参数
     * @return String
     */
    public String doGrpcService(String name){
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        return helloGrpcBlockingStub.sayHello(request).getMessage();
    }
}
