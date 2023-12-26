
FROM openjdk:17
WORKDIR /app
ADD target/notification-0.0.1-SNAPSHOT.jar notification.jar 
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "notification.jar"]
