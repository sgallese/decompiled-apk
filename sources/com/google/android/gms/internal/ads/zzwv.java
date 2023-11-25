package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzwv implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzxd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwv(zzww zzwwVar, zzxd zzxdVar) {
        this.zza = zzxdVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzu();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzu();
    }
}
