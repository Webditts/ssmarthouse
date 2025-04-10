/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lewis
 */
package com.smarthome.services;

import com.smarthome.models.Device;
import java.util.HashMap;
import java.util.Map;

public class DeviceService {
    private Map<String, Device> devices = new HashMap<>();

    public void addDevice(String id, String name) {
        devices.put(id, new Device(id, name));
        System.out.println("Added device: " + name);
    }

    public void turnOnDevice(String id) {
        if (devices.containsKey(id)) {
            devices.get(id).turnOn();
        } else {
            System.out.println("Device not found.");
        }
    }

    public void turnOffDevice(String id) {
        if (devices.containsKey(id)) {
            devices.get(id).turnOff();
        } else {
            System.out.println("Device not found.");
        }
    }
}
