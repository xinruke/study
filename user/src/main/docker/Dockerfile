##Dockerfile文件格式

#1、基础镜像信息
FROM <image>
FROM frolvlad/alpine-oraclejdk8

#2、维护者信息
MAINTAINER xinruke

#3、镜像操作指令
RUN <command>
COPY <源路径>...<目标路径>
ADD <源路径>...<目标路径>
ENV <key> <value>
EXPOSE <port>
VOLUME ["/data"]
WORKDIR /path/to/workdir
USER daemon
CMD command param1 param2
ENTRYPOINT command param1 param2
LABEL <key>=<value> ...
ARG <name>[=<default value>]
ONBUILD [instruction]
STOPSIGNAL signal
SHELL ["executable", "parameters"]


#4、容器启动执行指令
