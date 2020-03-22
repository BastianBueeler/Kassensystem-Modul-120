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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class View3Controller implements Initializable {

	@FXML
	private Button AddP;

	@FXML
	private Label Lname;

	@FXML
	private Label Lzahl;

	@FXML
	private Label Lhname;

	@FXML
	private Label Lartname;

	@FXML
	private Label Lmarkenname;

	@FXML
	private Label Lanzahl;

	@FXML
	private ImageView VImage;

	private String Image;
	String view;
	private int anzahl = 1;

	void setName(String n) {
		Lname.setText(n);
	}

	void setZahl(String preis) {
		Lzahl.setText(preis);
	}

	void setHName(String nh) {
		Lhname.setText(nh);
	}

	void setArtName(String a) {
		Lartname.setText(a);
	}

	void setMarkenName(String m) {
		Lmarkenname.setText(m);
	}

	void setImage(String I) {
		// VImage = new Image(new FileInputStream(""));
	}

	void getView(String v) {
		view = v;
	}

	@FXML
	protected void Bplus(ActionEvent event) {

		anzahl += 1;
		Lanzahl.setText(Double.toString(anzahl));

	}

	@FXML
	protected void Bminus(ActionEvent event) {

		if (anzahl > 1) {
			anzahl -= 1;
			Lanzahl.setText(Double.toString(anzahl));
		}
	}

	@FXML
	protected void previousView(ActionEvent event) {

		if (view.equals("B")) {
			Stage stage;
			Parent root = null;

			stage = (Stage) AddP.getScene().getWindow();

			try {
				root = FXMLLoader.load(getClass().getResource("/applicationView/View2B.fxml"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} else if (view.equals("F")) {
			Stage stage;
			Parent root = null;

			stage = (Stage) AddP.getScene().getWindow();

			try {
				root = FXMLLoader.load(getClass().getResource("/applicationView/View2F.fxml"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} else if (view.equals("G")) {
			Stage stage;
			Parent root = null;

			stage = (Stage) AddP.getScene().getWindow();

			try {
				root = FXMLLoader.load(getClass().getResource("/applicationView/View2G.fxml"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} else if (view.equals("N")) {
			Stage stage;
			Parent root = null;

			stage = (Stage) AddP.getScene().getWindow();

			try {
				root = FXMLLoader.load(getClass().getResource("/applicationView/View2N.fxml"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}

	@FXML
	protected void nextView_Add(ActionEvent event) {

		Stage stage;
		Parent root = null;

		stage = (Stage) AddP.getScene().getWindow();

		try {
			root = FXMLLoader.load(getClass().getResource("/applicationView/View1.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Lanzahl.setText("1.0");

	}

}
