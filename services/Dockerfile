FROM adoptopenjdk/openjdk11:jre-11.0.11_9-alpine@sha256:69c257f50bbc4b47a701c6cb0686f1c20bc437a127cb2315ceb671b86718cd15
RUN apk add dumb-init
RUN mkdir /app
RUN addgroup --system javauser && adduser -S -s /bin/false -G javauser javauser
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /app/app.jar
WORKDIR /app
RUN chown -R javauser:javauser /app
USER javauser
CMD "dumb-init" "java" "-jar" "app.jar"
