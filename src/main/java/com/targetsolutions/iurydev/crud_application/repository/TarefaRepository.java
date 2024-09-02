package com.targetsolutions.iurydev.crud_application.repository;

import com.targetsolutions.iurydev.crud_application.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
