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
        LayoutManager manager;

        manager = new FlowLayout();

        bounds = new Rectangle();
        bounds.setSize(width, height);

        button = new UpgradeButton(0, "Button!");

        root = new JFrame();

        root.setTitle(title);
        button.registerElements(manager);
        manager.layoutContainer(root);
        manager.preferredLayoutSize(root);
        root.setLayout(manager);

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