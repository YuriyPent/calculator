package yura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yurap on 17.10.2017.
 */
public class CalculatorEngine implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clikedButton = (JButton)e.getSource();
        String clikedButtonLabel = clikedButton.getText();
        JOptionPane.showConfirmDialog(null, "You pressed " + clikedButtonLabel, "text", JOptionPane.PLAIN_MESSAGE);

    }
}
