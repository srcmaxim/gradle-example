# Structuring Software Projects Sample
> gradle-version: 7.0  
> java-version: 11

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-orange.svg)](https://sonarcloud.io/dashboard?id=srcmaxim-gradle-example)  
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=srcmaxim-gradle-example&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=srcmaxim-gradle-example)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=srcmaxim-gradle-example&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=srcmaxim-gradle-example)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=srcmaxim-gradle-example&metric=bugs)](https://sonarcloud.io/dashboard?id=srcmaxim-gradle-example)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=srcmaxim-gradle-example&metric=code_smells)](https://sonarcloud.io/dashboard?id=srcmaxim-gradle-example)

> You can open this sample inside an IDE using the [IntelliJ's Gradle import](https://www.jetbrains.com/help/idea/gradle.html#gradle_import_project_start) or [Eclipse Buildship](https://projects.eclipse.org/projects/tools.buildship).  
> You can add [Google CheckStyle config](build-logic/commons/src/main/resources/StyleSources.md) for your IDE.

This sample shows how to structure a software product that consists of multiple components as a set of connected Gradle builds.
As such, it shows how Gradle is used to model a project's architecture and reflect that in the physical structure of the files that make up the software.
This example is described as part of the [documentation on this topic](https://docs.gradle.org/7.0/userguide/structuring_software_products.html).

The product that is built in this sample is an application that displays link: [Gradle Build Tool releases](https://gradle.org/releases/).

There are different ways to work with the sample:

- You may build or import the umbrella build in the root.
  There you can, for example, run the Spring Boot web application via `./gradlew :services:app:bootRun` or build events domain using `./gradlew :domain:events:build`.
- You may only build or import one of the application builds directly.
  For example, `cd services` and run the app using  `../gradlew :app:bootRun`.
- You may only build or import a selected component (and its dependencies).
  For example, only import the `features/cat` in the IDE.

## Recommended Project Structure

```yml
- aggragegation
  - test-aggregate
  - build-aggregate
- build-logic
  - avro-liblary
  - commons(jacoco, checkstyle, sonarqube)
  - java-liblary
  - report-aggreagation
  - spring-boot-app
  - lambda-app
- domain
  - entity
  - dto
  - avro-event(generated)
  - event
  - mapper(depend on: entity, dto, event)
- platforms
  - plugin-platform
  - product-platform
  - test-platform
- features
  - [name]-feature-api(optional)
  - [name]-feature
- services
  - [name]-service
- lambdas
  - [name]-lambda
- commons(common modules)
  - [name]-common
- tools
  - [name]-tool
- envs
  - local-env
  - aws-env
```

## Commands

### Run app
`./gradlew :services:app:run`

### Build app
`./gradlew :services:app:build`

### Test app
`./gradlew :features:cat:test --continuous`

### Run code coverage report
`./gradlew :aggregation:test-aggregate:codeCoverageReport`

### Run linter report
`./gradlew :aggregation:test-aggregate:linterReport`


### Run code coverage and linter report
`./gradlew :aggregation:test-aggregate:check`

### Clean all
`./gradlew clean`
