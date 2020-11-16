package com.eds.exception;

public class EDSException extends Throwable {
    private String edsException;

    public EDSException(String edsException) {
        this.edsException = edsException;
        System.out.println("EDS Exception: " + edsException);
    }

    public String getEdsException() {
        return edsException;
    }

    public void setEdsException(String edsException) {
        this.edsException = edsException;
    }
}
