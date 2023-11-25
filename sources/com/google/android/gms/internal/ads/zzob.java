package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzob implements zzof {
    public static final zzfry zza = new zzfry() { // from class: com.google.android.gms.internal.ads.zznz
        @Override // com.google.android.gms.internal.ads.zzfry
        public final Object zza() {
            String zzn;
            zzn = zzob.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzcv zzc;
    private final zzct zzd;
    private final HashMap zze;
    private final zzfry zzf;
    private zzoe zzg;
    private zzcw zzh;
    private String zzi;
    private long zzj;

    public zzob() {
        throw null;
    }

    public final long zzl() {
        long j10;
        long j11;
        zzoa zzoaVar = (zzoa) this.zze.get(this.zzi);
        if (zzoaVar != null) {
            j10 = zzoaVar.zzd;
            if (j10 != -1) {
                j11 = zzoaVar.zzd;
                return j11;
            }
        }
        return this.zzj + 1;
    }

    private final zzoa zzm(int i10, zzts zztsVar) {
        long j10;
        zzts zztsVar2;
        zzts zztsVar3;
        long j11 = Long.MAX_VALUE;
        zzoa zzoaVar = null;
        for (zzoa zzoaVar2 : this.zze.values()) {
            zzoaVar2.zzg(i10, zztsVar);
            if (zzoaVar2.zzj(i10, zztsVar)) {
                j10 = zzoaVar2.zzd;
                if (j10 != -1 && j10 >= j11) {
                    if (j10 == j11) {
                        int i11 = zzfk.zza;
                        zztsVar2 = zzoaVar.zze;
                        if (zztsVar2 != null) {
                            zztsVar3 = zzoaVar2.zze;
                            if (zztsVar3 != null) {
                                zzoaVar = zzoaVar2;
                            }
                        }
                    }
                } else {
                    zzoaVar = zzoaVar2;
                    j11 = j10;
                }
            }
        }
        if (zzoaVar == null) {
            String zzn = zzn();
            zzoa zzoaVar3 = new zzoa(this, zzn, i10, zztsVar);
            this.zze.put(zzn, zzoaVar3);
            return zzoaVar3;
        }
        return zzoaVar;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzoa zzoaVar) {
        long j10;
        long j11;
        j10 = zzoaVar.zzd;
        if (j10 != -1) {
            j11 = zzoaVar.zzd;
            this.zzj = j11;
        }
        this.zzi = null;
    }

    private final void zzp(zzly zzlyVar) {
        String str;
        long j10;
        zzts zztsVar;
        zzts zztsVar2;
        zzts zztsVar3;
        String unused;
        String unused2;
        if (zzlyVar.zzb.zzo()) {
            String str2 = this.zzi;
            if (str2 != null) {
                zzoa zzoaVar = (zzoa) this.zze.get(str2);
                zzoaVar.getClass();
                zzo(zzoaVar);
                return;
            }
            return;
        }
        zzoa zzoaVar2 = (zzoa) this.zze.get(this.zzi);
        zzoa zzm = zzm(zzlyVar.zzc, zzlyVar.zzd);
        str = zzm.zzb;
        this.zzi = str;
        zzi(zzlyVar);
        zzts zztsVar4 = zzlyVar.zzd;
        if (zztsVar4 != null && zztsVar4.zzb()) {
            if (zzoaVar2 != null) {
                j10 = zzoaVar2.zzd;
                if (j10 == zzlyVar.zzd.zzd) {
                    zztsVar = zzoaVar2.zze;
                    if (zztsVar != null) {
                        zztsVar2 = zzoaVar2.zze;
                        if (zztsVar2.zzb == zzlyVar.zzd.zzb) {
                            zztsVar3 = zzoaVar2.zze;
                            if (zztsVar3.zzc == zzlyVar.zzd.zzc) {
                                return;
                            }
                        }
                    }
                }
            }
            zzts zztsVar5 = zzlyVar.zzd;
            unused = zzm(zzlyVar.zzc, new zzts(zztsVar5.zza, zztsVar5.zzd)).zzb;
            unused2 = zzm.zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized String zzf(zzcw zzcwVar, zzts zztsVar) {
        String str;
        str = zzm(zzcwVar.zzn(zztsVar.zza, this.zzd).zzd, zztsVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized void zzg(zzly zzlyVar) {
        boolean z10;
        zzoe zzoeVar;
        String str;
        String str2 = this.zzi;
        if (str2 != null) {
            zzoa zzoaVar = (zzoa) this.zze.get(str2);
            zzoaVar.getClass();
            zzo(zzoaVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoa zzoaVar2 = (zzoa) it.next();
            it.remove();
            z10 = zzoaVar2.zzf;
            if (z10 && (zzoeVar = this.zzg) != null) {
                str = zzoaVar2.zzb;
                zzoeVar.zzd(zzlyVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zzh(zzoe zzoeVar) {
        this.zzg = zzoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized void zzi(zzly zzlyVar) {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        String str3;
        long j10;
        int i10;
        String unused;
        String unused2;
        this.zzg.getClass();
        if (zzlyVar.zzb.zzo()) {
            return;
        }
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar != null) {
            if (zztsVar.zzd < zzl()) {
                return;
            }
            zzoa zzoaVar = (zzoa) this.zze.get(this.zzi);
            if (zzoaVar != null) {
                j10 = zzoaVar.zzd;
                if (j10 == -1) {
                    i10 = zzoaVar.zzc;
                    if (i10 != zzlyVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzoa zzm = zzm(zzlyVar.zzc, zzlyVar.zzd);
        if (this.zzi == null) {
            str3 = zzm.zzb;
            this.zzi = str3;
        }
        zzts zztsVar2 = zzlyVar.zzd;
        if (zztsVar2 != null && zztsVar2.zzb()) {
            zzoa zzm2 = zzm(zzlyVar.zzc, new zzts(zztsVar2.zza, zztsVar2.zzd, zztsVar2.zzb));
            z12 = zzm2.zzf;
            if (!z12) {
                zzm2.zzf = true;
                zzlyVar.zzb.zzn(zzlyVar.zzd.zza, this.zzd);
                this.zzd.zzi(zzlyVar.zzd.zzb);
                Math.max(0L, zzfk.zzr(0L) + zzfk.zzr(0L));
                unused = zzm2.zzb;
            }
        }
        z10 = zzm.zzf;
        if (!z10) {
            zzm.zzf = true;
            unused2 = zzm.zzb;
        }
        str = zzm.zzb;
        if (str.equals(this.zzi)) {
            z11 = zzm.zzg;
            if (!z11) {
                zzm.zzg = true;
                zzoe zzoeVar = this.zzg;
                str2 = zzm.zzb;
                zzoeVar.zzc(zzlyVar, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized void zzj(zzly zzlyVar, int i10) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        this.zzg.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoa zzoaVar = (zzoa) it.next();
            if (zzoaVar.zzk(zzlyVar)) {
                it.remove();
                z10 = zzoaVar.zzf;
                if (z10) {
                    str = zzoaVar.zzb;
                    boolean equals = str.equals(this.zzi);
                    boolean z12 = false;
                    if (i10 == 0 && equals) {
                        z11 = zzoaVar.zzg;
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (equals) {
                        zzo(zzoaVar);
                    }
                    zzoe zzoeVar = this.zzg;
                    str2 = zzoaVar.zzb;
                    zzoeVar.zzd(zzlyVar, str2, z12);
                }
            }
        }
        zzp(zzlyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized void zzk(zzly zzlyVar) {
        boolean z10;
        String str;
        String str2;
        this.zzg.getClass();
        zzcw zzcwVar = this.zzh;
        this.zzh = zzlyVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoa zzoaVar = (zzoa) it.next();
            if (!zzoaVar.zzl(zzcwVar, this.zzh) || zzoaVar.zzk(zzlyVar)) {
                it.remove();
                z10 = zzoaVar.zzf;
                if (z10) {
                    str = zzoaVar.zzb;
                    if (str.equals(this.zzi)) {
                        zzo(zzoaVar);
                    }
                    zzoe zzoeVar = this.zzg;
                    str2 = zzoaVar.zzb;
                    zzoeVar.zzd(zzlyVar, str2, false);
                }
            }
        }
        zzp(zzlyVar);
    }

    public zzob(zzfry zzfryVar) {
        this.zzf = zzfryVar;
        this.zzc = new zzcv();
        this.zzd = new zzct();
        this.zze = new HashMap();
        this.zzh = zzcw.zza;
        this.zzj = -1L;
    }
}
