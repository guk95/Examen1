/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Listas.ListaC;
import Listas.ListaE;
import Model.Jugador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario
 */
public class TestExamen {

    public TestExamen() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testOrdenarChile() {

        //prueba el metodo ordenar de la clase ListaC para ordenar por edad
        Listas.ListaC listac = new ListaC();
        Model.Jugador prueba1 = new Jugador("Rodriguez", 3, "Delantero", "Chile");
        Model.Jugador prueba2 = new Jugador("Mario", 2, "Delantero", "Chile");
        Model.Jugador prueba3 = new Jugador("Jose", 1, "Delantero", "Chile");
        listac.addChile(prueba1);
        listac.addChile(prueba2);
        listac.addChile(prueba3);
        listac.ordernarChile();
        listac.getNodo(0);

        String obtenido = "";
        for (int i = 0; i < 3; i++) {
            obtenido = obtenido + listac.getNodo(i).getDato().getNombre() + " ";

        }
        String esperado = "Jose Mario Rodriguez ";
        assertEquals(obtenido, esperado);

    }

    @Test
    public void testOrdenarEspaña() {

        //prueba el metodo ordenar de la clase ListaE para ordenar por posicion 
        Listas.ListaC listac = new ListaC();
        Listas.ListaE listae = new ListaE();
        Model.Jugador prueba1 = new Jugador("Rodriguez", 3, "Defensa", "Chile");
        Model.Jugador prueba2 = new Jugador("Mario", 2, "Portero", "Chile");
        Model.Jugador prueba3 = new Jugador("Jose", 1, "Delantero", "Chile");

        Model.Jugador prueba4 = new Jugador("Kevin", 4, "Delantero", "España");
        Model.Jugador prueba5 = new Jugador("Kevin2", 4, "Portero", "España");
        Model.Jugador prueba6 = new Jugador("Kevin3", 4, "Defensa", "España");

        listae.addEspaña(prueba4, prueba1);
        listae.addEspaña(prueba5, prueba2);
        listae.addEspaña(prueba6, prueba3);
        listae.ordenarEspaña();

        String obtenido = "";
        for (int i = 0; i < 3; i++) {
            obtenido = obtenido + listae.getNodo(i).getDato().getPosicion() + " ";

        }
        String esperado = "Portero Defensa Delantero ";
        assertEquals(obtenido, esperado);

    }

    @Test
    public void testCambiarJugador() {

        //prueba el metodo ordenar de la clase ListaC para cambiar un jugador
        Listas.ListaC listac = new ListaC();
        Model.Jugador prueba1 = new Jugador("Rodriguez", 3, "Delantero", "Chile");
        Model.Jugador prueba2 = new Jugador("Mario", 2, "Delantero", "Chile");
        Model.Jugador prueba3 = new Jugador("Jose", 1, "Delantero", "Chile");
        Model.Jugador suplente = new Jugador("Kevin", 4, "Delantero", "Chile");

        listac.addChile(prueba1);
        listac.addChile(prueba2);
        listac.addChile(prueba3);
        listac.cambiarJugador(prueba1, suplente);

        String obtenido = "";
        for (int i = 0; i < 3; i++) {
            obtenido = obtenido + listac.getNodo(i).getDato().getNombre() + " ";

        }
        String esperado = "Kevin Mario Jose ";
        assertEquals(obtenido, esperado);

    }

    @Test
    public void testgetNodo() {

        //prueba el metodo ordenar de la clases Lista para obtener un nodo
        Listas.ListaC listac = new ListaC();
        Model.Jugador prueba1 = new Jugador("Rodriguez", 3, "Delantero", "Chile");
        Model.Jugador prueba2 = new Jugador("Mario", 2, "Delantero", "Chile");
        Model.Jugador prueba3 = new Jugador("Jose", 1, "Delantero", "Chile");
        listac.addChile(prueba1);
        listac.addChile(prueba2);
        listac.addChile(prueba3);

        String obtenido = listac.getNodo(2).getDato().getNombre();

        String esperado = "Jose";
        assertEquals(obtenido, esperado);

    }

    @Test
    public void testOrdenarAlineacion() {

        //prueba el metodo ordenar de la clase ListaC para ordenar por posicion 
        Listas.ListaC listac = new ListaC();
        Model.Jugador prueba1 = new Jugador("Rodriguez", 3, "Delantero", "Chile");
        Model.Jugador prueba2 = new Jugador("Mario", 2, "Portero", "Chile");
        Model.Jugador prueba3 = new Jugador("Jose", 1, "Defensa", "Chile");
        listac.addChile(prueba1);
        listac.addChile(prueba2);
        listac.addChile(prueba3);
        listac.ordenarparaAlineacion();
        listac.getNodo(0);

        String obtenido = "";
        for (int i = 0; i < 3; i++) {
            obtenido = obtenido + listac.getNodo(i).getDato().getNombre() + " ";

        }
        String esperado = "Mario Jose Rodriguez ";
        assertEquals(obtenido, esperado);

    }

}
