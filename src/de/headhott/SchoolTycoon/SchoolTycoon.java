package de.headhott.SchoolTycoon;

import de.headhott.SchoolTycoon.Game.GameController;
import de.headhott.SchoolTycoon.UI.GUI;


public class SchoolTycoon {
    public static void main(String[] args) {
        System.out.println("Starting...");

        GameController gameController = new GameController("Baden-Württemberg");
        GUI ui = new GUI(gameController);
    }
}
