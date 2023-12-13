# Use the official OpenJDK 11 base image
FROM adoptopenjdk/openjdk11:alpine-jre

# Set the working directory inside the container
WORKDIR ./src

# Copy the JAR file into the container
COPY ./build/staged-app/com.example.tictactoe-all.jar .

# Specify the command to run your application
CMD ["java", "-jar", "com.example.tictactoe-all.jar"]
