/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.otus;

import com.google.common.base.Joiner;
import java.util.List;

@SuppressWarnings("java:S106")
public class HelloOtus {

    public static void main(String... args) {
        List<String> list = List.of("Hello", "Otus", "Gradle");
        String joined = Joiner.on(" | ").join(list);
        System.out.println("Joined with Guava: " + joined);
    }
}
