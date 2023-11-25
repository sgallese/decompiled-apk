package io.realm.mongodb.sync;

import io.realm.internal.Keep;

@Keep
/* loaded from: classes4.dex */
public interface SubscriptionSet$StateChangeCallback {
    void onError(Throwable th);

    void onStateChange(SubscriptionSet subscriptionSet);
}
