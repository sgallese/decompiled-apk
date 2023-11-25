package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdmi implements zzbej {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdmj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmi(zzdmj zzdmjVar, String str) {
        this.zzb = zzdmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final void zzc() {
        zzdhx zzdhxVar;
        zzdhx zzdhxVar2;
        zzdmj zzdmjVar = this.zzb;
        zzdhxVar = zzdmjVar.zzd;
        if (zzdhxVar != null) {
            zzdhxVar2 = zzdmjVar.zzd;
            zzdhxVar2.zzD(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final void zzd(MotionEvent motionEvent) {
    }
}
