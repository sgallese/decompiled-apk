package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfdo implements zzfdn {
    private final ConcurrentHashMap zza;
    private final zzfdu zzb;
    private final zzfdq zzc = new zzfdq();

    public zzfdo(zzfdu zzfduVar) {
        this.zza = new ConcurrentHashMap(zzfduVar.zzd);
        this.zzb = zzfduVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfdu> creator = zzfdu.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgk)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.zzb.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfdx) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfdm) entry.getValue()).zzb(); i11++) {
                    sb2.append("[O]");
                }
                for (int zzb = ((zzfdm) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfdm) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < this.zzb.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            zzcaa.zze(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final zzfdu zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized zzfdw zzb(zzfdx zzfdxVar) {
        zzfdw zzfdwVar;
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        if (zzfdmVar != null) {
            zzfdwVar = zzfdmVar.zze();
            if (zzfdwVar == null) {
                this.zzc.zze();
            }
            zzfek zzf = zzfdmVar.zzf();
            if (zzfdwVar != null) {
                zzaxt zza = zzaxz.zza();
                zzaxr zza2 = zzaxs.zza();
                zza2.zzd(2);
                zzaxv zza3 = zzaxw.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzfdwVar.zza.zzb().zzc().zzi((zzaxz) zza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfdwVar = null;
        }
        return zzfdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    @Deprecated
    public final zzfdx zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfdy(zzlVar, str, new zzbur(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized boolean zzd(zzfdx zzfdxVar, zzfdw zzfdwVar) {
        boolean zzh;
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        zzfdwVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzfdmVar == null) {
            zzfdu zzfduVar = this.zzb;
            zzfdmVar = new zzfdm(zzfduVar.zzd, zzfduVar.zze * 1000);
            int size = this.zza.size();
            zzfdu zzfduVar2 = this.zzb;
            if (size == zzfduVar2.zzc) {
                int i10 = zzfduVar2.zzg;
                int i11 = i10 - 1;
                zzfdx zzfdxVar2 = null;
                if (i10 != 0) {
                    long j10 = Long.MAX_VALUE;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                int i12 = Integer.MAX_VALUE;
                                for (Map.Entry entry : this.zza.entrySet()) {
                                    if (((zzfdm) entry.getValue()).zza() < i12) {
                                        i12 = ((zzfdm) entry.getValue()).zza();
                                        zzfdxVar2 = (zzfdx) entry.getKey();
                                    }
                                }
                                if (zzfdxVar2 != null) {
                                    this.zza.remove(zzfdxVar2);
                                }
                            }
                        } else {
                            for (Map.Entry entry2 : this.zza.entrySet()) {
                                if (((zzfdm) entry2.getValue()).zzd() < j10) {
                                    j10 = ((zzfdm) entry2.getValue()).zzd();
                                    zzfdxVar2 = (zzfdx) entry2.getKey();
                                }
                            }
                            if (zzfdxVar2 != null) {
                                this.zza.remove(zzfdxVar2);
                            }
                        }
                    } else {
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfdm) entry3.getValue()).zzc() < j10) {
                                j10 = ((zzfdm) entry3.getValue()).zzc();
                                zzfdxVar2 = (zzfdx) entry3.getKey();
                            }
                        }
                        if (zzfdxVar2 != null) {
                            this.zza.remove(zzfdxVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfdxVar, zzfdmVar);
            this.zzc.zzd();
        }
        zzh = zzfdmVar.zzh(zzfdwVar);
        this.zzc.zzc();
        zzfdp zza = this.zzc.zza();
        zzfek zzf = zzfdmVar.zzf();
        zzaxt zza2 = zzaxz.zza();
        zzaxr zza3 = zzaxs.zza();
        zza3.zzd(2);
        zzaxx zza4 = zzaxy.zza();
        zza4.zza(zza.zza);
        zza4.zzb(zza.zzb);
        zza4.zzc(zzf.zzb);
        zza3.zzc(zza4);
        zza2.zza(zza3);
        zzfdwVar.zza.zzb().zzc().zzj((zzaxz) zza2.zzal());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized boolean zze(zzfdx zzfdxVar) {
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        if (zzfdmVar == null) {
            return true;
        }
        if (zzfdmVar.zzb() < this.zzb.zzd) {
            return true;
        }
        return false;
    }
}
