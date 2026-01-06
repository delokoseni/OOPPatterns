package org.example.composite;

public abstract class FileSystemItem {
    private String name;

    public FileSystemItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSize();

    public abstract void add(FileSystemItem fileSystemItem);

    public abstract void remove(FileSystemItem fileSystemItem);
}
