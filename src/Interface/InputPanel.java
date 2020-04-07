package Interface;

import Model.ComplexNumber;
import Model.Polynomial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel {
    private ComplexNumber coefficientA, coefficientB, coefficientC;
    private OutputPanel outputPanel;

    public InputPanel(OutputPanel outputPanel) {
        super();
        coefficientA = new ComplexNumber(1, 0);
        coefficientB = new ComplexNumber(2, 0);
        coefficientC = new ComplexNumber(1, 0);
        this.outputPanel = outputPanel;
        JLabel[] labels = outputPanel.getLabels();
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
        enterCoefficientsConstraints.gridwidth = 3;
        add(enterCoefficients, enterCoefficientsConstraints);
        JTextField textCoefficientA = new JTextField(7);
        textCoefficientA.setBorder(BorderFactory.createEmptyBorder());
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
        JTextField textCoefficientB = new JTextField(7);
        textCoefficientB.setBorder(BorderFactory.createEmptyBorder());
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
        JTextField textCoefficientC = new JTextField(7);
        textCoefficientC.setBorder(BorderFactory.createEmptyBorder());
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
        enterArgumentConstraints.gridwidth = 3;
        add(enterArgument, enterArgumentConstraints);
        JTextField textEnterArgument = new JTextField(7);
        textEnterArgument.setBorder(BorderFactory.createEmptyBorder());
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
//        buttonValueConstraints.insets.left = 10;
        buttonValueConstraints.insets.top = 20;
        buttonValueConstraints.weightx = 0;
        buttonValueConstraints.weighty = 0;
        buttonValueConstraints.gridx = 0;
        buttonValueConstraints.gridy = 5;
        buttonValueConstraints.gridwidth = 1;
        add(buttonCalculateValue, buttonValueConstraints);
        JButton buttonCalculateRoots = new JButton("Calculate roots");
        GridBagConstraints buttonRootsConstraints = new GridBagConstraints();
        buttonRootsConstraints.anchor = GridBagConstraints.WEST;
        buttonRootsConstraints.insets.left = 10;
        buttonRootsConstraints.insets.top = 20;
        buttonRootsConstraints.weightx = 0;
        buttonRootsConstraints.weighty = 0;
        buttonRootsConstraints.gridx = 0;
        buttonRootsConstraints.gridy = 6;
        buttonRootsConstraints.gridwidth = 2;
        add(buttonCalculateRoots, buttonRootsConstraints);

        buttonCalculateValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        textCoefficientA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coefficientA = new ComplexNumber(Double.parseDouble(textCoefficientA.getText()), 0);
                outputPolynomial();
            }
        });
        textCoefficientB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coefficientB = new ComplexNumber(Double.parseDouble(textCoefficientB.getText()), 0);
                outputPolynomial();
            }
        });
        textCoefficientC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coefficientC = new ComplexNumber(Double.parseDouble(textCoefficientC.getText()), 0);
                outputPolynomial();
            }
        });
        buttonCalculateRoots.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var rootCalcPolynomial = new Polynomial(coefficientA, coefficientB, coefficientC);
                ComplexNumber[] roots = Polynomial.calculateRoots(rootCalcPolynomial);
                String rootsString;
                if ((roots[0].realPart == roots[1].realPart) && (roots[0].imaginaryPart == 0 )) {
                    rootsString = roots[0].asString();
//                    System.out.println("The only root is " + roots[0].asString());
                }
                else {
//                    System.out.println("The first root is " + roots[0].asString() + ", and the second one is " + roots[1].asString());
                    rootsString = roots[0].asString() + " and " + roots[1].asString();
                }
                outputPanel.outputRoots(rootsString);
            }
        });
        buttonCalculateValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var argument = new ComplexNumber(Double.parseDouble(textEnterArgument.getText()), 0);
                var calcValuePolynomial = new Polynomial(coefficientA, coefficientB, coefficientC);
                ComplexNumber calculatedValue = Polynomial.calculateValue(calcValuePolynomial, argument);
                outputPanel.outputValue(argument.asString(), calculatedValue.asString());
            }
        });
        outputPolynomial();
    }

    private void outputPolynomial() {
        var outputPolynomial = new Polynomial(coefficientA, coefficientB, coefficientC);
        outputPanel.outputPolynomial(outputPolynomial.asString());
    }
}
