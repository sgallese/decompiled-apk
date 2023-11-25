package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcfm implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxb zza;
    final /* synthetic */ zzcfp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfm(zzcfp zzcfpVar, zzbxb zzbxbVar) {
        this.zzb = zzcfpVar;
        this.zza = zzbxbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
