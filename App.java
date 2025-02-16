// 3.2 Package statement
import personas.*;

public class App { //3.4 Class declaration
    public static void main(String[] args) { //4.2 Block indentation: +2 spaces

        Futbolista futbolista = new Futbolista(1, "Guillermo", "Ochoa", 39, 13, "Arquero");
        Futbolista futbolista2 = new Futbolista(2, "Hirving", "Lozano", 29, 22, "Delantero");
        Futbolista futbolista3 = new Futbolista(3, "César", "Huerta", 24, 21, "Delantero");
        Futbolista futbolista4 = new Futbolista(4, "Alan", "Mozo", 27, 2, "Defensa");
        Futbolista futbolista5 = new Futbolista(5, "Diego", "Lainez",24, 16, "Centrocampista");
        Entrenador entrenador = new Entrenador(20, "Javier", "Aguirre", 66, 1234);
        Entrenador entrenador2 = new Entrenador(21, "Miguel", "Herrera", 56, 5678);
        Masajista masajista = new Masajista(30, "Marcela", "Lopez", 30, "Fisioterapeuta", 7);
        Masajista masajista2 = new Masajista(31, "Luis", "Hernandez", 38, "Fisioterapeuta", 10);

        futbolista.jugarPartido();
        futbolista.concentrarse();
        futbolista2.jugarPartido();
        futbolista2.concentrarse();
        futbolista3.entrenar();
        futbolista3.concentrarse();
        futbolista4.viajar();
        futbolista5.viajar();

        entrenador.dirigirPartido();
        entrenador.concentrarse();

        entrenador2.dirigirEntrenamiento();
        entrenador2.concentrarse();

        masajista.darMasaje();
        masajista.concentrarse();
        masajista2.viajar();
    }
}
