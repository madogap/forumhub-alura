<h1>Fórum Hub API</h1>

<p>Gerencie seu fórum com facilidade e dinamismo!</p>

<hr />

## Descrição
<p>A API Rest do aplicativo Forum Hub oferece funcionalidades CRUD completas para gerenciar usuários, cursos, tópicos e comentários, além de facilitar a interação entre esses elementos para criar um fórum dinâmico e interativo.</p>

<br />

Configuração do Projeto
### Pré-requisitos
<ul>
  <li>
    Java JDK 17
  </li>
  <li>
    Maven 3.9.6 ou superior    
  </li>
</ul>

### Banco de Dados
<ul>
  <li>
    MySQL
  </li>
  <li>
     <p>Altere as credenciais de acesso ao banco de dados no arquivo application.properties: Properties</p>
  </li>
  <li>
    <pre>spring.datasource.username=USUÁRIO</pre>
  </li>
  <li>
    <pre>spring.datasource.password=SENHA</pre>
  </li>
  <li>
    <p>Banco de dados sugerido: forumhub</p>
    <pre>spring.datasource.url=jdbc:mysql://localhost:3306/forumhub</pre>
  </li>
</ul>

<br />

## Documentação
### Acesse a documentação completa da API:

<pre>.../swagger-ui.html</pre>
<pre>.../swagger-ui/**</pre>
<pre>.../v3/api-docs/**</pre>
<br />

<p>Tecnologias Utilizadas</p>
<p>Linguagem de Programação: Java</p>
<p>Framework: Spring Boot</p>
<p>Banco de Dados: MySQL</p>
<p>Ferramentas:</p>
<p>Maven</p>
<p>Spring Initializr</p>
<p>Postman (opcional, para testes)</p>
<br />

# Instalação e Uso
## 1. Clone o Repositório:

<p>Bash</p>
<pre>git clone https://github.com/SEU_USUARIO/forum-hub-api.git</pre>
<p>Use o código com cuidado.</p>

## 2. Navegue para o Diretório do Projeto:

<p>Bash</p>
<p>cd forum-hub-api</p>
<p>Use o código com cuidado.</p>

## 3. Instale as Dependências:

<p>Bash</p>
<p>mvn install</p>
<p>Use o código com cuidado.</p>

## 4. Execute a Aplicação:

<p>Bash</p>
<p>mvn spring-boot:run</p>
<p>Use o código com cuidado.</p>

## 5. Acesse a Documentação:

<p>Abra um navegador e acesse um dos seguintes endereços:</p>
<ol>
  <li>
    http://localhost:8080/swagger-ui.html
  </li>
  <li>
    http://localhost:8080/swagger-ui/**
  </li>
  <li>
    http://localhost:8080/v3/api-docs/**
  </li>
</ol>

## 6. Testes (Opcional):

### Utilize o Postman ou outra ferramenta de teste de API para realizar testes manuais dos endpoints da API.

<br />

<p>Observações</p>
<p>Certifique-se de ter o Java JDK 17 e o Maven 3.9.6 ou superior instalados em seu sistema.</p>
<p>Substitua SEU_USUARIO no comando de clone pelo seu nome de usuário do GitHub.</p>
<p>A porta padrão da aplicação é 8080, mas você pode alterá-la no arquivo application.properties.</p>
<br />

Contribuições
<p>Se você deseja contribuir com o projeto, sinta-se à vontade para enviar solicitações de pull com suas sugestões e melhorias.</p>

<br />
