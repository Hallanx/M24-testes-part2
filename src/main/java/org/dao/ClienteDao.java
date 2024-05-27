package org.dao;

public class ClienteDao implements IClienteDao {

    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }

    @Override
    public String buscar(Long id) {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }

    @Override
    public String excluir(Long id) {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }

    @Override
    public String atualizar(Long id, String novoNome) {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }
}