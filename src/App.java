
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("interface.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);
        primaryStage.setTitle("FUTEGAME");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
    public static void main(String[] args) throws Exception{
        launch(args);
    }
}
