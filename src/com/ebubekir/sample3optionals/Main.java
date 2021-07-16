package com.ebubekir.sample3optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<String> hello = Optional.of("Hello");

        System.out.println(hello.isEmpty());
        System.out.println(hello.isPresent());
        System.out.println("----------------");

        String orElse = hello
                .map(String::toUpperCase)
                .orElse("world");
        System.out.println(orElse);
        System.out.println("----------------");

        hello = Optional.ofNullable(null);
        orElse = hello.orElse("world");
        System.out.println(orElse);
        System.out.println("----------------");

        orElse = hello
                .orElseGet(() -> {
                    // ... extra computation to retrieve the value
                 return "world2";
                })
                .toUpperCase();
        System.out.println(orElse);
        System.out.println("----------------");

        hello = Optional.ofNullable("HelloToIfPresent");
        hello.ifPresent(word -> { System.out.println(word); } );
        hello.ifPresent(System.out::println);
        System.out.println("----------------");

        hello = Optional.ofNullable("HelloToifPresentOrElse");
        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world"));
        hello = Optional.ofNullable(null);
        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world"));
        System.out.println("----------------");

        Person person = new Person("james", "JAMES@gmail.com");
        String email = person.getEmail().map(String::toLowerCase).orElse("email not provided");
        System.out.println(email);

        person = new Person("james", null);
        if(person.getEmail().isPresent()){
            email = person.getEmail().get();
            System.out.println(email.toLowerCase());
        }else {
            System.out.println("email not provided");
        }

    }

}
