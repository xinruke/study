node -v
npm -v
vue -V

npm install -g vue-cli // 加-g是安装到全局

vue init webspack
npm install
cnpm install
npm run dev
npm run build

npm i && npm i element-ui
npm install axios

# LeanCloud
##存储服务（包括推送）
npm install leancloud-storage --save
##即时通讯服务
npm install leancloud-realtime --save

16001 eureka
16002 config
16101 sso
16102 user
16103 finance
16000 zuul


#访问地址
##http://localhost:16001/    Eureka
##http://localhost:15672/   RabbitMQ
##http://localhost:8766/    SpringBootAdmin
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