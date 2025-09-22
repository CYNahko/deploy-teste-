package com.example.estudo.service;

import com.example.estudo.model.Tarefa;
import com.example.estudo.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static com.example.estudo.enums.StatusTarefa.TarefaStatus.Pendente;

@Service
public class TarefaService {

    private TarefaRepository tarefaRepository;

    public List<Tarefa> listTarefa(){ return tarefaRepository.findAll();}

    public Tarefa saveTarefa(Tarefa tarefa){
        tarefa.setCreationDate(LocalDate.now());
        tarefa = tarefaRepository.save(tarefa);
        return tarefa;
    }
}