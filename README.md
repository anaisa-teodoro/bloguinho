# Bloguinho

## Visão Geral

Este é um aplicativo de blog web baseado em Spring Boot que permite aos usuários criar, visualizar e excluir postagens de blog. O aplicativo utiliza Thymeleaf para templates, Spring Data JPA para interações com o banco de dados e Bootstrap para design responsivo.

## Funcionalidades

- Criar novas postagens de blog
- Visualizar uma lista de todas as postagens
- Visualizar informações detalhadas de uma postagem
- Excluir postagens existentes
- Design responsivo com Bootstrap
- Integração com banco de dados MySQL

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Thymeleaf**
- **MySQL**
- **Bootstrap 5**
- **Maven**

## Pré-requisitos

- Java Development Kit (JDK) 17
- Banco de dados MySQL
- Maven

## Instalação e Configuração

### 1. Clonar o Repositório

```bash
git clone https://github.com/anaisa-teodoro/bloguinho.git
```


### 2. Configuração do Banco de Dados
Crie um banco de dados MySQL chamado blogappdbweb.
Atualize as credenciais do banco de dados no arquivo src/main/resources/application.properties.

### 3. Construir e Executar
O aplicativo estará disponível em http://localhost:8080/login.

Ao realizar teste use um dos dois usuários abaixo:

## Credenciais de Acesso

O sistema possui dois usuários pré-configurados para fins de teste. Utilize as credenciais abaixo para acessar o sistema:

### Administrador
- **Login:** admin
- **Senha:** adminpassword

### Usuário Comum
- **Login:** user
- **Senha:** userpassword

> **Nota:** As senhas estão configuradas apenas para fins de desenvolvimento e teste. Em produção, certifique-se de utilizar um sistema de gerenciamento de usuários seguro e senhas fortes.

### 4. Estrutura do Projeto

- `src/main/java/com/web/bloguinho/`: Pacote principal da aplicação
  - `controller/`: Controladores web
  - `model/`: Entidades do banco de dados
  - `repository/`: Repositórios de acesso a dados
  - `service/`: Serviços de lógica de negócios
  - `dtos/`: Objetos de Transferência de Dados
  - `configuration/`: Configurações da aplicação
  - `utils/`: Classes utilitárias
- `src/main/resources/`
  - `templates/`: Templates HTML do Thymeleaf
  - `application.properties`: Configuração da aplicação

### 5. Esquema do Banco de Dados

O aplicativo utiliza uma tabela `TB_POST` com as seguintes colunas:

- `id`: Identificador único (UUID)
- `autor`: Autor da postagem
- `data`: Data de criação da postagem
- `titulo`: Título da postagem
- `texto`: Conteúdo da postagem

### 6. Features

- Terminar a documentação no SpringDoc;
- Tornar a interface mais acessível;
- Realizar o deploy em alguma plataforma;

### 🌟 Exercício de Aprendizagem

Realizamos este bloguinho nas aulas do Devs2Blu ⭐ 2025.