package net.thauvin.erik;

import net.thauvin.erik.bitly.Bitlinks;

public class BldTesterMain {
    public static void main(String[] args) {
        System.out.println(new BldTesterMain().getMessage());
    }

    public String getMessage() {
        return new Bitlinks("blah").shorten("https://www.example.com/");
    }
}