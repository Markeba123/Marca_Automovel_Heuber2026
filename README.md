# 🚗 API de Gerenciamento de Automóveis e Marcas

Este é um mini-projeto de API RESTful desenvolvido como parte das atividades práticas do curso de Sistemas de Informação. O objetivo principal da aplicação é colocar em prática os conceitos de backend, mapeamento objeto-relacional (ORM) e estruturação de banco de dados relacional.

A API permite o gerenciamento completo (Listar, Consultar e Incluir) de Marcas e de Automóveis, demonstrando na prática o relacionamento entre entidades (`@ManyToOne`).

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Persistência:** Spring Data JPA / Hibernate
* **Banco de Dados:** PostgreSQL (Gerenciado via pgAdmin 4)
* **Testes de API:** Insomnia

## ⚙️ Funcionalidades

- **Marcas:**
  - Cadastro de novas marcas de veículos.
  - Listagem de todas as marcas cadastradas (ordenadas por ID).
  - Consulta de uma marca específica pelo seu código.
- **Automóveis:**
  - Cadastro de novos automóveis com vínculo direto a uma marca existente.
  - Listagem de todos os automóveis.
  - Consulta detalhada de um automóvel pelo código.
