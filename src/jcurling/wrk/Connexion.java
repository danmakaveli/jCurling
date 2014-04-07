/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcurling.wrk;

import jssc.SerialPort;
import jssc.SerialPortException;

/**
 *
 * @author albuquerqud
 */
public class Connexion extends Thread {

    private int baudRate = 57600;
    private int dataBits = 8;
    private int stopBits = 1;
    private int parity = 0;
    private final SerialPort serialPort;
    private boolean connected;


    public Connexion(String serialPort) {
        this.serialPort = new SerialPort("COM"+serialPort);
    }


    @Override
    public void run() {
        try {
            System.out.println("Port ouvert: " + serialPort.openPort());
            System.out.println("Paramètres affectés: " + serialPort.setParams(baudRate, dataBits, stopBits, parity));
            try {
                sendMessage("H,1");
                Thread.sleep(500);
                sendMessage("H,0");
            } catch (InterruptedException ex) {
                System.out.println("Une erreur est survenue lors de la connexion: " + ex.toString());
            }
            connected = true;
            while (connected) {

            }
        } catch (SerialPortException ex) {
            System.out.println("Une erreur est survenue:" + ex.getCause());
        }

    }

    public boolean sendMessage(String msg) {
        boolean ok = false;
        System.out.println("Message envoyé:" + msg);
        try {
            ok = serialPort.writeString(msg + "\n");
        } catch (SerialPortException ex) {
            System.out.println("Une erreur est survenue lors de l'envoi( " + msg + "):" + ex.getCause());
        }
        return ok;
    }

    public void stopConnexion() {
        connected = false;
        System.out.println("Connexion fermée");
    }

    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }

    public int getDataBits() {
        return dataBits;
    }

    public void setDataBits(int dataBits) {
        this.dataBits = dataBits;
    }

    public int getStopBits() {
        return stopBits;
    }

    public void setStopBits(int stopBits) {
        this.stopBits = stopBits;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(int parity) {
        this.parity = parity;
    }

    public boolean isConnected() {
        return connected;
    }
}
