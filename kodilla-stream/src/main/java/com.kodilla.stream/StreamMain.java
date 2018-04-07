package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        System.out.println("\n \n ^^^ Zadanie 7.3 - końcowe ^^^ \n");

        Forum forum = new Forum();

        Map<Integer, ForumUser> mapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostNumers() >= 1)
                .collect((Collectors.toMap(ForumUser::getUserId, Function.identity())));

        System.out.println("Numbers of elements in the map: " + mapOfForumUsers.size());
        mapOfForumUsers.entrySet().stream()
                .map(entry -> "Filtered user ID: " + entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);



        /* System.out.println("\n \n ^^^ Zadanie 7.3 - przyklad ^^^ \n");

        People.getList().stream()
                .forEach(System.out::println);

        System.out.println("\n ^^^ 7.3 - operacja transformujaca - przykład ^^^ \n");
                People.getList().stream()
                        .map(s -> s.toUpperCase())
                        .forEach(System.out::println);

                *//*People.getList().stream() - to samo co powyzej
                        .map(String::toUpperCase)
                        .forEach(s -> System.out.println(s));*//*

        System.out.println("\n ^^^ 7.3 - operacja filtrujaca - przykład ^^^ \n");
                People.getList().stream()
                        .filter(s -> s.length() < 11)
                        .forEach(System.out::println);

        System.out.println("\n ^^^ 7.3 - operacja kaskadowe łączenie operacji - przykład ^^^ \n");
                People.getList().stream()
                        .map(String::toUpperCase)
                        .filter(s -> s.length() > 11)
                        .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                        .filter(s -> s.substring(0, 1).equals("M"))
                        .forEach(System.out::println);

        System.out.println("\n ^^^ 7.3 - stream na kolekcjach z dowolnymi obietkami - przykład ^^^ \n");

        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println("\n ^^^ 7.3 - operacje terminalne - kolektory - przykład ^^^ \n");
            // Kolektor Collectors.toList()
        BookDirectory theBookDirectory1 = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory1.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size() + "\n");
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        // Kolektor Collectors.toMap()

        BookDirectory theBookDirectory2 = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory2.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size() + "\n");
            theResultMapOfBooks.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);

        // Kolektor Collectors.joining()
        BookDirectory theBookDirectory3 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory3.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println("\n" + theResultStringOfBooks);


        System.out.println("\n \n ^^^ Zadanie 7.2 - przyklad ^^^ \n");

        System.out.println("Using Stream to generate even numbers from 1 to 20:");
        NumbersGenerator.generateEven(20);

        System.out.println(" \n ^^^ Zadanie 7.1 - koncowe ^^^ \n");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("aaa", (beat) -> beat + "AAA");
        poemBeautifier.beautify("xXx", (beat) -> "aAa" + beat);
        poemBeautifier.beautify("aaaccc", (beat) -> beat.toUpperCase());
        poemBeautifier.beautify("aaa", String::toUpperCase);


        System.out.println("\n @@@ Text which is more beautiful @@@");

        poemBeautifier.beautify("HeHe", (beat) -> "aaa" + beat + "aaa");
        poemBeautifier.beautify("aaa", (beat) -> beat.toUpperCase() + beat.toLowerCase() + beat.toUpperCase());


        System.out.println("\n \n ^^^ Zadanie 7.1 - przyklad ^^^ \n");

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculate expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\nCalculate expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB); */
    }
}
