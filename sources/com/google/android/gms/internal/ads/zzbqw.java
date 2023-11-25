package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbqw implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbqx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqw(zzbqx zzbqxVar) {
        this.zza = zzbqxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("Operation denied by user.");
    }
}
