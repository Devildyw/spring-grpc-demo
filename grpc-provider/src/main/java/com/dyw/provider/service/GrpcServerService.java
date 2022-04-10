package com.dyw.provider.service;

import com.dyw.grpc.proto.HelloGrpcGrpc;
import com.dyw.grpc.proto.HelloRequest;
import com.dyw.grpc.proto.HelloResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author Devil
 * @date 2022/04/11/0:01
 */
@GrpcService
public class GrpcServerService extends HelloGrpcGrpc.HelloGrpcImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String name = request.getName();
        HelloResponse response = HelloResponse.newBuilder().setMessage("hello "+name).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
