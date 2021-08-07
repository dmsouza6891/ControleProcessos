package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static Scene mainScene;

	@Override
	public void start(Stage primaryStage) {
		try {
			 FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); //instancia o carregador da view passando o caminho
			 ScrollPane scrollPane = loader.load();
			 
			 scrollPane.setFitToHeight(true); //ajusta a largura do menu na janela
			 scrollPane.setFitToWidth(true);
			 
			 mainScene = new Scene(scrollPane); 
			 primaryStage.setScene(mainScene); //define a cena utilizada para tela principal
			 primaryStage.setTitle("Gestão de Tarefas"); //define texto para a tela principal
			 primaryStage.setMaximized(true); //define para ocupar a tela inteira
			 primaryStage.show(); //mostra a tela principal
		} catch (IOException e) {
			 e.printStackTrace();
		} 		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}
	
}
