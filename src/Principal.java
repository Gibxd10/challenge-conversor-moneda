import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaConversion consulta = new ConsultaConversion();

        String menu = """
                =========================================================================
                Bienvenido(a) al conversor de monedas!
                
                Por favor elije una de las siguientes opciones para convertir:
                1) Dolar => Peso Mexicano
                2) Peso Mexicano => Dolar
                3) Dolar => Peso Argentino
                4) Peso Argentino => Dolar
                5) Dolar => Real Brasileño
                6) Real Brasileño => Dolar
                7) Dolar => Peso Colombiano
                8) Peso Colombiano => Dolar
                9) Salir
                =========================================================================
                """;
        int opciones = 0;
        long cantidadParaConvertir = 0;
        Monedas monedas;

        while (opciones != 9){
            System.out.println(menu);
            try{
                opciones = Integer.valueOf(teclado.nextLine());
                switch (opciones){
                    case 1:
                        System.out.println("Por favor ingrese la cantidad a convertir: ");
                        cantidadParaConvertir = Long.valueOf(teclado.nextLine());
                        monedas = consulta.monedaConversion("USD", "MXN", cantidadParaConvertir);
                        System.out.println("La cantidad de $"+cantidadParaConvertir+" "+monedas.base_code()+", se convierte en un total de: $"+monedas.conversion_result()+" "+monedas.target_code());
                        break;
                    case 2:
                        System.out.println("Por favor ingrese la cantidad a convertir: ");
                        cantidadParaConvertir = Long.valueOf(teclado.nextLine());
                        monedas = consulta.monedaConversion("MXN", "USD", cantidadParaConvertir);
                        System.out.println("La cantidad de $"+cantidadParaConvertir+" "+monedas.base_code()+", se convierte en un total de: $"+monedas.conversion_result()+" "+monedas.target_code());
                        break;
                    case 3:
                        System.out.println("Por favor ingrese la cantidad a convertir: ");
                        cantidadParaConvertir = Long.valueOf(teclado.nextLine());
                        monedas = consulta.monedaConversion("USD", "ARS", cantidadParaConvertir);
                        System.out.println("La cantidad de $"+cantidadParaConvertir+" "+monedas.base_code()+", se convierte en un total de: $"+monedas.conversion_result()+" "+monedas.target_code());
                        break;
                    case 4:
                        System.out.println("Por favor ingrese la cantidad a convertir: ");
                        cantidadParaConvertir = Long.valueOf(teclado.nextLine());
                        monedas = consulta.monedaConversion("ARS", "USD", cantidadParaConvertir);
                        System.out.println("La cantidad de $"+cantidadParaConvertir+" "+monedas.base_code()+", se convierte en un total de: $"+monedas.conversion_result()+" "+monedas.target_code());
                        break;
                    case 5:
                        System.out.println("Por favor ingrese la cantidad a convertir: ");
                        cantidadParaConvertir = Long.valueOf(teclado.nextLine());
                        monedas = consulta.monedaConversion("USD", "BRL", cantidadParaConvertir);
                        System.out.println("La cantidad de $"+cantidadParaConvertir+" "+monedas.base_code()+", se convierte en un total de: $"+monedas.conversion_result()+" "+monedas.target_code());
                        break;
                    case 6:
                        System.out.println("Por favor ingrese la cantidad a convertir: ");
                        cantidadParaConvertir = Long.valueOf(teclado.nextLine());
                        monedas = consulta.monedaConversion("BRL", "USD", cantidadParaConvertir);
                        System.out.println("La cantidad de $"+cantidadParaConvertir+" "+monedas.base_code()+", se convierte en un total de: $"+monedas.conversion_result()+" "+monedas.target_code());
                        break;
                    case 7:
                        System.out.println("Por favor ingrese la cantidad a convertir: ");
                        cantidadParaConvertir = Long.valueOf(teclado.nextLine());
                        monedas = consulta.monedaConversion("USD", "COP", cantidadParaConvertir);
                        System.out.println("La cantidad de $"+cantidadParaConvertir+" "+monedas.base_code()+", se convierte en un total de: $"+monedas.conversion_result()+" "+monedas.target_code());
                        break;
                    case 8:
                        System.out.println("Por favor ingrese la cantidad a convertir: ");
                        cantidadParaConvertir = Long.valueOf(teclado.nextLine());
                        monedas = consulta.monedaConversion("COP", "USD", cantidadParaConvertir);
                        System.out.println("La cantidad de $"+cantidadParaConvertir+" "+monedas.base_code()+", se convierte en un total de: $"+monedas.conversion_result()+" "+monedas.target_code());
                        break;
                    case 9:
                        System.out.println("Muchas gracias por utilizar nuestra app de conversion, vuelva pronto!");
                        break;
                    default:
                        System.out.println("Opcion no valida, por favor intente de nuevo");
                }
            }catch (InputMismatchException | NumberFormatException e){
                System.out.println("Valor invalido, favor de intentar de nuevo");
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Saliendo de la aplicacion. Vuelve pronto!");
            }
        }
    }
}
