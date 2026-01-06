package org.example.compositor;

public abstract class FileSystemItem {
    private String name;

    public FileSystemItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSize();

    public abstract void addElement(FileSystemItem fileSystemItem);

    public abstract void removeElement(FileSystemItem fileSystemItem);
}
