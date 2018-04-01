package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String beat, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(beat);
       System.out.println("***Text which will be more beautiful***" + result);
    }
}