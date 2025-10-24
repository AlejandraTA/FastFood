package fastfood;

import java.util.ArrayList;

/**
 *
 * @author ALEJANDRA TRUJILLO ARIAS 20251232956
 */
public abstract class Receta implements IFastFood {

    private String nombre;
    private ArrayList<String> ingredientes;
    private ArrayList<String> pasosPreparacion;

    //Constuctores
    public Receta(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasosPreparacion = pasosPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPasosPreparacion() {
        return pasosPreparacion;
    }

    public void setPasosPreparacion(ArrayList<String> pasosPreparacion) {
        this.pasosPreparacion = pasosPreparacion;
    }
}

