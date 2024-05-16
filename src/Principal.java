import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);
        ApiRequest request = new ApiRequest();

        String menu = """
        *** Escriba el número de la opción deseada:
        
        1 - Convertir a Peso Argentino
        2 - Convertir a Boliviano boliviano
        3 - Convertir a Real brasileño
        4 - Convertir a Peso chileno
        5 - Convertir a Peso colombiano
        6 - Convertir a Dólar estadounidense
        7 - Convertir a Colón Costarricense
        8 - Salir
        """;
       int option = 0;

        System.out.println("Escriba el diminutivo de la moneda que desea convertir:");
        var diminutive = lecture.nextLine();
        Badge badge = null;

        try{
            badge = request.getBadge(diminutive);
            GenerateFile generate_file = new GenerateFile();
            generate_file.guardarJson(badge);
        } catch (NumberFormatException e){
            System.out.println("No encontrado "+e.getMessage());
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }

        System.out.println("Escriba la cantidad que desea convertir:");
        var total = Double.parseDouble(lecture.nextLine());

        while(option!=8){

           System.out.println(menu);
           option = lecture.nextInt();

           Converter converter = new Converter();

            switch (option){
                case 1:/* Convertir a Peso Argentino*/
                    System.out.println("Resultado: " + converter.badge_converter(badge, total,"ARS") + " ARS");
                    break;
                case 2:/* Convertir a Boliviano boliviano*/
                    System.out.println("Resultado: " + converter.badge_converter(badge, total,"BOB") + " BOB");
                    break;
                case 3:/* Convertir a Real brasileño*/
                    System.out.println("Resultado: " + converter.badge_converter(badge, total,"BRL") + " BRL");
                    break;
                case 4:/* Convertir a Peso chileno */
                    System.out.println("Resultado: " + converter.badge_converter(badge, total,"CLP") + " CLP");
                    break;
                case 5: /* Convertir a Peso colombiano */
                    System.out.println("Resultado: " + converter.badge_converter(badge, total,"COP") + " COP");
                    break;
                case 6: /* Convertir a Dólar estadounidense */
                    System.out.println("Resultado: " + converter.badge_converter(badge, total,"USD") + " USD");
                    break;
                case 7: /* Convertir a Colón Costarricense */
                    System.out.println("Resultado: " + converter.badge_converter(badge, total,"CRC") + " CRC");
                    break;
                case 8: /* Convertir a Colón Costarricense */
                    System.out.println("Fin del proceso.");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
       }
    }
}
