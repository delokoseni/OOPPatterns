package org.example;

import org.example.strategy.Archiver;
import org.example.strategy.CompressionStrategy;
import org.example.strategy.RarCompression;
import org.example.strategy.ZipCompression;

public class Main {
    public static void main(String[] args) {
        CompressionStrategy rar = new RarCompression();
        CompressionStrategy zip = new ZipCompression();

        Archiver archiver = new Archiver(rar);
        archiver.doArchive("myFile.pdf");
        archiver.changeAlgorithm(zip);
        archiver.doArchive("myAnotherFile.pdf");
    }
}