package umg.principaltio.VEHICULOS;

public class COCJE extends vehiculos{

    public int numpuertas;
    public int getNumpuertas() {

        return numpuertas;
}


    public COCJE(String marca, String modelo, int anio,int numpuertas) {
        super(marca, modelo, anio);
        this.numpuertas = numpuertas;

    }
    @Override
public void mostrarDetalles(){

        System.out.println("la marca es: " + getMarca() +" y el modelo es:" + getModelo() + " y anio es: " + getAnio() + " las puertas son " + numpuertas);
    }

    }


