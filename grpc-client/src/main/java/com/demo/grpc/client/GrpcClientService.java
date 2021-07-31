package com.demo.grpc.client;


import com.demo.grpc.lib.GreeterGrpc;
import com.demo.grpc.lib.GreeterOuterClass;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class GrpcClientService {

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(serverChannel);
        GreeterOuterClass.HelloReply response = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }

//    @Value("${grpc.client.local-grpc-server.port}")
//    private Integer port;
//    private String host = "0.0.0.0";
//
//    public List<InterruptStatusVo> getResult(String building, String park, String region) {
//        io.grpc.Channel channel = NettyChannelBuilder.forAddress(host, port)
//                .negotiationType(NegotiationType.PLAINTEXT)
//                .build();
//
//        InterruptGrpc.InterruptBlockingStub stub  =  InterruptGrpc.newBlockingStub(channel);
//    }

}
