# Docker Notes and Commands

## Pull an image (e.g., MySQL)

To pull a Docker image from the Docker Hub repository, use the `docker pull` command. This command downloads the specified image to your local machine.

```bash
docker pull mysql
docker pull ram1uj/easy-recipes

```

### Run the image

To run a Docker container from an image, use the `docker run` command. This command creates a new container from the specified image and starts it.

```bash
# Run a MySQL container
docker run -p 3309:3306 -e MYSQL_ROOT_PASSWORD=password --name mysql-container -d mysql

# Run the easy-recipes container
docker run -p 3000:80 --name easy-recipes-container -d ram1uj/easy-recipes
```

## How to build a Docker Image for Spring Boot Application

To build a Docker image for a Spring Boot application, you need to create a `Dockerfile` that contains the instructions for assembling the image.

```dockerfile
FROM openjdk:21-jdk-slim
WORKDIR /
ADD target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]

```

## How to build the image

To build the Docker image using the `Dockerfile`, use the `docker build` command. This command reads the `Dockerfile` and creates the image.

```bash
docker build -t spring-boot-app .
```

## Run the Image

To run the Docker image you built, use the `docker run` command. This command creates and starts a new container from the image.

```bash
docker run -p 8900:8080 --name spring-boot-app-container -d spring-boot-app
```
