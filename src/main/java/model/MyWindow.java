package model;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    /* public MyWindow(String title) throws HeadlessException {
        super(title);
    } */

    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            // in this case application is closing as well!
            @Override
            public void windowClosing(WindowEvent e) {
                // super.windowClosed(e);
                System.exit(0);
            }
        });
            /*// window closed has been called when window closed but application still running in background!
            @Override
            public void windowClosed(WindowEvent e) {
                // super.windowClosed(e);
                System.exit(0);
            }
        });*/
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}
