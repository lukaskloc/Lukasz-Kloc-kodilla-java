package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());

        try(Stream<String> fileLines = Files.lines(Paths.get("test.txt"))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I'm gonna be here... always!");
        }

        System.out.println(file.getPath());
    }
}
