FROM eclipse-temurin:17
COPY target/PracticeApplication.jar PracticeApplication.jar
CMD ["java", "-jar", "PracticeApplication.jar"]