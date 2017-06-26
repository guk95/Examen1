/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1;

import Listas.ListaC;
import Listas.ListaE;
import Model.Jugador;

/**
 *
 * @author Mario
 */
public class Examen1 {

    public static void main(String[] args) {
        Listas.ListaC listaC = new ListaC();
        Listas.ListaE listaE = new ListaE();

        // Los datos deben agregarse como se muestra a continuacion: 
        //Nombre , edad, Posicion(Portero o Defensa o Mediocampo o Delantero) , Pais
        Model.Jugador jugadorChile1 = new Jugador("Rodrigo Millar", 28, "Mediocampo", "Chile");
        Model.Jugador jugadorChile2 = new Jugador("Rodrigo Tello", 30, "Mediocampo", "Chile");
        Model.Jugador jugadorChile3 = new Jugador("Marco Estrada", 27, "Mediocampo", "Chile");
        Model.Jugador jugadorChile4 = new Jugador("Jorge Valdivia", 26, "Mediocampo", "Chile");
        Model.Jugador jugadorChile5 = new Jugador("Arturo Vidal", 23, "Defensa", "Chile");
        Model.Jugador jugadorChile6 = new Jugador("Humberto Suazo", 29, "Delantero", "Chile");
        Model.Jugador jugadorChile7 = new Jugador("Alexis Sanchez", 21, "Delantero", "Chile");
        Model.Jugador jugadorChile8 = new Jugador("Pablo Contreras", 31, "Defensa", "Chile");
        Model.Jugador jugadorChile9 = new Jugador("Waldo Ponce", 27, "Defensa", "Chile");
        Model.Jugador jugadorChile10 = new Jugador("Ismael Fuentes", 27, "Defensa", "Chile");
        Model.Jugador jugadorChile11 = new Jugador("Claudio Bravo", 28, "Portero", "Chile");
        Model.Jugador jugadorChileSuplente = new Jugador("Mario", 23, "Delantero", "Chile");

        listaC.addChile(jugadorChile1);
        listaC.addChile(jugadorChile2);
        listaC.addChile(jugadorChile3);
        listaC.addChile(jugadorChile4);
        listaC.addChile(jugadorChile5);
        listaC.addChile(jugadorChile6);
        listaC.addChile(jugadorChile7);
        listaC.addChile(jugadorChile8);
        listaC.addChile(jugadorChile9);
        listaC.addChile(jugadorChile10);
        listaC.addChile(jugadorChile11);

        // Los datos deben agregarse como se muestra a continuacion: 
        //Nombre , edad, Posicion(Portero o Defensa o Mediocampo o Delantero) , Pais
        Model.Jugador jugadorEspaña1 = new Jugador("Ramos ", 21, "Defensa", "España");
        Model.Jugador jugadorEspaña2 = new Jugador("Pique", 30, "Defensa", "España");
        Model.Jugador jugadorEspaña3 = new Jugador("Puyol", 2, "Defensa", "España");
        Model.Jugador jugadorEspaña4 = new Jugador("Capdevilla", 1, "Defensa", "España");
        Model.Jugador jugadorEspaña5 = new Jugador("Casillas", 10, "Portero", "España");
        Model.Jugador jugadorEspaña6 = new Jugador("Xabi Alonso", 11, "Mediocampo", "España");
        Model.Jugador jugadorEspaña7 = new Jugador("Busquets", 7, "Mediocampo", "España");
        Model.Jugador jugadorEspaña8 = new Jugador("Xavi Hernandez", 9, "Defensa", "España");
        Model.Jugador jugadorEspaña9 = new Jugador("Pedro Rodriguez", 10, "Mediocampo", "España");
        Model.Jugador jugadorEspaña10 = new Jugador("Andres Iniesta", 10, "Mediocampo", "España");
        Model.Jugador jugadorEspaña11 = new Jugador("David Villa", 10, "Delantero", "España");
        Model.Jugador jugadorEspañaSuplente = new Jugador("Torres", 10, "Delantero", "España");

        listaE.addEspaña(jugadorEspaña1, jugadorChile10);
        listaE.addEspaña(jugadorEspaña2, jugadorChile2);
        listaE.addEspaña(jugadorEspaña3, jugadorChile3);
        listaE.addEspaña(jugadorEspaña5, jugadorChile4);
        listaE.addEspaña(jugadorEspaña4, jugadorChile4);
        listaE.addEspaña(jugadorEspaña6, jugadorChile5);
        listaE.addEspaña(jugadorEspaña7, jugadorChile6);
        listaE.addEspaña(jugadorEspaña8, jugadorChile7);
        listaE.addEspaña(jugadorEspaña9, jugadorChile8);
        listaE.addEspaña(jugadorEspaña10, jugadorChile9);
        listaE.addEspaña(jugadorEspaña11, jugadorChile11);

//
//        System.out.println(listaC.toStringChile());
//        listaC.ordernarChile();
//        System.out.println(listaC.toStringChile());
//
//        System.out.println(listaE.toStringEspaña());
//        listaE.ordenarEspaña();
//        System.out.println(listaE.toStringEspaña());
//        System.out.println(listaC.alineaciondeJuego(1, 2, 4, 3));
        System.out.println(listaC.toStringChile());
        listaC.ordernarChile();
        System.out.println(listaC.toStringChile());

        System.out.println("Se lesiono Suazo");
        listaC.cambiarJugador(jugadorChile6, jugadorChileSuplente);
        listaC.ordernarChile();
        System.out.println(listaC.toStringChile());

//        System.out.println(listaE.toStringEspaña());
//        listaE.ordenarEspaña();
//        System.out.println(listaE.toStringEspaña());
//
        System.out.println(listaC.alineaciondeJuego(4, 4, 2));
    }

}
