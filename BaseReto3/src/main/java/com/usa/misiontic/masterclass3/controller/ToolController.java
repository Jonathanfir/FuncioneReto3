package com.usa.misiontic.masterclass3.controller;


import com.usa.misiontic.masterclass3.entities.Toool;
import com.usa.misiontic.masterclass3.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Tool")
public class ToolController {

    @Autowired
    private ToolService servicioHerramienta;

    @GetMapping("/all")
    public List<Toool> getAll(){
        return servicioHerramienta.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Toool save(@RequestBody  Toool p){
        return servicioHerramienta.save(p);
    }
}
