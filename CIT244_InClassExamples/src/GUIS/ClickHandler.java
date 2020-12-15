
package GUIS;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 *
 * @author robtr
 */
public class ClickHandler implements EventHandler<ActionEvent> {
    //Reference to label that will be updated
    private Label rLabel;
    private Label rLabel2;
    
    public ClickHandler(Label cParamLabel)
    {
        rLabel = cParamLabel;
    }
    @Override
    public void handle(ActionEvent event)
    {
        int count = Integer.parseInt(rLabel.getText());
        count ++;
        rLabel.setText(String.valueOf(count));
    }
    

}
