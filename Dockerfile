FROM openjdk:17-jdk-alpine
MAINTAINER Nagaraja
COPY target/demoApp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
