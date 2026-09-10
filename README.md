# Projeto MongoDB

API REST desenvolvida em Java com Spring Boot e MongoDB, aplicando conceitos de persistência NoSQL e arquitetura em camadas.

## Tecnologias

- Java
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven

## Funcionalidades

- Cadastro de usuários
- Consulta de usuários
- Atualização e remoção de usuários
- Gerenciamento de posts
- Associação de autores e comentários
- Consultas utilizando MongoDB

## Estrutura

O projeto está organizado em camadas:

- `resources` — endpoints REST
- `services` — regras de negócio
- `repositories` — acesso ao MongoDB
- `domain` — entidades da aplicação
- `dto` — objetos de transferência de dados

## Executando o projeto

É necessário ter o MongoDB em execução localmente.
