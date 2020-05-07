/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Ezzel a fájl-al indul a programunk. Ez a belépő pont.
public class TestFX extends Application {
    //Ez az Application methodja amit felülírunk, abstract method-> mindenépp felül kell írni
    @Override
    public void start(Stage stage) throws Exception {
        //Betöltjük a root-ba a saját nézetünket
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        Scene scene = new Scene(root);        
        stage.setScene(scene);
        //Ezzel jelenítjük meg, ha lefuttatom megjeleni az eredmény
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
