package com.lwh.delegate.simple;

public class SimpleTest {
    public static void main(String[] args) {
        new Boss().command("加密", new Leader());
    }
}
