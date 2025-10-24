package fastfood;

import java.util.ArrayList;

/**
 *
 * @author ALEJANDRA TRUJILLO ARIAS 20251232956
 */
public class Pizza extends Receta {

    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public boolean isVegetariano() {
        for (String ingrediente : getIngredientes()) {
            if (ingrediente.toLowerCase().contains("carne")) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return ("horno");
    }

    @Override
    public int tiempoDePreparacion() {
        int tiempoPrepIngr = 2;
        int contLetra = 0;

        for (int i = 0; i < getNombre().length(); i++) {
            char letra = getNombre().charAt(i);
            if (Character.isLetter(letra)) {
                contLetra++;
            }
        }
        return tiempoPrepIngr + contLetra;
    }
}
