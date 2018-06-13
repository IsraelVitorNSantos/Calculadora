/***
 **    Programa Principal
***/
package calculadoracorrigido;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/// Classe "Calculadora" torna-se uma Subclasse da classe Application
public class Calculadora extends Application {
    
    /// Subclasse "Calculadora", sobrescrevendo a Superclasse Application
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("calculadora.fxml"));
        
        /// Declarando uma cena, "scene", para definir a GUI como grafo de cena
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}