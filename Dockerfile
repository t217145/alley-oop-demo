FROM openjdk:21-jdk-slim
COPY target/cicddemo.jar /cicddemo.jar
CMD ["java", "-jar", "/cicddemo.jar"]
