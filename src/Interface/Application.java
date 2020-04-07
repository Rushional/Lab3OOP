package Interface;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    private InputPanel inputPanel;
    private OutputPanel outputPanel;

    public Application() {
        super("OOP Lab3");
        setLayout(new GridBagLayout());
        outputPanel = new OutputPanel();
        inputPanel = new InputPanel(outputPanel);
        GridBagConstraints inputPanelConstraints = new GridBagConstraints();
        inputPanelConstraints.fill = GridBagConstraints.NONE;
        inputPanelConstraints.weightx = 0;
        inputPanelConstraints.weighty = 0;
        inputPanelConstraints.gridx = 0;
        inputPanelConstraints.gridy = 0;
        add(inputPanel, inputPanelConstraints);
        GridBagConstraints outputPanelConstraints = new GridBagConstraints();
        outputPanelConstraints.weightx = 0;
        outputPanelConstraints.weighty = 0;
        outputPanelConstraints.gridx = 1;
        outputPanelConstraints.gridy = 0;
        add(outputPanel, outputPanelConstraints);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
