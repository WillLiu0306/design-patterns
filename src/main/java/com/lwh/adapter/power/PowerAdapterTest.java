package com.lwh.adapter.power;

public class PowerAdapterTest {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.outputDC5();
    }
}
