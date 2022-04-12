package UFO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UFO extends JFrame{

    JLabel lab;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int lifecounter = 3;
    int speed = 1;
    Icon pic;

    String text;

    public UFO() {
        getContentPane();

        //transparent
        setUndecorated(true);
        setBackground(new Color(0,0,0,0));

        //size
        setSize(200,200);

        //label
        pic = new ImageIcon("D:\\Rocketgg\\src\\UFO\\Vp3M.gif");
        lab = new JLabel(text,pic,JLabel.CENTER);

        //add listener

        lab.addMouseListener(new UFO.MListener());

        //add label to container

        add(lab);







    }

    // Mouse Listener
    public class MListener extends MouseAdapter{
        public void mousePressed(MouseEvent e) {

            lifecounter--;
            speed +=2;
        }
    }

    public void run() throws Exception {

        //start location
        int y = 300;
        int x = 500;
        boolean yb = false;
        boolean xb = false;

        //loop for the steps
        while (lifecounter >= 0) {
            Thread.sleep(10);
            setLocation(x,y);

            // direction
            if (y >= dim.getHeight() - 90) {
                yb = true;
            }else if (y <= -90) {
                yb = false;
            }

            if (x >= dim.getWidth() - 90) {
                xb = true;
            }else if(x <= -90) {
                xb = false;
            }

            if (yb) {
                y -= speed;
            } else {
                y += speed;
            }

            if (xb) {
                x -= speed;
            }else {
                x += speed;
            }


        }

        lab.setIcon(new ImageIcon("D:\\Rocketgg\\src\\UFO\\YQDj.gif"));
        //wait for 1.8 seconds
        Thread.sleep(1800);
        System.exit(0);


    }


}
