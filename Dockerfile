FROM maven:3.8.3-openjdk-11

WORKDIR /app

COPY pom.xml .

COPY src/ ./src/
COPY target/ ./target

RUN apt-get update && apt-get install -y maven


RUN mvn package

EXPOSE 8080

CMD ["java", "-jar", "/app/target/hola-mundo-2.0-SNAPSHOT.jar"]
