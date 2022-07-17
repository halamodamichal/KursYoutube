package Kurs.drive;

import Kurs.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
