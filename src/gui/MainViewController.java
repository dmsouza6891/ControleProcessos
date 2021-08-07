package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainViewController implements Initializable {
 
	@FXML private MenuItem menuItemColaboradores;
	@FXML private MenuItem menuItemRequisicoes;
	@FXML private MenuItem menuItemRequerente;
	
	@FXML
	public void onMenuItemColaboradoresAction() {
		System.out.println("Colaboradores");
	}
	
	@FXML
	public void onMenuItemRequisicoesAction() {
		
		createDialogForm("/gui/RequisicaoForm.fxml", Main.getMainScene() ,"Cadastro de Requisições");
	
	}
	
	@FXML
	public void onMenuItemRequerenteAction() {
		System.out.println("Requerente");
	}
	
	public void initialize(URL uri, ResourceBundle rb) {
		
	}
	
	private void createDialogForm(String absoluteName, Scene parentStage, String titleDialog) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			Pane pane = loader.load();
			
			Stage dialogStage = new Stage();
			dialogStage.setScene(new Scene(pane));
			dialogStage.setTitle(titleDialog);
			dialogStage.initOwner(parentStage.getWindow()); //define a Janela que será a raiz da Janela Modal
			dialogStage.setResizable(false); //não permite que a janela seja maximizada ou minimizada
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.showAndWait();
		}
		catch(IOException e){
			Alerts.showAlert("IOException", "Erro ao carregar janela", e.getMessage(), AlertType.ERROR);
		}
	}

}
