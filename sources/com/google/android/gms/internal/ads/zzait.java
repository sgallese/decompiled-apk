package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzait implements zzaio {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzakd zzb;
    private final zzfb zzc;
    private final boolean[] zzd;
    private final zzair zze;
    private final zzajd zzf;
    private zzais zzg;
    private long zzh;
    private String zzi;
    private zzace zzj;
    private boolean zzk;
    private long zzl;

    public zzait() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        int i10;
        int i11;
        float f10;
        float f11;
        zzdy.zzb(this.zzg);
        zzdy.zzb(this.zzj);
        int zzc = zzfbVar.zzc();
        int zzd = zzfbVar.zzd();
        byte[] zzI = zzfbVar.zzI();
        this.zzh += zzfbVar.zza();
        this.zzj.zzq(zzfbVar, zzfbVar.zza());
        while (true) {
            int zza2 = zzfy.zza(zzI, zzc, zzd, this.zzd);
            if (zza2 == zzd) {
                break;
            }
            int i12 = zza2 + 3;
            int i13 = zzfbVar.zzI()[i12] & 255;
            int i14 = zza2 - zzc;
            if (!this.zzk) {
                if (i14 > 0) {
                    this.zze.zza(zzI, zzc, zza2);
                }
                if (i14 < 0) {
                    i11 = -i14;
                } else {
                    i11 = 0;
                }
                if (this.zze.zzc(i13, i11)) {
                    zzace zzaceVar = this.zzj;
                    zzair zzairVar = this.zze;
                    int i15 = zzairVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzairVar.zzc, zzairVar.zza);
                    zzfa zzfaVar = new zzfa(copyOf, copyOf.length);
                    zzfaVar.zzm(i15);
                    zzfaVar.zzm(4);
                    zzfaVar.zzk();
                    zzfaVar.zzl(8);
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(4);
                        zzfaVar.zzl(3);
                    }
                    int zzd2 = zzfaVar.zzd(4);
                    if (zzd2 == 15) {
                        int zzd3 = zzfaVar.zzd(8);
                        int zzd4 = zzfaVar.zzd(8);
                        if (zzd4 == 0) {
                            zzes.zzf("H263Reader", "Invalid aspect ratio");
                            f11 = 1.0f;
                        } else {
                            f10 = zzd3 / zzd4;
                            f11 = f10;
                        }
                    } else if (zzd2 < 7) {
                        f10 = zza[zzd2];
                        f11 = f10;
                    } else {
                        zzes.zzf("H263Reader", "Invalid aspect ratio");
                        f11 = 1.0f;
                    }
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(2);
                        zzfaVar.zzl(1);
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(3);
                            zzfaVar.zzl(11);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                        }
                    }
                    if (zzfaVar.zzd(2) != 0) {
                        zzes.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzfaVar.zzk();
                    int zzd5 = zzfaVar.zzd(16);
                    zzfaVar.zzk();
                    if (zzfaVar.zzn()) {
                        if (zzd5 == 0) {
                            zzes.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i16 = zzd5 - 1;
                            int i17 = 0;
                            while (i16 > 0) {
                                i16 >>= 1;
                                i17++;
                            }
                            zzfaVar.zzl(i17);
                        }
                    }
                    zzfaVar.zzk();
                    int zzd6 = zzfaVar.zzd(13);
                    zzfaVar.zzk();
                    int zzd7 = zzfaVar.zzd(13);
                    zzfaVar.zzk();
                    zzfaVar.zzk();
                    zzak zzakVar = new zzak();
                    zzakVar.zzH(str);
                    zzakVar.zzS("video/mp4v-es");
                    zzakVar.zzX(zzd6);
                    zzakVar.zzF(zzd7);
                    zzakVar.zzP(f11);
                    zzakVar.zzI(Collections.singletonList(copyOf));
                    zzaceVar.zzk(zzakVar.zzY());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzI, zzc, zza2);
            zzajd zzajdVar = this.zzf;
            if (i14 > 0) {
                zzajdVar.zza(zzI, zzc, zza2);
                i10 = 0;
            } else {
                i10 = -i14;
            }
            if (this.zzf.zzd(i10)) {
                zzajd zzajdVar2 = this.zzf;
                int zzb = zzfy.zzb(zzajdVar2.zza, zzajdVar2.zzb);
                zzfb zzfbVar2 = this.zzc;
                int i18 = zzfk.zza;
                zzfbVar2.zzE(this.zzf.zza, zzb);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i13 == 178) {
                if (zzfbVar.zzI()[zza2 + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i13 = 178;
            }
            int i19 = zzd - zza2;
            this.zzg.zzb(this.zzh - i19, i19, this.zzk);
            this.zzg.zzc(i13, this.zzl);
            zzc = i12;
        }
        if (!this.zzk) {
            this.zze.zza(zzI, zzc, zzd);
        }
        this.zzg.zza(zzI, zzc, zzd);
        this.zzf.zza(zzI, zzc, zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzi = zzakaVar.zzb();
        zzace zzv = zzabeVar.zzv(zzakaVar.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzais(zzv);
        this.zzb.zzb(zzabeVar, zzakaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
        zzdy.zzb(this.zzg);
        if (z10) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        zzfy.zzf(this.zzd);
        this.zze.zzb();
        zzais zzaisVar = this.zzg;
        if (zzaisVar != null) {
            zzaisVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzait(zzakd zzakdVar) {
        this.zzb = zzakdVar;
        this.zzd = new boolean[4];
        this.zze = new zzair(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzajd(178, 128);
        this.zzc = new zzfb();
    }
}
