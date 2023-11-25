package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzzk {
    private final zzyo zza = new zzyo();
    private final zzzg zzb;
    private final zzzj zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzzk(Context context) {
        zzzg zzzgVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i10 = zzfk.zza;
            zzzgVar = zzzi.zzc(applicationContext);
            if (zzzgVar == null) {
                zzzgVar = zzzh.zzc(applicationContext);
            }
        } else {
            zzzgVar = null;
        }
        this.zzb = zzzgVar;
        this.zzc = zzzgVar != null ? zzzj.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzzk zzzkVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzzkVar.zzk = refreshRate;
            zzzkVar.zzl = (refreshRate * 80) / 100;
            return;
        }
        zzes.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzzkVar.zzk = -9223372036854775807L;
        zzzkVar.zzl = -9223372036854775807L;
    }

    private final void zzk() {
        Surface surface;
        if (zzfk.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE && this.zzh != 0.0f) {
            this.zzh = 0.0f;
            zzzf.zza(surface, 0.0f);
        }
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (java.lang.Math.abs(r0 - r10.zzg) >= r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r10.zza.zzb() >= 30) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r3 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzm() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzfk.zza
            r1 = 30
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r10.zze
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            com.google.android.gms.internal.ads.zzyo r0 = r10.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzyo r0 = r10.zza
            float r0 = r0.zza()
            goto L1c
        L1a:
            float r0 = r10.zzf
        L1c:
            float r2 = r10.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzyo r1 = r10.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzyo r1 = r10.zza
            long r6 = r1.zzd()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r10.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r6 != 0) goto L68
            com.google.android.gms.internal.ads.zzyo r2 = r10.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r10.zzg = r0
            r10.zzn(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzk.zzm():void");
    }

    private final void zzn(boolean z10) {
        Surface surface;
        if (zzfk.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE) {
            float f10 = 0.0f;
            if (this.zzd) {
                float f11 = this.zzg;
                if (f11 != -1.0f) {
                    f10 = this.zzi * f11;
                }
            }
            if (!z10 && this.zzh == f10) {
                return;
            }
            this.zzh = f10;
            zzzf.zza(surface, f10);
        }
    }

    public final long zza(long j10) {
        long j11;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j12 = this.zzq + (((float) (zzc * (this.zzm - this.zzp))) / this.zzi);
            if (Math.abs(j10 - j12) > 20000000) {
                zzl();
            } else {
                j10 = j12;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j10;
        zzzj zzzjVar = this.zzc;
        if (zzzjVar != null && this.zzk != -9223372036854775807L) {
            long j13 = zzzjVar.zza;
            if (j13 == -9223372036854775807L) {
                return j10;
            }
            long j14 = this.zzk;
            long j15 = j13 + (((j10 - j13) / j14) * j14);
            if (j10 <= j15) {
                j11 = j15 - j14;
            } else {
                j15 = j14 + j15;
                j11 = j15;
            }
            long j16 = this.zzl;
            if (j15 - j10 >= j10 - j11) {
                j15 = j11;
            }
            return j15 - j16;
        }
        return j10;
    }

    public final void zzc(float f10) {
        this.zzf = f10;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzp = j11;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j10 * 1000);
        zzm();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzzj zzzjVar = this.zzc;
            zzzjVar.getClass();
            zzzjVar.zzb();
            this.zzb.zzb(new zzze(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzzg zzzgVar = this.zzb;
        if (zzzgVar != null) {
            zzzgVar.zza();
            zzzj zzzjVar = this.zzc;
            zzzjVar.getClass();
            zzzjVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzzc)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i10) {
        if (this.zzj == i10) {
            return;
        }
        this.zzj = i10;
        zzn(true);
    }
}
