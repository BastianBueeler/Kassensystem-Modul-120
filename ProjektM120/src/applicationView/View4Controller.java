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
import javafx.stage.Stage;

public class View4Controller {

	@FXML
	private Button BackSite1;

	private String Zahlungsart;

	@FXML
	public void nextViewB(ActionEvent event) throws IOException {

		Stage stage;
		Parent root = null;

		Zahlungsart = "Vielen Dank für Ihren Einkauf mit Bargeld.";

		stage = (Stage) BackSite1.getScene().getWindow();

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/BezahlungsbestaetigungsView.fxml"));
		root = (Parent) loader.load();

		BezahlungsbestaetigungsController Controller = loader.getController();
		Controller.getZahlungsmethode(Zahlungsart);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextViewK(ActionEvent event) throws IOException {

		Stage stage;
		Parent root = null;

		Zahlungsart = "Vielen Dank für Ihren Einkauf mit einer Kreditkarte.";

		stage = (Stage) BackSite1.getScene().getWindow();

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/BezahlungsbestaetigungsView.fxml"));
		root = (Parent) loader.load();

		BezahlungsbestaetigungsController Controller = loader.getController();
		Controller.getZahlungsmethode(Zahlungsart);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextViewT(ActionEvent event) throws IOException {

		Stage stage;
		Parent root = null;

		Zahlungsart = "Vielen Dank für Ihren Einkauf mit Twint.";

		stage = (Stage) BackSite1.getScene().getWindow();

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/BezahlungsbestaetigungsView.fxml"));
		root = (Parent) loader.load();

		BezahlungsbestaetigungsController Controller = loader.getController();
		Controller.getZahlungsmethode(Zahlungsart);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void BacktoSite1(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) BackSite1.getScene().getWindow();

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
