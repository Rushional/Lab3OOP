package Interface;

import javax.swing.*;
import java.awt.*;

public class OutputPanel extends JPanel {
    private JLabel labelPolynomialOutput;
    private JLabel labelValueOutput;
    private JLabel labelRootsOutput;

    public OutputPanel() {
        super();
        setBackground(new Color(235, 240, 255));
        setPreferredSize(new Dimension(900, 500));
        setLayout(new GridBagLayout());
        labelPolynomialOutput = new JLabel("Current polynomial is: ");
        GridBagConstraints polynomialOutputConstraints = new GridBagConstraints();
        polynomialOutputConstraints.anchor = GridBagConstraints.WEST;
        polynomialOutputConstraints.insets.left = 50;
        polynomialOutputConstraints.weightx = 1;
        polynomialOutputConstraints.weighty = 0;
        polynomialOutputConstraints.gridx = 0;
        polynomialOutputConstraints.gridy = 0;
        add(labelPolynomialOutput, polynomialOutputConstraints);
        labelValueOutput = new JLabel("The value of the polynomial is: ");
        GridBagConstraints valueOutputConstraints = new GridBagConstraints();
        valueOutputConstraints.anchor = GridBagConstraints.WEST;
        valueOutputConstraints.insets.left = 50;
        valueOutputConstraints.insets.top = 60;
        valueOutputConstraints.weightx = 1;
        valueOutputConstraints.weighty = 0;
        valueOutputConstraints.gridx = 0;
        valueOutputConstraints.gridy = 1;
        add(labelValueOutput, valueOutputConstraints);
        labelRootsOutput = new JLabel("The roots of the polynomial are: ");
        GridBagConstraints labelRootsOutputConstraints = new GridBagConstraints();
        labelRootsOutputConstraints.anchor = GridBagConstraints.WEST;
        labelRootsOutputConstraints.insets.left = 50;
        labelRootsOutputConstraints.insets.top = 60;
        labelRootsOutputConstraints.weightx = 1;
        labelRootsOutputConstraints.weighty = 0;
        labelRootsOutputConstraints.gridx = 0;
        labelRootsOutputConstraints.gridy = 2;
        add(labelRootsOutput, labelRootsOutputConstraints);
    }

    public JLabel[] getLabels() {
        return new JLabel[]{labelPolynomialOutput, labelValueOutput, labelRootsOutput};
    }
}
