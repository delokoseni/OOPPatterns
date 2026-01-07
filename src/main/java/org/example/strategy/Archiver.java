package org.example.strategy;

public class Archiver {

    private CompressionStrategy compressionStrategy;

    public Archiver(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void changeAlgorithm(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void doArchive(String filePath) {
        compressionStrategy.doArchive(filePath);
    }
}
