package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args) {

        System.out.println(" ^^^ Zadanie 7.1 - koncowe ^^^ \n");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("aaa", (beat) -> beat + "AAA");
        poemBeautifier.beautify("xXx", (beat) -> "aAa" + beat);
        poemBeautifier.beautify("aaaccc", (beat) -> beat.toUpperCase());
        poemBeautifier.beautify("aaa", String::toUpperCase);


        System.out.println("\n @@@ Text which is more beautiful @@@");

        poemBeautifier.beautify("HeHe", (beat) -> "aaa" + beat + "aaa");
        poemBeautifier.beautify("aaa", (beat) -> beat.toUpperCase() + beat.toLowerCase() + beat.toUpperCase());


        System.out.println("\n \n ^^^ Zadanie 7.1 - pprzyklad ^^^ \n");

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculate expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculate expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

    }
}
