package hu.petrik.emberektablazat;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberekController {

    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, String> korOszlop;
    @FXML
    private TableColumn<Ember, Integer> nevOszlop;
    @FXML
    private Spinner korMezo;
    @FXML
    private TextField nevMezo;

    @FXML
    private void initialize() {
        initSpinner();
        this.nevOszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
        this.korOszlop.setCellValueFactory(new PropertyValueFactory<>("eletkor"));
        Ember e1 = new Ember("Gipsz Jakab", 25);
        Ember e2 = new Ember("Teszt Elek", 52);
        Ember e3 = new Ember("Szabolcsi Károly", 11);
        this.emberek.getItems().add(e1);
        this.emberek.getItems().add(e2);
        this.emberek.getItems().add(e3);

    }

    @FXML
    private void initSpinner() {
        this.korMezo.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 120));
    }

    @FXML
    private void hozzaadClick() {
        if (!this.nevMezo.getText().isEmpty()) {
            Ember e = new Ember(this.nevMezo.getText(), (int) this.korMezo.getValueFactory().getValue());
            this.emberek.getItems().add(e);
        } else {
            Alert felugroAblak = new Alert(Alert.AlertType.WARNING);
            felugroAblak.setHeaderText("Figyelmeztetés");
            felugroAblak.setContentText("Kérem adja meg a nevét");
            felugroAblak.show();
        }
    }

}