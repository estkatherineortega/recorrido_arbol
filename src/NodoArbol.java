public class NodoArbol<T> {

    private T dato;
    private NodoArbol[] hijo;

    public NodoArbol(T dato, NodoArbol[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
    }

    NodoArbol() {
    }

    public T getDato() {
        return dato;
    }

    public NodoArbol[] getHijo() {
        return hijo;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setHijo(NodoArbol[] hijo) {
        this.hijo = hijo;
    }

    public void setHijo(int pos, T dato) {
        if (hijo == null) {
            hijo = new NodoArbol[pos + 1];
        }
        hijo[pos] = new NodoArbol(dato, null);
    }

    // PREORDEN
    public void preOrden() {
        System.out.print(this.dato + " ");

        if (hijo == null) return;

        for (NodoArbol n : hijo) {
            if (n != null) {
                n.preOrden();
            }
        }
    }

    
    public void inOrden() {
        if (hijo != null && hijo.length > 0 && hijo[0] != null) {
            hijo[0].inOrden();
        }

        System.out.print(this.dato + " ");

        if (hijo != null) {
            for (int i = 1; i < hijo.length; i++) {
                if (hijo[i] != null) {
                    hijo[i].inOrden();
                }
            }
        }
    }

    
    public void postOrden() {
        if (hijo != null) {
            for (NodoArbol n : hijo) {
                if (n != null) {
                    n.postOrden();
                }
            }
        }

        System.out.print(this.dato + " ");
    }
}