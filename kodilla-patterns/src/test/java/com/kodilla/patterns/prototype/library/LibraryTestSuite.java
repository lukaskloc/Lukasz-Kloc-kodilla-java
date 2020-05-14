package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //Creating Books list
        Set<Book> booksSet = new HashSet<>();
        IntStream.iterate(1, n -> n +1)
                .limit(5)
                .forEach(n -> booksSet.add(new Book("Book" + n, "Author" + n,
                        LocalDate.of(1999 + n, 01 +n, 01 + n))));

        //Creating library and assigning book list
        Library library = new Library("Library");
        library.setBooks(booksSet);

        //making a shallow copy of object Library
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("ShallowCopiedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object Library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("DeepCopiedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().removeAll(booksSet);

        //Then
        System.out.println(library.getBooks());
        System.out.println(shallowClonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
