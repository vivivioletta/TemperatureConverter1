import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;


public class TemperatureConverter extends JFrame {

    // Déclaration des composants
    private JCheckBox jCheckBox2;
    private JSpinner jSpinner1;
    private JPanel jPanel2;
    private JLabel jLabel1;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;

    public TemperatureConverter() {
        initComponents();
    }

    private void initComponents() {
        // Initialisation des composants
        jCheckBox2 = new JCheckBox();
        jSpinner1 = new JSpinner();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();

        // Configuration de la fenêtre principale
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

        // Configuration du panneau
        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Temperature Converter ");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1)
                                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        // Configuration des menus déroulants
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));

        jTextField2.setEditable(false);

        // Configuration des boutons
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jButton1.setText("Convert");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jButton2.setText("Clear");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jButton3.setText("Exit");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        // Configuration de la disposition des composants
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, 0, 116, Short.MAX_VALUE))
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3)
                                        .addComponent(jButton2))
                                .addGap(29, 29, 29))
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(37, 37, 37))
        );

        pack();
    }

    // Gestionnaire d'événement pour le bouton Exit
    private void jButton3ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    // Gestionnaire d'événement pour le bouton Clear
    private void jButton2ActionPerformed(ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
    }

    // Gestionnaire d'événement pour le bouton Convert
    private void jButton1ActionPerformed(ActionEvent evt) {
        String val1 = (String) jComboBox1.getSelectedItem();
        String val2 = (String) jComboBox2.getSelectedItem();

        if (val1.equals("Celsius") && val2.equals("Fahrenheit")) {
            double cel = Double.parseDouble(jTextField1.getText());
            double fah = (double) ((9.0 / 5.0) * cel + 32);
            jTextField2.setText(String.valueOf(fah));
        } else if (val1.equals("Celsius") && val2.equals("Celsius")) {
            double c = Double.parseDouble(jTextField1.getText());
            jTextField2.setText(String.valueOf(c));
        }
        if (val1.equals("Fahrenheit") && val2.equals("Celsius")) {
            double f = Double.parseDouble(jTextField1.getText());
            double c = (double) ((f - 32) * (5.0 / 9.0));
            jTextField2.setText(String.valueOf(Math.round(c)));
        } else if (val1.equals("Fahrenheit") && val2.equals("Fahrenheit")) {
            double f = Double.parseDouble(jTextField1.getText());
            jTextField2.setText(String.valueOf(Math.round(f)));
        }
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }
}

