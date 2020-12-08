# Making-Pages
This will contains the tries of test of pages Automated, including the updates
Los archivos subidos son los siguiente:
Base: Contiene los comandos a usar en el programa a ejecutar. Esto es a manera de prueba, es decir modulo wrapper que de momento se apoya en la sintaxis de Selenium webdriver, pero si alguna vez cambia, solo hay que modificar este documento y no todos los programas.
Loggingvariables: Es una clase creada a manera de modulo independiente que será usada en el test. Se encarga de abrir la página y loguear al usuario.
Makingpages: Este es modulo independiente que se usara en el test. Se encarga de de ir a la sección de "Pages", ir a editor de página con el botón "ADD" y colocar un título a la nueva página, luego publicar esta página.
TestAddingManyPages: Es el test a correr en JUnit, aquí uso un comando recurrente para repetir el proceso 10 veces, es decir que habrán 10 páginas creadas con el mismo título.
TestMakingManypages: Es el mismo test descrito en "TestAddingManyPages" pero realizado en TestNG y ejecutado tal cual, solo que aqui se puede ver un mejor reporte al final que en JUnit.
