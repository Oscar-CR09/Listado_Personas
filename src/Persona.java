public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //cosntructor
    public Persona(){
        this.id = ++Persona.numeroPersonas;

    }

    //constructor
    public Persona(String nombre, String tel,String email){
        this(); //Se llama constructor vacio
        this.nombre = nombre ;
        this.tel = tel;
        this.email = email;

    }
}
