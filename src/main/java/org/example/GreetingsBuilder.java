package org.example;

public class GreetingsBuilder {

    private final String language;

    public GreetingsBuilder(final String language) {
        this.language = language;
    }

    public String greet() {
        switch (language) {
            case "EN":
                return "Hello";
            case "FR":
                return "Bonjour";
            case "DE":
                return "Hallo";
            default:
                return "Sorry language not supported";
        }
    }
}
