import javax.swing.*;
import java.awt.*;

class WindowManager{

    Frame root;
    public WindowManager(String title, int width, int height){

        Rectangle bounds;

        bounds = new Rectangle();
        bounds.setSize(width, height);

        root = new JFrame();
        root.setTitle(title);

        root.setBounds(bounds);

        root.setVisible(true);
    }

    public boolean Quit(){
        // Returns True of exits safely, false if not.

        root.dispose();
        return true;
    }

}