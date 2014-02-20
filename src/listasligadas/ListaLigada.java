/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadas;

/**
 *
 * @param <T>
 * @Autor Alumnos
 */
public class ListaLigada<T> {
    private Nodo<T> p= null;
    
    public void mostrarLista(){        
        Nodo<T> q =p;        
        while(q!=null){
            System.out.println(q.getValor());
            q=q.getLiga();
        
        }
    }
    public void insertaInicio(T obj){
        Nodo<T> t = new Nodo<>();
        t.setValor(obj);    
        t.setLiga(p);
        p=t;
    }
    
    public void insertaFinal(T obj){
        //variable aux
        Nodo<T> q =p;
        Nodo<T> t= new Nodo<>();        
        t.setValor(obj);
        t.setLiga(null);
        //cilco que recorre la lista 
        if(p==null){
            p=t;
        }else{
            while(q.getLiga()!=null){            
            q=q.getLiga();
        
        }
            q.setLiga(t);  
      } 
    }
    
    public ListaLigada<T> invertirLista(){
        ListaLigada<T> lista2 = new ListaLigada<>();
        Nodo<T> q =p;        
        while(q!=null){
            lista2.insertaInicio(q.getValor());
            q=q.getLiga(); 
            
        }
        return lista2;
    }
        
        

}
