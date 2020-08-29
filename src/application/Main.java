package application;
	
import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Processo;
import model.dao.DaoFactory;
import model.dao.ProcessoDao;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//launch(args);
		Processo teste = new Processo(1, 200, 2020, "Alteração de Conta", new Date(), "Teste 4");
		System.out.println(teste);
		
		ProcessoDao processo = DaoFactory.createProcessoDao();
		processo.insert(teste);
		teste = processo.findById(232020);
		System.out.println(teste);
	}
}
