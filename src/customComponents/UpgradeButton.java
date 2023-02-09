package customComponents;

import javax.swing.*;
import java.awt.*;

public class UpgradeButton {

    Button buttonObj;
    Label labelObj;
    String name;

    public UpgradeButton (int slot, String n){

        name = n;
        buttonObj = new Button();
        buttonObj.setLabel("Upgrade");
        buttonObj.setSize(160, 90);
        buttonObj.setLocation(20, 40+(130*slot));

        labelObj = new Label();
        labelObj.setText(name);
        labelObj.setSize(160, 30);
        labelObj.setLocation(20, 10+(130*slot));
    }

    public void registerElements(LayoutManager manager){
        manager.addLayoutComponent(name, buttonObj);
        manager.addLayoutComponent(name+"_label", labelObj);
    }



    public Button getButtonObj(){
        return buttonObj;
    }
}
