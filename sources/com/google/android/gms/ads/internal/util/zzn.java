package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.zzbcq;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzgzh;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzn implements zzbcq {
    final /* synthetic */ zzbcs zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzs zzsVar, zzbcs zzbcsVar, Context context, Uri uri) {
        this.zza = zzbcsVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbcq
    public final void zza() {
        androidx.browser.customtabs.d a10 = new d.a(this.zza.zza()).a();
        a10.f1758a.setPackage(zzgzh.zza(this.zzb));
        a10.a(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
