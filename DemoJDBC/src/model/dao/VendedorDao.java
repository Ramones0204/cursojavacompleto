package model.dao;

import java.util.List;

import model.entidades.Vendedor;

public interface VendedorDao {
	void inserir(Vendedor vendedor);
	void atualizar(Vendedor vendedor);
	void removerPeloId(Integer id);
	Vendedor buscarPeloId(Integer id);
	List<Vendedor> listar();
}
