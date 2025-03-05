package de.headhott.SchoolTycoon.Game;

import de.headhott.SchoolTycoon.Items.Teacher;
import java.util.*;

public class GameController {

    private int money = 0;
    private String name;
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public GameController(String name){
        this.name = name;
    }

    public void addMoney(){
        this.money++;
    }

    public int getMoney() {
        return money;
    }

    public boolean hireTeacher() {
        if(money >= 1000) {
            money -= 1000;
            teachers.add(new Teacher());
            Teacher.teachersCount++;
            return true;
        }
        return false;
    }

    public boolean fireTeacher() {
        if(Teacher.teachersCount > 0) {
            Teacher.teachersCount--;
            teachers.remove(teachers.size()-1);
            return true;
        }
        return false;
    }



}
