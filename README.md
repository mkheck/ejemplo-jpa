Command used to run mysql database:

```
docker run -p 3306:3306 --name mysql -e MYSQL_DATABASE=mark -e MYSQL_RANDOM_ROOT_PASSWORD=yes -e MYSQL_USER=mark -e MYSQL_PASSWORD=sbux -d mysql:latest
```