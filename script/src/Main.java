import udem.edu.co.car.entity.Vehiculo;
import udem.edu.co.car.entity.impl.Txl;
import udem.edu.co.car.entity.impl.Sandero;
import java.util.ArrayList;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");

        List<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
        Vehiculo txl= new Txl("rojo","axn-213");
        Vehiculo sandero= new Sandero("gris","zut-143");
        vehiculo.add(txl);
        vehiculo.add(sandero);
        System.out.printf(""+vehiculo);

    }
}

