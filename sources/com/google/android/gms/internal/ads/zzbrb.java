package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbrb implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrb(zzbrc zzbrcVar) {
        this.zza = zzbrcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("User canceled the download.");
    }
}
