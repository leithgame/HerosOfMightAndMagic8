package com.example.herosofmightandmagic8.Heros;

import com.example.herosofmightandmagic8.Effects.Effects;

public class Hero {
    private  String name;
    private int team;
    private int maxHP;
    private int currentHP;
    private int initiative;
    private int currentInitiative;
    private boolean alive = true;
    private Effects effects = new Effects();

    public String getName() {
        return name;
    }

    public int getTeam() {
        return team;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getInitiative() {
        return initiative;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getCurrentInitiative() {
        return currentInitiative;
    }

    public void setCurrentInitiative(int currentInitiative) {
        this.currentInitiative = currentInitiative;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public Effects getEffects() {
        return effects;
    }

    public void setEffects(Effects effects) {
        this.effects = effects;
    }

    public void takeDamage(int damage)
    {

    }

    public Hero(String name, int team, int maxHP, int initiative) {
        this.name = name;
        this.team = team;
        this.maxHP = maxHP;
        this.initiative = initiative;
        this.currentInitiative = initiative;
    }
}
