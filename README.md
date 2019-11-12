# SpringCloudDemo
my code of spring cloud project

2019-11-12
本人开始搭建spring cloud分布式微服务框架


架构说明：
1.new-web-eureka-server-12000和new-web-eureka-server-12001两个注册中心服务，做集群负载注册中心
2.new-web-eureka-client-11000是消费端（也是可以是服务端service-one），
new-web-eureka-client-11001和new-web-eureka-client-11002是两个生产端(服务名同为service-second)，做负载服务。