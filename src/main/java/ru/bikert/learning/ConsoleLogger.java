package ru.bikert.learning;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public void log(String message, Object... objects) {

    }
}
