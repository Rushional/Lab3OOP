package Interface;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel {
    public InputPanel(JLabel[] labels) {
        super();
        JLabel polynomialOutput = labels[0];
        JLabel valueOutput = labels[1];
        JLabel rootsOutput = labels[2];
        setBackground(new Color(116, 255, 207));
        setPreferredSize(new Dimension(300, 500));
        setLayout(new GridBagLayout());
        JLabel enterCoefficients = new JLabel("Please enter the coefficients of the polynomial: ");
        GridBagConstraints enterCoefficientsConstraints = new GridBagConstraints();
        enterCoefficientsConstraints.fill = GridBagConstraints.NONE;
        enterCoefficientsConstraints.weightx = 0;
        enterCoefficientsConstraints.weighty = 0;
        enterCoefficientsConstraints.gridx = 0;
        enterCoefficientsConstraints.gridy = 0;
        enterCoefficientsConstraints.gridwidth = 2;
        add(enterCoefficients, enterCoefficientsConstraints);
        JTextField textCoefficientA = new JTextField("                    "); //Spaces are needed to set preferred size, me am smart
        textCoefficientA.setMinimumSize(textCoefficientA.getPreferredSize());
        GridBagConstraints textCoefficientAConstraints = new GridBagConstraints();
        textCoefficientAConstraints.anchor = GridBagConstraints.WEST;
        textCoefficientAConstraints.insets.left = 10;
        textCoefficientAConstraints.insets.top = 20;
        textCoefficientAConstraints.weightx = 1;
        textCoefficientAConstraints.weighty = 0;
        textCoefficientAConstraints.gridx = 0;
        textCoefficientAConstraints.gridy = 1;
        add(textCoefficientA, textCoefficientAConstraints);
        JTextField textCoefficientB = new JTextField("                    ");
        textCoefficientB.setMinimumSize(textCoefficientA.getPreferredSize());
        GridBagConstraints textCoefficientBConstraints = new GridBagConstraints();
        textCoefficientBConstraints.anchor = GridBagConstraints.WEST;
        textCoefficientBConstraints.insets.left = 10;
        textCoefficientBConstraints.insets.top = 20;
        textCoefficientBConstraints.weightx = 1;
        textCoefficientBConstraints.weighty = 0;
        textCoefficientBConstraints.gridx = 0;
        textCoefficientBConstraints.gridy = 2;
        add(textCoefficientB, textCoefficientBConstraints);
        JTextField textCoefficientC = new JTextField("                    ");
        textCoefficientC.setMinimumSize(textCoefficientA.getPreferredSize());
        GridBagConstraints textCoefficientCConstraints = new GridBagConstraints();
        textCoefficientCConstraints.anchor = GridBagConstraints.WEST;
        textCoefficientCConstraints.insets.left = 10;
        textCoefficientCConstraints.insets.top = 20;
        textCoefficientCConstraints.weightx = 1;
        textCoefficientCConstraints.weighty = 0;
        textCoefficientCConstraints.gridx = 0;
        textCoefficientCConstraints.gridy = 3;
        add(textCoefficientC, textCoefficientCConstraints);
        JLabel enterArgument = new JLabel("Please enter an argument for the polynomial: ");
        GridBagConstraints enterArgumentConstraints = new GridBagConstraints();
        enterArgumentConstraints.fill = GridBagConstraints.NONE;
        enterArgumentConstraints.weightx = 0;
        enterArgumentConstraints.weighty = 0;
        enterArgumentConstraints.gridx = 0;
        enterArgumentConstraints.gridy = 4;
        enterArgumentConstraints.gridwidth = 2;
        add(enterArgument, enterArgumentConstraints);
        JTextField textEnterArgument = new JTextField("                    ");
        textEnterArgument.setMinimumSize(textCoefficientA.getPreferredSize());
        GridBagConstraints textEnterArgumentConstraints = new GridBagConstraints();
        textEnterArgumentConstraints.anchor = GridBagConstraints.WEST;
        textEnterArgumentConstraints.insets.left = 10;
        textEnterArgumentConstraints.insets.top = 20;
        textEnterArgumentConstraints.weightx = 1;
        textEnterArgumentConstraints.weighty = 0;
        textEnterArgumentConstraints.gridx = 0;
        textEnterArgumentConstraints.gridy = 5;
        add(textEnterArgument, textEnterArgumentConstraints);
        JButton buttonCalculateValue = new JButton("Calculate value");
        GridBagConstraints buttonValueConstraints = new GridBagConstraints();
        buttonValueConstraints.anchor = GridBagConstraints.WEST;
        buttonValueConstraints.insets.left = 10;
        buttonValueConstraints.insets.top = 20;
        buttonValueConstraints.weightx = 0;
        buttonValueConstraints.weighty = 0;
        buttonValueConstraints.gridx = 0;
        buttonValueConstraints.gridy = 6;
        add(buttonCalculateValue, buttonValueConstraints);
        JButton buttonCalculateRoots = new JButton("Calculate roots");
        GridBagConstraints buttonRootsConstraints = new GridBagConstraints();
        buttonRootsConstraints.anchor = GridBagConstraints.WEST;
        buttonRootsConstraints.insets.left = 10;
        buttonRootsConstraints.insets.top = 20;
        buttonRootsConstraints.weightx = 0;
        buttonRootsConstraints.weighty = 0;
        buttonRootsConstraints.gridx = 0;
        buttonRootsConstraints.gridy = 7;
        add(buttonCalculateRoots, buttonRootsConstraints);

        buttonCalculateValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
