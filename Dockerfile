FROM maven:3.8.3-openjdk-11

WORKDIR /app

COPY pom.xml .

COPY src/ ./src/
COPY target/ ./target

RUN mvn package

CMD ["java", "-jar", "/app/target/hola-mundo-2.0-SNAPSHOT.jar"]
