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
        Model.Jugador jugadorEspaña3 = new Jugador("Puyol", 33, "Defensa", "España");
        Model.Jugador jugadorEspaña4 = new Jugador("Capdevilla", 27, "Defensa", "España");
        Model.Jugador jugadorEspaña5 = new Jugador("Casillas", 30, "Portero", "España");
        Model.Jugador jugadorEspaña6 = new Jugador("Xabi Alonso", 31, "Mediocampo", "España");
        Model.Jugador jugadorEspaña7 = new Jugador("Busquets", 27, "Mediocampo", "España");
        Model.Jugador jugadorEspaña8 = new Jugador("Xavi Hernandez", 25, "Mediocampo", "España");
        Model.Jugador jugadorEspaña9 = new Jugador("Pedro Rodriguez", 27, "Mediocampo", "España");
        Model.Jugador jugadorEspaña10 = new Jugador("Andres Iniesta", 28, "Mediocampo", "España");
        Model.Jugador jugadorEspaña11 = new Jugador("David Villa", 30, "Delantero", "España");
        Model.Jugador jugadorEspañaSuplente = new Jugador("Torres", 22, "Delantero", "España");

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

        System.out.println("Ordenamiento de los de Chile" + "\n");
        //lista desordenada
        System.out.println("Lista desordenada");
        System.out.println(listaC.toStringChile());
        //metodo para ordenar por edad
        listaC.ordernarChile();
        //lista ordenada
        System.out.println("Lista ordenada");
        System.out.println(listaC.toStringChile());
        System.out.println(".....................................................................");

        System.out.println("Ordenamiento de los de España" + "\n");
        //lista desordenada
        System.out.println("Lista desordenada");
        System.out.println(listaE.toStringEspaña());
        //metodo para ordenar
        listaE.ordenarEspaña();
        //lista ordenada por posicion 
        System.out.println("Lista ordenada");
        System.out.println(listaE.toStringEspaña());

        System.out.println(".....................................................................");

        System.out.println("Alineacion de Chile");
        System.out.println(listaC.alineaciondeJuego(4, 4, 2));
        System.out.println(".....................................................................");

        System.out.println("Se lesiona un jugador y hay que cambiarlo");
        //antes del cambio
        System.out.println("Antes del cambio");
        System.out.println(listaC.toStringChile());
        //se escoge el jugador que se va a cambiar de primero y luego el suplente que va a entrar a la cancha
        listaC.cambiarJugador(jugadorChile6, jugadorChileSuplente);

        System.out.println("Despues del cambio");
        System.out.println(listaC.toStringChile());

        System.out.println(listaC.alineaciondeJuego(4, 4, 2));

    }

}
