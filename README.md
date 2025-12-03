# 📘 Gerenciador de Tarefas em Java

## 📌 Descrição do Projeto
Este projeto é um **sistema de gerenciamento de tarefas** desenvolvido em Java utilizando **Programação Orientada a Objetos (POO)** e uma arquitetura em camadas organizada.  
O sistema funciona via **console** e permite realizar operações CRUD completas.

Cada tarefa possui:
- ID (autoincrementado)
- Título
- Descrição
- Data de conclusão (LocalDate)

As operações disponíveis são:
- Criar tarefa
- Listar tarefas
- Atualizar tarefa
- Excluir tarefa

## 📂 Estrutura do Projeto

```bash
src/
 └── main/
      └── java/
           ├── model/
           │     └── Tarefa.java
           ├── repository/
           │     └── TarefaRepository.java
           ├── service/
           │     └── TarefaService.java
           └── app/
                 └── Main.java
```  

## 🧠 Conceitos Utilizados
- Programação Orientada a Objetos (POO)
- Manipulação de datas com LocalDate
- Entrada via console usando Scanner
- Locale.US


## ⚙️ Tecnologias Utilizadas
- Java 17+
- Biblioteca java.time
- Console (modo texto)

## ▶️ Como Executar

### Clonar o repositório
- https://github.com/eudesolv/CRUD-lab.git

Acessar o diretório do projeto
- cd (CRUD-lab)

Compilar o projeto
- javac -d out src/main/java/**/*.java

Executar o sistema
- java -cp out app.Main

📌 Funcionalidades
- Criar tarefas

- Listar tarefas

- Atualizar tarefas

- Excluir tarefas

- IDs autoincrementados

- Datas no formato AAAA-MM-DD

- Código organizado em pacotes

👤 Autor
Eudes Oliveira
GitHub: https://github.com/eudesolv
