package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaqx;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzaqx zzaqxVar;
        zzaqx zzaqxVar2;
        zzs zzsVar = this.zza;
        zzaqxVar = zzsVar.zzh;
        if (zzaqxVar != null) {
            zzaqxVar2 = zzsVar.zzh;
            zzaqxVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}
