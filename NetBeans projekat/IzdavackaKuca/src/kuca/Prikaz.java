/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Prikaz.java
 *
 * Created on Feb 7, 2010, 4:29:41 PM
 */

package kuca;
//package demo;
//import kuca.*;

/**
 *
 * @author stevan
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Prikaz extends javax.swing.JFrame {

    Knjiga k = new Knjiga();

    public Prikaz() {
        initComponents();
    }

    /** Creates new form Prikaz */
    public Prikaz(java.awt.Frame parent, boolean modal) {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        tISBN = new javax.swing.JTextField();
        dPrikazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lKnjige = new javax.swing.JList();
        dObrisi = new javax.swing.JButton();
        dPromeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Knjige");

        jLabel1.setText("ISBN:");

        dPrikazi.setText("Prikazi");
        dPrikazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dPrikaziActionPerformed(evt);
            }
        });
		
		try
		{
        lKnjige.setModel(new javax.swing.AbstractListModel() {
			Funkcije f = new Funkcije();
        	Knjiga[] knjige = f.vratiKnjige(tISBN.getText());
            public int getSize() { return knjige.length; }
            public Object getElementAt(int i) { return (knjige[i].getISBN().toString() + "     " + knjige[i].getNaslov().toString()); }
            });
        }
        catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage(), "Greska!", JOptionPane.INFORMATION_MESSAGE);
		}
		
    lKnjige.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    lKnjige.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            lKnjigeMouseClicked(evt);
        }
    });
    
    jScrollPane1.setViewportView(lKnjige);

    dObrisi.setText("Obrisi");
    dObrisi.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dObrisiActionPerformed(evt);
        }
    });

    dPromeni.setText("Promeni");
    dPromeni.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dPromeniActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(dPromeni)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dObrisi))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(6, 6, 6)
                    .addComponent(tISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dPrikazi)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(tISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dPrikazi))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dObrisi)
                .addComponent(dPromeni))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dPrikaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPrikaziActionPerformed
        try
        {
            Funkcije f = new Funkcije();
            //Metode f = new MetodeServiceLocator().getMetode();
            Knjiga[] lista = f.vratiKnjige(tISBN.getText());
            ArrayList<String> arr = new ArrayList<String>();

            for(int i=0; i<lista.length; i++)
            {
                arr.add(lista[i].getISBN().toString() + "     " + lista[i].getNaslov().toString());
            }

            this.lKnjige.setListData(arr.toArray());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Greska!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_dPrikaziActionPerformed

    private void dObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dObrisiActionPerformed
        try
        {
            if (this.lKnjige.getSelectedValue() != null)
            {
                if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni?", "Brisanje podataka", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                {
                    Funkcije f = new Funkcije();
                    //Metode f = new MetodeServiceLocator().getMetode();

                    String nISBN = this.lKnjige.getSelectedValue().toString().substring(0, 8);
                    Knjiga[] knjige = f.vratiKnjige(nISBN);
                    f.brisiKnjigu(knjige[0].getISBN());

                    this.dPrikaziActionPerformed(evt);

                    JOptionPane.showMessageDialog(this, "Knjiga je obrisana!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Niste izabrali knjigu!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
	catch(NePostojiException npe)
        {
            JOptionPane.showMessageDialog(this, npe.getPoruka(), "Greska! Ne postoji knjiga sa zadatim ISBN brojem!", JOptionPane.ERROR_MESSAGE);
        }
	catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_dObrisiActionPerformed

    private void dPromeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPromeniActionPerformed
        try
        {
            Funkcije f = new Funkcije();
            //Metode f = new MetodeServiceLocator().getMetode();

            if (this.lKnjige.getSelectedValue() != null)
            {
                Promena p = new Promena();

                String nISBN = this.lKnjige.getSelectedValue().toString().substring(0, 8);
                Knjiga[] knjige = f.vratiKnjige(nISBN);

                p.setLocationRelativeTo(null);
                p.setAlwaysOnTop(rootPaneCheckingEnabled);
                p.k = knjige[0];
                p.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Prvo izaberite knjigu sa liste!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (Exception e)
		{
            JOptionPane.showMessageDialog(this, e.getMessage(), "Greska!", JOptionPane.INFORMATION_MESSAGE);
		}
    }//GEN-LAST:event_dPromeniActionPerformed

    private void lKnjigeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lKnjigeMouseClicked
        if(evt.getClickCount() == 2)
            this.dPromeniActionPerformed(null);
    }//GEN-LAST:event_lKnjigeMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Prikaz dialog = new Prikaz(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dObrisi;
    private javax.swing.JButton dPrikazi;
    private javax.swing.JButton dPromeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lKnjige;
    private javax.swing.JTextField tISBN;
    // End of variables declaration//GEN-END:variables
}