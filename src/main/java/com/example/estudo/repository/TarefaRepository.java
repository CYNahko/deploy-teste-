package com.example.estudo.repository;

import com.example.estudo.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{
}
