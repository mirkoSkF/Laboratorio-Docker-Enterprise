# Stage 1: Compilazione (Resta invariato)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Esecuzione stabile sia su Intel che su Apple Silicon (Debian Slim)
FROM eclipse-temurin:17-jre-noble
WORKDIR /app
COPY --from=build /app/target/demoRestful-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8095
ENTRYPOINT ["java", "-jar", "app.jar"]