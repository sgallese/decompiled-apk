package com.google.android.gms.ads.initialization;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
    /* loaded from: classes.dex */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
