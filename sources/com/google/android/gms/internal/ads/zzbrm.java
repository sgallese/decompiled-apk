package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbrm extends zzbfz {
    final /* synthetic */ zzbrp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbrm(zzbrp zzbrpVar, zzbrl zzbrlVar) {
        this.zza = zzbrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze(zzbfq zzbfqVar, String str) {
        zzbrp zzbrpVar = this.zza;
        if (zzbrp.zzc(zzbrpVar) == null) {
            return;
        }
        zzbrp.zzc(zzbrpVar).onCustomClick(zzbrp.zze(zzbrpVar, zzbfqVar), str);
    }
}
