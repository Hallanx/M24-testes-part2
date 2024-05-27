package org.service;

import org.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        return clienteDao.salvar();
    }

    public String buscar(Long id) {
        return clienteDao.buscar(id);
    }

    public String excluir(Long id) {
        return clienteDao.excluir(id);
    }

    public String atualizar(Long id, String novoNome) {
        return clienteDao.atualizar(id, novoNome);
    }
}