# gRPC Playground

## Reference

1. [grpc-introduction](https://www.baeldung.com/grpc-introduction)
2. [postman-now-supports-grpc](https://blog.postman.com/postman-now-supports-grpc/)
3. [rest-vs-grpc](https://www.baeldung.com/rest-vs-grpc)
4. [awesome-grpc](https://github.com/grpc-ecosystem/awesome-grp)

## Invoke using API CLIENT

1. [POSTMAN](images/grpc-postman-call-invokation.png)
2. [BloomRPC](https://formulae.brew.sh/cask/bloomrpc)

## maven goals

1. mvn protobuf:compile
2. mvn clean install

## .proto file

1. The *.proto files needs to be created under src/main/proto
2. Whenever new file gets created, need to run `mvn protobuf:compile` to generate the resources associated.

## gRPC tools

1. [awesome-grpc#tools](https://github.com/grpc-ecosystem/awesome-grpc#tools)
