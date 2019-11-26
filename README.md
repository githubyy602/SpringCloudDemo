# SpringCloudDemo
my code of spring cloud project

2019-11-12
本人开始搭建spring cloud分布式微服务框架


架构说明：
1.new-web-eureka-server-12000和new-web-eureka-server-12001两个注册中心服务，做集群负载注册中心
2.new-web-eureka-client-11000（也是服务端service-one）和new-web-eureka-client-11003是消费端（也是服务端service-third），
new-web-eureka-client-11001和new-web-eureka-client-11002是两个生产端(服务名同为service-second)，做负载服务。
3.new-web-hystrix-dashboard-13000作为hystrix或turbine监控服务端
4.new-web-apollo-server-14000作为apollo服务端(没有自动搭建，直接使用官方脚手架)
5.new-web-zuul-server-15000作为网关服务端



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

5.springcloud集成apollo
集成参考链接：https://www.jianshu.com/p/5606483c7fbf
还有为什么选择apollo做为自动化配置而不选择spring cloud config，对比apollo优势更大。
※在new-web-eureka-client-11000添加client和core依赖（只添加其中一个会启动报错），启动类添加@EnableApolloConfig注解，使用apollo官方推荐启动脚手架apollo-build-scripts启动apollo，
然后设置设置配置。
※统一套apollo配置中心可以配置多个环境配置。在PORTAL_JAVA_OPTS中PORTAL_JAVA_OPTS配置多环境，并修改apolloportaldb数据库表
serverconfig中apollo.portal.envs字段值，默认支持DEV,FAT,UAT,PRO。其apollo其中还有很多配置细节，没有花太多时间钻研，后续有时间再了解。

6.springcloud zuul使用（参考链接：https://blog.csdn.net/fivehundredyearsago/article/details/80730119）
①路由：添加zuul依赖，启动类添加@EnableEurekaClient @EnableZuulProxy,因为需要将自身注册到eureka注册中心
       在yml文件中zuul.routes配置路由路径或服务
②服务过滤：继承ZuulFilter类，实现过滤功能。
