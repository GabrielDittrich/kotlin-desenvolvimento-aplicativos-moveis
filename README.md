# 📱 Desenvolvimento de Aplicativos Móveis — Kotlin & Android

Repositório com projetos, exercícios e atividades desenvolvidos durante a disciplina de **Desenvolvimento de Aplicativos Móveis**, do curso de **Análise e Desenvolvimento de Sistemas da Universidade Positivo**.

Ao longo da disciplina, os conteúdos evoluem dos fundamentos da linguagem **Kotlin** até o desenvolvimento de aplicações Android utilizando **Activities, Fragments, RecyclerView, Room, Android Architecture Components e Jetpack Compose**.

---

## 📚 Sobre o repositório

O repositório registra a evolução prática dos conteúdos estudados durante a disciplina.

As primeiras atividades trabalham fundamentos de Kotlin e Programação Orientada a Objetos. Em seguida, são introduzidos conceitos específicos do desenvolvimento Android, como **Activities, ciclo de vida, Intents, interfaces XML e Fragments**.

Nas atividades mais avançadas são utilizados recursos do ecossistema Android Jetpack, incluindo:

* RecyclerView;
* Room;
* ViewModel;
* LiveData;
* Repository;
* Coroutines;
* Jetpack Compose;
* Material 3;
* Navigation Compose.

---

## 🛠️ Tecnologias utilizadas

### 📱 Desenvolvimento Android

* **Kotlin**
* **Android SDK**
* **AndroidX**
* **Android Studio**

### 🎨 Interface

* **XML Layouts**
* **Material Components**
* **RecyclerView**
* **Jetpack Compose**
* **Material 3**

### 🗄️ Persistência e arquitetura

* **Room**
* **SQLite**
* **DAO**
* **Repository**
* **ViewModel**
* **LiveData**
* **Kotlin Coroutines**

### 🧭 Navegação

* **Activities**
* **Intents**
* **Fragments**
* **FragmentManager**
* **Navigation Compose**

---

## ✨ Conceitos praticados

### Kotlin

* Variáveis e tipos de dados
* Nullable types
* Strings
* Arrays e listas
* Laços de repetição
* Funções
* Classes e objetos
* Encapsulamento
* Construtores
* Herança
* Sobrescrita de métodos
* Classes abstratas
* Interfaces
* Polimorfismo

### Android

* Activities
* Ciclo de vida de Activities
* Intents
* Passagem de dados entre telas
* Layouts XML
* TextInput
* Botões e eventos
* Fragments
* RecyclerView
* Material Design

### Persistência

* Entidades Room
* `@Entity`
* `@PrimaryKey`
* DAO
* `@Insert`
* `@Update`
* `@Delete`
* `@Query`
* RoomDatabase
* Persistência local

### Arquitetura Android

* Repository
* ViewModel
* LiveData
* `viewModelScope`
* Coroutines
* Separação entre acesso a dados e interface

### Jetpack Compose

* Funções `@Composable`
* `Surface`
* `Card`
* `Column`
* `Row`
* `LazyColumn`
* `OutlinedTextField`
* Estados com `remember`
* `mutableStateOf`
* Material 3
* Navigation Compose

---

# 📈 Evolução das atividades

## 🟢 Aula 01 — Fundamentos de Kotlin

Primeiros exercícios utilizando a linguagem Kotlin.

Foram praticados conceitos envolvendo:

* entrada de dados;
* strings;
* nullable types;
* conversão de tipos;
* manipulação de textos;
* cálculo de médias;
* contagem de caracteres;
* `substring`;
* `replace`;
* `reversed`.

---

## 🟢 Aula 02 — Funções, coleções e manipulação de strings

Continuação dos fundamentos de Kotlin através de diferentes exercícios.

Entre os conteúdos praticados estão:

* criação de funções;
* parâmetros;
* retorno de valores;
* listas;
* `for`;
* `when`;
* manipulação de strings;
* anagramas;
* palíndromos;
* compressão de strings;
* cálculos.

---

## 🟢 Aula 03 — Arrays e temperaturas

Exercício utilizando um array de temperaturas.

A atividade trabalha:

* `FloatArray`;
* percorrimento de arrays;
* comparação entre valores;
* identificação da maior temperatura;
* identificação da menor temperatura.

---

## 🟢 Aula 04 — Programação Orientada a Objetos

Introdução e prática dos principais conceitos de POO em Kotlin.

Foram utilizados:

* classes;
* atributos;
* construtores;
* encapsulamento;
* getters e setters;
* herança;
* sobrescrita de métodos.

Entre os exemplos estão classes como:

```text
Carro
Celular
Animal
Cachorro
```

---

## 🟢 Aula 05 — Abstração, herança e interfaces

Aprofundamento dos conceitos de Programação Orientada a Objetos.

Foram desenvolvidos exemplos utilizando:

### Classes abstratas

```text
Forma
├── Circulo
└── Retangulo
```

### Funcionários

```text
Funcionario
├── Programador
└── Gerente
```

### Herança

```text
Veiculo
├── Carro
└── Moto
```

### Interfaces

Interfaces foram utilizadas para definir comportamentos compartilhados entre diferentes classes.

Entre os conceitos praticados estão:

* `abstract`;
* `open`;
* `override`;
* interfaces;
* implementação de métodos;
* polimorfismo.

---

# 📱 Desenvolvimento Android

## 🟢 Aula 06 — Primeira aplicação Android

Primeiro projeto Android desenvolvido com Kotlin e interface em XML.

Foi criada uma aplicação simples de **conversão de moedas**, utilizando:

* Activity;
* XML;
* TextInputLayout;
* TextInputEditText;
* Buttons;
* eventos de clique;
* leitura e alteração de valores da interface.

Essa etapa marca a transição dos exercícios em Kotlin puro para aplicações Android.

---

## 🟢 Aula 07 — Activities, ciclo de vida e navegação

Nesta etapa foram desenvolvidos diferentes projetos Android.

### 🧮 Calculadora

Aplicação utilizando campos de entrada e estrutura preparada para operações matemáticas.

### 💱 Conversão de moedas

Evolução da aplicação anterior com conversão entre real e dólar.

Também são estudados os métodos do ciclo de vida de uma Activity:

```text
onCreate
onStart
onResume
onPause
onStop
onRestart
onDestroy
```

### 📲 Navegação entre telas

Foram criadas aplicações com múltiplas Activities utilizando:

* `Intent`;
* `putExtra`;
* recuperação de dados;
* navegação entre telas;
* encerramento de Activities com `finish()`.

Também foram desenvolvidos exemplos com diferentes telas e passagem de informações entre elas.

---

## 🟢 Aula 08 — Fragments

Introdução à divisão da interface utilizando **Fragments**.

A aplicação possui diferentes fragments que podem ser substituídos dinamicamente através de botões.

Foram praticados:

* criação de Fragment;
* layouts específicos para cada Fragment;
* `FragmentManager`;
* `beginTransaction()`;
* `replace()`;
* `commit()`.

Exemplo:

```text
MainActivity
│
├── BlankFragment
├── OutroFragmento
└── BlackFragment
```

---

## 🟢 Aula 09 — Introdução ao Room

Desenvolvimento de uma aplicação para cadastro de livros utilizando persistência local com **Room**.

A entidade `Livro` possui:

* ID;
* nome;
* ano.

A camada de acesso aos dados utiliza um `LivroDao` com operações como:

```text
INSERT
UPDATE
DELETE
SELECT
```

Também são introduzidos componentes importantes da arquitetura Android:

```text
Livro
↓
LivroDao
↓
LivroDatabase
↓
LivroRepository
↓
LivroViewModel
↓
Interface
```

Foram utilizados:

* Room;
* DAO;
* Repository;
* ViewModel;
* LiveData;
* Coroutines;
* `viewModelScope`;
* Fragments.

---

## 🟢 Aula 10 — Room + RecyclerView

Evolução da aplicação de livros desenvolvida na aula anterior.

Além da persistência com Room, a aplicação passa a utilizar **RecyclerView** para exibição dos registros.

Entre os recursos estudados estão:

* RecyclerView;
* Adapter;
* ViewHolder;
* Fragments;
* FloatingActionButton;
* ViewModel;
* LiveData;
* Repository;
* Room;
* cadastro de livros;
* estrutura para edição de registros.

Os registros recuperados através do ViewModel são observados pela interface utilizando LiveData.

---

# 🎨 Jetpack Compose

## 🟢 Aula 11 — Introdução ao Jetpack Compose

Primeiro contato com a criação declarativa de interfaces Android utilizando **Jetpack Compose**.

Foram utilizados componentes como:

* `Surface`;
* `Card`;
* `Image`;
* `Text`;
* `Modifier`;
* `MaterialTheme`;
* `RoundedCornerShape`;
* `CircleShape`.

Também foram explorados:

* tamanho e espaçamento;
* bordas;
* elevação;
* imagens;
* Material 3;
* Preview de componentes.

Essa etapa apresenta uma alternativa moderna aos layouts tradicionais em XML.

---

## 🟢 Aula 12 — Jetpack Compose + Room

Integração dos conteúdos das aulas anteriores através de uma aplicação utilizando:

* Kotlin;
* Jetpack Compose;
* Material 3;
* Room;
* Coroutines;
* Navigation Compose.

A aplicação trabalha novamente com a entidade `Livro`.

### 🗄️ Persistência

São utilizados:

```text
Livro
LivroDao
LivroDatabase
```

com operações de:

* cadastro;
* atualização;
* exclusão;
* listagem;
* ordenação dos registros.

### 🎨 Interface

A interface utiliza componentes Compose como:

```text
Surface
Column
Row
Card
LazyColumn
OutlinedTextField
Button
Text
```

Também são utilizados estados:

```kotlin
remember
mutableStateOf
```

e Coroutines para operações com o banco de dados.

### 🧭 Navegação

O projeto utiliza **Navigation Compose** para navegação entre:

```text
TelaMenu
   ↓
TelaDetalhes
```

A tela de detalhes recebe informações através da rota de navegação e permite retornar à tela anterior.

---

# 📁 Estrutura do repositório

```text
kotlin-desenvolvimento-aplicativos-moveis/
│
├── Aula01/                 # Fundamentos de Kotlin
├── Aula02/                 # Funções e strings
├── Aula03/                 # Arrays
├── Aula04/                 # Programação Orientada a Objetos
├── Aula05/                 # Herança, abstração e interfaces
│
├── Aula06/                 # Primeira aplicação Android
│
├── Aula07/
│   ├── Calculadora/
│   ├── ConversaoDeMoeda/
│   └── VariasTelas/
│
├── Aula08/                 # Fragments
├── Aula09/                 # Room e Architecture Components
├── Aula10/                 # Room + RecyclerView
├── Aula11/                 # Jetpack Compose
├── Aula12/                 # Room + Compose + Navigation
│
└── README.md
```

---

# ▶️ Como executar

As atividades são **projetos independentes**, portanto não existe um único projeto Android que execute todas as aulas.

## ✔️ Pré-requisitos

Para as primeiras atividades:

* JDK
* Kotlin

Para os projetos Android:

* Android Studio
* Android SDK
* Emulador Android ou dispositivo físico

---

## 📥 Clone o repositório

```bash
git clone https://github.com/GabrielDittrich/kotlin-desenvolvimento-aplicativos-moveis.git
```

Entre na pasta:

```bash
cd kotlin-desenvolvimento-aplicativos-moveis
```

---

## 📱 Executando um projeto Android

Escolha uma das atividades Android, por exemplo:

```text
Aula12/
```

No Android Studio:

1. Abra a pasta da aula desejada.
2. Aguarde a sincronização do Gradle.
3. Selecione um emulador ou dispositivo físico.
4. Execute o projeto através de **Run**.

Como cada aula representa uma etapa diferente da disciplina, algumas utilizam dependências e versões distintas das bibliotecas Android.

---

# 🎓 Contexto acadêmico

Repositório desenvolvido durante a disciplina **Desenvolvimento de Aplicativos Móveis**, do curso de **Análise e Desenvolvimento de Sistemas da Universidade Positivo**.

As atividades registram a evolução do aprendizado desde os fundamentos de Kotlin até desenvolvimento Android utilizando **Activities, Fragments, persistência local e interfaces modernas com Jetpack Compose**.

---

## ⚠️ Observação

Os projetos foram desenvolvidos com **finalidade acadêmica** e representam diferentes momentos do processo de aprendizado.

Por esse motivo, algumas atividades possuem implementações simplificadas, código de experimentação ou funcionalidades parcialmente desenvolvidas.

O objetivo do repositório é preservar a evolução prática no desenvolvimento de aplicações Android utilizando **Kotlin e o ecossistema Android Jetpack**.
