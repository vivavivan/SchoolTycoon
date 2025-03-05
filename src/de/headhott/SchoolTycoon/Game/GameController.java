package de.headhott.SchoolTycoon.Game;

public class GameController {

    private int money = 0;
    private String name;
    public void GameController(String name){
        this.name = name;
    }

    public void addMoney(){
        this.money++;
    }

    public int getMoney() {
        return money;
    }

}
