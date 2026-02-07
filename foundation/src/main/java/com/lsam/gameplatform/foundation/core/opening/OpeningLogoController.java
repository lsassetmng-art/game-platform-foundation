package com.lsam.gameplatform.foundation.core.opening;

public interface OpeningLogoController {

    void show(
        OpeningLogoRequest request,
        OpeningLogoCallback callback
    );

    interface OpeningLogoCallback {
        void onCompleted();
        void onSkipped();
    }
}
