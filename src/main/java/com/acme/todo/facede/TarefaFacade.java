/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.todo.facede;

import com.acme.todo.model.Tarefa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alunoces
 */
@Stateless
public class TarefaFacade extends AbstractFacade<Tarefa> {

    @PersistenceContext(unitName = "todo-pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TarefaFacade() {
        super(Tarefa.class);
    }
    
}
