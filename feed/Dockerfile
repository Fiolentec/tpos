FROM openjdk:8-jdk-alpine
WORKDIR /app
EXPOSE 7070
ADD ./build/libs/feed-1.0-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "feed-1.0-SNAPSHOT.jar"]