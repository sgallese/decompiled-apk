package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeru implements zzesj {
    private final zzbyf zza;
    private final zzfyo zzb;
    private final Context zzc;

    public zzeru(zzbyf zzbyfVar, zzfyo zzfyoVar, Context context) {
        this.zza = zzbyfVar;
        this.zzb = zzfyoVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzert
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeru.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzerv zzc() throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        Long l10;
        if (!this.zza.zzu(this.zzc)) {
            return new zzerv(null, null, null, null, null);
        }
        String zze = this.zza.zze(this.zzc);
        if (zze == null) {
            str = "";
        } else {
            str = zze;
        }
        String zzc = this.zza.zzc(this.zzc);
        if (zzc == null) {
            str2 = "";
        } else {
            str2 = zzc;
        }
        String zza = this.zza.zza(this.zzc);
        if (zza == null) {
            str3 = "";
        } else {
            str3 = zza;
        }
        String zzb = this.zza.zzb(this.zzc);
        if (zzb == null) {
            str4 = "";
        } else {
            str4 = zzb;
        }
        if ("TIME_OUT".equals(str2)) {
            l10 = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzag);
        } else {
            l10 = null;
        }
        return new zzerv(str, str2, str3, str4, l10);
    }
}
