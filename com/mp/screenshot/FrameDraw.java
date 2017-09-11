package com.mp.screenshot;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class FrameDraw extends JFrame {

    private final JButton button;
    private final JScrollPane scroll;
    private final int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public FrameDraw(String path) {
        super("Draw panel");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        button = new JButton("Capture");
        button.setBackground(Color.red);
        ImagePanel panel = new ImagePanel(path);
        scroll = new JScrollPane(panel);
        add(scroll, BorderLayout.CENTER);
        add(button, BorderLayout.NORTH);
    }

    private class ImagePanel extends JPanel implements MouseListener, MouseMotionListener {

        private final FileChooserPanel jfc = new FileChooserPanel();
        private BufferedImage buff;
        private Rectangle currentRect;
        private final String fileDelete;
        private int xx = 0;
        private int yy = 0;
        private int w = 0;
        private int h = 0;
        boolean done = false;

        public ImagePanel(String path) {
            setLayout(new BorderLayout());
            setPreferredSize(new Dimension(width, height));
            fileDelete = path;
            try {
                buff = ImageIO.read(new File(path));
                button.addActionListener((ActionEvent e) -> {
                    capture(e);
                    dispose();
                });
                addMouseListener(this);
                addMouseMotionListener(this);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            xx = e.getX();
            yy = e.getY();
            currentRect = new Rectangle(xx, yy, 0, 0);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            currentRect.setSize(e.getX() - currentRect.x, e.getY() - currentRect.y);
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            w = e.getX() - currentRect.x;
            h = e.getY() - currentRect.y;
            currentRect.setSize(w, h);
            done = true;
            repaint();
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(buff, 0, 0, this);
            g.setColor(Color.RED);
            if (done) {
                g.drawRect(xx, yy, currentRect.width, currentRect.height);
            }
        }

        public void capture(ActionEvent e) {
            try {
                BufferedImage subBuff = buff.getSubimage(xx, yy, w, h);
                jfc.salva(subBuff);
                DeleteTemp.delete(fileDelete);
            } catch (AWTException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }
}
