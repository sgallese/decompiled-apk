package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcfc implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfc(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.confirm();
    }
}