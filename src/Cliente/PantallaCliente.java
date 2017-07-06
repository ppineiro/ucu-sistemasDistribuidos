/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import BDyGral.VarGlobal;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author Michel
 */
public class PantallaCliente extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCliente
     */
    public PantallaCliente() {
        initComponents();
        this.lblOnline.setText(VarGlobal.usuarioLogged);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        listChat = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listUsuarios = new javax.swing.JList();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblOnline = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listChat.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listChat.setName("listChat"); // NOI18N
        jScrollPane1.setViewportView(listChat);

        listUsuarios.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listUsuarios.setName("listUsuarios"); // NOI18N
        jScrollPane2.setViewportView(listUsuarios);

        btnEnviar.setText("Enviar");
        btnEnviar.setName("btnEnviar"); // NOI18N
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel1.setText("Chat");

        jLabel2.setText("Usuarios Online");

        txtMensaje.setName("txtMensaje"); // NOI18N

        jLabel3.setText("Escribe tu mensaje aquí:");

        lblOnline.setText("Online: Pablo");
        lblOnline.setName("lblOnline"); // NOI18N

        menu.setName("menu"); // NOI18N

        menuArchivo.setText("Archivo");
        menuArchivo.setName("menuArchivo"); // NOI18N
        menu.add(menuArchivo);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtMensaje)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblOnline))
                        .addGap(0, 543, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOnline)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        lblOnline.getAccessibleContext().setAccessibleName("Online");
        lblOnline.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCliente().setVisible(true);
            }
        });
    }

    /**
     * A�ade el actionListener que se le pasa tanto a pulsar <intro> en el
     * textField como al bot�n.
     *
     * @param accion ActionListener a a�adir.
     */
    public void addActionListener(ActionListener accion) {
        txtMensaje.addActionListener(accion);
        btnEnviar.addActionListener(accion);

    }

    /**
     * A�ade el texto que se le pasa al textArea.
     *
     * @param texto Texto a a�adir
     */
    public void addTexto(String texto) {
        DefaultListModel lista = new DefaultListModel();
//esto esta asi ya que hay una jlist y para poder agregar los textos del chat hay que poner en una lista de este tip
        //agregarle el texto y luego setear la lista al jlist
        int i = 0;
        while (i < listChat.getModel().getSize()) {
            lista.addElement(listChat.getModel().getElementAt(i));
            i++;
        }
        lista.addElement(texto);

        listChat.setModel(lista);
    }

    /**
     * Devuelve el texto que hay en el textfield y lo borra.
     *
     * @return El texto del textfield.
     */
    public String getTexto() {
        String texto = txtMensaje.getText();
        txtMensaje.setText("");
        return texto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOnline;
    private javax.swing.JList listChat;
    private javax.swing.JList listUsuarios;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
}
