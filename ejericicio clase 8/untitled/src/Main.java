public class Main {
    public static void main(String[] args) {
        Persona nombre = new Persona();
        nombre.setNombre("Diego");

        Persona edad = new Persona();
        edad.setEdad(17);

        Persona telefono = new Persona();
        telefono.setTelefono(917287980);

       System.out.println("Tu nombre es: " + nombre.getNombre());
       System.out.println("tu edad es: " + edad.getEdad());
       System.out.println("Tu número de teléfono es: " + telefono.getTelefono());
    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;

    }
    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}