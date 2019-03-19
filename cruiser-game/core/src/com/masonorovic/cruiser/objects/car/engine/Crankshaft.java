package com.masonorovic.cruiser.objects.car.engine;

public class Crankshaft {
    private String codeName;
    private int maxTorque;
    private float damage;

    public Crankshaft(String codeName, int maxTorque, float damage) {
        this.codeName = codeName;
        this.maxTorque = maxTorque;
        this.damage = damage;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }
}