FROM maven:3.8.6-openjdk-17-slim AS build
WORKDIR /app

# Copy the Maven POM file
COPY pom.xml .

# Copy the source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Create the runtime image
FROM openjdk:17-slim
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Environment variables
ENV MYSQL_HOST=mysql \
    MYSQL_PORT=3306 \
    MYSQL_DATABASE=restapi \
    MYSQL_USER=root \
    MYSQL_PASSWORD=password \
    SERVER_PORT=8080

# Expose the port the app runs on
EXPOSE ${SERVER_PORT}

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]