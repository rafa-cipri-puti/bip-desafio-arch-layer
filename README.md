
🏗️ Desafio Técnico – Arquitetura em Camadas (Layered Architecture)
🎯 Objetivo

Implementar um sistema simples de Gestão de Benefícios utilizando arquitetura em camadas no Spring Boot.
O candidato deverá aplicar boas práticas de desenvolvimento, organização de código, tratamento de erros e documentação da API.

📌 Requisitos do Projeto

Arquitetura em camadas:

Controller Layer – Exposição da API REST.

Service Layer – Regras de negócio.

Repository Layer – Acesso a dados (JPA/Hibernate).

Domain Layer – Entidades e modelos de negócio.

CRUD Benefício (id, nome, descricao, valor).

Swagger/OpenAPI para documentação dos endpoints.

Validações com Bean Validation (@NotNull, @Size, etc.).

Mensagens de erro claras e consistentes.

Tratamento global de exceções (@ControllerAdvice + @ExceptionHandler).

Injeção de dependência (Spring).

Uso de Lombok para reduzir boilerplate.

Banco em memória (H2) para execução local.

Testes unitários e/ou de integração.

Pipeline CI (já incluso no GitHub Actions – não precisa alterar).

✅ O que será avaliado
Critério	Peso
Estrutura em camadas bem definida (Controller, Service, Repository, Domain)
Correta implementação do CRUD (Benefício)
Uso adequado de Swagger/OpenAPI
Validações de campos e mensagens de erro claras
Tratamento global de exceções
Injeção de dependência e boas práticas de Spring
Uso de Lombok e código limpo (Clean Code)
Organização do projeto e clareza do código
Testes automatizados (unitários/integrados)
Qualidade da documentação (README, instruções, clareza)

🚀 Como executar

Clonar ou fazer fork do repositório.

Rodar o projeto:

mvn spring-boot:run


Acessar:

Swagger UI: http://localhost:8080/swagger-ui.html

H2 Console: http://localhost:8080/h2-console

📩 Entrega

O candidato deve:

Criar um fork deste repositório.

Implementar a solução no fork.

Enviar o link do repositório atualizado.
