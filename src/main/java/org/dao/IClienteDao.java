package org.dao;

public interface IClienteDao {
    String salvar();
    String buscar(Long id);
    String excluir(Long id);
    String atualizar(Long id, String novoNome);
}
