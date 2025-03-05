package de.headhott.SchoolTycoon.Game;

import de.headhott.SchoolTycoon.UI.GUI;

import java.util.TimerTask;

public class GameTimer {

    private int yearGame = 2024; // Starting year
    private int month = 1; // Starting month (January)

    private GUI ui;

    public int getYearGame() {
        return yearGame;
    }

    public void setYearGame(int yearGame) {
        this.yearGame = yearGame;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }



    public GameTimer(int year, int month) {
        this.yearGame = year;
        this.month = month;
    }

    public void setUI(GUI ui){
        this.ui = ui;
    }

    public void run(){
        java.util.Timer timer = new java.util.Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                month++;
                if (month > 12) {
                    month = 1;
                    yearGame++;
                    if(ui != null)
                       ui.updateYear();
                }
                System.out.println("Year: " + yearGame + ", Month: " + month);

            }
        };

        // Schedule the task to run every 5,000 milliseconds (5 seconds for testing, change to 60,000 for real-time minutes)
        timer.scheduleAtFixedRate(task, 0, 20);
    }
}
