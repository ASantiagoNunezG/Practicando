package Cafe;

public class Recepcionista {
    private String name;
    private String eleccion;

    public void saludar(String name){
        System.out.println("Hola "+name+", ¿qué le sirvo?");
    }

    public void darEleccion(Integer pedido){

        CartaCafe cartaCafe = new CartaCafe();
        String pedidoCarta = cartaCafe.carta.get(pedido);

        if(pedidoCarta != null){
            System.out.println("Tenga su café "+pedidoCarta);
        }else {
            System.out.println("Elije otro bobo");
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }
}
