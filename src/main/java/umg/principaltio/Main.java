package umg.principaltio;

import umg.principaltio.VEHICULOS.COCJE;
import umg.principaltio.VEHICULOS.MOTO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        COCJE a = new COCJE("toyota","subaru",2000, 4);
a.mostrarDetalles();

MOTO b = new MOTO("SUZUKI","SUPER_ULTRAMEGA_SABER",2012,false);
b.mostrarDetalles();
    }
}