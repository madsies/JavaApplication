import customComponents.UpgradeButton;

import javax.swing.*;
import java.awt.*;

class WindowManager{

    Frame root;
    private Boolean live = true;
    private int ticks = 0;

    public WindowManager(String title, int width, int height){

        Rectangle bounds;
        UpgradeButton button;

        bounds = new Rectangle();
        bounds.setSize(width, height);

        button = new UpgradeButton(0);

        root = new JFrame();
        root.setTitle(title);
        root.add(button.getObject());

        root.setBounds(bounds);

        root.setVisible(true);
    }

    public void Quit(){
        // Returns True of exits safely, false if not.

        root.dispose();
        live = false;
    }

    public boolean isLive(){
        return live;
    }

    public void setWindowTitle(String title){
        root.setTitle(title);
    }

    public void tick(){
        ticks++;
    }

    public int getTicks(){
        return ticks;
    }

}