# Hello Web

Take 4 (with emphasis on TDD and Top Down Design)

## Instructions

1. Download [Jetty Runner](https://www.eclipse.org/downloads/) and rename to `jetty-runner.jar`
    - `wget --no-clobber --output-document=jetty-runner.jar http://repo2.maven.org/maven2/org/mortbay/jetty/jetty-runner/8.1.9.v20130131/jetty-runner-8.1.9.v20130131.jar`
2. Package Maven
    - `mvn package`
3. Launch server
    - `java -jar jetty-runner.jar target/maintainable-code-1.4.war` 