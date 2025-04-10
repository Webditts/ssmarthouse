/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lewis
 */
package com.smarthome.models;

public class Device {
    private String id;
    private String name;
    private boolean status; // true = ON, false = OFF

    public Device(String id, String name) {
        this.id = id;
        this.name = name;
        this.status = false; // Default OFF
    }

    public void turnOn() {
        this.status = true;
        System.out.println(name + " is now ON.");
    }

    public void turnOff() {
        this.status = false;
        System.out.println(name + " is now OFF.");
    }

    public boolean getStatus() {
        return status;
    }
}
