# SPRING CLOUD

This spring cloud config source is intent to apply and put on practice **spring cloud magic**, everything in this source code is derived from book i learned about spring microservice, and to make things easier to track my history (since i forgetfull) .

# HOW TO!
actually it's easy to run the project
  - check out the project (current branch **cloud-config01** is the **most updated** source code )
  - after you done, go in into the **parentspringproject** and then hit mvn spring-boot:run
  - and then go to the browser **http://localhost:8888/cloudsclientservice01/default** (to get datasource from default properties file) or **http://localhost:8888/cloudsclientservice01/dev** (to get datasource from dev properties file)

### NOTE

> --> **cloudsclientservice01** in the url is from **spring.application.name** in the **cloudserverclientservice/main/resources/bootstrap.yml** 
> --> **dev / default** is from datasource properties either **application-dev** or **application** 
