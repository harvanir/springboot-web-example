# Spring Boot Web example
Example of Spring Boot Web. 

## How to use
**1. Clone the application**

```bash
git clone https://github.com/harvanir/springboot-example.git
```
**2. Build the application**

```bash
mvn clean install -Dspring.profiles.active=se
```

**3. Run the application**

```bash
java -jar -Dspring.profiles.active=se target/springboot-example-0.0.1-SNAPSHOT-exec.jar
```

**4. Access the application via web browser**

```
http://localhost:8082
```