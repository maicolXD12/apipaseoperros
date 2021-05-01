package com.umanizales.apipaseoperros.controller;


import com.umanizales.apipaseoperros.modelo.Empleado;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/capacitacion")
@Validated
public class CapacitacionController {

    @GetMapping
    public Empleado getEmployee(){

        Empleado michael=new Empleado("Maicol herrada","10536563",
                3000000);
        return michael;
    }


}
