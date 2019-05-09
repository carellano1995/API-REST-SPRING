# API-REST-SPRING

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/CARELLANO/API-REST-SPRING)

API-REST-SPRING es una API WEB REST encargada de realizar un CRUD.

## Requisitos

- Java 1.8 o mayor
- PostMan
- Visual Studio Code u otro IDE similar (STS, NetBeans, etc...)
- MySql
- GIT
- Terminal Decente jaja (ITERM con plugins oh my zsh)

### Plugins

Algunos plugins que utilizamos en Visual Studio Code son:

| Plugin                                    |
| ----------------------------------------- |
| Spring boot Tools                         |
| Spring boot Dashboard                     |
| Spring boot extension Pack                |
| Maven for java                            |
| Language support for java                 |
| Java extension packk                      |
| Java Test Runner vscjava.vscode-java-test |

### Installation

API-REST-SPRING requires [Java](https://nodejs.org/) 1.8+ to run.

Install the dependencies and devDependencies and start the server.

```sh
$ git clone https://github.com/carellano1995/API-REST-SPRING.git
$ cd API-REST-SPRING/
$ mvn package
$ mvn spring-boot:run
```

# Controllers

### GET/Players

Este endpoint devolvera una lista con todos los registros paginados.

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

### GET/Players/all

Este endpoint devolvera una lista con todos los registros.

```json
[]
```

### POST/Players

Este endpoint Permitira crear un player

Si fue exitoso devolvera un status 200 Y el siguiente JSON:

```json
{
  "name": "Cristian",
  "rut": "22420731-k"
}
```

### Tech

Dillinger uses a number of open source projects to work properly:

- [AngularJS] - HTML enhanced for web apps!
- [Ace Editor] - awesome web-based text editor
- [markdown-it] - Markdown parser done right. Fast and easy to extend.
- [Twitter Bootstrap] - great UI boilerplate for modern web apps
- [node.js] - evented I/O for the backend
- [Express] - fast node.js network app framework [@tjholowaychuk]
- [Gulp] - the streaming build system
- [Breakdance](http://breakdance.io) - HTML to Markdown converter
- [jQuery] - duh

And of course Dillinger itself is open source with a [public repository][dill]
on GitHub.
