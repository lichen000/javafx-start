package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 *
 */
public class Controller {

    @FXML
    private Text text1;

    /**
     * 点击按钮，切换字符串
     * @param event
     */
    @FXML
    protected void doSwitch(ActionEvent event) {
        if ("A".equals(text1.getText())) {
            text1.setText("B");
        } else {
            text1.setText("A");
        }

    }
}
