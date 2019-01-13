start   cmd /K java -jar ./eureka-server/eureka-server-0.0.1-SNAPSHOT.jar
start   cmd /K java -jar ./config-server/config-server-0.0.1-SNAPSHOT.jar
ping /n 10 /w 10000 1.0.0.1>nul
start   cmd /K java -jar ./gateway/gateway-0.0.1-SNAPSHOT.jar
start   cmd /K java -jar ./user-service-1/user-service-0.0.1-SNAPSHOT.jar
start   cmd /K java -jar ./user-service-2/user-service-0.0.1-SNAPSHOT.jar
start   cmd /K java -jar ./user-service-3/user-service-0.0.1-SNAPSHOT.jar