package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {
	
	@FXML private MenuItem menuItemProcesso;
	@FXML private MenuItem menuItemRequerente;
	@FXML private MenuItem menuItemSobre;
	
	@FXML public void onMenuItemProcessoAction() {
		System.out.println("Clicado em Processo");
	}
	
	@FXML public void onMenuItemRequerenteAction() {
		System.out.println("Clicado em Requerente");
	}
	
	@FXML public void onMenuItemSobreAction() {
		loadView("/gui/SobreView.fxml");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	private void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) mainScene.getRoot();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Erro ao carregar a janela", e.getMessage(), AlertType.ERROR);
		}
	}

}
