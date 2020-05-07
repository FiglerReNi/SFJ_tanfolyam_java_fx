/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

//Ez a kontorller fájl
public class ViewController implements Initializable {
    //Annotáció fajta az FXML -> segít abban, hgy elemeet fel tudjunk cimkézni
    //és össze tudjunk kötni a nézetben található elemekkel
    @FXML
    private Label tag;
    
    @FXML
    private CheckBox cbox;
    
    @FXML
    private void akcio(ActionEvent event) {
        System.out.println("You clicked me!");
        tag.setText("Hello World!");
        cbox.setSelected(true);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }       
}
