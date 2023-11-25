package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbqy implements View.OnClickListener {
    final /* synthetic */ zzbqz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqy(zzbqz zzbqzVar) {
        this.zza = zzbqzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
