FROM openjdk:11 as builder

WORKDIR '/app'

COPY . .

RUN ./mvnw clean package

FROM openjdk:11 as runtime
# ARG JAR_FILE
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
