package de.headhott.SchoolTycoon;

import de.headhott.SchoolTycoon.Game.GameController;
import de.headhott.SchoolTycoon.Game.GameTimer;
import de.headhott.SchoolTycoon.UI.GUI;


public class SchoolTycoon {
    public static void main(String[] args) {
        System.out.println("Starting...");

        GameController gameController = new GameController("Baden-Württemberg");
        GameTimer timer = new GameTimer(0, 0);
        GUI ui = new GUI(gameController, timer);

        timer.setUI(ui);
        timer.run();
    }
}
