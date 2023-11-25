package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcge extends com.google.android.gms.ads.internal.client.zzdp {
    private final zzccj zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzdt zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbge zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcge(zzccj zzccjVar, float f10, boolean z10, boolean z11) {
        this.zza = zzccjVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(final int i10, final int i11, final boolean z10, final boolean z11) {
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgd
            @Override // java.lang.Runnable
            public final void run() {
                zzcge.this.zzd(i10, i11, z10, z11);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgc
            @Override // java.lang.Runnable
            public final void run() {
                zzcge.this.zzr(hashMap);
            }
        });
    }

    public final void zzc(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi && f12 == this.zzk) {
                z11 = false;
            }
            this.zzi = f11;
            this.zzj = f10;
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z11) {
            try {
                zzbge zzbgeVar = this.zzn;
                if (zzbgeVar != null) {
                    zzbgeVar.zze();
                }
            } catch (RemoteException e10) {
                zzcaa.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzw(i11, i10, z12, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar2;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar3;
        synchronized (this.zzb) {
            boolean z17 = this.zzg;
            boolean z18 = false;
            if (!z17 && i11 == 1) {
                i11 = 1;
                i12 = 1;
                z12 = true;
            } else {
                i12 = i11;
                z12 = false;
            }
            if (i10 != i11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && i12 == 1) {
                z14 = true;
                i12 = 1;
            } else {
                z14 = false;
            }
            if (z13 && i12 == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z13 && i12 == 3) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z17 || z12) {
                z18 = true;
            }
            this.zzg = z18;
            if (z12) {
                try {
                    com.google.android.gms.ads.internal.client.zzdt zzdtVar4 = this.zzf;
                    if (zzdtVar4 != null) {
                        zzdtVar4.zzi();
                    }
                } catch (RemoteException e10) {
                    zzcaa.zzl("#007 Could not call remote method.", e10);
                }
            }
            if (z14 && (zzdtVar3 = this.zzf) != null) {
                zzdtVar3.zzh();
            }
            if (z15 && (zzdtVar2 = this.zzf) != null) {
                zzdtVar2.zzg();
            }
            if (z16) {
                com.google.android.gms.ads.internal.client.zzdt zzdtVar5 = this.zzf;
                if (zzdtVar5 != null) {
                    zzdtVar5.zze();
                }
                this.zza.zzw();
            }
            if (z10 != z11 && (zzdtVar = this.zzf) != null) {
                zzdtVar.zzf(z11);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final com.google.android.gms.ads.internal.client.zzdt zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        synchronized (this.zzb) {
            zzdtVar = this.zzf;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z10) {
        String str;
        if (true != z10) {
            str = "unmute";
        } else {
            str = "mute";
        }
        zzx(str, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        synchronized (this.zzb) {
            this.zzf = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z10;
        boolean zzp = zzp();
        synchronized (this.zzb) {
            z10 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        String str;
        String str2;
        String str3;
        boolean z10 = zzflVar.zza;
        boolean z11 = zzflVar.zzb;
        boolean z12 = zzflVar.zzc;
        synchronized (this.zzb) {
            this.zzl = z11;
            this.zzm = z12;
        }
        if (true != z10) {
            str = "0";
        } else {
            str = "1";
        }
        String str4 = str;
        if (true != z11) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        String str5 = str2;
        if (true != z12) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", str4, "customControlsRequested", str5, "clickToExpandRequested", str3));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbge zzbgeVar) {
        synchronized (this.zzb) {
            this.zzn = zzbgeVar;
        }
    }
}
