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
        while (!salir){
            mostrarMenu(){
                System.out.println();
            }
        }

        private static  void mostrarMenu(){
            System.out.print("""
                    ****Listado Personas App *****
                    1.Agregar
                    2.Listar
                    3.Salir
                    
                    
                    """);

            System.out.println("Proporcionar la opcion ");
        }

    }
}