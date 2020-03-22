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

public class View2FController {

	@FXML
	private Button Apfel;

	private String name;
	private String preis;
	private String hname;
	private String artname;
	private String markenname;
	private String view = "F";

	@FXML
	public void nextView_Ap(ActionEvent event) throws IOException {

		name = "Apfel";
		preis = "0.60Fr";
		hname = "Schweiz";
		artname = "Frucht";
		markenname = "SwissFruits";

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

		stage = (Stage) Apfel.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextView_Bi(ActionEvent event) throws IOException {

		name = "Birne";
		preis = "0.90Fr";
		hname = "Schweiz";
		artname = "Frucht";
		markenname = "SwissFruits";

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

		stage = (Stage) Apfel.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextView_Ba(ActionEvent event) throws IOException {

		name = "Banane";
		preis = "0.90Fr";
		hname = "Afrika";
		artname = "Frucht";
		markenname = "Max Havelar";

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

		stage = (Stage) Apfel.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextView_Tr(ActionEvent event) throws IOException {

		name = "Trauben";
		preis = "4.20Fr ";
		hname = "Italien";
		artname = "Frucht";
		markenname = "Max Havelar";

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

		stage = (Stage) Apfel.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextView_An(ActionEvent event) throws IOException {

		name = "Ananas";
		preis = "5.85";
		hname = "Costa Rica";
		artname = "Frucht";
		markenname = "Max Havelar";

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

		stage = (Stage) Apfel.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextView_Ki(ActionEvent event) throws IOException {

		name = "Kiwi";
		preis = "1.20";
		hname = "China";
		artname = "Frucht";
		markenname = "ChinaFruits";

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

		stage = (Stage) Apfel.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void previousView(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Apfel.getScene().getWindow();

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
