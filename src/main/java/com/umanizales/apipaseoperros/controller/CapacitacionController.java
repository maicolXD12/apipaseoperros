package com.umanizales.apipaseoperros.controller;


import com.umanizales.apipaseoperros.modelo.Empleado;
import com.umanizales.apipaseoperros.modelo.ListaSE;
import com.umanizales.apipaseoperros.service.ListaSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/capacitacion")
@Validated
public class CapacitacionController {

    private ListaSEService ListaSEService;
    @Autowired
    public CapacitacionController(com.umanizales.apipaseoperros.service.ListaSEService listaSEService) {
        ListaSEService = listaSEService;
    }

    @GetMapping
    public Empleado getEmployee(){

        Empleado michael=new Empleado("Maicol herrada","10536563",
                3000000);
        return michael;
    }

    @GetMapping("/empleados")
    public Empleado[] getAllEmployees(){
        Empleado[] empleados= new Empleado[3];
        empleados [0]=new Empleado("Maicol herrada","10536563",
                3000000);
        empleados [1]=new Empleado("Eilyn","100343563",
                4000000);
        empleados [2]=new Empleado("pepito","100345463",
                1000000);
         return empleados;
    }

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado employee) {
        //simular que recibo un empleado y lo mando a guardar
        // en bds y ademas de recalcular bonificacion del 15%
        // guardar bds.
        employee.setSalario(employee.getSalario() * 1.15);
        return employee;
    }
    @GetMapping(path = "/count")
    public int getCountEmployees()
    {
        return ListaSEService.contarNodos();
    }

    @GetMapping(path = "/Listar")
    public String getTotalEmployees()
    {
        return ListaSEService.listarNodos();
    }
}
