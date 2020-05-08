package lotto;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class LottoNezetController implements Initializable {

    //final változót nagy betűvel írjuk
//<editor-fold defaultstate="collapsed" desc="Class Variables">
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
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="FXML items">
    @FXML
    private Pane basePane;
    @FXML
    private Pane alertPane;
    @FXML
    private Label alertText;
    @FXML
    private Button alertButton;
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
    private Label eredmeny;
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
//</editor-fold>

    @FXML
    private void handleAlertButton(ActionEvent event){
         basePane.setDisable(false);
         basePane.setOpacity(1);
         alertPane.setVisible(false);
         alertText.setText("");
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       
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
        
        calculate();
    }

    private String calculate(){
        //begyűjtjük a beírt számokat
        try{
        selNum1 = Integer.parseInt(input1.getText());
        selNum2 = Integer.parseInt(input2.getText());
        selNum3 = Integer.parseInt(input3.getText());
        selNum4 = Integer.parseInt(input4.getText());
        selNum5 = Integer.parseInt(input5.getText());
        }catch(Exception e){
            basePane.setDisable(true);
            basePane.setOpacity(0.3);
            alertPane.setVisible(true);
            alertText.setText("Nem jó számot adtál meg!");
            System.out.println(e);
            return "";
            
        } 
        if(selNum1 < 1 || selNum1 > 90 || selNum2 < 1 || selNum2 > 90 ||selNum3 < 1 || selNum3 > 90 ||selNum4 < 1 || selNum4 > 90 ||selNum5 < 1 || selNum5 > 90  ){
            basePane.setDisable(true);
            basePane.setOpacity(0.3);
            alertPane.setVisible(true);
            alertText.setText("Minden számnak 1 és 90 között kell lennie");
        }
        return "";
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
