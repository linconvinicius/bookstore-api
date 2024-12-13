# Bookstore API

## Descrição

Este projeto é uma API RESTful para gerenciar uma livraria, construída com Java, Spring Boot e Maven. A API permite operações CRUD (Create, Read, Update, Delete) em livros, autores e editoras.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- Spring Data JPA (Java Persistence API)
- Lombok
- Banco de Dados (PostgreSQL)

## Estrutura do Projeto

- `src/main/java/com/bookstore/jpa/controllers`: Contém os controladores REST.
- `src/main/java/com/bookstore/jpa/dtos`: Contém os Data Transfer Objects (DTOs).
- `src/main/java/com/bookstore/jpa/models`: Contém as entidades JPA.
- `src/main/java/com/bookstore/jpa/repositories`: Contém os repositórios JPA.
- `src/main/java/com/bookstore/jpa/services`: Contém os serviços que implementam a lógica de negócios.

## Endpoints

### Livros

- **GET /bookstore/books**: Retorna todos os livros.
- **POST /bookstore/books**: Cria um novo livro.
- **DELETE /bookstore/books/{id}**: Deleta um livro pelo ID.

## Exemplo de Uso

### Requisição para obter todos os livros

```bash
curl -X GET http://localhost:8080/bookstore/books
```

### Requisição para criar um novo livro

```bash
curl -X POST http://localhost:8080/bookstore/books \
  -H "Content-Type: application/json" \
  -d '{
        "title": "Novo Livro",
        "publisherId": "UUID-da-Editora",
        "authorIds": ["UUID-do-Autor1", "UUID-do-Autor2"],
        "reviewComment": "Ótimo livro!"
      }'
```

### Requisição para deletar um livro

```bash
curl -X DELETE http://localhost:8080/bookstore/books/{id}
```

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/bookstore-api.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd bookstore-api
   ```
3. Compile e execute o projeto usando Maven:
   ```bash
   mvn spring-boot:run
   ```
4. Acesse a API em `http://localhost:8080`.

## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`).
4. Faça o push para a branch (`git push origin feature/nova-feature`).
5. Crie um novo Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.