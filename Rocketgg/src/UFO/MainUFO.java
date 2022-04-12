package UFO;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainUFO {



    public static void main(String[] args) {

        UFO frame = new UFO();
        frame.setVisible(true);

        try {

            frame.run();

        } catch (Exception e) {
        }

    }
}
