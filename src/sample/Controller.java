package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    private int op1InInt;
    private int op2InInt;
    private char action;
    private String op ="";
    private double res;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button5;

    @FXML
    private Button button4;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonOperationSum;

    @FXML
    private Button buttonOperationDifference;

    @FXML
    private Button buttonOperationMul;

    @FXML
    private Button buttonOperationDiv;

    @FXML
    private TextField l1;

    @FXML
    private Button buttonResult;
    @FXML
    private Button buttonClear;

    @FXML
    void initialize() {
        l1.setEditable(false);
        button1.setOnAction(event -> {
        op = op +"1";
        l1.setText(op);

        });
        button2.setOnAction(event -> {
            op += "2"; l1.setText(op);});
        button3.setOnAction(event -> {
            op += "3"; l1.setText(op);});
        button4.setOnAction(event -> {
            op += "4"; l1.setText(op);});
        button5.setOnAction(event -> {
            op += "5"; l1.setText(op);});
        button6.setOnAction(event -> {
            op += "6"; l1.setText(op);});
        button7.setOnAction(event -> {
            op += "7"; l1.setText(op);});
        button8.setOnAction(event -> {
            op += "8"; l1.setText(op);});
        button9.setOnAction(event -> {
            op += "9"; l1.setText(op);});
        button0.setOnAction(event -> {
            op += "0"; l1.setText(op);});

        buttonOperationSum.setOnAction(event -> {
            op1InInt = Integer.parseInt(op);
            op = "";
            action = '+';
            l1.clear();
        });
        buttonOperationDifference.setOnAction(event -> {
            op1InInt = Integer.parseInt(op);
            op = "";
            action = '-';
            l1.clear();
        });
        buttonOperationDiv.setOnAction(event -> {
            op1InInt = Integer.parseInt(op);
            op = "";
            action = '/';
            l1.clear();
        });
        buttonOperationMul.setOnAction(event -> {
            op1InInt = Integer.parseInt(op);
            op = "";
            action = '*';
            l1.clear();
        });
        buttonResult.setOnAction(event -> {
            op2InInt = Integer.parseInt(op);
            switch (action){
                case '+':
                    res = op1InInt+op2InInt;
                    break;
                case '-':
                    res = op1InInt-op2InInt;
                    break;
                case '*':
                    res = op1InInt*op2InInt;
                    break;
                case '/':
                    res = (double) op1InInt/op2InInt;
                    break;
                default:
                    l1.setText("error");
                    break;
            }
            l1.setText(String.valueOf(res));

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("INFORMATION");
            alert.setHeaderText(null);
            alert.setContentText("Операция выполнена!\nНажмите на кнопку Clear");
            alert.showAndWait();

            op = "";
            op1InInt = 0;
            op2InInt = 0;
        });
        buttonClear.setOnAction(event -> {
            l1.clear();
            op = "";
            op1InInt = 0;
            op2InInt = 0;
        });

    }
}
