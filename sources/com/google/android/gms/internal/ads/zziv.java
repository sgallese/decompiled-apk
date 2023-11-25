package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zziv {
    final Context zza;
    zzdz zzb;
    zzfry zzc;
    zzfry zzd;
    zzfry zze;
    zzfry zzf;
    zzfry zzg;
    zzfqw zzh;
    Looper zzi;
    zzk zzj;
    int zzk;
    boolean zzl;
    zzlr zzm;
    long zzn;
    long zzo;
    boolean zzp;
    boolean zzq;
    zzig zzr;

    public zziv(final Context context, zzcer zzcerVar) {
        zzip zzipVar = new zzip(zzcerVar);
        zziq zziqVar = new zziq(context);
        zzfry zzfryVar = new zzfry() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                return new zzxd(context);
            }
        };
        zzis zzisVar = new zzfry() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                return new zzih();
            }
        };
        zzit zzitVar = new zzit(context);
        zziu zziuVar = new zzfqw() { // from class: com.google.android.gms.internal.ads.zziu
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return new zzny((zzdz) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzipVar;
        this.zzd = zziqVar;
        this.zze = zzfryVar;
        this.zzf = zzisVar;
        this.zzg = zzitVar;
        this.zzh = zziuVar;
        this.zzi = zzfk.zzv();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzlr.zze;
        this.zzr = new zzig(0.97f, 1.03f, 1000L, 1.0E-7f, zzfk.zzp(20L), zzfk.zzp(500L), 0.999f, null);
        this.zzb = zzdz.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = true;
    }

    public static /* synthetic */ zztr zza(Context context) {
        return new zztf(context, new zzaaw());
    }
}
