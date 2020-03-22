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

public class View2BController {

	@FXML
	private Button Buttergipfeli;

	private String name;
	private String preis;
	private String hname;
	private String artname;
	private String markenname;
	private String view = "B";

	@FXML
	protected void nextView_Bu(ActionEvent event) throws IOException {

		name = "Buttergipfeli";
		preis = "1.20Fr";
		hname = "Schweiz";
		artname = "Gebäck";
		markenname = "Prix Garantie";

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

		stage = (Stage) Buttergipfeli.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Lg(ActionEvent event) throws IOException {

		name = "Laugengipfeli";
		preis = "1.20Fr";
		hname = "Schweiz";
		artname = "Gebäck";
		markenname = "Prix Garantie";

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

		stage = (Stage) Buttergipfeli.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Sc(ActionEvent event) throws IOException {

		name = "Schöbli";
		preis = "0.90Fr";
		hname = "Schweiz";
		artname = "Gebäck";
		markenname = "Prix Garantie";

		System.out.println(name);

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

		stage = (Stage) Buttergipfeli.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Ba(ActionEvent event) throws IOException {

		name = "Baguette";
		preis = "2.30Fr";
		hname = "Schweiz";
		artname = "Brot";
		markenname = "Sutter";

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

		stage = (Stage) Buttergipfeli.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Lk(ActionEvent event) throws IOException {

		name = "Laugenkranz";
		preis = "2.90Fr";
		hname = "Schweiz";
		artname = "Brot";
		markenname = "Sutter";

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

		stage = (Stage) Buttergipfeli.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Bz(ActionEvent event) throws IOException {

		name = "Butterzopf";
		preis = "3.20Fr";
		hname = "Schweiz";
		artname = "Gebäck";
		markenname = "Brotastisch";

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

		stage = (Stage) Buttergipfeli.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void previousView(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Buttergipfeli.getScene().getWindow();

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