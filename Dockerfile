FROM maven:3.8.3-openjdk-11

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src/ ./src/

RUN apt-get update && apt-get install -y maven

RUN mvn package

EXPOSE 8080

CMD ["java", "-jar", "/app/target/hola-mundo-2.0-SNAPSHOT.jar"]
