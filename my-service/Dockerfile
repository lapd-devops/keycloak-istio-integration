FROM maven:3.6.3-jdk-11-openj9 AS maven
COPY my-service/pom.xml pom.xml
COPY my-service/src ./src
RUN mvn package 
COPY ./target/*.jar app.jar

FROM openjdk:11
WORKDIR /app
COPY --from=maven /app/app.jar ./app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]