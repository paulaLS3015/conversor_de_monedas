# Currency Converter in Java

## Description

The Currency Converter is a Java program that allows users to convert values between different currencies using real-time exchange rates. The program interacts with the exchange rate API to obtain up-to-date data and performs calculations to convert the values entered by the user into the desired currency.

## Features

1. **Development Environment Setup**: The program is developed in a Java development environment with JDK version 11 or higher, the Gson library 2.10.1 or higher, and optionally the IntelliJ IDEA IDE.

2. **Interaction with the Exchange Rate API**: The program uses the HttpClient class to make requests to the exchange rate API and obtain essential data. The HttpRequest class is used to configure and customize requests to the API.

3. **Handling API Responses**: The HttpResponse interface is used to manage responses received from the API and extract meaningful information from the responses.

4. **JSON Response Parsing**: The Gson library is used to parse the JSON response and efficiently map JSON data to Java objects.

5. **Currency Filtering**: The program allows filtering of currencies using the Gson library in Java. Users can choose at least three "Currency Code" to include in the application.

6. **Currency Conversion**: The program performs conversions between currencies using the obtained exchange rates to calculate the converted values between the desired currencies.

7. **User Interface**: The program implements a textual interface through the console that presents currency conversion options. Users can select numerical options and provide data for conversion.

## Usage

To use the Currency Converter, follow these steps:

1. Ensure you have installed Java JDK version 11 or higher and the Gson library 2.10.1 or higher.
2. Download and run the program.
3. Follow the instructions on the console to select currencies and provide values for conversion.
4. The program will display the converted value according to your choice.

## Testing

It is recommended to perform exhaustive tests to ensure the correct operation of the program, simulating various situations and paths to identify and correct possible errors.

## Useful Links

- [Exchange Rate API](https://www.exchangerate-api.com/)
- [Exchange Rate API Documentation](https://www.exchangerate-api.com/docs/java-currency-api)
- [Currencies Supported by the Exchange Rate API](https://www.exchangerate-api.com/docs/supported-currencies)

## Contribution

Contributions are welcome. Please open an issue or make a pull request for suggestions or corrections.
