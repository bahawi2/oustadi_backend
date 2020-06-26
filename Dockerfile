FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9090
ADD target/*.jar oustadi_app.jar
ENTRYPOINT ["java","-jar","/oustadi_app.jar"]