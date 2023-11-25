package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzzh implements zzzg {
    private final WindowManager zza;

    private zzzh(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzzg zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzzh(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzb(zzze zzzeVar) {
        zzzk.zzb(zzzeVar.zza, this.zza.getDefaultDisplay());
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zza() {
    }
}
