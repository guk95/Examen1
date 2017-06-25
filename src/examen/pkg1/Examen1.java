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

        Model.Jugador jugadorChile1 = new Jugador("1", 4, "Portero", "Chile");
        Model.Jugador jugadorChile2 = new Jugador("2", 3, "Portero", "Chile");
        Model.Jugador jugadorChile3 = new Jugador("3", 2, "Portero", "Chile");
        Model.Jugador jugadorChile4 = new Jugador("4", 1, "Portero", "Chile");
        Model.Jugador jugadorChile5 = new Jugador("5", 10, "Portero", "Chile");
        Model.Jugador jugadorChile6 = new Jugador("6", 11, "Portero", "Chile");
        Model.Jugador jugadorChile7 = new Jugador("7", 7, "Portero", "Chile");
        Model.Jugador jugadorChile8 = new Jugador("8", 9, "Portero", "Chile");
        Model.Jugador jugadorChile9 = new Jugador("9", 10, "Portero", "Chile");
        Model.Jugador jugadorChile10 = new Jugador("10", 10, "Portero", "Chile");
        Model.Jugador jugadorChile11 = new Jugador("11", 10, "Portero", "Chile");
        Model.Jugador jugadorChile12 = new Jugador("Mario", 10, "Portero", "Chile");
        Model.Jugador jugadorChileSuplente = new Jugador("MARIO", 0, "DElantero", "Chile");

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

        Model.Jugador jugadorEspaña1 = new Jugador("1", 4, "Delantero", "Chile");
        Model.Jugador jugadorEspaña2 = new Jugador("2", 3, "Delantero", "Chile");
        Model.Jugador jugadorEspaña3 = new Jugador("3", 2, "Delantero", "Chile");
        Model.Jugador jugadorEspaña4 = new Jugador("4", 1, "Portero", "Chile");
        Model.Jugador jugadorEspaña5 = new Jugador("5", 10, "Portero", "Chile");
        Model.Jugador jugadorEspaña6 = new Jugador("6", 11, "Portero", "Chile");
        Model.Jugador jugadorEspaña7 = new Jugador("7", 7, "Portero", "Chile");
        Model.Jugador jugadorEspaña8 = new Jugador("8", 9, "Portero", "Chile");
        Model.Jugador jugadorEspaña9 = new Jugador("9", 10, "Portero", "Chile");
        Model.Jugador jugadorEspaña10 = new Jugador("10", 10, "Portero", "Chile");
        Model.Jugador jugadorEspaña11 = new Jugador("11", 10, "Portero", "Chile");

        listaE.addEspaña(jugadorEspaña1, jugadorChile1);
        listaE.addEspaña(jugadorEspaña2, jugadorChile2);
        listaE.addEspaña(jugadorEspaña3, jugadorChile3);
        listaE.addEspaña(jugadorEspaña4, jugadorChile9);

//        listaC.sortedChile();
        System.out.println(listaE.toString());

    }

}
