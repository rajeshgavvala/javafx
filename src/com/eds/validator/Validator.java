package com.eds.validator;

import com.eds.exception.EDSException;
import javafx.scene.control.TextField;

public class Validator {
    private static int serial_number_d;
    private static String software_v_d;
    private static short motoar_serial_number_d;
    private static int serial_number_b;
    private static int torque_sensor_serial_number_b;
    private static int serial_number_r;
    private static short HMI_board_serial_number_r;
    private static boolean onTest;

    public void validateSerial_number_d(TextField serial_number_d) throws EDSException {
        try {
            if(Integer.parseInt(serial_number_d.getText()) >=0 && serial_number_d.getText() !=null ){
                int serialNumber = Integer.parseInt(serial_number_d.getText());
                setSerial_number_d(serialNumber);
                setOnTest(true);
            }else{
                throw new EDSException("Driver-pack:Serial number-allowed in the range of 0 to 2147483647");
            }
        }catch (Exception e){
            throw new EDSException("Driver-pack:Serial number-allowed in the range of 0 to 2147483647");
        }
    }

    public void validateSoftwareVersion_d(TextField software_v_d) throws EDSException {
        short msb;
        short lsb;
        try {
            if (software_v_d.getText().contains(",") && software_v_d.getText() != null) {
                String[] msbLsb= software_v_d.getText().split(",");
                msb = Short.parseShort(msbLsb[0]);
                lsb = Short.parseShort(msbLsb[1]);
                int result = (lsb << 8) + msb;
                String softwareVersion = Integer.toHexString(result);
                setSoftware_v_d("0x"+softwareVersion);
            }else{
                throw new EDSException("Driver-pack:Software Version-allowed in the format of ex: 4,19");
            }
        }catch (Exception e){
            throw new EDSException("Driver-pack:Software Version-allowed in the format of ex: 4,19");
        }
    }

    public void validateMotoar_serial_number_d(TextField motoar_serial_number_d) throws EDSException {
        try {
            if(Integer.parseInt(motoar_serial_number_d.getText()) >=0 && motoar_serial_number_d.getText() !=null ){
                Short motoarSerial_number_d = Short.parseShort(motoar_serial_number_d.getText());
                setMotoar_serial_number_d(motoarSerial_number_d);
                setOnTest(true);
            }else{
                throw new EDSException("Driver-pack:Serial number-allowed in the range of 0 to 2147483647");
            }
        }catch (Exception e){
            throw new EDSException("Driver-pack:Serial number-allowed in the range of 0 to 2147483647");
        }
    }

    public int getSerial_number_d() {
        return serial_number_d;
    }

    public void setSerial_number_d(int serial_number_d) {
        this.serial_number_d = serial_number_d;
    }

    public String getSoftware_v_d() {
        return software_v_d;
    }

    public void setSoftware_v_d(String software_v_d) {
        this.software_v_d = software_v_d;
    }

    public short getMotoar_serial_number_d() {
        return motoar_serial_number_d;
    }

    public void setMotoar_serial_number_d(short motoar_serial_number_d) {
        this.motoar_serial_number_d = motoar_serial_number_d;
    }

    public int getSerial_number_b() {
        return serial_number_b;
    }

    public void setSerial_number_b(int serial_number_b) {
        this.serial_number_b = serial_number_b;
    }

    public int getTorque_sensor_serial_number_b() {
        return torque_sensor_serial_number_b;
    }

    public void setTorque_sensor_serial_number_b(int torque_sensor_serial_number_b) {
        this.torque_sensor_serial_number_b = torque_sensor_serial_number_b;
    }

    public int getSerial_number_r() {
        return serial_number_r;
    }

    public void setSerial_number_r(int serial_number_r) {
        this.serial_number_r = serial_number_r;
    }

    public short getHMI_board_serial_number_r() {
        return HMI_board_serial_number_r;
    }

    public void setHMI_board_serial_number_r(short HMI_board_serial_number_r) {
        this.HMI_board_serial_number_r = HMI_board_serial_number_r;
    }

    public boolean isOnTest() {
        return onTest;
    }

    public void setOnTest(boolean onTest) {
        this.onTest = onTest;
    }
}
