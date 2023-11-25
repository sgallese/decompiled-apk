package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzds extends zzdu {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzef zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzef zzefVar, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzefVar, true);
        this.zzg = zzefVar;
        this.zza = l10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z10;
        this.zzf = z11;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    final void zza() throws RemoteException {
        long longValue;
        zzcc zzccVar;
        Long l10 = this.zza;
        if (l10 == null) {
            longValue = this.zzh;
        } else {
            longValue = l10.longValue();
        }
        long j10 = longValue;
        zzccVar = this.zzg.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j10);
    }
}
