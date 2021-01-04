FROM registry.cn-beijing.aliyuncs.com/hub-mirrors/maven:3-jdk-8 AS build  
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app  
COPY settings.xml /user/src/app/settings.xml
RUN mvn -f /usr/src/app/pom.xml -s /user/src/app/settings.xml clean package -DskipTests

from registry.cn-beijing.aliyuncs.com/hub-mirrors/openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/application.jar
COPY --from=build /usr/src/app/${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
