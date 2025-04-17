package com.smarthome.services;

import io.grpc.stub.StreamObserver;
import smart_home.CameraStreamingServiceGrpc;
import smart_home.CameraStreamingProto.CameraStreamingRequest;
import smart_home.CameraStreamingProto.CameraStreamingResponse;

public class CameraStreamingServiceImpl extends CameraStreamingServiceGrpc.CameraStreamingServiceImplBase {
    @Override
    public void streamCamera(CameraStreamingRequest request,
                             StreamObserver<CameraStreamingResponse> responseObserver) {
        System.out.println("Camera streaming request received for camera ID: " + request.getCameraId());

        // Simulate streaming by sending 5 dummy frames
        for (int i = 1; i <= 5; i++) {
            String dummyFrameData = "Frame " + i + " from camera " + request.getCameraId();
            CameraStreamingResponse response = CameraStreamingResponse.newBuilder()
                    .setFrameData(dummyFrameData)
                    .build();

            responseObserver.onNext(response);

            try {
                Thread.sleep(500); // Simulate delay between frames
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted();
    }
}
