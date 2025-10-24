package fastfood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ALEJANDRA TRUJILLO ARIAS 20251232956
 */
public class Restaurante {

    private HashMap<String, IFastFood> mapaRecetasRestaurante;
    private Menu menuDiaDado;

    public Restaurante(HashMap<String, IFastFood> mapaRecetasRestaurante, Menu menuDiaDado) {
        this.mapaRecetasRestaurante = mapaRecetasRestaurante;
        this.menuDiaDado = menuDiaDado;
    }

    public HashMap<String, IFastFood> getMapaRecetasRestaurante() {
        return mapaRecetasRestaurante;
    }

    public void setMapaRecetasRestaurante(HashMap<String, IFastFood> mapaRecetasRestaurante) {
        this.mapaRecetasRestaurante = mapaRecetasRestaurante;
    }

    public Menu getMenuDiaDado() {
        return menuDiaDado;
    }

    public void setMenuDiaDado(Menu menuDiaDado) {
        this.menuDiaDado = menuDiaDado;
    }

    public void crearReceta(IFastFood receta) {
        String nombre = ((Receta) receta).getNombre();
        mapaRecetasRestaurante.put(nombre.toLowerCase(), receta);
        System.out.println("Receta creada: " + nombre);
    }

    public void anadirRecetaAlMenu(IFastFood receta) {
        menuDiaDado.getListaDePlatillos().add(receta);
        System.out.println("Receta adicionada al menu: " + ((Receta) receta).getNombre());
    }

    public void anadirRecetaAlMenu() {
        if (mapaRecetasRestaurante.isEmpty()) {
            System.out.println("No hay recetas disponibles en el restaurante.");
            return;
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Recetas disponibles:");
        
        for (IFastFood val : mapaRecetasRestaurante.values()) {
            System.out.println("- " + ((Receta) val).getNombre());
        }

        System.out.print("Elige una receta por nombre: ");
        String elecc = in.nextLine().trim().toLowerCase();  

        IFastFood recetaElegida = mapaRecetasRestaurante.get(elecc);

        if (recetaElegida != null) {
            menuDiaDado.getListaDePlatillos().add(recetaElegida);
            System.out.println("Receta '" + ((Receta) recetaElegida).getNombre() + "' adicionada al menu.");
        } else {
            System.out.println("No existe esa receta en el restaurante.");
        }
    }

    public double tiempoMedio() {
        ArrayList<IFastFood> lista = menuDiaDado.getListaDePlatillos();
        if (lista.isEmpty()) {
            return -1;
        }

        int suma = 0;
        for (IFastFood receta : lista) {
            suma += receta.tiempoDePreparacion();
        }

        return (double) suma / lista.size();
    }

    public double porcentajeVegetariano() {
        ArrayList<IFastFood> lista = menuDiaDado.getListaDePlatillos();
        if (lista.isEmpty()) {
            return 0;
        }

        int contadorVeg = 0;
        for (IFastFood receta : lista) {
            if (receta.isVegetariano()) {
                contadorVeg++;
            }
        }

        return (contadorVeg * 100.0) / lista.size();
    }

    public static void main(String[] args) {
        HashMap<String, IFastFood> mapa = new HashMap<>();
        Menu menu = new Menu(new ArrayList<>());
        Restaurante restaurante = new Restaurante(mapa, menu);

        ArrayList<String> ingPizza = new ArrayList<>();
        ingPizza.add("Harina");
        ingPizza.add("Tomate");
        ingPizza.add("Queso mozzarella");
        ingPizza.add("Albahaca");
        ingPizza.add("Sal");
        ingPizza.add("Pimienta negra");
        ingPizza.add("Aceite de oliva");

        ArrayList<String> pasosPizza = new ArrayList<>();
        pasosPizza.add("Preparar la masa");
        pasosPizza.add("Amasar la masa");
        pasosPizza.add("Adicionar ingredientes externos.");
        pasosPizza.add("Meter al horno");

        Pizza pizza = new Pizza("Pizza Margarita", ingPizza, pasosPizza);

        ArrayList<String> ingSandwich = new ArrayList<>();
        ingSandwich.add("Pan");
        ingSandwich.add("Aguacate");
        ingSandwich.add("Tomate");
        ingSandwich.add("Limon");
        ingSandwich.add("Edamame");
        ingSandwich.add("Pepino");
        ingSandwich.add("Cebolla roja encurtida");

        ArrayList<String> pasosSandwich = new ArrayList<>();
        pasosSandwich.add("Tostar el pan");
        pasosSandwich.add("Armar el sandwich");

        Sandwich sandwich = new Sandwich("Sandwich de Aguacate", ingSandwich, pasosSandwich);

        restaurante.crearReceta(pizza);
        restaurante.crearReceta(sandwich);

        restaurante.anadirRecetaAlMenu(pizza);

        restaurante.anadirRecetaAlMenu();

        System.out.println("\nTiempo medio de preparacion: " + restaurante.tiempoMedio());
        System.out.println("Porcentaje vegetariano: " + restaurante.porcentajeVegetariano() + "%");
    }
}
