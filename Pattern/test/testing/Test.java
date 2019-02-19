/*
 * Programmer: Victor Pineda
 * Date:
 * Description: Testing Pattern 
 */
package testing;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.VLineTo;
import pattern.Pattern;

public class Test extends Application{
    
        @Override
    public void start(Stage primaryStage) {
        
        
        Pattern test = new Pattern();                
        
        test.setSize(30);
        test.setPathCount(30);
        test.setMinRange(0);
        test.setMaxRange(300);
        Path n = new Path();
       
        
        n.getElements().addAll(); 
        
        //root needs argument
        StackPane root = new StackPane();        
        Scene scene = new Scene(root);       
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
