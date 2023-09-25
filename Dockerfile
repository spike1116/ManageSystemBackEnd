FROM openjdk:8-jdk

ADD . /app

WORKDIR app

RUN mvn clean package

COPY ./target/ManageSystemBackEnd-1.0-SNAPSHOT.jar ManageSystemBackEnd.jar

ENTRYPOINT ["java", "-jar", "ManageSystemBackEnd.jar"]






