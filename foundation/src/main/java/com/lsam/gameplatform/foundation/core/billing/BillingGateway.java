package com.lsam.gameplatform.foundation.core.billing;

import android.app.Activity;
import android.content.Context;

public interface BillingGateway {

    void initialize(Context context);

    boolean hasEntitlement(String productId);

    void purchase(Activity activity, String productId);

    void restore();
}
