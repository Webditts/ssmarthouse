package com.smarthome.services;

import io.grpc.stub.StreamObserver;
import smart_home.MotionDetectionServiceGrpc;
import smart_home.MotionDetectionProto.MotionDetectionRequest;
import smart_home.MotionDetectionProto.MotionAlert;

public class MotionDetectionServiceImpl extends MotionDetectionServiceGrpc.MotionDetectionServiceImplBase {
    @Override
    public void streamMotionAlerts(MotionDetectionRequest request, 
                                   StreamObserver<MotionAlert> responseObserver) {
        System.out.println("Motion detection request received for sensor ID: " + request.getSensorId());
        
        // Create a motion alert based on the request
        MotionAlert alert = MotionAlert.newBuilder()
                .setTimestamp(String.valueOf(System.currentTimeMillis()))  // Convert to String as required
                .setLocation("Living Room")  // Example location, you can customize as needed
                .setMessage("Motion detected at sensor: " + request.getSensorId())
                .setMotionDetected(true)  // Indicating motion detected
                .build();
                
        // Stream the motion alert
        responseObserver.onNext(alert);
        responseObserver.onCompleted();
    }
}
