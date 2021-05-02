package com.umanizales.apipaseoperros.service;


import com.umanizales.apipaseoperros.modelo.Empleado;
import com.umanizales.apipaseoperros.modelo.ListaSE;
import com.umanizales.apipaseoperros.modelo.ListaSEExcepcion;
import org.springframework.stereotype.Service;

@Service
public class ListaSEService {
    private ListaSE ListaSE;


    public ListaSEService() {
        this.ListaSE = new ListaSE();

        ///bsd llenar la lista

        ListaSE.adicionarNodo(new Empleado("jose perez",
                    "34354454", 3434545));
        ListaSE.adicionarNodo(new Empleado("david castañeda",
                "6786554", 76424556));

    }

    public int contarNodos()
    {
        return ListaSE.getCont();

    }

    public String listarNodos()
    {
        return ListaSE.listadoNodos();
    }
}
