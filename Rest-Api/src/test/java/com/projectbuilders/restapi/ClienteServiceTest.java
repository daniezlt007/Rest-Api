package com.projectbuilders.restapi;

import com.projectbuilders.restapi.model.Cliente;
import com.projectbuilders.restapi.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ClienteServiceTest {

    @Autowired
    private ClienteService clienteService;

    @Test
    public void buscarPorIdRetornoNotNull(){
        Cliente cliente = this.clienteService.findById(1L);
        Assert.assertNotNull(cliente);
    }

    @Test
    public void buscarPorIdRetornoNull(){
        Cliente cliente = this.clienteService.findById(1L);
        Assert.assertNull(cliente);
    }

    @Test
    public void retornaLista(){
        List<Cliente> clientes = this.clienteService.getClients();
        Assert.assertTrue(!clientes.isEmpty());
    }

    @Test
    public void retornaListaVazia(){
        List<Cliente> clientes = this.clienteService.getClients();
        clientes.clear();
        Assert.assertTrue(clientes.isEmpty());
    }

    @Test
    public void salvarCliente(){
        Cliente cliente = this.clienteService.save(retornaObjeto());
        Assert.assertNotNull(cliente);
    }

    private Cliente retornaObjeto(){
        return new Cliente("teste", "11122233377", "7788987", 33);
    }

}
