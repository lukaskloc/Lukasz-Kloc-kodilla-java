package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String poem, PoemDecorator decorator) {
        String decoratedPoem = decorator.decorate(poem);
        System.out.println(decoratedPoem);
    }
}
