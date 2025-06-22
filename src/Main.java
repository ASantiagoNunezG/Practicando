import Cafe.CartaCafe;
import Cafe.Cliente;
import Cafe.Recepcionista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! in a Café shop");
        Cliente cliente = new Cliente();
        cliente.setName("Santiago");
        Recepcionista recepcionista = new Recepcionista();
        CartaCafe cartaCafe = new CartaCafe();
        cartaCafe.mostrarCarta();
        recepcionista.saludar(cliente.getName());
        cliente.elegirPedido();
        Integer imprimirPedido =  cliente.getPedido();
        recepcionista.setName("María");
        recepcionista.darEleccion(imprimirPedido);
        cliente.setAgradecimiento("Danke my friend");
        cliente.darGracias(recepcionista.getName());
        System.out.println("Todos contentos, todos felices");
    }
}