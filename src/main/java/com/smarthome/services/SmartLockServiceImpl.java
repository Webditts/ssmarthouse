package com.smarthome.services;

import io.grpc.stub.StreamObserver;
import smart_home.SmartLockServiceGrpc;
import smart_home.SmartLockProto.SmartLockRequest;
import smart_home.SmartLockProto.SmartLockResponse;

public class SmartLockServiceImpl extends SmartLockServiceGrpc.SmartLockServiceImplBase {
    @Override
    public void controlLock(SmartLockRequest request, 
                            StreamObserver<SmartLockResponse> responseObserver) {
        System.out.println("Lock control request received for lock ID: " + request.getLockId());
        
        // Logic for controlling lock
        String lockAction = request.getLock() ? "Locking" : "Unlocking";
        
        SmartLockResponse response = SmartLockResponse.newBuilder()
                .setStatus(lockAction + " completed")  // Status message based on action
                .setMessage("The lock ID " + request.getLockId() + " is now " + (request.getLock() ? "locked" : "unlocked"))
                .build();
                
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
