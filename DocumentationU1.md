## Backend Documentación

1 - Dependencias de Spring Web y la versión 2.7.7 de Spring Boot.

2 - Package:
  
  - a. controlador
  - b. dominio
  - c. utilidades

3 - Generar las siguientes clases dentro del package que considere necesario,características:

  - a.  Personaje: deberá de tener
    - i.Nombre
    - ii.Edad
    - iii.Peso
    - iv.Historia
    - v.Película o Series asociadas
  
  - b. Película o Serie: deberá de tener
      - i.Titulo
      - ii.Fecha de creación
      - iii.Calificación (del 1 al 5)
      - iv.Personajes asociados

  - c. Género: deberá de tener
      - i. Nombre
      - ii. Películas o series asociados

4 - Generar una clase que instancie una colección con datos dummy por cada clase generada en el punto anterior.

5 - Generar el/los controller que considere necesarios para responder a los siguientes endpoint:

  - a. GET /personajes/{nombre}: busca el personaje por el nombre ingresado.

  - b. GET /personajes: se obtiene todos los personajes y sus correspondientes datos.
  
  - c. GET /personajes/{edad}: busca los personajes de cierta edad
  
  - d. GET /películas: se obtiene todas las películas.

  - e. GET /películas/{titulo}: busca la película por el titulo ingresado.

  - f. GET /películas/{genero}: busca las películas correspondientes a dicho género.




---

<> con ❤️ 
