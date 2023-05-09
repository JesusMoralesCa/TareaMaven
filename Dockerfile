FROM openjdk:11

WORKDIR /app

COPY pom.xml .

COPY src/ ./src/

RUN apt-get update && apt-get install -y maven

RUN mvn package

CMD ["java", "-jar", "/app/target/hola-mundo-2.0-SNAPSHOT.jar"]
