FROM eclipse-temurin:21-jre-alpine-3.24

WORKDIR /app

COPY target/secongStart-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
