# Base image with Node.js
FROM openjdk:8-jdk-alpine
# Create app directory
#WORKDIR /var/bewizyu/docker-node-mongo
#Expose Argument for setting MONGO_HOST
ARG MONGO_HOST=mongodev
ENV MONGODEVHOST=${MONGO_HOST}
ARG MONGO_PORT=27017
ENV MONGODEVPORT=${MONGO_PORT}

ARG JAR_FILE="demo/target/demo-0.0.1-SNAPSHOT.jar"
ADD ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]