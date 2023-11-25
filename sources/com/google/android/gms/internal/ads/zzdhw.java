package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdhw implements zzfya {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdhx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhw(zzdhx zzdhxVar, View view) {
        this.zzb = zzdhxVar;
        this.zza = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzab(this.zza, (zzfip) obj);
    }
}
