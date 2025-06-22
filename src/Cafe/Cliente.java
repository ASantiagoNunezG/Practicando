package Cafe;
import java.util.Random;

public class Cliente {
    private String name;
    public Integer pedido;
    public String agradecimiento;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPedido() {
        return pedido;
    }
    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }
    public String getAgradecimiento() {
        return agradecimiento;
    }
    public void setAgradecimiento(String agradecimiento) {
        this.agradecimiento = agradecimiento;
    }

    //Acciones que el cliente realizara
    public Integer elegirPedido(){
        Random rand;
        rand= new Random();

        Integer eleccion = rand.nextInt(10);
        setPedido(eleccion);

        CartaCafe cartaCafe = new CartaCafe();
        String decir = cartaCafe.carta.get(eleccion);
        System.out.println("Quisiera un café "+decir + " por favor");
        return eleccion;
    }

    public void darGracias(String nombre){
        System.out.println("Gracias señor@ "+ nombre + "!" + getAgradecimiento());
    }
}
