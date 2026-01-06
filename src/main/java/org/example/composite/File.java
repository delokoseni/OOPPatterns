package org.example.composite;

public class File extends FileSystemItem {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void add(FileSystemItem fileSystemItem) {
        throw new UnsupportedOperationException("Нельзя добавить ничего внутрь файла.");
    }

    @Override
    public void remove(FileSystemItem fileSystemItem) {
        throw new UnsupportedOperationException("Нельзя удалить ничего из файла.");
    }
}
