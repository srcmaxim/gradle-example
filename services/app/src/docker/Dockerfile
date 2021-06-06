# File should be ran from services/app
FROM gradle:7.0.2-jdk16-hotspot as build
WORKDIR /project
COPY  build/distributions/*.zip /project/app.zip
RUN jar -xf app.zip && rm app.zip

FROM adoptopenjdk/openjdk16:jre-16.0.1_9-alpine
WORKDIR /app
RUN addgroup --system javauser && adduser -S -s /bin/false -G javauser javauser
COPY --from=build /project/app/ /app/
RUN chown -R javauser:javauser /app && \
    chmod 500 /app/bin/app
USER javauser
EXPOSE 8080
CMD "/app/bin/app"
