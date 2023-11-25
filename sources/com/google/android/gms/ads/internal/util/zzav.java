package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzav implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzaw zzawVar, Context context, String str, boolean z10, boolean z11) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzH = zzs.zzH(this.zza);
        zzH.setMessage(this.zzb);
        if (this.zzc) {
            zzH.setTitle("Error");
        } else {
            zzH.setTitle("Info");
        }
        if (this.zzd) {
            zzH.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzH.setPositiveButton("Learn More", new zzau(this));
            zzH.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzH.create().show();
    }
}
