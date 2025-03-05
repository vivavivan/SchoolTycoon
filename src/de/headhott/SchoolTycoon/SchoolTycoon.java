package de.headhott.SchoolTycoon;

import de.headhott.SchoolTycoon.UI.SchoolTycoonGUI;

public class SchoolTycoon {
    public static void main(String[] args) {
        System.out.println("Starting...");

        SchoolTycoonGUI dialog = new SchoolTycoonGUI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
