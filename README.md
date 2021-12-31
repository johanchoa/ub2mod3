# ub2mod3 Grupo 2:

Integrantes del equipo:

Alfonso Gutierrez Cordoba
Johan Sebastian Choconta Agudelo

La actividad la dividimos en que cada integrante del equipo realizar tres de los seis test de la actividad final.

1 - COMO usuario QUIERO ser capaz de darme de alta (Sign Up) en la Tienda Online.  (Realizada por Johan Choconta)
2 - COMO usuario QUIERO ser capaz de iniciar sesión en la Tienda Online. (Realizada por Johan Choconta)
3 - COMO usuario QUIERO ser capaz de navegar por los diferentes tipos de productos (Teléfonos, ordenadores y Pantallas).  (Realizada por Johan Choconta)
4 - COMO usuario QUIERO añadir al carrito un Samsung galaxy s7, Samsung galaxy s6 y un Sony vaio i7. (Realizada por Alfonso Gutierrez)
5 - COMO usuario QUIERO eliminar del carrito el Samsung galaxy s6. (Realizada por Alfonso Gutierrez)
6 - COMO usuario QUIERO realizar el pedido de los artículos seleccionados. // (Realizada por Alfonso Gutierrez)

Actividades realizadas por Johan Choconta:

Como actividad preliminar, se realizó la creación del proyecto junto con la sincronización con el repositorio en GitHub.

Se creo el archivo POM.xlm con las Propiedades, dependencias y pluggins necesarios para la actividad. Se realizo la configuración del controlador chromedriver para la ejecución de las pruebas automáticas, en la ruta resources/drivers/windows/chromedriver.exe

Para esta actividad se crearon  como punto de partida, en la sección de features ubicados en src/test/resources/features los documentos de cucumber .features en lenguaje Gherkin para la declaración de los pasos a ejecutar en cada una de las pruebas.
Para el punto 1 de la actividad se creó el documento SignUp.feature ubicado en  src/test/resources/features/SignUp.feature
Para el punto 2 de la actividad se creó el documento LogIn.feature ubicado en  src/test/resources/features/LogIn.feature
Para el punto 3 de la actividad se creó el documento Navigate.feature ubicado en  src/test/resources/features/Navigate.feature

a su vez, fueron creadas las clases dentro de los step_definitions para la ejecución de las pruebas solicitadas.

Para el punto 1 de la actividad se creó la clase SignUp.feature ubicado en  src/test/java/step_definitions/SignUpSteps.java
Para el punto 2 de la actividad se creó la clase LogIn.feature ubicado en  src/test/java/step_definitions/LogInSteps.java
Para el punto 3 de la actividad se creó la clase Navigate.feature ubicado en  src/test/java/step_definitions/NavigateSteps.java

las pruebas de estas tres actividades generaron el PASSED requerido.

Actividades realizadas por Alfonso Gutiérrez:

Dada la configuración que previamente Johan realizó para incluir las propiedades, dependencias y pluggins en el archivo POM.xml y la configuración del Chromedriver en el cual ambos nos basamos para las pruebas y dado que trabajamos bajo el mismo sistema operativo, procedí a realizar las siguientes 3 actividades (4,5 y 6).

Para esta actividad se crearon  como punto de partida, en la sección de features ubicados en src/test/resources/features los documentos de cucumber .features en lenguaje Gherkin para la declaración de los pasos a ejecutar en cada una de las pruebas.

Para el punto 4 de la actividad se creó el documento Selector.feature ubicado en  src/test/resources/features/Selector.feature
Para el punto 5 de la actividad se creó el documento DeleteProduct.feature ubicado en  src/test/resources/features/DeleteProduct.feature 
Para el punto 6 de la actividad se creó el documento ExecuteOrder.feature ubicado en  src/test/resources/features/ExecuteOrder.feature

a su vez, fueron creadas las clases dentro de los step_definitions para la ejecución de las pruebas solicitadas.

Para el punto 4 de la actividad se creó la clase Selector.feature ubicado en  src/test/java/step_definitions/SelectProducts.java
Para el punto 5 de la actividad se creó la clase DeleteProduct.feature  ubicado en  src/test/java/step_definitions/DeleteProduct.java
Para el punto 6 de la actividad se creó la clase ExecuteOrder.feature ubicado en  src/test/java/step_definitions/OrderProducts.java

las pruebas de estas tres actividades generaron el PASSED requerido.



