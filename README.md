# Gerenciador de Matérias

Este projeto foi desenvolvido para a disciplina de Programação Orientada a Objetos (POO) utilizando a IDE NetBeans. O principal objetivo foi implementar uma aplicação CRUD (Create, Read, Update, Delete), colocando em prática os conceitos fundamentais da orientação a objetos, como encapsulamento, herança, polimorfismo e abstração.

## Funcionalidades

- **Cadastro de matérias**: Permite inserir novos registros no banco de dados.
- **Consulta de matérias**: Exibe os registros cadastrados, mostrando informações como ISBN e título.
- **Atualização de matérias**: Possibilita modificar informações de registros existentes.
- **Remoção de matérias**: Permite excluir registros do banco de dados.
- **Interface gráfica**: Utiliza Java Swing para interação amigável com o usuário.
- **Integração com banco de dados**: Utiliza JDBC para conectar e manipular dados em um banco PostgreSQL.

## Tecnologias Utilizadas

- Java
- Swing (Interface gráfica)
- JDBC (Conexão com banco de dados)
- PostgreSQL
- NetBeans IDE

## Como executar

1. **Clonar o repositório**
   ```bash
   git clone https://github.com/andreeycoutinho34/Gerenciador-de-Materias.java.git
   ```

2. **Configurar o banco de dados**
   - Certifique-se de ter o PostgreSQL instalado e rodando.
   - Crie o banco e a tabela `titulos` conforme o modelo utilizado.
   - Atualize as credenciais de acesso ao banco nos arquivos `.java` caso necessário.

3. **Executar o projeto**
   - Abra o projeto no NetBeans.
   - Execute a classe principal para iniciar a aplicação com a interface gráfica.

## Estrutura do Projeto

- `src/main/java/com/mycompany/jabancodedadosexemplo/JaBancoDeDadosExemplo.java`: Exemplo de conexão e consulta ao banco de dados.
- `src/main/java/com/mycompany/jabancodedadosexemplo/NewJFrame.java`: Interface gráfica principal do sistema.
- Outras classes de apoio conforme necessário.

## Sobre

Este projeto simula um sistema de gerenciamento de matérias/títulos e foi desenvolvido para fins educacionais, visando a prática dos conceitos de orientação a objetos e integração com banco de dados em Java.

---

Qualquer dúvida ou sugestão, fique à vontade para abrir uma issue!
