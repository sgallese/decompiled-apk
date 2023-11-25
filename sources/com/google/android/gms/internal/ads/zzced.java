package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzced extends zzcdu implements zzcbz {
    public static final /* synthetic */ int zzd = 0;
    private zzcca zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcdm zzi;
    private long zzj;
    private long zzk;

    public zzced(zzccj zzccjVar, zzcci zzcciVar) {
        super(zzccjVar);
        zzcev zzcevVar = new zzcev(zzccjVar.getContext(), zzcciVar, (zzccj) this.zzc.get(), null);
        zzcaa.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcevVar;
        zzcevVar.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzbzt.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j10) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcec
            @Override // java.lang.Runnable
            public final void run() {
                zzced.this.zzb();
            }
        }, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdu, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcca zzccaVar = this.zze;
        if (zzccaVar != null) {
            zzccaVar.zzL(null);
            this.zze.zzH();
        }
    }

    public final zzcca zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcca zzccaVar = this.zze;
        this.zze = null;
        return zzccaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzced, com.google.android.gms.internal.ads.zzcdu] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzced] */
    /* JADX WARN: Type inference failed for: r2v31 */
    public final /* synthetic */ void zzb() {
        String str;
        zzced zzcedVar;
        zzced zzcedVar2;
        zzbbp zzc;
        long longValue;
        long intValue;
        zzced zzcedVar3;
        long j10;
        long j11;
        String str2;
        long j12;
        boolean z10;
        long j13;
        long j14;
        long j15;
        String zzc2 = zzc(this.zzf);
        String str3 = "error";
        try {
            zzbbj zzbbjVar = zzbbr.zzx;
            zzc = com.google.android.gms.ads.internal.client.zzba.zzc();
            longValue = ((Long) zzc.zzb(zzbbjVar)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzw)).intValue();
            zzcedVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
            str = zzc2;
            zzcedVar = this;
        }
        synchronized (this) {
            try {
                int i10 = ((com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (i10 <= 0) {
                    try {
                        if (!this.zzg) {
                            if (this.zzh) {
                                zzcedVar2 = this;
                            } else if (this.zze.zzV()) {
                                long zzz = this.zze.zzz();
                                if (zzz > 0) {
                                    long zzv = this.zze.zzv();
                                    if (zzv != this.zzk) {
                                        if (zzv > 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        try {
                                            String str4 = this.zzf;
                                            if (zzcedVar != 0) {
                                                j13 = this.zze.zzA();
                                            } else {
                                                j13 = -1;
                                            }
                                            if (zzcedVar != 0) {
                                                j14 = this.zze.zzx();
                                            } else {
                                                j14 = -1;
                                            }
                                            if (zzcedVar != 0) {
                                                j15 = this.zze.zzB();
                                            } else {
                                                j15 = -1;
                                            }
                                            long j16 = j13;
                                            j11 = intValue;
                                            str2 = zzc2;
                                            try {
                                                zzo(str4, zzc2, zzv, zzz, z10, j16, j14, j15, zzcca.zzs(), zzcca.zzu());
                                                zzcedVar = this;
                                                j10 = zzv;
                                                try {
                                                    zzcedVar.zzk = j10;
                                                    j12 = zzz;
                                                    zzcedVar = zzcedVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str = str2;
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzcedVar = this;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str2 = zzc2;
                                            zzcedVar = this;
                                        }
                                    } else {
                                        j10 = zzv;
                                        j11 = intValue;
                                        str2 = zzc2;
                                        zzcedVar = this;
                                        j12 = zzz;
                                    }
                                    if (j10 >= j12) {
                                        zzcedVar.zzj(zzcedVar.zzf, str2, j12);
                                        zzcedVar2 = zzcedVar;
                                    } else {
                                        long zzw = zzcedVar.zze.zzw();
                                        zzcedVar3 = zzcedVar;
                                        if (zzw >= j11) {
                                            zzcedVar3 = zzcedVar;
                                            if (j10 > 0) {
                                                zzcedVar2 = zzcedVar;
                                            }
                                        }
                                    }
                                } else {
                                    zzcedVar3 = this;
                                }
                                zzcedVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzy)).longValue());
                                return;
                            } else {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcedVar2.zzi);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = i10;
                    }
                } else {
                    str = zzc2;
                    zzcedVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc2;
                zzcedVar = this;
            }
            try {
                throw th;
            } catch (Exception e11) {
                e = e11;
                String str5 = str3;
                zzcaa.zzj("Failed to preload url " + zzcedVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcedVar.zzg(zzcedVar.zzf, str, str5, zzd(str5, e));
                zzcedVar2 = zzcedVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcedVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(final boolean z10, final long j10) {
        final zzccj zzccjVar = (zzccj) this.zzc.get();
        if (zzccjVar != null) {
            zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceb
                @Override // java.lang.Runnable
                public final void run() {
                    zzccj.this.zzv(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzk(String str, Exception exc) {
        zzcaa.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzl(String str, Exception exc) {
        zzcaa.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzp(int i10) {
        this.zze.zzJ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzq(int i10) {
        this.zze.zzK(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzr(int i10) {
        this.zze.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzs(int i10) {
        this.zze.zzN(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcdu] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzu(String str, String[] strArr) {
        String str2;
        String str3;
        zzced zzcedVar;
        long j10;
        long j11;
        long j12;
        ?? r12;
        long j13;
        String str4;
        long j14;
        long j15;
        boolean z10;
        long j16;
        long j17;
        long j18;
        zzced zzcedVar2 = this;
        String str5 = str;
        zzcedVar2.zzf = str5;
        String str6 = "error";
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            zzcedVar2.zze.zzF(uriArr, zzcedVar2.zzb);
            zzccj zzccjVar = (zzccj) zzcedVar2.zzc.get();
            if (zzccjVar != null) {
                zzccjVar.zzt(zzc, zzcedVar2);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzy)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzx)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzw)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue();
            long j19 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.currentTimeMillis() - currentTimeMillis <= longValue2) {
                            if (!zzcedVar2.zzg) {
                                if (zzcedVar2.zzh) {
                                    break;
                                } else if (zzcedVar2.zze.zzV()) {
                                    long zzz = zzcedVar2.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = zzcedVar2.zze.zzv();
                                        if (zzv != j19) {
                                            if (zzv > 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (booleanValue) {
                                                j16 = zzcedVar2.zze.zzA();
                                            } else {
                                                j16 = -1;
                                            }
                                            if (booleanValue) {
                                                j17 = zzcedVar2.zze.zzx();
                                            } else {
                                                j17 = -1;
                                            }
                                            if (booleanValue) {
                                                j18 = zzcedVar2.zze.zzB();
                                            } else {
                                                j18 = -1;
                                            }
                                            try {
                                                j10 = intValue;
                                                long j20 = zzz;
                                                j11 = longValue2;
                                                j13 = longValue;
                                                str4 = zzc;
                                                try {
                                                    zzo(str, zzc, zzv, j20, z10, j16, j17, j18, zzcca.zzs(), zzcca.zzu());
                                                    j15 = zzv;
                                                    j14 = zzz;
                                                    str2 = j20;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    zzcedVar = this;
                                                    str2 = str;
                                                    str3 = str4;
                                                    try {
                                                        throw th;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        String str7 = str6;
                                                        zzcaa.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                                        com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                                                        release();
                                                        zzcedVar.zzg(str2, str3, str7, zzd(str7, e));
                                                        return false;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str4 = zzc;
                                            }
                                        } else {
                                            j10 = intValue;
                                            j11 = longValue2;
                                            j13 = longValue;
                                            str4 = zzc;
                                            j14 = zzz;
                                            j15 = j19;
                                            str2 = intValue;
                                        }
                                        zzcedVar = (zzv > j14 ? 1 : (zzv == j14 ? 0 : -1));
                                        if (zzcedVar >= 0) {
                                            zzj(str, str4, j14);
                                        } else {
                                            try {
                                                zzced zzcedVar3 = this;
                                                str2 = str;
                                                str3 = str4;
                                                if (zzcedVar3.zze.zzw() < j10 || zzv <= 0) {
                                                    j12 = j13;
                                                    r12 = j15;
                                                    zzcedVar = zzcedVar3;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        }
                                    } else {
                                        j10 = intValue;
                                        j11 = longValue2;
                                        str2 = str5;
                                        str3 = zzc;
                                        zzcedVar = zzcedVar2;
                                        j12 = longValue;
                                        r12 = j19;
                                    }
                                    try {
                                        try {
                                            zzcedVar.wait(j12);
                                        } catch (InterruptedException unused) {
                                            throw new IOException("Wait interrupted.");
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str6 = r12;
                                        throw th;
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzc;
                        zzcedVar = zzcedVar2;
                    }
                }
                longValue = j12;
                zzcedVar2 = zzcedVar;
                str5 = str2;
                zzc = str3;
                intValue = j10;
                longValue2 = j11;
                j19 = r12;
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            str2 = str5;
            str3 = zzc;
            zzcedVar = zzcedVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv() {
        zzcaa.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzw(String str, String[] strArr, zzcdm zzcdmVar) {
        this.zzf = str;
        this.zzi = zzcdmVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzccj zzccjVar = (zzccj) this.zzc.get();
            if (zzccjVar != null) {
                zzccjVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e10) {
            zzcaa.zzj("Failed to preload url " + str + " Exception: " + e10.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzm(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzD(int i10, int i11) {
    }
}
