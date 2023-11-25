package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public class zzfoe extends Handler {
    private final Looper zza;

    public zzfoe() {
        this.zza = Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfoe(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
