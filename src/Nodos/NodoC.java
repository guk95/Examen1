package Nodos;

import Model.Jugador;

public class NodoC {

    private NodoC sig;
    private NodoC ant;
    private Model.Jugador dato;
    private int posicion;

    public NodoC(Model.Jugador dato) {

        this.sig = null;
        this.ant = null;

        this.dato = new Jugador(dato.getNombre(), dato.getEdad(), dato.getPosicion(), dato.getPais());

    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public NodoC getAnt() {
        return ant;
    }

    public void setAnt(NodoC ant) {
        this.ant = ant;
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
