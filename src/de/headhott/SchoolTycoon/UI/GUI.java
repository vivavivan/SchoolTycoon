package de.headhott.SchoolTycoon.UI;

import de.headhott.SchoolTycoon.Game.GameController;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private JLabel moneyLabel;
    private GameController gameController;

    public GUI(GameController gameController){
        SwingUtilities.invokeLater(() -> {

            this.gameController = gameController;

            // Create Frame
            JFrame frame = new JFrame("Image Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new GridBagLayout()); // Center components

            // Load Image
            ImageIcon originalIcon = new ImageIcon("resources/images/money.png");
            Image scaledImage = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon buttonIcon = new ImageIcon(scaledImage);


            // Create Button
            JButton button = new JButton(buttonIcon);
            button.setBorderPainted(false); // Remove border
            button.setContentAreaFilled(false); // Make transparent
            button.setFocusPainted(false); // Remove focus border

            button.addActionListener(e -> updateMoney());

            JLabel moneyLabel = new JLabel("Money: 0");
            moneyLabel.setFont(new Font("Arial", Font.BOLD, 20));


            // Add Button to Center
            frame.add(button);
            frame.add(moneyLabel);

            this.moneyLabel = moneyLabel;

            // Show Frame
            frame.setLocationRelativeTo(null); // Center window
            frame.setVisible(true);
        });
    }

    private void updateMoney() {
        gameController.addMoney();
        moneyLabel.setText("Money: " + gameController.getMoney());
    }


}
