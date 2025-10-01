package com.ei.task1.observer; public class ConsoleNotifier implements Observer{ @Override public void update(String msg){ System.out.println("[Console] " + msg); } }
