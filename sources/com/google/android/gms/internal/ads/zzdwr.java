package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdwr extends zzbui {
    final /* synthetic */ zzdws zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdwr(zzdws zzdwsVar) {
        this.zza = zzdwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zzd(zzazVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
