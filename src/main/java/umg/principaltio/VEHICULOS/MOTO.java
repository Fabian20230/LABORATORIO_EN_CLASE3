package umg.principaltio.VEHICULOS;

public class MOTO extends vehiculos {

    private boolean tieneSidecar;

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public MOTO(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles()
    {
        if (tieneSidecar==true){

            System.out.println("la marca es: " + getMarca() +" y el modelo es:" + getModelo() + " y anio es: " + getAnio() + " Si tiene Sidecar");
        }else
        {
            System.out.println("la marca es: " + getMarca() +" y el modelo es: " + getModelo() + " y anio es: " + getAnio() + " No tiene Sidecar");
        }
    }
}
