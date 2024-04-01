[![Finalizado](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)](https://github.com/imetropoledigital/trabalho-final-matheus-costa-vidal)
<h1 align="center">Sistema Web para Cadastro de Empresas</h1>

O projeto é um sistema web para cadastro de empresas, desenvolvido utilizando tecnologias Java como JPA, JSF, PrimeFaces, Hibernate, entre outras. O sistema visa facilitar o gerenciamento e o registro de informações relacionadas a empresas, proporcionando uma interface amigável e funcionalidades úteis para os usuários.

## Funcionalidades do Sistema ⚙️
O sistema oferece várias funcionalidades para os usuários, incluindo:

1. 📋 **Cadastro de Empresas**: Os usuários podem cadastrar novas empresas, fornecendo informações como razão social, nome fantasia, CNPJ, data de fundação, ramo de atividade, etc.

2. ✏️ **Edição e Exclusão de Empresas**: Os usuários podem editar e excluir empresas existentes conforme necessário.

3. 🔍 **Pesquisa de Empresas**: Os usuários podem pesquisar empresas com base em critérios como nome, CNPJ, ramo de atividade, etc.

4. 📤 **Exportação de Dados**: Os usuários podem exportar os dados das empresas para formatos como Excel, facilitando a análise e o compartilhamento de informações.

5. ✅ **Validação de Dados**: O sistema realiza validações de dados para garantir que apenas informações válidas sejam inseridas no banco de dados.

6. 🎨 **Interface Amigável**: O sistema oferece uma interface amigável e intuitiva, com componentes visuais fornecidos pelo PrimeFaces, facilitando a interação dos usuários.


## Tecnologias utilizadas 💻

- Java
- JPA (Java Persistence API)
- Tomcat
- CDI (Contexts and Dependency Injection)
- JSF (JavaServer Faces)
- PrimeFaces
- Hibernate
- MVC (Model-View-Controller)

## Estrutura do Projeto 🏗️
O projeto está estruturado com base no padrão de arquitetura MVC (Model-View-Controller), onde:

- **`Model:`** Representado pelas classes Java que definem os objetos de negócio, como a classe Empresa e RamoAtividade. Essas classes são mapeadas para o banco de dados usando JPA e Hibernate.

- **`View:`** Representado pelas páginas JSF (JavaServer Faces), localizadas no diretório WebContent. As páginas JSF definem a interface do usuário e interagem com o controlador para exibir dados e processar ações do usuário.

- **`Controller:`** Representado pelas classes Java no pacote controller, como GestaoEmpresasBean. Essas classes controlam o fluxo da aplicação, processam as requisições do usuário e interagem com o modelo para buscar ou persistir dados.

## Dependências do Projeto 📦
As dependências do projeto são gerenciadas pelo Maven e estão especificadas no arquivo [pom.xml](pom.xml). Algumas das principais dependências incluem:

- Apache POI: Para trabalhar com arquivos do Microsoft Excel.
- Weld Servlet: Implementação do CDI para integração com Servlets.
- PrimeFaces: Biblioteca de componentes JSF rica em funcionalidades.
- Hibernate Validator: Para validação de dados.
- Hibernate Core: Implementação do JPA utilizando Hibernate.
- MySQL Connector: Driver JDBC para MySQL.
- JAXB API: Para manipulação de XML.

## Como Executar o Projeto 🔧
Antes de executar o projeto, certifique-se de ter os seguintes pré-requisitos instalados e configurados:
1. Java Development Kit (JDK): Versão adequada instalada e configurada.
2. Apache Maven: Ferramenta de automação de compilação e gerenciamento de dependências.
3. Servidor de Aplicação (Apache Tomcat): Configurado para implantar a aplicação.
4. MySQL Database: Instalado e configurado, com o esquema do banco de dados criado.
5. IDE Java: Opcional, mas recomendado para facilitar o desenvolvimento.

Para executar o projeto, siga estes passos:

- Clone o repositório do projeto em sua máquina local.
- Certifique-se de que o ambiente Java (JDK) está instalado em sua máquina.
- Importe o projeto em sua IDE Java de preferência.
- Configure um servidor Apache Tomcat na IDE, se ainda não estiver configurado.
- Compile e execute o projeto na IDE.

Certifique-se de configurar corretamente o banco de dados MySQL e ajustar as configurações de conexão conforme necessário no arquivo [persistence.xml](src/main/resources/META-INF/persistence.xml).

## Contribuição 🤝
Contribuições são bem-vindas! Se você encontrar problemas, bugs ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Autor 🧑‍💻

| [<img src="https://avatars.githubusercontent.com/u/102569695?s=400&u=f20bbb53cc46ec2bae01f8d60a28492bfdccbdd5&v=4" width=115><br><sub>Matheus Vidal</sub>](https://github.com/matheusvidal21) |
| :---: | 
