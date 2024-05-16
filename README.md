# Conversor de Monedas en Java

## Descripción

El Conversor de Monedas es un programa en Java que permite a los usuarios convertir valores entre diferentes monedas utilizando tasas de cambio en tiempo real. El programa interactúa con la API de tasas de cambio para obtener datos actualizados y realiza cálculos para convertir los valores ingresados por el usuario a la moneda deseada.

## Características

1. **Configuración del entorno de desarrollo**: El programa se desarrolla en un entorno de desarrollo Java con JDK versión 11 o superior, la biblioteca Gson 2.10.1 o superior y opcionalmente el IDE IntelliJ IDEA.

2. **Interacción con la API de tasas de cambio**: El programa utiliza la clase HttpClient para realizar solicitudes a la API de tasas de cambio y obtener datos esenciales. La clase HttpRequest se utiliza para configurar y personalizar las solicitudes a la API.

3. **Gestión de respuestas de la API**: La interfaz HttpResponse se utiliza para gestionar las respuestas recibidas de la API y extraer información significativa de las respuestas.

4. **Análisis de la respuesta JSON**: La biblioteca Gson se utiliza para analizar la respuesta JSON y mapear eficientemente los datos JSON a objetos Java.

5. **Filtrado de monedas**: El programa permite filtrar las monedas utilizando la biblioteca Gson en Java. Los usuarios pueden elegir al menos tres "Currency Code" para incluir en la aplicación.

6. **Conversión de monedas**: El programa realiza las conversiones entre las monedas utilizando las tasas de cambio obtenidas para calcular los valores convertidos entre las monedas deseadas.

7. **Interfaz de usuario**: El programa implementa una interfaz textual a través de la consola que presenta opciones de conversión de monedas. Los usuarios pueden seleccionar opciones numéricas y proporcionar datos para la conversión.

## Uso

Para utilizar el Conversor de Monedas, siga estos pasos:

1. Asegúrese de tener instalado Java JDK versión 11 o superior y la biblioteca Gson 2.10.1 o superior.
2. Descargue y ejecute el programa.
3. Siga las instrucciones en la consola para seleccionar las monedas y proporcionar los valores para la conversión.
4. El programa mostrará el valor convertido según su elección.

## Pruebas

Se recomienda realizar pruebas exhaustivas para garantizar el correcto funcionamiento del programa, simulando diversas situaciones y recorridos para identificar y corregir posibles errores.

## Enlaces útiles

- [API de tasas de cambio](https://www.exchangerate-api.com/)
- [Documentación de la API de tasas de cambio](https://www.exchangerate-api.com/docs/java-currency-api)
- [Monedas admitidas por la API de tasas de cambio](https://www.exchangerate-api.com/docs/supported-currencies)

## Contribución

Las contribuciones son bienvenidas. Por favor, abra un problema o haga un pull request para sugerencias o correcciones.

## Licencia

Este proyecto está licenciado bajo los términos de la licencia MIT. Para más detalles, consulte el archivo LICENSE.
