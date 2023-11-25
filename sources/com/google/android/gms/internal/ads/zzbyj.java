package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbyj implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyk zza;
    private final String zzb;

    public zzbyj(zzbyk zzbykVar, String str) {
        this.zza = zzbykVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbyi> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbyi zzbyiVar : list) {
                zzbyiVar.zza.zzb(zzbyiVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
