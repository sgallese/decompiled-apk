package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzrj extends Handler {
    final /* synthetic */ zzrl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrj(zzrl zzrlVar, Looper looper) {
        super(looper);
        this.zza = zzrlVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzrl.zza(this.zza, message);
    }
}
