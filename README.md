# Maintable Code: Hello Web Exercise #

Take 2

## Deployment Instructions

1. Run `mvn package`
2. Download [jetty-runner](http://www.eclipse.org/jetty/documentation/9.3.x/runner.html) file
    - `wget http://repo1.maven.org/maven2/org/eclipse/jetty/jetty-runner/9.4.6.v20170531/jetty-runner-9.4.6.v20170531.jar -O jetty-runner.jar`
3. Run `java -jar jetty-runner.jar target/hello.1.1.0.war`
4. Navigate to
    - [http://localhost:8080/hello?target=world](http://localhost:8080/hello?target=alice)
    - [http://localhost:8080/add?left=2&right=3](http://localhost:8080/add?left=2&right=3)