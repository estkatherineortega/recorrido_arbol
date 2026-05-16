
//KATHERINE ORTEGA CONTRERAS//
public class Main {

    public static void main(String[] args) {

        NodoArbol<Integer> tree = new NodoArbol<>();
        tree.setDato(45);

        NodoArbol[] arrNodoArbol = {
            new NodoArbol(23, null),
            new NodoArbol(11, null)
        };

        tree.setHijo(arrNodoArbol);

        tree.getHijo()[0].setHijo(0, 50);
        tree.getHijo()[1].setHijo(0, 40);

        System.out.println("Recorrido PreOrden:");
        tree.preOrden();

        System.out.println("\nRecorrido InOrden:");
        tree.inOrden();

        System.out.println("\nRecorrido PostOrden:");
        tree.postOrden();
    }
}
