// 3.2 Package statement
package personas;

public class Masajista extends Personal{ //3.4 Class declaration

    private String profesion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int aniosExperiencia) { //4.2 Block indentation: +2 spaces
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje(){
        System.out.println("El masajista da un masaje");
    }

    @Override //6.1 @Override: always used
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    @Override //6.1 @Override: always used
    public void viajar() {
        System.out.println("El masajista viaja");
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    
    
    
}
