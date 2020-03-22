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

public class View1Controller {

	@FXML
	private Button Bezahlen;

	@FXML
	private Button Zurueck_Help;

	@FXML
	public void nextViewF(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Bezahlen.getScene().getWindow();
		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/View2F.fxml"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextViewG(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Bezahlen.getScene().getWindow();
		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/View2G.fxml"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextViewB(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Bezahlen.getScene().getWindow();

		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/View2B.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void nextViewN(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Bezahlen.getScene().getWindow();

		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/View2N.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void nextViewHelp(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Bezahlen.getScene().getWindow();

		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/HelpView.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void nextViewBezahlen(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Bezahlen.getScene().getWindow();

		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/View4.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void previousViewZurueckStartseite(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) Zurueck_Help.getScene().getWindow();

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
