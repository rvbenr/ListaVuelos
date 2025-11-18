# ListaVuelos
Segunda prueba técnica
En esta segunda prueba técnica realicé una app que nos permite filtrar vuelos por su fecha de salida y su fecha de llegada.

Para ello distribuí el código en packages, para guardar una organización y que el código sea má limpio.

En el Main cree una lista de 10 vuelos de prueba para así corroborar que la app funciona. En la parte inicial podemos modificar los filtros anuestro gusto para que así podamos comprobar que funciona correctamente.

Cree la carpeta de entities con una Java class "Vuelos" donde almaceno todas las variables de mi proyecto añadiendo tambien los "Getters" y un "toString".

Por último cree la carpeta "utils" con la Java class "FiltroVuelos" donde aplico un par de "ifs" para que la app devuelva lo que a mi me interesa, utizando el .sorted conseguimos que la lista final esté en orden cronológico y con el .collect devolvemos la lista.
