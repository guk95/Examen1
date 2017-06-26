package Listas;

import Nodos.NodoC;

public class ListaC {

    private Nodos.NodoC cabeza;
    private NodoC ultimo;
    private int size;

    public ListaC() {
        this.cabeza = null;
        this.size = 0;

    }

    private boolean isEmpty() {
        return cabeza == null;
    }

    public boolean addChile(Model.Jugador dato) {
        if (size < 11) {
            if (isEmpty()) {
                NodoC nuevo = new NodoC(dato);

                if (dato.getPosicion() == "Portero") {

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
                NodoC nuevo = new NodoC(dato);

                if (dato.getPosicion() == "Portero") {

                    nuevo.setPosicion(0);
                } else if (dato.getPosicion() == "Defensa") {
                    nuevo.setPosicion(1);

                } else if (dato.getPosicion() == "Mediocampo") {
                    nuevo.setPosicion(2);
                } else if (dato.getPosicion() == "Delantero") {
                    nuevo.setPosicion(3);

                } else {
                    throw new Error("Una de las posiciones de los jugadores esta mal escrita   "
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

    public NodoC getNodo(int index) {

        if (0 == size) {
            return null;
        } else if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            return cabeza;
        } else if (index == size - 1) {

            return ultimo;
        } else {
            NodoC aux = cabeza;
            int cont = 0;
            while (aux.getSig() != null && cont < index) {
                aux = aux.getSig();
                ++cont;
            }
            return aux;
        }
    }

    public void ordernarChile() {
        int cont = 0;
        while (cont <= size / 2) {
            NodoC mayor = getNodo(cont);
            NodoC menor = getNodo((size - 1) - cont);
            while (mayor.getSig() != null) {
                if (mayor.getDato().getEdad() > mayor.getSig().getDato().getEdad()) {
                    if (mayor == cabeza) {
                        NodoC nuevo = mayor.getSig();
                        nuevo.getSig().setAnt(mayor);
                        mayor.setSig(mayor.getSig().getSig());
                        mayor.setAnt(nuevo);
                        nuevo.setAnt(null);
                        nuevo.setSig(mayor);
                        cabeza = nuevo;
                    } else if (mayor.getSig() == ultimo) {
                        NodoC nuevo = mayor.getSig();
                        mayor.getAnt().setSig(nuevo);
                        nuevo.setAnt(mayor.getAnt());
                        nuevo.setSig(mayor);
                        mayor.setSig(null);
                        mayor.setAnt(nuevo);
                        ultimo = mayor;
                    } else {
                        NodoC nuevo = mayor.getSig();
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
                if (menor.getDato().getEdad() < menor.getAnt().getDato().getEdad()) {
                    if (menor == ultimo) {
                        NodoC nuevo2 = menor.getAnt();
                        nuevo2.getAnt().setSig(menor);
                        menor.setSig(nuevo2);
                        menor.setAnt(menor.getAnt().getAnt());
                        nuevo2.setAnt(menor);
                        nuevo2.setSig(null);
                        ultimo = nuevo2;
                    } else if (menor.getAnt() == cabeza) {
                        NodoC nuevo2 = menor.getAnt();
                        menor.getSig().setAnt(nuevo2);
                        nuevo2.setAnt(menor);
                        nuevo2.setSig(menor.getSig());
                        menor.setSig(nuevo2);
                        menor.setAnt(null);
                        cabeza = menor;
                    } else {
                        NodoC nuevo2 = menor.getAnt();
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

    public String toStringChile() {
        StringBuilder builder = new StringBuilder();

        NodoC aux = cabeza;
        int cont = 0;

        while (cont < size) {
            builder.append(" ");
            builder.append("Nombre : ");
            builder.append(aux.getDato().getNombre());
            builder.append("    ");
            builder.append("Edad : ");
            builder.append(aux.getDato().getEdad());
            builder.append("    ");
            builder.append("Posicion : ");
            builder.append(aux.getDato().getPosicion());
            builder.append("    ");
            builder.append("Pais : ");
            builder.append(aux.getDato().getPais());
            builder.append("    ");
            builder.append(System.getProperty("line.separator"));

            ++cont;
            aux = aux.getSig();
        }

        return builder.toString();
    }

    public String alineaciondeJuego(int dato2, int dato3, int dato4) {
        ordenarparaAlineacion();

        if (dato2 + dato3 + dato4 <= 10) {
            int cont = 0;

            StringBuilder builder = new StringBuilder();

            int coni = 0;
            while (coni < 1) {
                NodoC aux = cabeza;
                while (cont < size) {
                    builder.append("------Portero-------");
                    builder.append(System.getProperty("line.separator"));
                    if (aux.getDato().getPosicion() == "Portero") {

                        builder.append(aux.getDato().getNombre());
                        builder.append(System.getProperty("line.separator"));
                        builder.append(System.getProperty("line.separator"));

                        break;

                    } else {
                        aux = aux.getSig();

                    }

                    cont++;

                }
                coni++;
            }

            int cont1 = 0;

            NodoC aux = cabeza.getSig();
            builder.append("------Defensas-------");
            builder.append(System.getProperty("line.separator"));

            int cont2 = 0;
            while (cont2 < dato2) {

                builder.append(aux.getDato().getNombre());
                builder.append(" ");

                aux = aux.getSig();

                cont2++;

            }
            builder.append(System.getProperty("line.separator"));
            builder.append(System.getProperty("line.separator"));
            builder.append("------Mediocampo-------");
            builder.append(System.getProperty("line.separator"));
            int cont3 = 0;
            while (cont3 < dato3) {

                builder.append(aux.getDato().getNombre());
                builder.append(" ");

                aux = aux.getSig();

                cont3++;

            }
            builder.append(System.getProperty("line.separator"));
            builder.append(System.getProperty("line.separator"));
            builder.append("------Delanteros-------");
            builder.append(System.getProperty("line.separator"));
            int cont4 = 0;
            while (cont4 < dato4) {

                builder.append(aux.getDato().getNombre());
                builder.append(" ");

                aux = aux.getSig();

                cont4++;

            }
            return builder.toString();
        } else {

            throw new IndexOutOfBoundsException("Usted solo puede realizar alineaciones con"
                    + " no mas de 11 jugadores");

        }

    }

    public void ordenarparaAlineacion() {
        int cont = 0;
        while (cont <= size / 2) {
            NodoC mayor = getNodo(cont);
            NodoC menor = getNodo((size - 1) - cont);
            while (mayor.getSig() != null) {
                if (mayor.getPosicion() > mayor.getSig().getPosicion()) {
                    if (mayor == cabeza) {
                        NodoC nuevo = mayor.getSig();
                        nuevo.getSig().setAnt(mayor);
                        mayor.setSig(mayor.getSig().getSig());
                        mayor.setAnt(nuevo);
                        nuevo.setAnt(null);
                        nuevo.setSig(mayor);
                        cabeza = nuevo;
                    } else if (mayor.getSig() == ultimo) {
                        NodoC nuevo = mayor.getSig();
                        mayor.getAnt().setSig(nuevo);
                        nuevo.setAnt(mayor.getAnt());
                        nuevo.setSig(mayor);
                        mayor.setSig(null);
                        mayor.setAnt(nuevo);
                        ultimo = mayor;
                    } else {
                        NodoC nuevo = mayor.getSig();
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
                        NodoC nuevo2 = menor.getAnt();
                        nuevo2.getAnt().setSig(menor);
                        menor.setSig(nuevo2);
                        menor.setAnt(menor.getAnt().getAnt());
                        nuevo2.setAnt(menor);
                        nuevo2.setSig(null);
                        ultimo = nuevo2;
                    } else if (menor.getAnt() == cabeza) {
                        NodoC nuevo2 = menor.getAnt();
                        menor.getSig().setAnt(nuevo2);
                        nuevo2.setAnt(menor);
                        nuevo2.setSig(menor.getSig());
                        menor.setSig(nuevo2);
                        menor.setAnt(null);
                        cabeza = menor;
                    } else {
                        NodoC nuevo2 = menor.getAnt();
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
