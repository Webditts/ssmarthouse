package com.smarthome;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.smarthome.services.MotionDetectionServiceImpl;
import com.smarthome.services.CameraStreamingServiceImpl;
import com.smarthome.services.ApplianceControlServiceImpl;
import com.smarthome.services.SmartLockServiceImpl;

public class ServerApp {
    public static void main(String[] args) {
        try {
            Server server = ServerBuilder.forPort(9090)
                .addService(new MotionDetectionServiceImpl())
                .addService(new CameraStreamingServiceImpl())
                .addService(new ApplianceControlServiceImpl())
                .addService(new SmartLockServiceImpl())
                .build();
            System.out.println("🚀 gRPC Server starting on port 9090...");
            server.start();
            System.out.println("🚀 gRPC Server started on port 9090");
            server.awaitTermination();
        } catch (Exception e) {
            System.err.println("Error starting server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
