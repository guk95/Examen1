package Listas;

import Model.Jugador;
import Nodos.NodoC;
import Nodos.NodoE;

public class ListaE {

    private Nodos.NodoE cabeza;
    private NodoE ultimo;

    private int size;

    public ListaE() {

        this.size = 0;
        this.cabeza = null;
    }

    private boolean isEmpty() {
        return cabeza == null;
    }

    /**
     * <h4>addEspaña</h4>
     * <p>
     * Añade Objetos Jugador a la lista y dependiendo de su posicion les asigna
     * un valor y ademas agrega un jugador rival como marca</p>
     *
     *
     * @param dato Objeto jugador
     * @param marca Objeto jugador rival
     * @return true si se añade.
     */
    public boolean addEspaña(Model.Jugador dato, Model.Jugador marca) {

        if (size < 11) {
            if (isEmpty()) {
                NodoE nuevo = new NodoE(dato, marca);

                if (dato.getPosicion() == "Portero") {
                    Model.Jugador jugadorNulo = new Jugador("Al portero no se le puede marcar", 0, "", "");
                    nuevo.setMarca(jugadorNulo);
                    nuevo.setPosicion(0);
                } else if (dato.getPosicion() == "Defensa") {
                    nuevo.setPosicion(1);

                } else if (dato.getPosicion() == "Mediocampo") {
                    nuevo.setPosicion(2);
                } else if (dato.getPosicion() == "Delantero") {
                    nuevo.setPosicion(3);

                } else {
                    throw new Error("Una de las posiciones de los jugadores esta malescrita   "
                            + "o no existe por favor escribala correctamente");

                }
                cabeza = nuevo;
                ultimo = nuevo;
                ++size;
                return true;
            } else {
                NodoE nuevo = new NodoE(dato, marca);

                if (dato.getPosicion() == "Portero") {
                    Model.Jugador jugadorNulo = new Jugador("Al portero no se le puede marcar", 0, "", "");
                    nuevo.setMarca(jugadorNulo);
                    nuevo.setPosicion(0);
                } else if (dato.getPosicion() == "Defensa") {
                    nuevo.setPosicion(1);

                } else if (dato.getPosicion() == "Mediocampo") {
                    nuevo.setPosicion(2);
                } else if (dato.getPosicion() == "Delantero") {
                    nuevo.setPosicion(3);

                } else {
                    throw new Error("Una de las posiciones de los jugadores esta malescrita   "
                            + "o no existe por favor escribala correctamente");

                }
                ultimo.setSig(nuevo);
                nuevo.setAnt(ultimo);
                ultimo = nuevo;
                ++size;

            }

        } else {

            throw new Error("No se puede añadir mas de 11 jugadores al terreno de juego");

        }

        return true;
    }

    /**
     * <h4>getNodo</h4>
     * <p>
     * Obtiene el nodo segun el indice que reciba</p>
     *
     * @param index numero que se escoge.
     * @return el dato del indice que recibio.
     */
    public NodoE getNodo(int index) {

        if (0 == size) {
            return null;
        } else if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            return cabeza;
        } else if (index == size - 1) {
            return ultimo;
        } else {
            NodoE aux = cabeza;
            int cont = 0;
            while (aux.getSig() != null && cont < index) {
                aux = aux.getSig();
                ++cont;
            }
            return aux;
        }
    }

    /**
     * <h4>ordenarEspaña</h4>
     * <p>
     * Utiliza el cocktailSort para recorrer la lista y ordenarla segun la
     * posicion de los jugadores</p>
     *
     *
     * @return true cuando el proceso termina.
     */
    public boolean ordenarEspaña() {
        int cont = 0;
        while (cont <= size / 2) {
            NodoE mayor = getNodo(cont);
            NodoE menor = getNodo((size - 1) - cont);
            while (mayor.getSig() != null) {
                if (mayor.getPosicion() > mayor.getSig().getPosicion()) {
                    if (mayor == cabeza) {
                        NodoE nuevo = mayor.getSig();
                        nuevo.getSig().setAnt(mayor);
                        mayor.setSig(mayor.getSig().getSig());
                        mayor.setAnt(nuevo);
                        nuevo.setAnt(null);
                        nuevo.setSig(mayor);
                        cabeza = nuevo;
                    } else if (mayor.getSig() == ultimo) {
                        NodoE nuevo = mayor.getSig();
                        mayor.getAnt().setSig(nuevo);
                        nuevo.setAnt(mayor.getAnt());
                        nuevo.setSig(mayor);
                        mayor.setSig(null);
                        mayor.setAnt(nuevo);
                        ultimo = mayor;
                    } else {
                        NodoE nuevo = mayor.getSig();
                        mayor.getAnt().setSig(nuevo);
                        nuevo.getSig().setAnt(mayor);
                        nuevo.setAnt(mayor.getAnt());
                        mayor.setSig(nuevo.getSig());
                        nuevo.setSig(mayor);
                        mayor.setAnt(nuevo);
                    }
                } else {
                    mayor = mayor.getSig();
                }
            }
            while (menor.getAnt() != null) {
                if (menor.getPosicion() < menor.getAnt().getPosicion()) {
                    if (menor == ultimo) {
                        NodoE nuevo2 = menor.getAnt();
                        nuevo2.getAnt().setSig(menor);
                        menor.setSig(nuevo2);
                        menor.setAnt(menor.getAnt().getAnt());
                        nuevo2.setAnt(menor);
                        nuevo2.setSig(null);
                        ultimo = nuevo2;
                    } else if (menor.getAnt() == cabeza) {
                        NodoE nuevo2 = menor.getAnt();
                        menor.getSig().setAnt(nuevo2);
                        nuevo2.setAnt(menor);
                        nuevo2.setSig(menor.getSig());
                        menor.setSig(nuevo2);
                        menor.setAnt(null);
                        cabeza = menor;
                    } else {
                        NodoE nuevo2 = menor.getAnt();
                        menor.getSig().setAnt(nuevo2);
                        nuevo2.getAnt().setSig(menor);
                        nuevo2.setSig(menor.getSig());
                        menor.setSig(nuevo2);
                        menor.setAnt(nuevo2.getAnt());
                        nuevo2.setAnt(menor);
                    }
                } else {
                    menor = menor.getAnt();
                }
            }
            cont++;
        }
        return true;
    }

    /**
     * <h4>toStringEspaña</h4>
     * <p>
     * Concatena la informacion de la lista</p>
     *
     *
     * @return string de lo que se le indica .
     */
    public String toStringEspaña() {
        StringBuilder builder = new StringBuilder();

        NodoE aux = cabeza;
        int cont = 0;

        while (cont < size) {
            builder.append(" ");
            builder.append("Nombre: ");
            builder.append(aux.getDato().getNombre());
            builder.append(" ");
            builder.append("Edad : ");
            builder.append(aux.getDato().getEdad());
            builder.append(" ");
            builder.append("Posicion: ");
            builder.append(aux.getDato().getPosicion());
            builder.append(" ");
            builder.append("Pais :");
            builder.append(aux.getDato().getPais());
            builder.append(" ");
            builder.append(" El jugador contrario que lo marca es: ");

            builder.append(aux.getMarca().getNombre());
            builder.append(" ");
            builder.append(System.getProperty("line.separator"));

            ++cont;
            aux = aux.getSig();
        }

        return builder.toString();
    }

    public NodoE getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoE cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
