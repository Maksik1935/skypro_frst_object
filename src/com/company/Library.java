package com.company;

public class Library {
    Book[] booksArr;

    public Library(Book[] booksArr) {
        this.booksArr = booksArr;
    }
    void addBook(Book book){
        for(int i = 0; i < booksArr.length; i++) {
            if(booksArr[i] == null) {
                booksArr[i] = book;
                break;
            }
        }
    }
    void printBooks() {
        for (int i = 0; i < booksArr.length; i++) {
            if(booksArr[i] == null) {
                break;
            } else {
                System.out.println(booksArr[i].getAuthor().getName() + ": " + booksArr[i].getName() + ": " + booksArr[i].getYear());
            }
        }
    }
    public void printUpgradeBooks (String name) {
        for(Book book : booksArr) {
            if (book.getName().equals(name)) {
                System.out.println(book.getName() + " by " + book.getAuthor().getName() + " was published in " + book.getYear());
            }
        }
    }
    public void setBookYear (String name, int year) {
        for(Book book : booksArr) {
            if (book.getName().equals(name)) {
                book.setYear(year);
            }
        }
    }
}
