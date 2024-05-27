package org.service;

import org.dao.ClienteDaoMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteServiceTest {

    private ClienteService clienteService;

    @BeforeEach
    public void setUp() {
        clienteService = new ClienteService(new ClienteDaoMock());
    }

    @Test
    public void testSalvar() {
        String resultado = clienteService.salvar();
        Assertions.assertEquals("Cliente salvo com sucesso", resultado);
    }

    @Test
    public void testBuscar() {
        String resultado = clienteService.buscar(1L);
        Assertions.assertEquals("Cliente encontrado", resultado);
    }

    @Test
    public void testExcluir() {
        String resultado = clienteService.excluir(1L);
        Assertions.assertEquals("Cliente excluído com sucesso", resultado);
    }

    @Test
    public void testAtualizar() {
        String resultado = clienteService.atualizar(1L, "Novo Nome");
        Assertions.assertEquals("Cliente atualizado com sucesso", resultado);
    }
}
