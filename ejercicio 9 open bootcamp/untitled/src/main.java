public class main {
    public static void main(String[] args) throws Exception {

        //realizar el set de "cliente"
        Cliente cliente = new Cliente();
        cliente.setAge (17);
        cliente.setName ("Diego");
        cliente.setPhone (917287980);
        cliente.setCredito (2500);

        //realizar el get de "cliente"
        System.out.println ("Edad del cliente: " + cliente.getAge ());
        System.out.println ("Nombre del cliente: " + cliente.getName ());
        System.out.println ("Teléfono del cliente: " + cliente.getPhone ());
        System.out.println ("Crédito del cliente: " + cliente.getCredito ());

        //realizar el set de trabajador
        Trabajador trabajador = new Trabajador ();
        trabajador.setAge (18);
        trabajador.setName ("Eduardo");
        trabajador.setPhone (97697647);
        trabajador.setSalario (1515);

        System.out.println ("----------------------------------------");

        //realizar el get de "trabajador"
        System.out.println ("Edad del trabajador: " + trabajador.getAge ());
        System.out.println ("Nombre del trabajador: " + trabajador.getName ());
        System.out.println ("Telefono del trabajador: " + trabajador.getPhone ());
        System.out.println ("Crédito del trabajador: " + trabajador.getSalario ());
    }
}
//crear clase persona y darle atributos
class Persona {
    private int age;
    private String name;
    private int phone;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }


}
//crear clase clientes y agregarle el credito
class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
//crear clase "trabajador" y agregarle el salario
class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}