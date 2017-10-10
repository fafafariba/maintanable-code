mvn clean
mvn package
wget http://repo1.maven.org/maven2/org/eclipse/jetty/jetty-runner/9.4.6.v20170531/jetty-runner-9.4.6.v20170531.jar -nc -O jetty-runner.jar
open http://localhost:8080/hello?target=$(whoami)
open http://localhost:8080/add?left=2\&right=3
java -jar jetty-runner.jar target/hello-1.1.0.war
