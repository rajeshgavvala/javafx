package com.eds.controller;

import com.eds.exception.EDSException;
import com.eds.validator.Validator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField serial_number_d;

    @FXML
    private TextField software_v_d;

    @FXML
    private TextField motoar_serial_number_d;

    @FXML
    private TextField serial_number_b;

    @FXML
    private TextField torque_sensor_serial_number_b;

    @FXML
    private TextField serial_number_r;

    @FXML
    private TextField HMI_board_serial_number_r;

    private Validator validate;

    @FXML
    void onValidate(ActionEvent event) throws EDSException {
        validate = new Validator();

        validate.validateSerial_number_d(serial_number_d);
        System.out.println(validate.getSerial_number_d());

        validate.validateSoftwareVersion_d(software_v_d);
        System.out.println(validate.getSoftware_v_d());

        validate.validateMotoar_serial_number_d(motoar_serial_number_d);
        System.out.println(validate.getMotoar_serial_number_d());

    }

    @FXML
    void onSumbit(ActionEvent event) {
        validate = new Validator();
        System.out.println(validate.getSerial_number_d());
        Alert dg = new Alert(Alert.AlertType.INFORMATION);

        dg.setTitle("Result");
        dg.setContentText("vvaBJBFNJK EALFK");
        dg.show();



    }






}


//double softwareVersion_d = Double.parseDouble(software_v_d.getText());
//short motorSerialNumber_d = Short.parseShort(motoar_serial_number_d.getText());
//int serialNumber_b = Integer.parseInt(serial_number_b.getText());
//int torqueSensorSerialNumber_b = Integer.parseInt(torque_sensor_serial_number_b.getText());
//int serialNumber_r = Integer.parseInt(serial_number_r.getText());
//short HMI_boardSerialNumber_r = Short.parseShort(HMI_board_serial_number_r.getText());
