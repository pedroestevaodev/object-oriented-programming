package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela extends JDialog {
    private JButton btnIniciar;
    private JPanel panelMain;
    private JTextField txtNome;
    private JComboBox selectRaca;
    private JComboBox selectClasse;
    private JLabel lbNome;
    private JLabel lbGenero;
    private JComboBox selectGenero;
    private JLabel lbRaca;
    private JLabel lbClasse;
    private JLabel lbCaracteristicas;
    private JTextArea taCaracteristicas;

    public PrimeiraTela(Frame parent) {
        super(parent);
        setTitle("Interface");
        setContentPane(panelMain);
        setMinimumSize(new Dimension(300, 200));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Que a jornada comece: "+txtNome.getText());
            }
        });
    }

    public static void main(String[] args) {
        PrimeiraTela tela = new PrimeiraTela(null);
    }
}
