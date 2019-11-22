# SpringCloudDemo
my code of spring cloud project

2019-11-12
本人开始搭建spring cloud分布式微服务框架


架构说明：
1.new-web-eureka-server-12000和new-web-eureka-server-12001两个注册中心服务，做集群负载注册中心
2.new-web-eureka-client-11000是消费端（也是可以是服务端service-one），
new-web-eureka-client-11001和new-web-eureka-client-11002是两个生产端(服务名同为service-second)，做负载服务。
3.



注意点与坑点：
1.使用pom文件配置变量，通过yml文件读取时，会报错如下错误（暂未解决，尝试了很多方法）
Caused by: org.yaml.snakeyaml.scanner.ScannerException: while scanning for the next token
found character '@' that cannot start any token. (Do not use @ for indentation)
 in 'reader', line 10, column 13:
        active: @active.dev@

2.使用hystrix dashboard监控板面的项目，不能注册到eureka，只需引入相关依赖及注解，添加端口号和服务名即可。

3.被hystrix dashboard监控的服务中必须添加spring-boot-starter-actuator依赖，否则报错。
hystrix只能监控单个服务，集群监控需要使用Turbine 聚合流

4.使用Turbine 聚合流需要引入相关依赖，以及@EnableHystrixDashboard @EnableDiscoveryClient @EnableTurbine等注解，
并且需要在yml配置文件中将turbine服务注册到eureka服务注册中心，这样才能监控到注册中心的所有服务。
被监控的服务名需要写在turbine服务的yml配置app-config中。

