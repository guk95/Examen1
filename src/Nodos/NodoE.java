package Nodos;

import Model.Jugador;

public class NodoE {

    private NodoE sig;
    private NodoE ant;
    private Model.Jugador dato;
    private Model.Jugador marca;

    public Jugador getMarca() {
        return marca;
    }

    public void setMarca(Jugador marca) {
        this.marca = marca;
    }

    public NodoE(Model.Jugador dato, Model.Jugador marca) {
        this.sig = null;
        this.ant = null;
        this.dato = new Jugador(dato.getNombre(), 0, dato.getPosicion(), dato.getPais());
        this.marca = new Jugador(dato.getNombre(), 0, dato.getPosicion(), dato.getPais());

    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }

    public NodoE getAnt() {
        return ant;
    }

    public void setAnt(NodoE ant) {
        this.ant = ant;
    }

    public Jugador getDato() {
        return dato;
    }

    public void setDato(Jugador dato) {
        this.dato = dato;
    }

}
