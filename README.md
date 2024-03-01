# API de Notification
 
Bem-vindo à API de Notification, uma solução robusta desenvolvida em Spring Boot para imprimir mensagens de ações feitas pelos usuários.

## Colaborador
-------------------------------------
| E-mail              | Usuário GitHub |
|---------------------|----------------|
| pablo.haddad.pb@compasso.com.br   |pablitohaddad   |


 
## Requisitos
 
- Java 17 
- MySql Database
- RabbitMQ
- Spring Boot
 
## Configuração
 
1. Clone o repositório:
 
```bash
git clone https://github.com/pablitohaddad/ms-notification.git
```
 
2. Configure o banco de dados no arquivo `application.properties`.
 
3. Execute a aplicação:
 
```bash
mvn spring-boot:run
```
## Mensagens possíveis imprimidas na tela.
```json
{
  "email": "maria@email.com",
  "event": "LOGIN",
  "date": "ISO-8601 DATE"
}
```
```json
{
  "email": "maria@email.com",
  "event": "CREATE",
  "date": "ISO-8601 DATE"
}
```
```json
{
  "email": "maria@email.com",
  "event": "UPDATE_USER",
  "date": "ISO-8601 DATE"
}
```
```json
{
  "email": "maria@email.com",
  "event": "UPDATE_PASSWORD",
  "date": "ISO-8601 DATE"
}
```
 

### Dificuldades.

As únicas dificuldades foram os testes, aos quais não consegui dar início. Entretando, foi uma tarefa tranquila usar o rabbitmq para a mensageria.
