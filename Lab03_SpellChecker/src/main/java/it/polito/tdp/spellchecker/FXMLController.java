/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;

import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class FXMLController {
	
	private Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    
    @FXML
    private ChoiceBox<String> languageSelect;

    @FXML
    private TextArea inputArea;

    @FXML
    private Button spellCheckBtn;

    @FXML
    private TextArea resultArea;

    @FXML
    private Text numberOfErrorsTxt;

    @FXML
    private Button clearTextBtn;

    @FXML
    private Text timeTxt;

    @FXML
    void doClearCheck(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	this.languageSelect.getItems().addAll("English","Italian");
    }

	public void setModel(Model model) {
		this.model = model;
	}
}


