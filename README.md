gradle-version: 7.0

# Structuring Software Projects Sample

NOTE: You can open this sample inside an IDE using the [IntelliJ's Gradle import](https://www.jetbrains.com/help/idea/gradle.html#gradle_import_project_start) or [Eclipse Buildship](https://projects.eclipse.org/projects/tools.buildship).

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
