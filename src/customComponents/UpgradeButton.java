package customComponents;

import java.awt.*;

public class UpgradeButton {

    Button buttonObj;
    public UpgradeButton (int slot){
        buttonObj = new Button();
        buttonObj.setLabel("Upgrade: ");
        buttonObj.setSize(160, 90+slot);
    }



    public Button getObject(){
        return buttonObj;
    }
}
