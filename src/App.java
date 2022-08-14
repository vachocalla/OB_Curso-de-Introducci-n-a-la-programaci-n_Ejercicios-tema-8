public class App {
    public static void main(String args[]){
        Persona persona = new Persona();
        persona.setEdad(34);
        persona.setNombre("Victor Achocalla");
        persona.setTelefono("+59178613777");

        System.out.println("Persona");
        System.out.println("Edad: " + persona.getEdad() );
        System.out.println("Nombre: " + persona.getNombre() );
        System.out.println("Telefono: " + persona.getTelefono() );
    }
}
