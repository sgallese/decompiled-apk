package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzjm implements ListenerHolder.Notifier {
    final /* synthetic */ zzgp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjm(zzgp zzgpVar) {
        this.zza = zzgpVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((MessageApi.MessageListener) obj).onMessageReceived(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
