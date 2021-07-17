package application;
	
import java.io.IOException;
import java.util.Date;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.dao.DaoFactory;
import model.dao.ProcessoDao;
import model.entities.Processo;


public class Main extends Application {
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			Pane mainPane = loader.load();
			
			mainScene = new Scene(mainPane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Controle de Processos");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}
	
	public static void main(String[] args) {
		launch(args);
<<<<<<< HEAD
	
=======
		Processo teste = new Processo(1, 200, 2020, "Alteração de Conta", new Date(), "Teste 4");
		System.out.println(teste);
		
		//ProcessoDao processo = DaoFactory.createProcessoDao();
		//processo.insert(teste);
		//teste = processo.findById(232020);
		System.out.println(teste);
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
	}
}
