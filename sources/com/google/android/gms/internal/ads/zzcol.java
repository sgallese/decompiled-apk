package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcol implements zzfya {
    final /* synthetic */ zzcon zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcol(zzcon zzconVar) {
        this.zza = zzconVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfck zzfckVar;
        zzfig zzfigVar;
        zzfbr zzfbrVar;
        zzfbe zzfbeVar;
        zzfbe zzfbeVar2;
        Context context;
        String str = (String) obj;
        zzcon zzconVar = this.zza;
        zzfckVar = zzconVar.zzh;
        zzfigVar = zzconVar.zzg;
        zzfbrVar = zzconVar.zze;
        zzfbeVar = zzconVar.zzf;
        zzfbeVar2 = zzconVar.zzf;
        List zzd = zzfigVar.zzd(zzfbrVar, zzfbeVar, false, "", str, zzfbeVar2.zzc);
        zzbzj zzo = com.google.android.gms.ads.internal.zzt.zzo();
        context = this.zza.zza;
        boolean zzx = zzo.zzx(context);
        int i10 = 1;
        if (true == zzx) {
            i10 = 2;
        }
        zzfckVar.zzc(zzd, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
    }
}
