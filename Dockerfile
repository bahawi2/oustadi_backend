FROM openjdk:8-jdk-alpine
EXPOSE 9090
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} oustadi.jar
COPY /etc/hosts  /etc/hosts 
ENTRYPOINT ["java","-jar","/oustadi.jar"]