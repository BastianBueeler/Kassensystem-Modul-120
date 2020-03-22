package applicationView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class View2NController {

	@FXML
	private Button Farbstifte;

	private String name;
	private String preis;
	private String hname;
	private String artname;
	private String markenname;
	private String view = "N";

	@FXML
	protected void nextView_Fa(ActionEvent event) throws IOException {

		name = "Farbstifte";
		preis = "14.50Fr";
		hname = "Deutschland";
		artname = "Stifte";
		markenname = "Stabilo";

		Stage stage;
		Parent root = null;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/View3.fxml"));

		root = (Parent) loader.load();

		View3Controller Controller = loader.getController();
		Controller.setName(name);
		Controller.setZahl(preis);
		Controller.setHName(hname);
		Controller.setArtName(artname);
		Controller.setMarkenName(markenname);
		Controller.getView(view);

		stage = (Stage) Farbstifte.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextViewF_Tu(ActionEvent event) throws IOException {

		name = "Tupperware";
		preis = "7.90Fr";
		hname = "Schweiz";
		artname = "Verpackung";
		markenname = "Tupperware";

		Stage stage;
		Parent root = null;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/View3.fxml"));

		root = (Parent) loader.load();

		View3Controller Controller = loader.getController();
		Controller.setName(name);
		Controller.setZahl(preis);
		Controller.setHName(hname);
		Controller.setArtName(artname);
		Controller.setMarkenName(markenname);
		Controller.getView(view);

		stage = (Stage) Farbstifte.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextViewF_Sp(ActionEvent event) throws IOException {

		name = "Spülmittel";
		preis = "1.90Fr";
		hname = "Schweiz";
		artname = "Küchenutensilien";
		markenname = "Frosch";

		Stage stage;
		Parent root = null;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/View3.fxml"));

		root = (Parent) loader.load();

		View3Controller Controller = loader.getController();
		Controller.setName(name);
		Controller.setZahl(preis);
		Controller.setHName(hname);
		Controller.setArtName(artname);
		Controller.setMarkenName(markenname);
		Controller.getView(view);

		stage = (Stage) Farbstifte.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextViewF_Km(ActionEvent event) throws IOException {

		name = "Küchenmesser";
		preis = "29.90Fr";
		hname = "Deutschland";
		artname = "Küchenutensilien";
		markenname = "GermanKnifes";

		Stage stage;
		Parent root = null;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/View3.fxml"));

		root = (Parent) loader.load();

		View3Controller Controller = loader.getController();
		Controller.setName(name);
		Controller.setZahl(preis);
		Controller.setHName(hname);
		Controller.setArtName(artname);
		Controller.setMarkenName(markenname);
		Controller.getView(view);

		stage = (Stage) Farbstifte.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextViewF_Te(ActionEvent event) throws IOException {

		name = "Teelichter";
		preis = "5.50Fr";
		hname = "Schweiz";
		artname = "Non-Food";
		markenname = "Bolsius";

		Stage stage;
		Parent root = null;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/View3.fxml"));

		root = (Parent) loader.load();

		View3Controller Controller = loader.getController();
		Controller.setName(name);
		Controller.setZahl(preis);
		Controller.setHName(hname);
		Controller.setArtName(artname);
		Controller.setMarkenName(markenname);
		Controller.getView(view);

		stage = (Stage) Farbstifte.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextViewF_Ta(ActionEvent event) throws IOException {

		name = "Taschentücher";
		preis = "7.50Fr";
		hname = "Schweiz";
		artname = "Hygiene";
		markenname = "Tempo";

		Stage stage;
		Parent root = null;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/View3.fxml"));

		root = (Parent) loader.load();

		View3Controller Controller = loader.getController();
		Controller.setName(name);
		Controller.setZahl(preis);
		Controller.setHName(hname);
		Controller.setArtName(artname);
		Controller.setMarkenName(markenname);
		Controller.getView(view);

		stage = (Stage) Farbstifte.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void previousView(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Farbstifte.getScene().getWindow();

		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/View1.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}