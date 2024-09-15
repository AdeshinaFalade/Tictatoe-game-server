# Use the official OpenJDK 11 base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR ./src

# Copy the JAR file into the container
COPY ./build/libs/com.example.tictactoe-all.jar .

# Specify the command to run your application
CMD ["java", "-jar", "com.example.tictactoe-all.jar"]


# FROM gradle:7-jdk11 AS build
# COPY --chown=gradle:gradle . /home/gradle/src
# WORKDIR /home/gradle/src
# RUN gradle buildFatJar --no-daemon
#
# FROM openjdk:11
# EXPOSE 8080:8080
# RUN mkdir /app
# COPY --from=build /home/gradle/src/build/libs/*.jar com.example.tictactoe-all.jar
# ENTRYPOINT ["java","-jar","com.example.tictactoe-all.jar"]

# docker run -d --name my-app-container -p 8080:8080 dockerfile