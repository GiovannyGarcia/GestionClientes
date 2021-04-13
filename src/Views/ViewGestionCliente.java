package Views;

import Class.Cliente;
import ClassDAO.ClienteDAO;
import Conexion.Conexion;
import Controllers.ClienteCTRL;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BlackSterben
 */
public class ViewGestionCliente extends javax.swing.JFrame {

    private final ClienteDAO clientesDao = new ClienteDAO();
    private List<Cliente> listaClientes;
    private final Cliente cliente;
    private final ClienteCTRL clienteCtrl = new ClienteCTRL();

    public ViewGestionCliente() {
        initComponents();
        this.cliente = new Cliente();
        this.CargarLista();

    }

    @SuppressWarnings("empty-statement")
    private void CargarLista(){
        try {
            this.listaClientes = this.clientesDao.RecuperarClientes(Conexion.obtener());
            DefaultTableModel dtm = (DefaultTableModel) TableClientes.getModel();
            String[] titulos = {"Cedula", "Nombre", "Apellidos", "Telefono", "Correo", "Ciudad"};
            dtm.setColumnIdentifiers(titulos);
            dtm.setColumnCount(titulos.length);
            dtm.setRowCount(0);
            
            for (int i = 0; i < this.listaClientes.size(); i++) {
                dtm.addRow(new Object[]{
                    this.listaClientes.get(i).getCedula(),
                    this.listaClientes.get(i).getNombre(),
                    this.listaClientes.get(i).getApellidos(),
                    this.listaClientes.get(i).getTelefono(),
                    this.listaClientes.get(i).getCorreo(),
                    this.listaClientes.get(i).getCiudad(),});
            }//        listaClientes.forEach((cliente) -> {
//            dtm.addRow(new Object[]{
//                this.listaClientes.getClass(cliente)
//            });
//        });
;       } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ViewGestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JPANEL1 = new javax.swing.JPanel();
        JPANEL2 = new javax.swing.JPanel();
        LName = new javax.swing.JLabel();
        LName1 = new javax.swing.JLabel();
        LName2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxName = new javax.swing.JTextField();
        TxCedula = new javax.swing.JTextField();
        TxLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxCel = new javax.swing.JTextField();
        TxEmail = new javax.swing.JTextField();
        TxCity = new javax.swing.JTextField();
        BtmRegister = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPANEL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JPANEL2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Registrar"));

        LName.setText("Nombres");

        LName1.setText("Cedula");

        LName2.setText("Apellidos");

        jButton1.setText("jButton1");

        TxName.setText(" ");

        TxCedula.setText(" ");

        TxLastName.setText(" ");

        jLabel1.setText("Telefono");

        jLabel2.setText("Correo");

        jLabel3.setText("Ciudad");

        TxCel.setText(" ");

        TxEmail.setText(" ");

        TxCity.setText(" ");

        BtmRegister.setText("Registrar");

        javax.swing.GroupLayout JPANEL2Layout = new javax.swing.GroupLayout(JPANEL2);
        JPANEL2.setLayout(JPANEL2Layout);
        JPANEL2Layout.setHorizontalGroup(
            JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANEL2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPANEL2Layout.createSequentialGroup()
                        .addComponent(LName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxName))
                    .addGroup(JPANEL2Layout.createSequentialGroup()
                        .addComponent(LName1)
                        .addGap(18, 18, 18)
                        .addComponent(TxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPANEL2Layout.createSequentialGroup()
                        .addComponent(LName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxLastName)))
                .addGap(18, 18, 18)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPANEL2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxCel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(JPANEL2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TxCity))
                    .addGroup(JPANEL2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TxEmail)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPANEL2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtmRegister)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addGap(80, 80, 80))
        );
        JPANEL2Layout.setVerticalGroup(
            JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANEL2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName1)
                    .addComponent(TxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(TxCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName)
                    .addComponent(TxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName2)
                    .addComponent(TxLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtmRegister)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Clientes"));

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TableClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPANEL1Layout = new javax.swing.GroupLayout(JPANEL1);
        JPANEL1.setLayout(JPANEL1Layout);
        JPANEL1Layout.setHorizontalGroup(
            JPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANEL1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPANEL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPANEL1Layout.setVerticalGroup(
            JPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANEL1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JPANEL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPANEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPANEL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtmRegister;
    private javax.swing.JPanel JPANEL1;
    private javax.swing.JPanel JPANEL2;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel LName1;
    private javax.swing.JLabel LName2;
    private javax.swing.JTable TableClientes;
    public javax.swing.JTextField TxCedula;
    public javax.swing.JTextField TxCel;
    public javax.swing.JTextField TxCity;
    public javax.swing.JTextField TxEmail;
    public javax.swing.JTextField TxLastName;
    public javax.swing.JTextField TxName;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables



//public class manejador_tabla extends AbstractTableModel {
//      private String[] titulos = {"PRODUCTO", "PRECIO UNIT", "CANTIDAD", "PRECIO"};
//
//            @Override
//            public int getRowCount() {
//                return pedido.getLista_detalles().size();
//            }
//
//            @Override
//            public int getColumnCount() {
//                return titulos.length;
//            }
//
//            @Override
//            public String getColumnName(int column) {
//                return this.titulos[column];
//            }
//
//        @Override
//        public Object getValueAt(int rowIndex, int columnIndex) {
//              Detalle_pedido detalle = pedido.getLista_detalles().get(rowIndex);
//                switch (columnIndex) {
//                    case 0:
//                        return detalle.getProducto();
//                    case 1:
//                        return detalle.getProducto().getPrecio_venta();
//                    case 2:
//                        return detalle.getCantidad();
//                    case 3:
//                        return detalle.getCantidad() * detalle.getProducto().getPrecio_venta();
//                }
//                return "";
//        }
//    }
}
