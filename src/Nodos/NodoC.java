package Nodos;

import Model.Jugador;

public class NodoC {

    private NodoC sig;

    private Model.Jugador dato;

    public NodoC(Model.Jugador dato) {

        this.sig = null;

        this.dato = new Jugador(dato.getNombre(), dato.getEdad(), dato.getPosicion(), dato.getPais());

    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }

    public Jugador getDato() {
        return dato;
    }

    public void setDato(Jugador dato) {
        this.dato = dato;
    }

}
