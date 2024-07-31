package umg.principaltio.VEHICULOS;

public class vehiculos {
    private String marca;
    private String modelo;
    private int anio;

public vehiculos(String marca, String modelo, int anio) {//CONSTRUCTOR
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
}

public String getMarca() {
    return marca;
}

public String getModelo() {
    return modelo;
}

public int getAnio() {
    return anio;
}

public void mostrarDetalles(){
    System.out.println("la marca es: " + marca +" y el modelo es:" + modelo + " y anio es: " + anio);
    }
}
