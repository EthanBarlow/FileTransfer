package main;


import java.io.File;

public class FileManage {
    private String rootDir;
    private File baseDir;

    public FileManage(String root)
    {
        rootDir = root;
        baseDir = new File(rootDir);
        validDir(rootDir);
    }

    private boolean validDir(String dirToCheck)
    {
        if(baseDir.isDirectory())
        {
            System.out.println(dirToCheck + " is a directory on this computer");
            return true;
        }
        else
        {
            System.out.println(dirToCheck + " is not a directory at all");
            return false;
        }
    }
}
