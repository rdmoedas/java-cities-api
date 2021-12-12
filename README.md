# java-cities-api
Java backend api developed in TQI Java Bootcamp from Digital Innovation One

Projeto baseado em https://github.com/andrelugomes/digital-innovation-one/tree/master/cities-api

## Configuração
Criada utilizando spring initializr
- Grade Project
- Java
- Spring boot 2.6.1
- Packaging Jar
- Java 17

## Database: Postgress

Banco Postgress rodando em docker.

<code>
    docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
</code>