### GraphQL - Java Spring Book

The following sample project is a Java GraphQL implementation of retrieving and creating books and authors
of the books. The project has been implemented using:

- Spring
- graphql-java-tools
- spring-boot-starter-data-jpa
- hsql database
- refer to the pom.xml for more information

The project includes the creation of authors and books and loading them into a simple HSQL in memory database.

The project consists of developing a graphql solution using a schema based approach (top-down, instead of code based (bottom-up))

- Just like how graphql proejects/implementations are done, the schema file can be found in the resources folder with the
*.graphqls extension
  
- The .graphqls extension is read and loaded into spring automatically (with the help of graphql-spring-boot-starter package)
so implementation of the graphql data fetchers and manually loading/parsing the schema (usually found int he BookServer.java file)
  was not necessary
  
- models to represent the author and the books were created and different models to represent the graphql inputs (for mutations) were
also created
  
- query and mutations were implemented in this project:
    - retrieval of books
    - retrieval of authors and their books
    - creation of a book
    - creation of an author