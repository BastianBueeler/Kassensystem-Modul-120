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

public class View2GController {

	@FXML
	private Button Blumenkohl;

	private String name;
	private String preis;
	private String hname;
	private String artname;
	private String markenname;
	private String view = "G";

	@FXML
	protected void nextView_Bl(ActionEvent event) throws IOException {

		name = "Blumenkohl";
		preis = "4.20Fr";
		hname = "Schweiz";
		artname = "Gemüse";
		markenname = "Schweizergemüse";

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

		stage = (Stage) Blumenkohl.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Br(ActionEvent event) throws IOException {

		name = "Brokkoli";
		preis = "4.90Fr";
		hname = "Schweiz";
		artname = "Gemüse";
		markenname = "Schweizergemüse";

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

		stage = (Stage) Blumenkohl.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Ka(ActionEvent event) throws IOException {

		name = "Karotte";
		preis = "0.40Fr";
		hname = "Schweiz";
		artname = "Gemüse";
		markenname = "Schweizergemüse";

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

		stage = (Stage) Blumenkohl.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_La(ActionEvent event) throws IOException {

		name = "Lauch";
		preis = "3.50Fr";
		hname = "Schweiz";
		artname = "Gemüse";
		markenname = "Schweizergemüse";

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

		stage = (Stage) Blumenkohl.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Ma(ActionEvent event) throws IOException {

		name = "Mais";
		preis = "1.90Fr";
		hname = "Schweiz";
		artname = "Gemüse";
		markenname = "Schweizergemüse";

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

		stage = (Stage) Blumenkohl.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void nextView_Pa(ActionEvent event) throws IOException {

		name = "paprika";
		preis = "1.50Fr";
		hname = "Schweiz";
		artname = "Gemüse";
		markenname = "Schweizergemüse";

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

		stage = (Stage) Blumenkohl.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	protected void previousView(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Blumenkohl.getScene().getWindow();

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