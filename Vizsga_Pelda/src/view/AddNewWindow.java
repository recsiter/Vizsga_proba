package view;

import java.awt.HeadlessException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import persistance.PlaneTripController;
import vizsga_pelda.trippackage.planeClass;
import vizsga_pelda.trippackage.tripByPlane;

/**
 *
 * @author --G--
 */
public class AddNewWindow extends javax.swing.JFrame {

    private List<PlaneTripEventListener> listeners;
    private tripByPlane innerPlaneTrip;

    public AddNewWindow(String title) throws HeadlessException {
        super(title);
        listeners = new ArrayList<>();
        innerPlaneTrip = new tripByPlane();

    }

    /**
     * Creates new form addNewWindow
     */
    public AddNewWindow() {
        initComponents();
        listeners = new ArrayList<>();
        innerPlaneTrip = new tripByPlane();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAirportFrom = new javax.swing.JLabel();
        lbFlyingClass = new javax.swing.JLabel();
        lbAirportTo = new javax.swing.JLabel();
        lbToGo = new javax.swing.JLabel();
        lbPassangerName = new javax.swing.JLabel();
        lbTripDate = new javax.swing.JLabel();
        lbNumberOfNights = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        jAirportFrom = new javax.swing.JTextField();
        jToGo = new javax.swing.JTextField();
        jFlyingClass = new javax.swing.JTextField();
        jPassangerName = new javax.swing.JTextField();
        jTripDate = new javax.swing.JTextField();
        jNumberOfNigths = new javax.swing.JTextField();
        jPrice = new javax.swing.JTextField();
        jAirportTo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbAirportFrom.setText("AirportFrom");

        lbFlyingClass.setText("FlyingClass");

        lbAirportTo.setText("AirportTo");

        lbToGo.setText("ToGo");

        lbPassangerName.setText("PassangerName");

        lbTripDate.setText("TripDate");

        lbNumberOfNights.setText("NumberOfNights");

        lbPrice.setText("Price");

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbFlyingClass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbPassangerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNumberOfNights, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(lbPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbAirportTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbToGo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbAirportFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTripDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPrice)
                            .addComponent(jNumberOfNigths)
                            .addComponent(jTripDate)
                            .addComponent(jPassangerName)
                            .addComponent(jToGo)
                            .addComponent(jFlyingClass)
                            .addComponent(jAirportTo, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jAirportFrom))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAirportFrom)
                    .addComponent(jAirportFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAirportTo)
                    .addComponent(jAirportTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFlyingClass)
                    .addComponent(jFlyingClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbToGo)
                    .addComponent(jToGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassangerName)
                    .addComponent(jPassangerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTripDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTripDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumberOfNights)
                    .addComponent(jNumberOfNigths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice)
                    .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btSave)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        notifyListeners();
        createTripFromData();
        PlaneTripController ctrl = new PlaneTripController();
        ctrl.insert(innerPlaneTrip);
        this.dispose();

    }//GEN-LAST:event_btSaveActionPerformed

    public void addListener(PlaneTripEventListener listener) {
        listeners.add(listener);
    }

    private void notifyListeners() {
        for (PlaneTripEventListener listener : listeners) {
            listener.add(innerPlaneTrip);
        }
    }

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                    getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewWindow.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewWindow.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewWindow.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewWindow.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JTextField jAirportFrom;
    private javax.swing.JTextField jAirportTo;
    private javax.swing.JTextField jFlyingClass;
    private javax.swing.JTextField jNumberOfNigths;
    private javax.swing.JTextField jPassangerName;
    private javax.swing.JTextField jPrice;
    private javax.swing.JTextField jToGo;
    private javax.swing.JTextField jTripDate;
    private javax.swing.JLabel lbAirportFrom;
    private javax.swing.JLabel lbAirportTo;
    private javax.swing.JLabel lbFlyingClass;
    private javax.swing.JLabel lbNumberOfNights;
    private javax.swing.JLabel lbPassangerName;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbToGo;
    private javax.swing.JLabel lbTripDate;
    // End of variables declaration//GEN-END:variables

    private void createTripFromData() {
        innerPlaneTrip.setAirportFrom(jAirportFrom.getText());
        innerPlaneTrip.setAirportTo(jAirportTo.getText());
        innerPlaneTrip.setFlyingClass(planeClass.
                valueOf(jFlyingClass.getText()));
        innerPlaneTrip.setNumberOfNights(Integer.parseInt(jNumberOfNigths.
                getText()));
        innerPlaneTrip.setPassangerName(jPassangerName.getText());
        innerPlaneTrip.setPrice(Integer.parseInt(jPrice.getText()));
        innerPlaneTrip.setToGo(jToGo.getText());
        innerPlaneTrip.setTripDate(LocalDate.parse(jTripDate.getText()));

    }
}
