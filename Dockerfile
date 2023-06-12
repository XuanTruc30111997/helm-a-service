FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} a-service-1.1.2-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/a-service-1.1.2-SNAPSHOT.jar"]
