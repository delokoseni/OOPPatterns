package org.example;

import org.example.compositor.File;
import org.example.compositor.FileSystemItem;
import org.example.compositor.Folder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileSystemItem firstFile = new File("text.txt", 10);
        FileSystemItem secondFile = new File("anotherText.txt", 15);
        FileSystemItem thirdFile = new File("image.jpeg", 15);

        FileSystemItem textFilesFolder = new Folder("text files");
        FileSystemItem myFilesFilesFolder = new Folder("my files");

        myFilesFilesFolder.addElement(textFilesFolder);
        myFilesFilesFolder.addElement(thirdFile);

        textFilesFolder.addElement(firstFile);
        textFilesFolder.addElement(secondFile);

        List<FileSystemItem> fileSystemItemList = new ArrayList<>();
        fileSystemItemList.add(firstFile);
        fileSystemItemList.add(secondFile);
        fileSystemItemList.add(thirdFile);
        fileSystemItemList.add(textFilesFolder);
        fileSystemItemList.add(myFilesFilesFolder);

        for(FileSystemItem aFileSystemItem : fileSystemItemList) {
            System.out.println(aFileSystemItem.getName() + ": " + aFileSystemItem.getSize());
        }
    }
}