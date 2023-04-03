/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Haikal
 */
public class PesananView extends javax.swing.JFrame {
    /**
     * Creates new form HomeView
     */
    public PesananView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menubar = new javax.swing.JPanel();
        PesananBtn = new javax.swing.JButton();
        PelangganBtn = new javax.swing.JButton();
        TransaksiBtn = new javax.swing.JButton();
        KeluarBtn = new javax.swing.JButton();
        Contains = new javax.swing.JPanel();
        Pelanggan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Pesanan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Transaksi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1005, 550));

        Menubar.setBackground(new java.awt.Color(18, 20, 21));

        PesananBtn.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        PesananBtn.setForeground(new java.awt.Color(0, 204, 204));
        PesananBtn.setText("Pesanan");
        PesananBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        PesananBtn.setContentAreaFilled(false);
        PesananBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PesananBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        PesananBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesananBtnActionPerformed(evt);
            }
        });

        PelangganBtn.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        PelangganBtn.setForeground(new java.awt.Color(0, 204, 204));
        PelangganBtn.setText("Pelanggan");
        PelangganBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        PelangganBtn.setContentAreaFilled(false);
        PelangganBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PelangganBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        PelangganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganBtnActionPerformed(evt);
            }
        });

        TransaksiBtn.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        TransaksiBtn.setForeground(new java.awt.Color(0, 204, 204));
        TransaksiBtn.setText("Transaksi");
        TransaksiBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        TransaksiBtn.setContentAreaFilled(false);
        TransaksiBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TransaksiBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        TransaksiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiBtnActionPerformed(evt);
            }
        });

        KeluarBtn.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        KeluarBtn.setForeground(new java.awt.Color(255, 0, 51));
        KeluarBtn.setText("Keluar");
        KeluarBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        KeluarBtn.setContentAreaFilled(false);
        KeluarBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KeluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenubarLayout = new javax.swing.GroupLayout(Menubar);
        Menubar.setLayout(MenubarLayout);
        MenubarLayout.setHorizontalGroup(
            MenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenubarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PesananBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PelangganBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(TransaksiBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KeluarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenubarLayout.setVerticalGroup(
            MenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenubarLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(PesananBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PelangganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TransaksiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KeluarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Informasi Pelanggan");

        jTable2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Waktu Pemesanan", "Jadwal Pengiriman", "Status Pembayaran"
            }
        ));
        jTable2.setRowHeight(40);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout PelangganLayout = new javax.swing.GroupLayout(Pelanggan);
        Pelanggan.setLayout(PelangganLayout);
        PelangganLayout.setHorizontalGroup(
            PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PelangganLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        PelangganLayout.setVerticalGroup(
            PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detail Pesanan");

        jTable1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Kontak", "Alamat Pengiriman"
            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout PesananLayout = new javax.swing.GroupLayout(Pesanan);
        Pesanan.setLayout(PesananLayout);
        PesananLayout.setHorizontalGroup(
            PesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesananLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(PesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
        );
        PesananLayout.setVerticalGroup(
            PesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        Transaksi.setPreferredSize(new java.awt.Dimension(715, 511));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Detail Transaksi");

        jTable3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Waktu Pemesanan", "Jadwal Pengiriman", "Status Pembayaran"
            }
        ));
        jTable3.setRowHeight(40);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout TransaksiLayout = new javax.swing.GroupLayout(Transaksi);
        Transaksi.setLayout(TransaksiLayout);
        TransaksiLayout.setHorizontalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransaksiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap())
        );
        TransaksiLayout.setVerticalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ContainsLayout = new javax.swing.GroupLayout(Contains);
        Contains.setLayout(ContainsLayout);
        ContainsLayout.setHorizontalGroup(
            ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainsLayout.createSequentialGroup()
                    .addComponent(Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ContainsLayout.setVerticalGroup(
            ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Pesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainsLayout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menubar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contains, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contains, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesananBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesananBtnActionPerformed
        // TODO add your handling code here:
        Contains.removeAll();
        Contains.repaint();
        Contains.revalidate();
        
        // Menambahkan panel
        Contains.add(Pesanan);
        Contains.repaint();
        Contains.revalidate();
    }//GEN-LAST:event_PesananBtnActionPerformed

    private void PelangganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganBtnActionPerformed
        // TODO add your handling code here:
        Contains.removeAll();
        Contains.repaint();
        Contains.revalidate();
        
        // Menambahkan panel
        Contains.add(Pelanggan);
        Contains.repaint();
        Contains.revalidate();
    }//GEN-LAST:event_PelangganBtnActionPerformed

    private void TransaksiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiBtnActionPerformed
        // TODO add your handling code here:
        Contains.removeAll();
        Contains.repaint();
        Contains.revalidate();
        
        // Menambahkan panel
        Contains.add(Transaksi);
        Contains.repaint();
        Contains.revalidate();
    }//GEN-LAST:event_TransaksiBtnActionPerformed

    private void KeluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeluarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PesananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesananView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contains;
    private javax.swing.JButton KeluarBtn;
    private javax.swing.JPanel Menubar;
    private javax.swing.JPanel Pelanggan;
    private javax.swing.JButton PelangganBtn;
    private javax.swing.JPanel Pesanan;
    private javax.swing.JButton PesananBtn;
    private javax.swing.JPanel Transaksi;
    private javax.swing.JButton TransaksiBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
