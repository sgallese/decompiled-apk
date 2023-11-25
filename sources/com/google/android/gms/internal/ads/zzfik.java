package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfik {
    private final Context zza;
    private final Executor zzb;
    private final zzcaf zzc;
    private final zzfhu zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfik(Context context, Executor executor, zzcaf zzcafVar, zzfhu zzfhuVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcafVar;
        this.zzd = zzfhuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, zzfhr zzfhrVar) {
        zzfhg zza = zzfhf.zza(this.zza, 14);
        zza.zzh();
        zza.zzf(this.zzc.zza(str));
        if (zzfhrVar == null) {
            this.zzd.zzb(zza.zzl());
            return;
        }
        zzfhrVar.zza(zza);
        zzfhrVar.zzg();
    }

    public final void zzc(final String str, final zzfhr zzfhrVar) {
        if (zzfhu.zza() && ((Boolean) zzbdd.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfij
                @Override // java.lang.Runnable
                public final void run() {
                    zzfik.this.zzb(str, zzfhrVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfii
                @Override // java.lang.Runnable
                public final void run() {
                    zzfik.this.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
