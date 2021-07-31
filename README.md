
# grpc-springboot-demo


## Service definition

By default, gRPC uses [protocol buffers](https://developers.google.com/protocol-buffers) as the Interface Definition Language (IDL) for describing both the **service interface** and the structure of the **payload messages**.

> single request to the server and gets a single response
```
rpc SayHello(HelloRequest) returns (HelloResponse);
```

> sends a request to the server and gets a stream
```
rpc LotsOfReplies(HelloRequest) returns (stream HelloResponse);
```

> writes a sequence of messages and sends them to the server
```
rpc LotsOfGreetings(stream HelloRequest) returns (HelloResponse);
```

> Bidirectional streaming RPCs
```
rpc BidiHello(stream HelloRequest) returns (stream HelloResponse);
```


## Important  Annotations

    @GrpcService
    
    @GrpcClient



### reference


[Grpc-Docs](https://grpc.io/docs/what-is-grpc/core-concepts/)
