package br.com.caelum.tarefas.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.tarefas.model.dao.JdbcTarefaDao;
import br.com.caelum.tarefas.model.entity.Tarefa;

public class InserirTarefaTeste {
	public static void main (String [] args) {
		
		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
		
		Tarefa t = new Tarefa();
		t.setDescricao("descrição");
		t.setFinalizado(true);
		t.setDataFinalizacao(calendar);
		
		JdbcTarefaDao.adiciona(t);
		
	}
}
