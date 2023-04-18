# gRPC Playground

## Reference 
1. https://www.baeldung.com/grpc-introduction
2. https://blog.postman.com/postman-now-supports-grpc/

## Invoke using postman
[images/grpc-postman-call-invokation.png]

## maven goals
1. mvn protobuf:compile
2. mvn clean install

## .proto file
1. The *.proto files needs to be created under src/main/proto
2. Whenever new file gets created, need to run `mvn protobuf:compile` to generate the resources associated.
3. 