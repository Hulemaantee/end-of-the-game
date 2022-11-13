package com.example.homework.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {

    public static void main(String[] args) {
        var persons = List.of(
                new Person("hindrek", "y", 30, 100),
                new Person("tom", "Kraav", 25, 200),
                new Person("kalev", "Sein", 35, 500),
                new Person("tonis", "Tulp", 40, 400)
        );

        // make a collection with just names - loops approach
        List<String> namesWithStream = persons.stream()
                .map(person -> person.name())
                //.collect(Collectors.toList());
                .toList(); // since java 16th

        System.out.println("streams - just names: " + namesWithStream);

        List<String> olderPersonsFilteredWithStream = persons.stream()
                .filter(person -> person.age() > 31)
                .map(person -> person.name())
                .toList();

        System.out.println("streams - just names, older persons: " + olderPersonsFilteredWithStream);

        persons.stream()
                .filter(person -> person.age() < 30)
                .map(person -> person.height())
                .forEach(height -> System.out.println("person height " + height));

        System.out.println("_____________________________________");
        persons.stream()
                .filter(person -> {
                    System.out.println("checking person: " + person);
                    return person.age() < 30;
                })
                .map(person -> {
                    System.out.println("mapping to names %s -> %s".formatted(person, person.name()));
                    return person.name();
                })
                .toList();

    }

}
