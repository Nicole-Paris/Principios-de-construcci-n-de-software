// 3.2 Package statement
package personas;

public class Futbolista extends Personal { //3.4 Class declaration

    private int numJugador;
    private String pocisionEnCancha;

    public Futbolista(int id, String nombre, String apellido, int edad, int numJugador, String pocisionEnCancha) { //4.2 Block indentation: +2 spaces
        super(id, nombre, apellido, edad);
        this.numJugador = numJugador;
        this.pocisionEnCancha = pocisionEnCancha;
    }

    public void jugarPartido(){
        System.out.println(getNombre() + " " + getApellido() + " juega un partido");
    }

    public void entrenar(){
        System.out.println(getNombre() + " " + getApellido() + " entrena");
    }

    @Override //6.1 @Override: always used
    public void concentrarse() {
        System.out.println("El futbolista se concentra");
    }

    @Override //6.1 @Override: always used
    public void viajar() {
        System.out.println("El futbolista viaja");
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public String getPocisionEnCancha() {
        return pocisionEnCancha;
    }

    public void setPocisionEnCancha(String pocisionEnCancha) {
        this.pocisionEnCancha = pocisionEnCancha;
    }

    
}
