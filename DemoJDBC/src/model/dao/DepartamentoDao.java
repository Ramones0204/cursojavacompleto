package model.dao;

import java.util.List;

import model.entidades.Departamento;

public interface DepartamentoDao {
	void inserir(Departamento departamento);
	void atualizar(Departamento departamento);
	void removerPeloId(Integer id);
	Departamento buscarPeloId(Integer id);
	List<Departamento> listar();
}
