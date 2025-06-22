package Cafe;

import java.util.Map;
import java.util.TreeMap;

public class CartaCafe {

    public Map<Integer, String> carta = new TreeMap<>();

    public CartaCafe() {
        carta.put(0, "Americano");
        carta.put(1, "Espresso");
        carta.put(2, "Latte");
        carta.put(3, "Cappuccino");
        carta.put(4, "Mocha");
        carta.put(5, "Macchiato");
        carta.put(6, "Cargado");
        carta.put(7, "Affogato");
        carta.put(8, "Irish Coffee");
        carta.put(9, "Cold Brew");
    }

    public void mostrarCarta(){
        System.out.println("=========Café Shop=========");
        for (Map.Entry<Integer, String> item: carta.entrySet()){
            System.out.println(item.getKey()+" --> "+item.getValue());
        }
        System.out.println("===========================");

    }


}
