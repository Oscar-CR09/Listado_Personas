import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Se define la lista afuera del ciclo While

        List<Persona> personas = new ArrayList<>();
        //Menu
        var salir = false;
        while (!salir) {
            mostrarMenu();

            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());

            }
            System.out.println();

        }
    }

    private static void mostrarMenu() {
        System.out.print("""
                ****Listado Personas App *****
                1.Agregar
                2.Listar
                3.Salir
                                    
                                    
                """);

        System.out.println("Proporcionar la opcion ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //opciones proporcionada
        switch (opcion) {
            case 1 -> {//Agregar persona a la lista
                System.out.println("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Proporciona el telefono:");
                var tel = consola.nextLine();
                System.out.println("Proporcionael email:");
                var email = consola.nextLine();

                //Crear el objeto Persona
                var persona = new Persona(nombre,tel,email);

                //objeto a la lsita de personas
                personas.add(persona);
                System.out.println("La lista tiene :" + personas.size() + "elementos ");

            }
            case 2->{ //listar personas
                System.out.println("Listado de personas: ");
                //mejora usando lamda y metodos de referencia
                //personas.forEach(persona -> System.out.println(persona));
                personas.forEach(System.out::println);
            }

            case 3->{//salida del ciclo
                System.out.println("Hasta pronto...");
                salir = true;

            }
            default -> {
                System.out.println("Opcion erronea: " + opcion);
            }

        }//fin switch

        return salir;
    }

}