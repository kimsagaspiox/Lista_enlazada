/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_enlazada;

/**
 *
 * @author Zonia Roldan
 */
public class Lista {
    protected Nodo inicio,fin;

    public Lista() {
        inicio=null;
        fin=null;
    }
    
    public void agregar_inicio(char elemento){
        inicio = new Nodo(elemento, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    
    public void mostrar_lista(){
        Nodo auxiliar = inicio;
        while(auxiliar != null){
            if(auxiliar.siguiente == null){
                System.out.print("[" + auxiliar.dato + "]->Null");
            }else{
                System.out.print("[" + auxiliar.dato + "]->");
            }
            auxiliar = auxiliar.siguiente;
        }
      }
    
}
