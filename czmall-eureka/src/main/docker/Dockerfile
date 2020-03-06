FROM java:8

MAINTAINER "znlccy0603@163.com"

ADD /target/czmall-eureka-1.0-SNAPSHOT.jar /czmall-eureka.jar

EXPOSE 1001

VOLUME "/tmp"

ENTRYPOINT ["java", "-jar", "/czmall-eureka.jar"]