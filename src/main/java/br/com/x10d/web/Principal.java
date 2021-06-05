package br.com.x10d.web;

import com.jpro.webapi.JProApplication;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Principal extends JProApplication {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) {
		
		StackPane stackPane = new StackPane();
		stackPane.setStyle("HelloJPro.css");
		stackPane.prefWidth(300);
		stackPane.prefHeight(300);

		ImageView imageView = new ImageView();
		imageView.setFitWidth(100);
		imageView.setPreserveRatio(true);
		imageView.setImage(new Image("grande.png"));

		stackPane.getChildren().add(imageView);
		
		stage.setScene(new Scene(stackPane));
		stage.show();
	}
}
