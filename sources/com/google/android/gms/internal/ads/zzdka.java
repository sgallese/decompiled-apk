package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdka implements zzfya {
    final /* synthetic */ zzdkb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdka(zzdkb zzdkbVar) {
        this.zza = zzdkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    /* renamed from: zzc  reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            this.zza.zzb((zzcfi) list.get(0));
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "omid native display exp");
        }
    }
}
