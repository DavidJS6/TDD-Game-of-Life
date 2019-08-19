# TDD Juego de la vida
Implementación del juego de la vida utilizando lenguaje Java y TDD para el
manejo de las pruebas.

El proyecto cuenta con tres clases: Cell, World y Game, las cuales tienen la
siguiente descripción:

* Cell: Clase donde se almacena el valor actual y futuro (el cual se usara)
en la próxima instancia) de una célula. La clase donde se encuentran sus pruebas
se llama CellTest y cuenta con los siguientes métodos:

    - DeadCellTest: Prueba que se encarga de validar si una célula creada muerta
    tiene el valor correspondiente.
    
    - AliveCellTest Prueba que se encarga de validar si una célula creada viva
    tiene el valor correspondiente.
    
    - KillingCellTest: Prueba que se encarga de validar si una célula creada viva
    es eliminada correctamente en la siguiente instancia.
     
    - RevivingCellTest: Prueba que se encarga de validar si una célula creada muerta
    es revivida correctamente en la siguiente instancia.
   
* World: Clase donde se almacena una matriz de células para representar el espacio
donde se desarrollara el juego. La clase donde se encuentran sus pruebas se llama
WorldTest y cuenta con los siguientes métodos:

    - WorldHorizontalSizeTest: Prueba que se encarga de validar si la longitud
    horizontal del espacio para el juego es el valor especificado.
    
    - WorldVerticalSizeTest: Prueba que se encarga de validar si la longitud
    Vertical del espacio para el juego es el valor especificado.
    
    - RevivingCellTest: Prueba que se encarga de validar si una célula revivida
    del juego tiene el valor correcto.
    
    - KillingCellTest: Prueba que se encarga de validar si una célula eliminada
    del juego tiene el valor correcto.
    
    - WorldDrawTest: Prueba que se encarga de validar si el espacio de juego es
    representado adecuadamente en base a su longitud, esto debido a que el espacio
    se representa en una cadena de carácteres. 

* Game: Clase desde donde se inicia el juego y se tiene la implementación de las
reglas del mismo, junto a una instancia del espacio de juego para acceder a las células.
La clase donde se encuentran sus pruebas se llama GameTest y cuenta con cinco métodos
en donde junto a cada método se encuentra una pequeña representación del espacio de juego
donde se lleva a cabo la prueba, los métodos son:

    - FindFourNeighboursCellFromMiddleTest: Prueba que se encarga de validar que la cantidad de
    células vecinas vivas a partir de un punto especifico en el espacio de juego es 4.
    
    - FindZeroNeighboursCellFromMiddleTest: Prueba que se encarga de validar que la cantidad de
    células vecinas vivas a partir de un punto específico en el espacio de juego es 0.
    
    - tryToReviveWithSuccessTest: Prueba que se encarga de validar si una célula que se encuentra
    muerta cumple con las reglas para ser revivida. Se espera que el resultado sea positivo. 
    
    - tryToReviveWithFailTest: Prueba que se encarga de validar si una célula que se encuentra
    muerta cumple con las reglas para ser revivida. Se espera que el resultado sea negativo.
    
    - tryToKillWithSucessTest: Prueba que se encarga de validar si una célula que se encuentra
    viva cumple con las reglas para ser eliminada. Se espera que el resultado sea positivo.
    
    - tryToKillWithFailTest: Prueba que se encarga de validar si una célula que se encuentra
    viva cumple con las reglas para ser eliminada. Se espera que el resultado sea negativo.
    
    
### Cómo ejecutar

Para poder ejecutar tanto el proyecto como las pruebas unitarias primero se debera clonar este
repositorio y luego seguir los siguientes pasos:

#### Ejecución del proyecto

Para poder ejecutar el proyecto basta con ejecutar el método main que se encuentra en la clase main en el
paquete com.example.game_of_life. El juego cuenta con dos métodos para poder ejecutarse, los cuales
ya se encuentran dentro del método main solo que uno esta comentado:

- startLimitedGame: El cual se encarga de ejecutar el proyecto y mostrar cómo se modifican las
celulas en el espacio durante 10 instancias.

- startEndlessGame: El cual se encarga de ejecutar el proyecto y mostrar cómo se modifican las
células en el espacio cada 2 segundos durante un tiempo indefinido.

Solo es necesario modificar el código para dejar el método que se quiera utilizar y compilar
el proyecto.

#### Ejecución de las pruebas unitarias

Para la ejecución de las pruebas unitarias solo es necesario acceder a las clases que se 
encuentran en el paquete test.com.example.game_of_life y ejecutar los pruebas que se deseen.
