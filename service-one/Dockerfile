FROM openjdk:8-jdk-alpine
LABEL maintainer="roshan"

RUN apk --update --no-cache add curl

ADD ./target/service-one.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/service-one.jar"]

EXPOSE 8081