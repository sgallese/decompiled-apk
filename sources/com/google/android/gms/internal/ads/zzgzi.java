package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgzi extends androidx.browser.customtabs.e {
    private final WeakReference zza;

    public zzgzi(zzbcs zzbcsVar) {
        this.zza = new WeakReference(zzbcsVar);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        zzbcs zzbcsVar = (zzbcs) this.zza.get();
        if (zzbcsVar != null) {
            zzbcsVar.zzc(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbcs zzbcsVar = (zzbcs) this.zza.get();
        if (zzbcsVar != null) {
            zzbcsVar.zzd();
        }
    }
}
