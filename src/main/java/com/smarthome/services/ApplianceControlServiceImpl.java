package com.smarthome.services;

import io.grpc.stub.StreamObserver;
import smart_home.ApplianceControlProto.ApplianceControlRequest;
import smart_home.ApplianceControlProto.ApplianceControlResponse;
import smart_home.ApplianceControlServiceGrpc;

public class ApplianceControlServiceImpl extends ApplianceControlServiceGrpc.ApplianceControlServiceImplBase {
    @Override
    public void toggleAppliance(ApplianceControlRequest request, 
                               StreamObserver<ApplianceControlResponse> responseObserver) {
        System.out.println("Appliance control request received for: " + request.getApplianceId());

        // Determine status based on request
        String newStatus = request.getTurnOn() ? "on" : "off";

        ApplianceControlResponse response = ApplianceControlResponse.newBuilder()
                .setStatus(newStatus)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}