/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionclientes;

import Class.Cliente;
import ClassDAO.ClienteDAO;
import Controllers.CTRLCliente;
import Views.ViewGestionCliente;

/**
 *
 * @author BlackSterben
 */
public class GestionClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Cliente cliente = new Cliente();
                ClienteDAO clienteDAO = new ClienteDAO();
                ViewGestionCliente VGC = new ViewGestionCliente();
                
                CTRLCliente CTR = new CTRLCliente(cliente, clienteDAO, VGC);
                CTR.Iniciar();
                VGC.setVisible(true);
            }
        });
    }
    
}
