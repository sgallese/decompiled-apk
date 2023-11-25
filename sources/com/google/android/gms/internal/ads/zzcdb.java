package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcdb extends zzcbp implements TextureView.SurfaceTextureListener, zzcbz {
    private final zzccj zzc;
    private final zzcck zzd;
    private final zzcci zze;
    private zzcbo zzf;
    private Surface zzg;
    private zzcca zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcch zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcdb(Context context, zzcck zzcckVar, zzccj zzccjVar, boolean z10, boolean z11, zzcci zzcciVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzccjVar;
        this.zzd = zzcckVar;
        this.zzn = z10;
        this.zze = zzcciVar;
        setSurfaceTextureListener(this);
        zzcckVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccw
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z10, Integer num) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null && !z10) {
            zzccaVar.zzP(num);
        } else if (this.zzi != null && this.zzg != null) {
            if (z10) {
                if (zzad()) {
                    zzccaVar.zzU();
                    zzY();
                } else {
                    zzcaa.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcdu zzp = this.zzc.zzp(this.zzi);
                if (zzp instanceof zzced) {
                    zzcca zza = ((zzced) zzp).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        zzcaa.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzp instanceof zzcea) {
                    zzcea zzceaVar = (zzcea) zzp;
                    String zzF = zzF();
                    ByteBuffer zzk = zzceaVar.zzk();
                    boolean zzl = zzceaVar.zzl();
                    String zzi = zzceaVar.zzi();
                    if (zzi == null) {
                        zzcaa.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzcca zzE = zzE(num);
                    this.zzh = zzE;
                    zzE.zzG(new Uri[]{Uri.parse(zzi)}, zzF, zzk, zzl);
                } else {
                    zzcaa.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i10 = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    uriArr[i10] = Uri.parse(strArr[i10]);
                    i10++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcca zzccaVar = this.zzh;
            if (zzccaVar != null) {
                zzccaVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z10) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            try {
                zzccaVar.zzS(surface, z10);
                return;
            } catch (IOException e10) {
                zzcaa.zzk("", e10);
                return;
            }
        }
        zzcaa.zzj("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i10, int i11) {
        float f10;
        if (i11 > 0) {
            f10 = i10 / i11;
        } else {
            f10 = 1.0f;
        }
        if (this.zzs != f10) {
            this.zzs = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        if (zzad() && this.zzl != 1) {
            return true;
        }
        return false;
    }

    private final boolean zzad() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null && zzccaVar.zzV() && !this.zzk) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzs;
        if (f10 != 0.0f && this.zzm == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcch zzcchVar = this.zzm;
        if (zzcchVar != null) {
            zzcchVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.zzn) {
            zzcch zzcchVar = new zzcch(getContext());
            this.zzm = zzcchVar;
            zzcchVar.zzd(surfaceTexture, i10, i11);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq != 0 && this.zzr != 0) {
            zzaa();
        } else {
            zzab(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccv
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcch zzcchVar = this.zzm;
        if (zzcchVar != null) {
            zzcchVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccz
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        zzcch zzcchVar = this.zzm;
        if (zzcchVar != null) {
            zzcchVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccp
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzO(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i10);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccy
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzQ(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzA(int i10) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzN(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzB(int i10) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzR(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z10 = false;
        if (this.zze.zzl && str2 != null && !str.equals(str2) && this.zzl == 4) {
            z10 = true;
        }
        this.zzi = str;
        zzW(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzD(int i10, int i11) {
        this.zzq = i10;
        this.zzr = i11;
        zzaa();
    }

    final zzcca zzE(Integer num) {
        zzcev zzcevVar = new zzcev(this.zzc.getContext(), this.zze, this.zzc, num);
        zzcaa.zzi("ExoPlayerAdapter initialized.");
        return zzcevVar;
    }

    final String zzF() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzc.getContext(), this.zzc.zzn().zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(String str) {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzH() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(boolean z10, long j10) {
        this.zzc.zzv(z10, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzK(String str) {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzN() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzi();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzO(int i10, int i11) {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzj(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            try {
                zzccaVar.zzT(zza, false);
                return;
            } catch (IOException e10) {
                zzcaa.zzk("", e10);
                return;
            }
        }
        zzcaa.zzj("Trying to set volume before player is initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ(int i10) {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.onWindowVisibilityChanged(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzR() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzS() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzb() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzf() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzg() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzh() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(final boolean z10, final long j10) {
        if (this.zzc != null) {
            zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccx
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdb.this.zzJ(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final String zzj() {
        String str;
        if (true != this.zzn) {
            str = "";
        } else {
            str = " spherical";
        }
        return "ExoPlayer/2".concat(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        zzcaa.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcco
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzG(zzT);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        zzcaa.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccr
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzK(zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzm(int i10) {
        if (this.zzl != i10) {
            this.zzl = i10;
            if (i10 != 3) {
                if (i10 == 4) {
                    if (this.zze.zza) {
                        zzX();
                    }
                    this.zzd.zze();
                    this.zzb.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcdb.this.zzH();
                        }
                    });
                    return;
                }
                return;
            }
            zzV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, com.google.android.gms.internal.ads.zzccm
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccs
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcct
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdb.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdb.this.zzS();
                }
            });
            return;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzq(int i10) {
        if (zzac()) {
            this.zzh.zzI(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzr(zzcbo zzcboVar) {
        this.zzf = zzcboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzu(float f10, float f11) {
        zzcch zzcchVar = this.zzm;
        if (zzcchVar != null) {
            zzcchVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcda
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final Integer zzw() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzx(int i10) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzJ(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzy(int i10) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzK(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzz(int i10) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzM(i10);
        }
    }
}
