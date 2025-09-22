package com.example.estudo.controller;

import com.example.estudo.model.Tarefa;
import com.example.estudo.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> listTarefa(){
        return tarefaService.listTarefa();
    }

    @PostMapping
    public Tarefa saveTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.saveTarefa(tarefa);
    }
}
