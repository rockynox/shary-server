FROM maven:3.5-jdk-8 as builder

WORKDIR /usr/src/

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:8-jre-alpine

WORKDIR /home/user
USER user
COPY --from=builder /usr/src/build/shary-server.jar .
EXPOSE 8080

CMD java -jar /home/user/ad-cae.jar

HEALTHCHECK --interval=30s --timeout=3s CMD curl -f http://localhost:8080/actuator/info || exit 1
