package org.example.compositor;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem{

    private List<FileSystemItem> fileSystemItemList;

    public Folder(String name) {
        super(name);
        fileSystemItemList = new ArrayList<FileSystemItem>();
    }

    public Folder(String name, int capacity) {
        super(name);
        fileSystemItemList = new ArrayList<FileSystemItem>(capacity);
    }

    @Override
    public int getSize() {
        int size = 0;
        for(FileSystemItem fileSystemItem : fileSystemItemList) {
            size += fileSystemItem.getSize();
        }
        return size;
    }

    @Override
    public void addElement(FileSystemItem fileSystemItem) {
        fileSystemItemList.add(fileSystemItem);
    }

    @Override
    public void removeElement(FileSystemItem fileSystemItem) {
        fileSystemItemList.remove(fileSystemItem);
    }
}
