package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzeaz implements zzfya {
    final /* synthetic */ zzffh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeaz(zzeba zzebaVar, zzffh zzffhVar) {
        this.zza = zzffhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzcaa.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            zzcaa.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
