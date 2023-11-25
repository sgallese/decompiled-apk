package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzebq implements zzfgf {
    private final zzebe zza;
    private final zzebi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebq(zzebe zzebeVar, zzebi zzebiVar) {
        this.zza = zzebeVar;
        this.zzb = zzebiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffyVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && zzffy.RENDERER == zzffyVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffyVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            return;
        }
        if (zzffy.RENDERER == zzffyVar) {
            this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
        } else if (zzffy.PRELOADED_LOADER != zzffyVar && zzffy.SERVER_TRANSACTION != zzffyVar) {
        } else {
            this.zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
            final zzebi zzebiVar = this.zzb;
            final long zzd = this.zza.zzd();
            zzebiVar.zza.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzebh
                @Override // com.google.android.gms.internal.ads.zzffh
                public final Object zza(Object obj) {
                    zzebi zzebiVar2 = zzebi.this;
                    long j10 = zzd;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    if (!zzebiVar2.zzf()) {
                        zzazm zzg = zzazn.zzg();
                        zzg.zzh(j10);
                        byte[] zzax = ((zzazn) zzg.zzal()).zzax();
                        zzebp.zzg(sQLiteDatabase, false, false);
                        zzebp.zzd(sQLiteDatabase, j10, zzax);
                        return null;
                    }
                    return null;
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && zzffy.RENDERER == zzffyVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str) {
    }
}
