package com.mp.screenshot;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.MessageFormat;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooserPanel extends JFrame {

    private static File file = null;
    private TakeScreen ts = new TakeScreen();

    public void salva(BufferedImage buff) throws AWTException, IOException {
        JFileChooser fc = new JFileChooser();
        FileFilter jpegFilter = new FileNameExtensionFilter("File JPG/JPEG", "jpeg");
        FileFilter gifFilter = new FileNameExtensionFilter("File GIF", "gif");
        FileFilter pngFilter = new FileNameExtensionFilter("File PNG", "png");
        fc.addChoosableFileFilter(gifFilter);
        fc.addChoosableFileFilter(pngFilter);
        fc.addChoosableFileFilter(jpegFilter);

        int returnVal = fc.showSaveDialog(fc);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            FileFilter selectedFilter = fc.getFileFilter();
            if (file.getName().indexOf('.') == -1) {
                if (selectedFilter == jpegFilter) {
                    file = new File(file.getPath() + ".jpeg");
                } else if (selectedFilter == gifFilter) {
                    file = new File(file.getPath() + ".gif");
                } else if (selectedFilter == pngFilter) {
                    file = new File(file.getPath() + ".png");
                }
            }
            if (file.exists()) {
                String msg = MessageFormat.format("The entry ''{0}'' already exists.\nDo you want to replace it?", new Object[]{file});
                int r = JOptionPane.showConfirmDialog(null, msg, "Confirm", JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.NO_OPTION) {
                    return;
                }
            }
            ts.manualScreenSub(formato(), file.toString(), buff);
        }
    }

    public static String formato() {
        String ext = file.toString();
        String formato = ext.substring(ext.lastIndexOf(".") + 1);
        return formato;
    }
}