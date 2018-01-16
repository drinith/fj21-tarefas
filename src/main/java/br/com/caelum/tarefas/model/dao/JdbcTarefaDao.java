package br.com.caelum.tarefas.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.tarefas.model.entity.Tarefa;

public class JdbcTarefaDao {

	public static void adiciona(Tarefa tarefa) {
		
		ConnectionFactory cf = new ConnectionFactory();
		PreparedStatement st=null;
		String sql="insert into tarefas (descricao,finalizado,dataFinalizacao) "
				+ "values (?,?,?)";
		Calendar calendar = new GregorianCalendar();
				
		tarefa.setDataFinalizacao(calendar);
		tarefa.setFinalizado(false);
		try {
			st =cf.getConnection().prepareStatement(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			st.setString(1,tarefa.getDescricao());
			st.setBoolean(2,tarefa.isFinalizado());
			st.setDate(3,new java.sql.Date(tarefa.getDataFinalizacao().getTimeInMillis()));
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
