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
ADD target/spring-boot-app.jar app.jar
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



# Running a Spring Boot Application with a Database on Docker

To set up and run a Spring Boot application with a PostgreSQL (or MySQL) database in Docker, follow these steps.

## Steps:

### 1. Create a Docker Network
Create a dedicated Docker network to ensure communication between the Spring Boot application and the database container.

```sh
docker network create spring-boot-db-network
```

### 2. Run PostgreSQL/MySQL on the Network
Start the database container on the created network with the necessary environment variables.

```sh
docker run \
    --name postgres \
    -e POSTGRES_PASSWORD=password \
    --network=spring-boot-db-network \
    -p 5432:5432 \
    -d \
    postgres
```

### 3. Update the `application.yml` File
Configure your Spring Boot application to connect to the database. Update `application.yml` with the following content:

```yaml
spring:
    datasource:
        url: jdbc:postgresql://${POSTGRES_HOST:localhost}:${POSTGRES_PORT:5432}/${POSTGRES_DB:postgres}
        username: ${POSTGRES_USER:postgres}
        password: ${POSTGRES_PASSWORD:password}

    jpa:
        hibernate:
            ddl-auto: update
        show-sql: true
        properties:
            hibernate:
                format_sql: true
server:
    port: 8080
```

### 4. Create a Dockerfile for the Spring Boot App
Define the Dockerfile for the Spring Boot application to run in a container.

```Dockerfile
FROM openjdk:21-jdk-slim
WORKDIR /
ADD target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
```

### 5. Build the Docker Image
Build the Docker image for the Spring Boot application.

```sh
docker build -t todo-app .
```

### 6. Run the Spring Boot App Container on the Network
Run the application container, connecting it to the same Docker network.

```sh
docker run -p 8080:8080 \
    --name=todo-app \
    --network=spring-boot-db-network \
    -e POSTGRES_PORT=5432 \
    -e POSTGRES_DB=postgres \
    -e POSTGRES_USER=postgres \
    -e POSTGRES_PASSWORD=password \
    -d todo-app
```

### 7. Access the Application on Port 8080
The Spring Boot application should now be accessible on `localhost:8080`.

### 8. Check Logs
To view the logs for troubleshooting or monitoring, use the following command:

```sh
docker logs [container-name]
```

## Using Docker Compose

You can simplify the setup with Docker Compose.

### 1. Create a `docker-compose.yml` File
Add the following content to `docker-compose.yml`:

```yaml
version: '3.7'
services:

    postgres:
        image: postgres
        ports:
            - "5432:5432"
        restart: always
        environment:
            POSTGRES_USER: postgres
            POSTGRES_PASSWORD: password
            POSTGRES_DB: postgres
        networks:
            - app-network

    todo-app:
        image: todo-app
        ports:
            - "8080:8080"
        restart: always
        depends_on:
            - postgres
        networks:
            - app-network
        environment:
            POSTGRES_HOST: postgres
            POSTGRES_PORT: 5432
            POSTGRES_DB: postgres
            POSTGRES_USER: postgres
            POSTGRES_PASSWORD: password

networks:
    app-network:
```

### 2. Validate the `docker-compose.yml` File
Ensure the YAML file syntax is correct:

```sh
docker compose config
```

### 3. Start the Application
Run the following command to start the application:

```sh
docker compose up -d
```

### 4. Stop the Application
To stop the containers, use:

```sh
docker compose down
```

## How to Install Docker and Docker Compose on AWS

To set up Docker and Docker Compose on an AWS instance:

### 1. Install Docker

```sh
sudo yum install docker -y
sudo service docker start
```

### 2. Add the EC2 User to the Docker Group

```sh
sudo usermod -a -G docker ec2-user
```

### 3. Install Docker Compose
Download Docker Compose:

```sh
sudo curl -L https://github.com/docker/compose/releases/download/1.22.0/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
```

### Note: For the latest version, use:

### 4. Set Executable Permissions

```sh
sudo chmod +x /usr/local/bin/docker-compose
```

### 5. Verify Installation

```sh
docker-compose version
```


