package com.mp.screenshot;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TakeScreen {

    public void autoScreen(String formato, String percorso) throws AWTException, IOException {
        Robot robot = new Robot();
        Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage buff = robot.createScreenCapture(area);
        ImageIO.write(buff, formato, new File(percorso));
        JOptionPane.showMessageDialog(null, "Immagine salvata" + percorso);
    }

    public void manualScreen(String formato, String percorso, int x, int y, int w, int h) throws AWTException, IOException {
        Robot robot = new Robot();
        Rectangle area = new Rectangle(x, y, w, h);
        BufferedImage buff = robot.createScreenCapture(area);
        ImageIO.write(buff, formato, new File(percorso));
        JOptionPane.showMessageDialog(null, "Immagine salvata" + percorso);
    }

    public void manualScreenSub(String formato, String percorso, BufferedImage buff) throws AWTException, IOException {
        ImageIO.write(buff, formato, new File(percorso));
        JOptionPane.showMessageDialog(null, "Immagine salvata" + percorso);
    }

    public void bufferScreen(String formato) throws AWTException, IOException, InterruptedException {
        aspetta();
        String percorso = null;
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            percorso = System.getProperty("user.home") + "\\screen." + formato;
        } else {
            percorso = System.getProperty("user.home") + "/screen." + formato;
        }
        Robot robot = new Robot();
        Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage buff = robot.createScreenCapture(area);
        ImageIO.write(buff, formato, new File(percorso));

        FrameDraw panel = new FrameDraw(percorso);
        panel.setVisible(true);
        panel.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void aspetta() throws InterruptedException {
        Thread.sleep(2000);
    }
}
