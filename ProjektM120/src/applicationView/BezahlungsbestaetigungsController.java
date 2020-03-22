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

public class BezahlungsbestaetigungsController {

	@FXML
	private Button Ja;

	private String zahlung;

	void getZahlungsmethode(String z) {
		zahlung = z;
	}

	@FXML
	public void nextView(ActionEvent event) throws IOException {
		Stage stage;
		Parent root = null;

		stage = (Stage) Ja.getScene().getWindow();

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/applicationView/View5.fxml"));
		root = (Parent) loader.load();

		View5Controller Controller = loader.getController();
		Controller.setLabel(zahlung);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void previousView(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Ja.getScene().getWindow();

		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/View4.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
