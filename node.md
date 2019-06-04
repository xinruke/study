
16001 eureka
16002 config
16101 sso
16102 user
16103 finance
16000 zuul


#访问地址
##http://localhost:16001/    Eureka
##http://localhost:15672/   RabbitMQ
##http://localhost:16003/    SpringBootAdmin
##http://localhost:8767/    Zipkin

Eureka
Feign
Ribbon
Hystrix
Zuul
Config
Config Bus
Sleuth
Zipkin

端口规划：
16+服务类型+序号，例如：16+0+01。0：系统服务，1：基础业务，2：交易业务