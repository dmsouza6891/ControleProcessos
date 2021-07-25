package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("Requisicoes");
	}
	
	@FXML
	public void onMenuItemRequerenteAction() {
		System.out.println("Requerente");
	}
	
	public void initialize(URL uri, ResourceBundle rb) {
		
	}

}
