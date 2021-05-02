/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umanizales.apipaseoperros.modelo;



import java.io.Serializable;


/**
 *
 * @author carloaiza
 */
public class ListaSE implements Serializable{
   private Nodo cabeza;
   private int cont;

    public ListaSE() {
        this.cont=0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
   
    
    public void adicionarNodo(Object dato)
    {
        if(cabeza==null)
        {
            cabeza = new Nodo(dato);
            cont++;
        }
        else
        {
            Nodo temp= cabeza;
            while(temp.getSiguiente()!=null)
            {
                temp=temp.getSiguiente();
            }
            // En el ultimo
            temp.setSiguiente(new Nodo(dato));
            cont++;
        }
    }

    public void adicionarNodoAlInicio(Object dato)
    {
        if(cabeza ==null)
        {
            cabeza = new Nodo(dato);
            cont++;
        }
        else
        {
            Nodo temp = new Nodo(dato);
            temp.setSiguiente(cabeza);
            cabeza=temp;
            cont++;
        }
    }
    
    public String listadoNodos()
    {
        String listado="";
        Nodo temp=cabeza;
        while(temp!=null)
        {
            listado = listado + temp.getDato();
            temp = temp.getSiguiente();
        }
        
        return listado;
    }

    public int getCont() {
        return cont;
    }
}
