package lotto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lotto extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LottoNezet.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        //ablak méret nem lesz változtatható
        stage.setResizable(false);
        stage.setTitle("Lottó Program");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
