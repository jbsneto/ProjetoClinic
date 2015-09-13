/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.clinic.facade.Facade;
import br.com.clinic.model.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GENPAC
 */
public class FacadeTest {
    
    private static Facade instance;
    private static long idTest;
    
    public FacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new Facade();
        
        //ID PARA TESTAR 
        idTest = 3;
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ClienteCadastrar method, of class Facade.
     */
    @Test
    public void testClienteCadastrar() throws Exception {
        System.out.println("ClienteCadastrar");
        Cliente c = new Cliente("nome","cpf","dataNas","telefone","email","obs","cidade","bairro","rua","numero","cep");
        
        instance.ClienteCadastrar(c);
        assertNotNull(instance.ClienteListar());

        
    }

    /**
     * Test of ClienteBuscar method, of class Facade.
     */
    @Test
    public void testClienteBuscar() throws Exception {
        System.out.println("ClienteBuscar");   
        assertNotNull(instance.ClienteBuscar(  idTest  ));
    }

    /**
     * Test of ClienteEditar method, of class Facade.
     */
    @Test
    public void testClienteEditar() throws Exception {
        System.out.println("ClienteEditar");
  
        Cliente cli = instance.ClienteBuscar(  idTest  );
        
        cli.setNome("TestJUnit");
        
        instance.ClienteEditar(cli);
        
        assertEquals(cli.getNome(), instance.ClienteBuscar(  idTest ).getNome());
    }

    /**
     * Test of ClienteDeletar method, of class Facade.
     */
    @Test
    public void testClienteDeletar() throws Exception {
        System.out.println("ClienteDeletar");
        Cliente c = new Cliente();
        instance.ClienteCadastrar(c);
        instance.ClienteDeletar(c);
        System.out.println(c.getId());
        assertNull(instance.ClienteBuscar(c.getId()));
    }
    
    /**
     * Test of ClienteListar method, of class Facade.
     */
    @Test
    public void testClienteListar() throws Exception {
        System.out.println("ClienteDeletar");
        assertNotNull(instance.ClienteListar());
    }
    
    
    
}
