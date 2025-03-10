FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/log-producer-*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]