package org.example.strategy;

public class ZipCompression extends CompressionStrategy{
    @Override
    public void doArchive(String filepath) {
        System.out.println("Файл " + filepath + " заархивирован используя алгоритм ZIP.");
    }
}
