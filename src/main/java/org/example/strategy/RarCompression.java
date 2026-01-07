package org.example.strategy;

public class RarCompression extends CompressionStrategy{
    @Override
    public void doArchive(String filepath) {
        System.out.println("Файл " + filepath + " заархивирован используя алгоритм RAR.");
    }
}
