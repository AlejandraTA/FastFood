/*
Se definen los tipos IFastFood y Receta de este modo:
Interface IFastFood {
int tiempoDePreparacion(); // tiempo en minutos
boolean isVegetariano();
String tipoPreparacion();
}
public class Receta {
private String nombre;
private ArrayList<String> ingredientes = new ArrayList<String>();
private ArrayList<String> pasosPreparacion = new ArrayList<String>();
public Receta(String nombre,ArrayList<String> ingredientes,ArrayList<String> pasosPreparacion){
this.nombre = nombre;
this.ingredientes = ingredientes;
this.pasosPreparacion = pasosPreparacion;
}
}
Se pide:
• Definir dos clases: la clase Pizza y la clase Sandwich. Estas dos clases extienden la clase Receta.
A su vez, Receta implementa la interfaz IFastFood, pero no escribe sus métodos (Receta es
abstracta, por lo tanto)
• Codificar ambas clases proporcionando los métodos necesarios y el constructor adecuado a cada
una según las definiciones de la interfaz IFastFood y la clase Receta y teniendo en cuenta que:
- para el metodo isVegetariano():
▪ el Sandwich es siempre vegetariano.
▪ la Pizza es vegetariana si no tiene algún ingrediente que contenga la palabra
“carne” (en mayúscula o en minúscula)

- para el método tipoPreparación():
▪ la Pizza se prepara siempre al horno (devuelve “horno”)
▪ El Sandwich se prepara siempre en plancha (devuelve “plancha”)
- para el método tiempoDePreparación():
▪ Todas las recetas tardan de entrada 2 minutos, (el tiempo de preparar
ingredientes)
▪ Una Pizza, además del tiempo base de toda receta, tarda tantos minutos más
como letras tenga su nombre
▪ Un Sandwich, además del tiempo base de toda receta, tarda tantos minutos más
como vocales haya en su nombre (cuidado, vocales en mayúscula o minúscula)
• Definir la clase Menu, que tiene como único atributo una lista de elementos de tipo IFastFood
(podría ser tambien de tipo Receta, pero se pide IFastFood).
- Como métodos tiene un constructor vacío y los getters y setters que necesite (solamente).
• Codificar en una clase Restaurante que tiene:
- un atributo hashMap llamado mapaRecetasRestaurante (mapa que tendrá como clave el
nombre de la receta, y como valor un objeto IFastFood). Esta colección almacena todas
las recetas que se pueden hacer en el restaurante.
- Un objeto de la clase Menu. El menú contiene las recetas que el restaurante ofrece un día
dado.
- Codificar además estos métodos en esta clase:

▪ Método para crear recetas y almacenarlas en el mapa del restaurante.
▪ Método anadirRecetaAlMenu(IFastFood receta) , que vale para añadir la receta
indicada por parámetro al menú.
▪ Método anadirRecetaAlMenu() , que vale para añadir una receta (de las ya
existentes en el mapa de recetas) a un menú. Se le ha de pedir al usuario que
elija.
▪ Método tiempoMedio() que calcula la media de todos los tiempos de preparación
del menú. Se devuelve -1 en el caso de que la lista esté vacía.
▪ Método porcentajeVegetariano() que calcula el porcentaje de elementos
vegetarianos de un menú de un restaurante.
▪ Método main ademas de crear un menú, debe probar el resto de los métodos de
la clase Restaurante: creando recetas, añadiéndolas al mapa de recetas del
restaurante, y crear un menú eligiendo entre la recetas del restaurante
 */
package fastfood;

/**
 *
 * @author ALEJANDRA TRUJILLO ARIAS 20251232956
 */
public class FastFood {
    
}
