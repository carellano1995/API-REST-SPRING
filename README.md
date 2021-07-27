# API-REST-SPRING

![spring|java](https://spring.io/img/spring-by-pivotal.png)

## Requirements

- Java 1.8 +
- PostMan
- Visual Studio Code or another similar IDE (STS, NetBeans, etc ...)
- MySql
- GIT
- Terminal (ITERM con plugins oh my zsh)

### Plugins

Some plugins that use in Visual Studio Code are:

| Plugin                                    |
| ----------------------------------------- |
| Spring boot Tools                         |
| Spring boot Dashboard                     |
| Spring boot extension Pack                |
| Maven for java                            |
| Language support for java                 |
| Java extension pack                       |
| Java Test Runner vscjava.vscode-java-test |

## Set up MySQL

```sh
$ mysql -u root -p
$ > CREATE USER 'username'@'localhost' IDENTIFIED BY 'password';
$ > GRANT ALL PRIVILEGES ON *.* TO 'username'@'localhost';
```

### Installation

API-REST-SPRING requires [Java](https://www.java.com/es) 1.8+ to run.

Install the dependencies and devDependencies and start the server.

```sh
$ git clone https://github.com/carellano1995/API-REST-SPRING.git
$ cd API-REST-SPRING/
$ mvn package
$ mvn spring-boot:run
```

# Controllers

### GET[/players]

This endpoint will return a list with all the paged records.

#### Request

```json
url: http://localhost:8080/players
method: GET
headers : {Content-Type : application/json}
```

If successful, it will return a status **200** and the following JSON:

```json
{
  "content": [],
  "pageable": {
    "sort": {
      "sorted": false,
      "unsorted": true,
      "empty": true
    },
    "offset": 0,
    "pageSize": 20,
    "pageNumber": 0,
    "paged": true,
    "unpaged": false
  },
  "totalPages": 0,
  "totalElements": 0,
  "last": true,
  "size": 20,
  "numberOfElements": 0,
  "number": 0,
  "sort": {
    "sorted": false,
    "unsorted": true,
    "empty": true
  },
  "first": true,
  "empty": true
}
```

### GET ALL[/players/all]

This endpoint will return a list with all records.

```json
url: http://localhost:8080/players/all
method: GET
headers : {Content-Type : application/json}
```

If successful, it will return a status **200** and the following JSON:

```json
[]
```

### POST[/players]

This endpoint will allow to create a player.

#### Request

```json
url: http://localhost:8080/players
method: POST
headers : {Content-Type : application/json}
body: {
	"name": "Cristiano Ronaldo",
	"rut": "20320983-5"
}
```

If successful, it will return a status **200** and the following JSON:

```json
{
  "id": 1,
  "name": "Cristiano Ronaldo",
  "rut": "20320983-5"
}
```

### PUT[/players/{id}]

This endpoint will allow to update a player.

#### Request

```json
url: http://localhost:8080/players/{id}
method: PUT
headers : {Content-Type : application/json}
body: {
	"name": "Cristiano R.",
	"rut": "20320983-5"
}
```

If successful, it will return a status **200** and the following JSON:

```json
{
  "id": 1,
  "name": "Cristiano R.",
  "rut": "20320983-5"
}
```

### Delete[/players/{id}]

This endpoint will allow to delete a player.

#### Request

```json
url: http://localhost:8080/players/{id}
method: DELETE
headers : {Content-Type : application/json}
```

If successful, it will return a status **200**.
