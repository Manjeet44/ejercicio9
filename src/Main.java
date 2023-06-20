// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
*Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
* */

public class Main {
    public static void main(String[] args) {
        Cliente clienteNuevo = new Cliente();
        clienteNuevo.setEdad(30);
        clienteNuevo.setNombre("Andreu");
        clienteNuevo.setTelefono(676912321);
        clienteNuevo.setCredito(2112111212);
        System.out.println(clienteNuevo.getNombre() + " tiene una edad de " + clienteNuevo.getEdad() + " años, su numero de telefono es " + clienteNuevo.getTelefono() + " y tiene un cuenta de credito numerica: " + clienteNuevo.getCredito());
        Trabajador nuevoTrabajador = new Trabajador();
        nuevoTrabajador.setSalario(1700);
        System.out.println("Joan tiene un salario de " + nuevoTrabajador.getSalario() + " euros");
    }

}

class Persona {
    int edad;
    String nombre;
    int telefono;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona {
    int credito;
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }

}

final class Trabajador extends Persona {
    int salario;
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}