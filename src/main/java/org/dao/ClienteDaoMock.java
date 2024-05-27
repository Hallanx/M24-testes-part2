package org.dao;

public class ClienteDaoMock implements IClienteDao {

    @Override
    public String salvar() {
        return "Cliente salvo com sucesso";
    }

    @Override
    public String buscar(Long id) {
        return "Cliente encontrado";
    }

    @Override
    public String excluir(Long id) {
        return "Cliente excluído com sucesso";
    }

    @Override
    public String atualizar(Long id, String novoNome) {
        return "Cliente atualizado com sucesso";
    }
}
