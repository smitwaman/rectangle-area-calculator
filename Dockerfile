# Use a Java base image from Docker Hub
FROM openjdk:latest

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code into the container
COPY main.java /app

# Compile the Java source code
RUN javac main.java

# Specify the command to run the Java application
CMD ["java", "main.java"]
