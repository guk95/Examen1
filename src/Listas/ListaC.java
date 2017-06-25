package Listas;

import Nodos.NodoC;

public class ListaC {

    private Nodos.NodoC cabeza;
    private int size;
    private NodoC ultimo;

    public ListaC() {
        this.cabeza = null;
        this.size = 0;

    }

    private boolean isEmpty() {
        return cabeza == null;
    }

    public boolean addChile(Model.Jugador dato) {

        NodoC nuevo = new NodoC(dato);

        if (size < 11) {
            if (isEmpty()) {
                cabeza = nuevo;

            } else {
                NodoC aux = cabeza;
                int cont = 0;

                while (cont < size - 1) {
                    aux = aux.getSig();
                    cont++;
                }
                aux.setSig(nuevo);
                ultimo = nuevo;

            }

        } else {
            throw new Error("\"No se puede tener mas de 11 jugadores en la cancha"
                    + " intente realizar un cambio con la opcion Cambiar jugador");

        }

        size++;
        return true;
    }

    public boolean sortedChile() {

        int cont2 = 0;
        int cont = 0;

        while (cont < size) {

            while (cont2 < size - 1) {
                NodoC aux = cabeza;
                NodoC aux2 = aux.getSig();

                if (cabeza.getDato().getEdad() > aux2.getDato().getEdad()) {
                    aux.setSig(aux2.getSig());
                    aux2.setSig(aux);
                    cabeza = aux2;

                    System.out.println("puta");
                    aux2 = aux.getSig();
                } else {
                    aux = aux.getSig();
                    aux2 = aux2.getSig();

                }

                if (aux.getDato().getEdad() > aux2.getDato().getEdad() && aux2.getSig() != null) {
                    aux.setSig(aux2.getSig());
                    aux2.setSig(aux);
                    System.out.println("putitas");

                }

                cont2++;

            }
            System.out.println("putap");

            cont++;

        }

        return true;
    }

    public boolean sorted() {

        NodoC aux = cabeza;
        NodoC aux2 = aux.getSig();
        int cont = 0;
        while (aux.getSig() != null) {

            while (cont < size - 1) {

                if (cabeza.getDato().getEdad() > aux2.getDato().getEdad()) {
                    cabeza.setSig(aux2.getSig());
                    aux2.setSig(cabeza);
                    cabeza = aux2;
                    aux = aux2;

                }
                if (aux.getDato().getEdad() > aux2.getDato().getEdad()) {
                    aux.setSig(aux2.getSig());
                    aux2.setSig(aux);
                    aux2 = aux;

                } else {
                    aux = aux.getSig();
                    aux2 = aux2.getSig();

                }

            }

        }

        return true;
    }

    public int get(int index) {
        if (0 == size) {
            return 0;
        } else if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            return cabeza.getDato().getEdad();
        } else {
            NodoC aux = cabeza;
            int cont = 0;
            while (aux.getSig() != null && cont < index) {
                aux = aux.getSig();
                ++cont;
            }
            return aux.getDato().getEdad();
        }
    }

    public boolean cambiarJugador(Model.Jugador actual, Model.Jugador cambio) {

        NodoC aux = cabeza;
        NodoC nuevo = new NodoC(cambio);
        int cont = 0;
        while (cont < size) {
            if (cabeza.getDato().getNombre() == actual.getNombre()) {

                nuevo.setSig(cabeza.getSig());
                cabeza = nuevo;
                break;

            } else if (aux.getSig().getDato().getNombre() == actual.getNombre()) {
                nuevo.setSig(aux.getSig().getSig());
                aux.setSig(nuevo);

                break;
            } else {

                aux = aux.getSig();

            }

            cont++;

        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        NodoC aux = cabeza;
        int cont = 0;

        while (cont < size) {
            builder.append(" ");
            builder.append(aux.getDato().getNombre());
            builder.append(" ");
            builder.append(aux.getDato().getEdad());
            builder.append(" ");
            builder.append(aux.getDato().getPosicion());
            builder.append(" ");
            builder.append(aux.getDato().getPais());
            builder.append(" ");
            builder.append(System.getProperty("line.separator"));

            ++cont;
            aux = aux.getSig();
        }

        return builder.toString();
    }

    public NodoC getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoC cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
