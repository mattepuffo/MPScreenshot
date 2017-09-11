package com.mp.screenshot;

import java.io.*;

public class DeleteTemp {

    public static void delete(String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
    }
}