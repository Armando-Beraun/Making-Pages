# Making-Pages
This will contains the tries of test of pages Automated, including the updates
Los archivos subidos son los siguiente:
Base: contine los comandos a usar en el programa a ejecutar. Esto es a manera de prueba, es decir modulo wrapper que de momento se apoya en la sintaxis de Selenium webdriver, pero si aulguna vez cambia, solo hay que modificar este documento y no todos los programas.
Loggingvariables: Es una clase creada a manera de modulo independiente que sera usada en el test. Se encarga de abrir la pagina y loguear al usuario.
Makingpages: Este es modulo independiete que se usara en el test. Se encarga de de ir a la seccion de "Pages", ir a editor de pagina con el boton "ADD" y colocar un titulo a la nueva pagina, luego publicar esta pagina.
TestAddingManyPages: Es el test a correr en JUnit, aqui uso un comando recurrente para repetir el proceso 10 veces, es decir que habran 10 paginas creadas con el mismo titulo.
TestMakingManypages: Es el mismo test descrito en "TestAddingManyPages" pero realizado en TestNG y ejecutado tal cual, solo que aqui se puede ver un mejor reporte que en JUnit.
