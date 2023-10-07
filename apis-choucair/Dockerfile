# Use an official Gradle image as a parent image
FROM gradle:8.1-jdk11 AS builder

# Set the working directory to /apis-choucair
WORKDIR /apis-choucair

# Copy the build.gradle and settings.gradle files
COPY build.gradle settings.gradle /apis-choucair/

# Copy the src directory (contains your Karate DSL code)
COPY src apis-choucair/src

# Build the project using Gradle
RUN gradle build

# Create a runtime image
FROM openjdk:11-jre-slim

# Set the working directory to /apis-choucair
WORKDIR /apis-choucair

# Copy the built application from the builder image
COPY --from=builder /apis-choucair/build/libs/*.jar apis-choucair.jar

# Set the environment variable for Karate (if needed)
ENV KARATE_OPTS="-Dkarate.env=your_environment"

# Run your Karate tests (replace 'test.feature' with your actual test file)
CMD ["java", "-jar", "apis-choucair.jar", "user-dummy.feature"]
