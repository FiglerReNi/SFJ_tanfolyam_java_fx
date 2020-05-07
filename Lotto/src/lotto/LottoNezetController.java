package lotto;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class LottoNezetController implements Initializable {
    //final változót nagy betűvel írjuk
    private final int MAX = 90;
    private final int MIN = 1;
    
    @FXML
    private Label label1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label1.setText(String.valueOf(getRandomNumber()));
    }
    
    private int getRandomNumber(){
        //1-90 ig generál A módszer
        int random = (int)(Math.random() * MAX) + MIN;
        //B módszer
//        Random rand = new Random();
//        int random = rand.nextInt((MAX - MIN) + 1 ) + MIN;
        return random;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //ami itt van az egyetlen egyszer hívódik meg a program elején
    }    
    
}
