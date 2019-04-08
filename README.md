A ) MECANISMO PARA PREPARAR UN AMBIENTE DE PRUEBAS LOCAL

-- SERVICIOS WEB --

1 - Generar un proyecto de JAVA EE con el IDE de su preferencia (Se recomienda Oracle Netbeans).

2 - Importar y compilar al proyecto recien creado cada una de las clases java ubicadas en el directorio: Herramienta-y-Casos-de-prueba-V1.0.0\Servicios Web\src\java\

-- HERRAMIENTA DE PRUEBAS --

3 - Generar un proyecto para crear una aplicación de escritorio JAVA con el IDE de su preferencia (Se recomienda Oracle Netbeans).

4 - Importar y compilar al proyecto recien creado cada una de las clases java ubicadas en el directorio: Herramienta-y-Casos-de-prueba-V1.0.0\Herramienta\src

5 - Conectar la herramienta de pruebas con los servicios web creados en el Paso 2 y ejecutar la aplicación.

B ) EJECUCIÓN DE LAS PRUEBAS Y DESARROLLO DEL EXPERIMENTO

1 - Seleccionar en la pestaña principal el caso de prueba a ejecutar:HIPERCUBO, BERNOULLI, TAYLOR (1), TAYLOR (2), CONTINUAS (1), CONTINUAS (2), DISCRETAS

2 - Seleccionar el número de repeticiones simultáneas (throughput) de cada caso de prueba:

HIPERCUBO	10	25	50	100	125	150	175	200	225	250

BERNOULLI	25	50	100	150	200	250	300	350	400	450

TAYLOR (1)	100	150	200	250	300	100	150	200	250	300

TAYLOR (2)	100	150	200	250	300	100	150	200	250	300

CONTINUAS (1)	25	50	75	100	125	150	175	200	300	500

CONTINUAS (2)	25	50	75	100	125	150	175	200	300	500

DISCRETAS	25	50	75	100	125	150	175	200	300	500

3 - Seleccione el número de repeticiones del experimento (30 repeticiones por default es el mínimo para considerar que los resultados comienzan a ser estadísticamente significativos)

4 - Presione el boton: "INICIAR" y espere a que la ejecución de las pruebas termine. Posteriormente registre el tiempo de respuesta mostrado en la interfaz.
