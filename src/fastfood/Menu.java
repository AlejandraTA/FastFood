package fastfood;

import java.util.ArrayList;

/**
 *
 * @author ALEJANDRA TRUJILLO ARIAS 20251232956
 */
public class Menu {

    private ArrayList<IFastFood> listaDePlatillos;

    public Menu(ArrayList<IFastFood> listaDePlatillos) {
        this.listaDePlatillos = listaDePlatillos;
    }

    public ArrayList<IFastFood> getListaDePlatillos() {
        return listaDePlatillos;
    }

    public void setListaDePlatillos(ArrayList<IFastFood> listaDePlatillos) {
        this.listaDePlatillos = listaDePlatillos;
    }

}
