package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzemp implements zzesj {
    private final zzesj zza;
    private final zzfca zzb;
    private final Context zzc;
    private final zzbzj zzd;

    public zzemp(zzeoj zzeojVar, zzfca zzfcaVar, Context context, zzbzj zzbzjVar) {
        this.zza = zzeojVar;
        this.zzb = zzfcaVar;
        this.zzc = context;
        this.zzd = zzbzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return zzfye.zzm(this.zza.zzb(), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return zzemp.this.zzc((zzeso) obj);
            }
        }, zzcan.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzemq zzc(zzeso zzesoVar) {
        String str;
        boolean z10;
        String str2;
        int i10;
        float f10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            str = zzqVar.zza;
            z10 = zzqVar.zzi;
        } else {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z13 = zzqVar2.zzi;
                if (!z13 && !z11) {
                    str = zzqVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (!z12) {
                        z12 = true;
                        z10 = true;
                    } else {
                        z12 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f11 = displayMetrics.density;
            int i13 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            str2 = this.zzd.zzh().zzm();
            i11 = i13;
            f10 = f11;
        } else {
            str2 = null;
            i10 = 0;
            f10 = 0.0f;
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z14 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i14 = zzqVar3.zze;
                    if (i14 == -1) {
                        if (f10 != 0.0f) {
                            i14 = (int) (zzqVar3.zzf / f10);
                        } else {
                            i14 = -1;
                        }
                    }
                    sb2.append(i14);
                    sb2.append("x");
                    int i15 = zzqVar3.zzb;
                    if (i15 == -2) {
                        if (f10 != 0.0f) {
                            i15 = (int) (zzqVar3.zzc / f10);
                        } else {
                            i15 = -2;
                        }
                    }
                    sb2.append(i15);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new zzemq(zzqVar, str, z10, sb2.toString(), f10, i11, i10, str2, this.zzb.zzp);
    }
}
