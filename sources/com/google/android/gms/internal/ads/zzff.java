package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzff implements zzei {
    private Message zza;
    private zzfg zzb;

    private zzff() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzff(zzfe zzfeVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfg.zzl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final zzff zzb(Message message, zzfg zzfgVar) {
        this.zza = message;
        this.zzb = zzfgVar;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
