FROM maven:3.6.3-jdk-11-openj9 AS maven
COPY pom.xml pom.xml
COPY ./src ./src
RUN mvn package && cp target/*.jar app.jar

FROM openjdk:11
WORKDIR /app
COPY --from=maven /app/app.jar ./app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]