package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));

//        Group root = new Group();
//
//
//        TextField nameField = new TextField();
//        Label label = new Label("Name:");
//        Text txt = new Text("Sup?");
//        txt.setFont(new Font("Papyrus",50));
//        Button btn = new Button();
//        GridPane grid = new GridPane();
//        btn.setText("Say Sup!");
//        btn.setOnAction(evt -> txt.setText(nameField.getText()));
//        grid.add(label, 0, 0);
//        grid.add(nameField,1,0);
//        grid.add(btn, 1, 1);
//        grid.setHgap(20);
//
//
//
//        VBox box = new VBox();
//        box.getChildren().addAll(txt, grid);
//
//        root.getChildren().add(box);

        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
