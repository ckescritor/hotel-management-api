# Hotel Management API

## Descrição

A **Hotel Management API** é uma aplicação RESTful desenvolvida em **Spring Boot** que permite gerenciar hóspedes, quartos e reservas de um hotel. Ela expõe endpoints para criar, atualizar, consultar e deletar informações relacionadas à operação de um hotel, facilitando a comunicação com o banco de dados através de uma interface REST.

### O que é uma API REST?

Uma **API REST** (Representational State Transfer) é uma forma de construir aplicações que seguem princípios específicos para comunicar sistemas de forma eficiente e escalável usando o protocolo HTTP. Uma API RESTful utiliza os métodos HTTP para realizar operações em **recursos** (dados que representam objetos do mundo real, como hóspedes, quartos, reservas).

### Características principais desta API RESTful:
1. **Stateless**: Cada requisição HTTP enviada ao servidor deve conter todas as informações necessárias para processar a solicitação. O servidor não mantém estado da sessão entre diferentes requisições.
2. **Recursos**: Os recursos como `guests`, `rooms`, e `bookings` são manipulados através de **URLs**.
3. **Métodos HTTP**: Os métodos padrão do HTTP (GET, POST, PUT, DELETE) são usados para realizar operações de leitura, criação, atualização e exclusão de recursos.

#### Endpoints principais:
- `GET /guests`: Retorna todos os hóspedes.
- `POST /guests`: Cria um novo hóspede.
- `GET /guests/{id}`: Retorna um hóspede específico.
- `PUT /guests/{id}`: Atualiza as informações de um hóspede existente.
- `DELETE /guests/{id}`: Remove um hóspede.

Esses endpoints seguem as convenções REST ao usar métodos HTTP para manipulação de recursos.

## Tecnologias utilizadas
- **Java 17**: Linguagem de programação.
- **Spring Boot**: Framework para construir a API.
- **Spring Data JPA**: Abstração para interagir com o banco de dados relacional.
- **H2 Database**: Banco de dados em memória (utilizado para testes).
- **Maven**: Gerenciador de dependências e build da aplicação.

## Requisitos para executar o projeto
- **Java 17+**
- **Maven 3.6+**
  
### Clonar o repositório

```bash
git clone https://github.com/seu-usuario/hotel-management-api.git
cd hotel-management-api
