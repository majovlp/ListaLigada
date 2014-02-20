/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadas;

/**
 *
 * @author Alumnos
 */
public class ListasLigadas {
     private static Nodo p = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListaLigada<String> lista = new ListaLigada<>();                   
       lista.mostrarLista();
       lista.insertaFinal("1"); 
       lista.insertaFinal("2");
       lista.insertaFinal("3");
       lista.mostrarLista();
       ListaLigada<String> lista2= lista.invertirLista();
       lista2.mostrarLista();
    }
}
