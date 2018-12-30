FROM openjdk:8-jdk-alpine as final
RUN adduser -D barath
USER barath
ADD target/demo-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
