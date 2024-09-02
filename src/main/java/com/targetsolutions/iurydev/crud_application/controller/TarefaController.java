package com.targetsolutions.iurydev.crud_application.controller;

import com.targetsolutions.iurydev.crud_application.DAO.Itarefa;
import com.targetsolutions.iurydev.crud_application.model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private Itarefa dao;

    @GetMapping({"", "/"})
    public String mostrarListaTarefa(Model model) {
        List<Tarefa> tarefa = new ArrayList<>();
        dao.findAll().forEach(tarefa::add);
        model.addAttribute("tarefa", tarefa);
        return "index";
    }

    @GetMapping("/api")
    @ResponseBody
    public List<Tarefa> listaTarefa() {
        Iterable<Tarefa> tarefas = dao.findAll();
        List<Tarefa> listaTarefa = new ArrayList<>();
        tarefas.forEach(listaTarefa::add);
        return listaTarefa;
    }

    @PostMapping("/api")
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa) {
        if (tarefa.getDataCriacao() == null) {
            tarefa.setDataCriacao(new Date());
        }
        Tarefa savedTarefa = dao.save(tarefa);
        return new ResponseEntity<>(savedTarefa, HttpStatus.CREATED);
    }

    @PutMapping("/api/{id}")
    public ResponseEntity<Tarefa> editarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        if (!dao.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        tarefa.setId(id);
        Tarefa updatedTarefa = dao.save(tarefa);
        return new ResponseEntity<>(updatedTarefa, HttpStatus.OK);
    }

    @DeleteMapping("/api/{id}")
    public ResponseEntity<String> excluirTarefa(@PathVariable Long id) {
        if (!dao.existsById(id)) {
            return new ResponseEntity<>("Tarefa não encontrada", HttpStatus.NOT_FOUND);
        }
        dao.deleteById(id);
        return new ResponseEntity<>("Tarefa excluída com sucesso!", HttpStatus.OK);
    }
}
