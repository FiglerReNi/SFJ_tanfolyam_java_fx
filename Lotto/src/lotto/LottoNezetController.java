package lotto;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LottoNezetController implements Initializable {

    //final változót nagy betűvel írjuk
    private final int MAX = 90;
    private final int MIN = 1;

    private int genNum1;
    private int genNum2;
    private int genNum3;
    private int genNum4;
    private int genNum5;
    private int selNum1;
    private int selNum2;
    private int selNum3;
    private int selNum4;
    private int selNum5;

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private TextField input1;
    @FXML
    private TextField input2;
    @FXML
    private TextField input3;
    @FXML
    private TextField input4;
    @FXML
    private TextField input5;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        //begyűjtjük a beírt számokat
        selNum1 = Integer.parseInt(input1.getText());
        selNum2 = Integer.parseInt(input2.getText());
        selNum3 = Integer.parseInt(input3.getText());
        selNum4 = Integer.parseInt(input4.getText());
        selNum5 = Integer.parseInt(input5.getText());
        //lenullázzuk az előző sorsolásból maradt értékeket
        genNum1 = 0;
        genNum2 = 0;
        genNum3 = 0;
        genNum4 = 0;
        genNum5 = 0;
        //számokat generálunk
        genNum1 = getRandomNumber();
        genNum2 = getRandomNumber();
        genNum3 = getRandomNumber();
        genNum4 = getRandomNumber();
        genNum5 = getRandomNumber();
        //kiirjuk őket
        label1.setText(String.valueOf(genNum1));
        label2.setText(String.valueOf(genNum2));
        label3.setText(String.valueOf(genNum3));
        label4.setText(String.valueOf(genNum4));
        label5.setText(String.valueOf(genNum5));
    }

    /*Rekurzív függyvény - Olyan függvény ami saját magát hívja meg, a mi esetünkben egy feltételhez kötötten*/
    private int getRandomNumber() {
        //1-90 ig generál A módszer
        int random = (int) (Math.random() * MAX) + MIN;
        //B módszer
//        Random rand = new Random();
//        int random = rand.nextInt((MAX - MIN) + 1 ) + MIN;
//      Ellenőrizzük, hogy egy szám csak egyszer szerepeljen
        if (random == genNum1 || random == genNum2 || random == genNum3 || random == genNum4 || random == genNum5) {
            return getRandomNumber();
        }
        return random;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //ami itt van az egyetlen egyszer hívódik meg a program elején
    }

}
