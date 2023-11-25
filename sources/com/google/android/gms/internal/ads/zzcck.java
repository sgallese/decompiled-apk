package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfoe;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcck {
    private final Context zza;
    private final String zzb;
    private final zzcag zzc;
    private final zzbcg zzd;
    private final zzbcj zze;
    private final com.google.android.gms.ads.internal.util.zzbf zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcbp zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzcck(Context context, zzcag zzcagVar, String str, zzbcj zzbcjVar, zzbcg zzbcgVar) {
        com.google.android.gms.ads.internal.util.zzbd zzbdVar = new com.google.android.gms.ads.internal.util.zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbdVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzcagVar;
        this.zzb = str;
        this.zze = zzbcjVar;
        this.zzd = zzbcgVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzA);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.zzg[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e10) {
                zzcaa.zzk("Unable to parse frame hash target time number.", e10);
                this.zzg[i10] = -1;
            }
        }
    }

    public final void zza(zzcbp zzcbpVar) {
        zzbcb.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcbpVar.zzj());
        this.zzn = zzcbpVar;
    }

    public final void zzb() {
        if (this.zzi && !this.zzj) {
            zzbcb.zza(this.zze, this.zzd, "vfr2");
            this.zzj = true;
        }
    }

    public final void zzc() {
        this.zzm = true;
        if (this.zzj && !this.zzk) {
            zzbcb.zza(this.zze, this.zzd, "vfp2");
            this.zzk = true;
        }
    }

    public final void zzd() {
        if (((Boolean) zzbdy.zza.zze()).booleanValue() && !this.zzo) {
            Bundle bundle = new Bundle();
            bundle.putString(TaskFormActivity.TASK_TYPE_KEY, "native-player-metrics");
            bundle.putString("request", this.zzb);
            bundle.putString("player", this.zzn.zzj());
            for (com.google.android.gms.ads.internal.util.zzbc zzbcVar : this.zzf.zza()) {
                String valueOf = String.valueOf(zzbcVar.zza);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbcVar.zze));
                String valueOf2 = String.valueOf(zzbcVar.zza);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbcVar.zzd));
            }
            int i10 = 0;
            while (true) {
                long[] jArr = this.zzg;
                if (i10 < jArr.length) {
                    String str = this.zzh[i10];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
                    }
                    i10++;
                } else {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    final Context context = this.zza;
                    final String str2 = this.zzc.zza;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    bundle.putString("device", com.google.android.gms.ads.internal.util.zzs.zzp());
                    zzbbj zzbbjVar = zzbbr.zza;
                    bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza()));
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    zzbzt.zzw(context, str2, "gmob-apps", bundle, true, new zzbzs() { // from class: com.google.android.gms.ads.internal.util.zzk
                        @Override // com.google.android.gms.internal.ads.zzbzs
                        public final boolean zza(String str3) {
                            Context context2 = context;
                            String str4 = str2;
                            zzfoe zzfoeVar = zzs.zza;
                            com.google.android.gms.ads.internal.zzt.zzp();
                            zzs.zzI(context2, str4, str3);
                            return true;
                        }
                    });
                    this.zzo = true;
                    return;
                }
            }
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcbp zzcbpVar) {
        long j10;
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbcb.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzt.zzB().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzB)).longValue();
        long zza = zzcbpVar.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i10 < strArr.length) {
                if (strArr[i10] == null && longValue > Math.abs(zza - this.zzg[i10])) {
                    String[] strArr2 = this.zzh;
                    int i11 = 8;
                    Bitmap bitmap = zzcbpVar.getBitmap(8, 8);
                    long j11 = 63;
                    long j12 = 0;
                    int i12 = 0;
                    while (i12 < i11) {
                        int i13 = 0;
                        while (i13 < i11) {
                            int pixel = bitmap.getPixel(i13, i12);
                            if (Color.blue(pixel) + Color.red(pixel) + Color.green(pixel) > 128) {
                                j10 = 1;
                            } else {
                                j10 = 0;
                            }
                            j12 |= j10 << ((int) j11);
                            j11--;
                            i13++;
                            i11 = 8;
                        }
                        i12++;
                        i11 = 8;
                    }
                    strArr2[i10] = String.format("%016X", Long.valueOf(j12));
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
