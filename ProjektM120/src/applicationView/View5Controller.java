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
import javafx.scene.control.Labeled;
import javafx.stage.Stage;

public class View5Controller {

	@FXML
	private Label Lzahlungsmethode;

	void setLabel(String art) {
		Lzahlungsmethode.setText(art);
	}

}
