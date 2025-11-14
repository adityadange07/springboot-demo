# Stage 1: Build the jar
FROM eclipse-temurin:17-jdk AS build
WORKDIR /springboot-demo
COPY . .
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the jar
FROM eclipse-temurin:17-jdk
WORKDIR /springboot-demo
COPY target/*.jar springboot-demo.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "springboot-demo.jar"]