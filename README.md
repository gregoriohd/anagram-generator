
# Gerador de Anagramas em Java

Este projeto é uma aplicação Java que gera todos os anagramas possíveis a partir de uma palavra composta por letras distintas. A solução inclui validação da entrada, geração de anagramas e testes unitários utilizando **JUnit 5**.

## 🚀 Funcionalidades

- 🔡 Geração de todos os anagramas possíveis de uma palavra.
- ✅ Validação da entrada para garantir que contenha apenas letras.
- 🔒 Tratamento de erros para entradas inválidas (nula, vazia ou com caracteres não alfabéticos).
- 🧪 Testes unitários abrangentes utilizando **JUnit 5**.
- 📜 Documentação automática utilizando **Javadoc**.

## 📂 Estrutura do Projeto

```
anagram-generator/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── br/com/gregoriosantos/anagram/
│   │           ├── App.java
│   │           └── util/
│   │               └── AnagramGenerator.java
│   └── test/
│       └── java/
│           └── br/com/gregoriosantos/anagram/util/
│               └── AnagramGeneratorTest.java
├── pom.xml
└── README.md
```

## 🔧 Requisitos

- Java 11 ou superior
- Maven 3.6 ou superior

## 🏃‍♂️ Como executar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/anagram-generator.git
cd anagram-generator
```

### 2. Compilar o projeto

```bash
mvn clean compile
```

### 3. Executar a aplicação

```bash
mvn exec:java -Dexec.mainClass="br.com.gregoriosantos.anagram.App"
```

### ✔️ Saída esperada

```
Anagramas de 'abc': [acb, bca, abc, cba, bac, cab]
```

---

## 🧪 Executando os testes

```bash
mvn test
```

### ✔️ Resultado dos testes

Todos os testes devem passar, validando:

- Geração correta dos anagramas.
- Validação da entrada.
- Tratamento de exceções para casos inválidos.

---

## 📜 Gerando documentação com Javadoc

### 1. Gerar a documentação

```bash
mvn javadoc:javadoc
```

### 2. Acessar a documentação

Abra o arquivo no navegador:

```
target/site/apidocs/index.html
```

---

## 📖 Exemplo de uso no código

```java
List<String> anagrams = AnagramGenerator.generateAnagrams("abc");
System.out.println(anagrams); 
// Saída: [acb, bca, abc, cba, bac, cab]
```

---

## ⚠️ Validações implementadas

- 🚫 Não aceita string nula.
- 🚫 Não aceita string vazia.
- 🚫 Não aceita caracteres não alfabéticos (números, símbolos, espaços).
- ✅ Aceita letras maiúsculas e minúsculas.

---

## 👨‍💻 Autor

- [**Gregorio Santos**](http://gregoriosantos.com.br) - [LinkedIn](https://www.linkedin.com/in/gregorio-santos) | [GitHub](https://github.com/gregoriohd)

---
