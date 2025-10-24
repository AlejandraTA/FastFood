package fastfood;

import java.util.ArrayList;

/**
 *
 * @author ALEJANDRA TRUJILLO ARIAS 20251232956
 */
public class Sandwich extends Receta {

    public Sandwich(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return ("plancha");
    }

    @Override
    public int tiempoDePreparacion() {
        int tiempoPrepIngr = 2;
        int contVocales = 0;
        String nombre = getNombre().toLowerCase();

        for (int i = 0; i < nombre.length(); i++) {
            char vocal = nombre.charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                contVocales++;
            }
        }
        return tiempoPrepIngr + contVocales;
    }
}
