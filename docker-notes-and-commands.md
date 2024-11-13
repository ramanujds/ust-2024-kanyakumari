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
