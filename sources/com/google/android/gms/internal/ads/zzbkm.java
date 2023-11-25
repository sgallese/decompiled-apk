package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbkm implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcas zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkm(zzbkn zzbknVar, zzcas zzcasVar) {
        this.zza = zzcasVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
