package org.service;

import org.dao.ContratoDaoMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContratoServiceTest {

    private ContratoService contratoService;

    @BeforeEach
    public void setUp() {
        contratoService = new ContratoService(new ContratoDaoMock());
    }

    @Test
    public void testSalvar() {
        String resultado = contratoService.salvar();
        Assertions.assertEquals("Sucesso", resultado);
    }
}
