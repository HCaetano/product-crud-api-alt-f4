# product-crud-api-alt-f4

## Technical test code for the Alt F4 Tecnologia interview. 

The task: We ask of you to develop an API in Java that handles an entity called "Product". The API should be able to perform the following basic operations:

- List all products;
- List a single product by its id;
- Create a product;
- Edit a product;
- Delete a product.

## Swagger UI 

Documentation of the API made by <a href="https://swagger.io/tools/swagger-ui/">Swagger UI</a> can be acessed at http://localhost:8080/swagger-ui.html 

## Project Lombok

Since we are using <a href="https://projectlombok.org/">Project Lombok</a>, there may be an issue with the IDE on ```ProductService```'s line 25. Due to Lombok's nature, the method ```setId``` might not be recognized by the IDE. In order to solve that on IntelliJ (our chosen IDE), <a href="https://www.baeldung.com/lombok-ide">these</a> instructions can be followed.

Also on Lombok: due to the lack of an option to customize a specific type of constructor, we had to use the library's default one. The problem is it shows the ```id``` field on Swagger UI, although trying to assign a value to it doesn't change anything. The ```@GeneratedValue``` annotation, as far as we know, is working perfectly.

## Database

We are using PostgreSQL as our database. User and password configuration can be found on ```src/main/resources/application.yaml```.
