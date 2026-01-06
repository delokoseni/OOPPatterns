package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem{

    private List<FileSystemItem> children;

    public Folder(String name) {
        super(name);
        children = new ArrayList<FileSystemItem>();
    }

    public Folder(String name, int capacity) {
        super(name);
        children = new ArrayList<FileSystemItem>(capacity);
    }

    @Override
    public int getSize() {
        int size = 0;
        for(FileSystemItem fileSystemItem : children) {
            size += fileSystemItem.getSize();
        }
        return size;
    }

    @Override
    public void add(FileSystemItem fileSystemItem) {
        children.add(fileSystemItem);
    }

    @Override
    public void remove(FileSystemItem fileSystemItem) {
        children.remove(fileSystemItem);
    }
}
