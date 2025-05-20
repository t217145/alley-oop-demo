FROM openjdk:21-jdk-slim
COPY cicddemo.jar /cicddemo.jar
CMD ["java", "-jar", "/cicddemo.jar"]
