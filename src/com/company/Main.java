package com.company;

public class Main {

    public static void main(String[] args) {
        Author scherbenevVadim = new Author("Scherbenev Vadim");
        Author repinAndrey = new Author("Repin Andrey");
        Book valentinka = new Book("Valentinka", 1931, scherbenevVadim);
        Book bananaKokosa = new Book("Banana Kokosa", 39564, repinAndrey);

        bananaKokosa.setYear(2056);
    }
}
