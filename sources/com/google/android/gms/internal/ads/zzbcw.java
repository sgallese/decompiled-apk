package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public class zzbcw {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbcw(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbcw zza(String str, double d10) {
        return new zzbcw(str, Double.valueOf(d10), 3);
    }

    public static zzbcw zzb(String str, long j10) {
        return new zzbcw(str, Long.valueOf(j10), 2);
    }

    public static zzbcw zzc(String str, String str2) {
        return new zzbcw(str, str2, 4);
    }

    public static zzbcw zzd(String str, boolean z10) {
        return new zzbcw(str, Boolean.valueOf(z10), 1);
    }

    public final Object zze() {
        zzbdz zza = zzbeb.zza();
        if (zza == null) {
            if (zzbeb.zzb() != null) {
                zzbeb.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
