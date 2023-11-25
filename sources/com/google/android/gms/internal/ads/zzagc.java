package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzagc implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaga
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzagc(0)};
        }
    };
    private static final zzaep zzb = new zzaep() { // from class: com.google.android.gms.internal.ads.zzagb
    };
    private final zzfb zzc;
    private final zzabu zzd;
    private final zzabq zze;
    private final zzabs zzf;
    private final zzace zzg;
    private zzabe zzh;
    private zzace zzi;
    private zzace zzj;
    private int zzk;
    private zzbz zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzage zzq;
    private boolean zzr;

    public zzagc() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzf(com.google.android.gms.internal.ads.zzabc r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zzf(com.google.android.gms.internal.ads.zzabc):int");
    }

    private final long zzg(long j10) {
        return this.zzm + ((j10 * 1000000) / this.zzd.zzd);
    }

    private final zzage zzh(zzabc zzabcVar, boolean z10) throws IOException {
        ((zzaar) zzabcVar).zzm(this.zzc.zzI(), 0, 4, false);
        this.zzc.zzG(0);
        this.zzd.zza(this.zzc.zzf());
        return new zzafx(zzabcVar.zzd(), zzabcVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i10, long j10) {
        if ((i10 & (-128000)) == (j10 & (-128000))) {
            return true;
        }
        return false;
    }

    private final boolean zzj(zzabc zzabcVar) throws IOException {
        zzage zzageVar = this.zzq;
        if (zzageVar != null) {
            long zzb2 = zzageVar.zzb();
            if (zzb2 != -1 && zzabcVar.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            if (!zzabcVar.zzm(this.zzc.zzI(), 0, 4, true)) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzabc zzabcVar, boolean z10) throws IOException {
        int i10;
        int i11;
        int zzb2;
        int i12;
        zzabcVar.zzj();
        if (zzabcVar.zzf() == 0) {
            zzbz zza2 = this.zzf.zza(zzabcVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i11 = (int) zzabcVar.zze();
            if (!z10) {
                ((zzaar) zzabcVar).zzo(i11, false);
            }
            i10 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (zzj(zzabcVar)) {
                if (i13 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.zzc.zzG(0);
                int zzf = this.zzc.zzf();
                if ((i10 != 0 && !zzi(zzf, i10)) || (zzb2 = zzabv.zzb(zzf)) == -1) {
                    if (true != z10) {
                        i12 = 131072;
                    } else {
                        i12 = 32768;
                    }
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw zzcd.zza("Searched too many bytes.", null);
                    }
                    if (z10) {
                        zzabcVar.zzj();
                        ((zzaar) zzabcVar).zzl(i11 + i15, false);
                    } else {
                        ((zzaar) zzabcVar).zzo(1, false);
                    }
                    i14 = i15;
                    i10 = 0;
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 1) {
                        this.zzd.zza(zzf);
                        i10 = zzf;
                    } else if (i13 == 4) {
                        break;
                    }
                    ((zzaar) zzabcVar).zzl(zzb2 - 4, false);
                }
            }
        }
        if (z10) {
            ((zzaar) zzabcVar).zzo(i11 + i14, false);
        } else {
            zzabcVar.zzj();
        }
        this.zzk = i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        zzdy.zzb(this.zzi);
        int i10 = zzfk.zza;
        int zzf = zzf(zzabcVar);
        if (zzf == -1 && (this.zzq instanceof zzafy)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzafy zzafyVar = (zzafy) this.zzq;
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzh = zzabeVar;
        zzace zzv = zzabeVar.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzage zzageVar = this.zzq;
        if (!(zzageVar instanceof zzafy)) {
            return;
        }
        zzafy zzafyVar = (zzafy) zzageVar;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return zzk(zzabcVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzagc(int i10) {
        this.zzc = new zzfb(10);
        this.zzd = new zzabu();
        this.zze = new zzabq();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzabs();
        zzaba zzabaVar = new zzaba();
        this.zzg = zzabaVar;
        this.zzj = zzabaVar;
    }
}
