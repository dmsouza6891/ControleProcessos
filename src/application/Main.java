package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			 FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); //instancia o carregador da view passando o caminho
			 Parent parent = loader.load();
			 Scene mainScene = new Scene(parent); //cena principal
			 primaryStage.setScene(mainScene); //define a cena utilizada para tela principal
			 primaryStage.setTitle("Gestão de Tarefas"); //define texto para a tela principal
			 primaryStage.show(); //mostra a tela principal
		} catch (IOException e) {
			 e.printStackTrace();
		} 		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
