### Docker Reference :
https://github.com/ramanujds/docker-exercise


### Pull an image (eg Mysql)

```bash

docker pull mysql

docker pull ram1uj/easy-recipes

```

### Run the image

```bash

docker run -p 3309:3306 -e MYSQL_ROOT_PASSWORD=password --name mysql-container -d  mysql

docker run -p 3000:80 ram1uj/easy-recipes

```

## How to build a Docker Image for Spring Boot Application

```dockerfile

FROM openjdk:21-jdk-slim
WORKDIR /
ADD target/spring-boot-app.jar app.jar
CMD java -jar app.jar

```

## How to build the image

```bash

docker build -t spring-boot-app .

```

## Run the Image

```bash

docker run -p 8900:8080 --name spring-boot-app -d spring-boot-app

```
