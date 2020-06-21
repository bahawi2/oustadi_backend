FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9090
ADD target/*.jar oustadi_app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /oustadi_app.jar" ]