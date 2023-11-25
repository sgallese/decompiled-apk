package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzoa {
    final /* synthetic */ zzob zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzts zze;
    private boolean zzf;
    private boolean zzg;

    public zzoa(zzob zzobVar, String str, int i10, zzts zztsVar) {
        long j10;
        this.zza = zzobVar;
        this.zzb = str;
        this.zzc = i10;
        if (zztsVar == null) {
            j10 = -1;
        } else {
            j10 = zztsVar.zzd;
        }
        this.zzd = j10;
        if (zztsVar != null && zztsVar.zzb()) {
            this.zze = zztsVar;
        }
    }

    public final void zzg(int i10, zzts zztsVar) {
        if (this.zzd == -1 && i10 == this.zzc && zztsVar != null && zztsVar.zzd >= zzob.zza(this.zza)) {
            this.zzd = zztsVar.zzd;
        }
    }

    public final boolean zzj(int i10, zzts zztsVar) {
        if (zztsVar == null) {
            if (i10 == this.zzc) {
                return true;
            }
            return false;
        }
        zzts zztsVar2 = this.zze;
        if (zztsVar2 == null) {
            if (!zztsVar.zzb() && zztsVar.zzd == this.zzd) {
                return true;
            }
            return false;
        } else if (zztsVar.zzd == zztsVar2.zzd && zztsVar.zzb == zztsVar2.zzb && zztsVar.zzc == zztsVar2.zzc) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean zzk(zzly zzlyVar) {
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar == null) {
            if (this.zzc != zzlyVar.zzc) {
                return true;
            }
            return false;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        if (zztsVar.zzd > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza = zzlyVar.zzb.zza(zztsVar.zza);
        int zza2 = zzlyVar.zzb.zza(this.zze.zza);
        zzts zztsVar2 = zzlyVar.zzd;
        if (zztsVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (zztsVar2.zzb()) {
            zzts zztsVar3 = zzlyVar.zzd;
            int i10 = zztsVar3.zzb;
            int i11 = zztsVar3.zzc;
            zzts zztsVar4 = this.zze;
            int i12 = zztsVar4.zzb;
            if (i10 > i12) {
                return true;
            }
            if (i10 == i12 && i11 > zztsVar4.zzc) {
                return true;
            }
            return false;
        }
        int i13 = zzlyVar.zzd.zze;
        if (i13 == -1 || i13 > this.zze.zzb) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 < r8.zzc()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcw r7, com.google.android.gms.internal.ads.zzcw r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = -1
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzob r1 = r6.zza
            com.google.android.gms.internal.ads.zzcv r1 = com.google.android.gms.internal.ads.zzob.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzob r0 = r6.zza
            com.google.android.gms.internal.ads.zzcv r0 = com.google.android.gms.internal.ads.zzob.zzc(r0)
            int r0 = r0.zzp
        L26:
            com.google.android.gms.internal.ads.zzob r1 = r6.zza
            com.google.android.gms.internal.ads.zzcv r1 = com.google.android.gms.internal.ads.zzob.zzc(r1)
            int r1 = r1.zzq
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzob r7 = r6.zza
            com.google.android.gms.internal.ads.zzct r7 = com.google.android.gms.internal.ads.zzob.zzb(r7)
            com.google.android.gms.internal.ads.zzct r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzts r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoa.zzl(com.google.android.gms.internal.ads.zzcw, com.google.android.gms.internal.ads.zzcw):boolean");
    }
}
