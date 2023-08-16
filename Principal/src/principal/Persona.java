
package principal;


class Persona {
    private String nombre;
    private Reloj reloj;

    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }

    public void verHora() {
        System.out.print(nombre + " está viendo la fecha y hora: ");
        reloj.mostrarHora();
    }
}

