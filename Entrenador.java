// 3.2 Package statement
package personas;

public class Entrenador extends Personal { //3.4 Class declaration

    private int idFederacion; //5.3 lower camel case

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) { //4.2 Block indentation: +2 spaces
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido(){ //5.3 lower camel case
        System.out.println(getNombre() + " " + getApellido() + " dirige un partido");
    }

    public void dirigirEntrenamiento(){ //5.3 lower camel case
        System.out.println(getNombre() + " " + getApellido() + " dirige un entrenamiento");
    }

    @Override //6.1 @Override: always used
    public void concentrarse() {
        System.out.println("El entrenador se concentra");
    }

    @Override //6.1 @Override: always used
    public void viajar() {
        System.out.println("El entrenador viaja");
    }

    public int getIdFederacion() { //5.3 lower camel case
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) { //5.3 lower camel case
        this.idFederacion = idFederacion;
    }
}
