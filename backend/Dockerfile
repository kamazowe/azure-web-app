FROM openjdk:11 as builder

WORKDIR '/app'

COPY . .

# skip test - maven fail in spring project build trying to establish connection with database
RUN ./mvnw clean package -DskipTests

FROM openjdk:11 as runtime
# ARG JAR_FILE
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
