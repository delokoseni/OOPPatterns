package org.example.compositor;

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
    public void addElement(FileSystemItem fileSystemItem) {
        throw new RuntimeException("С данным типом элемента файловой системы эта операция недопустима.");
    }

    @Override
    public void removeElement(FileSystemItem fileSystemItem) {
        throw new RuntimeException("С данным типом элемента файловой системы эта операция недопустима.");
    }
}
