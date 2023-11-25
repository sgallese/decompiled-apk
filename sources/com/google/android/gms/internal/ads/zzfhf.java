package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzfhf {
    public static zzfhg zza(Context context, int i10) {
        boolean booleanValue;
        if (zzfhu.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbdd.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbdd.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbdd.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbdd.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzfhi(context, i10);
            }
        }
        return new zzfid();
    }

    public static zzfhg zzb(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfhg zza = zza(context, i10);
        if (!(zza instanceof zzfhi)) {
            return zza;
        }
        zza.zzh();
        zza.zzm(i11);
        if (zzfhq.zze(zzlVar.zzp)) {
            zza.zze(zzlVar.zzp);
        }
        return zza;
    }
}
