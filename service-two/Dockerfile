FROM openjdk:8-jdk-alpine
LABEL maintainer="roshan"

RUN apk --update --no-cache add curl

ADD ./target/service-two.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/service-two.jar"]

EXPOSE 8082