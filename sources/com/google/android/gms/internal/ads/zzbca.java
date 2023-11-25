package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzbca {
    public static final void zza(zzbbz zzbbzVar, zzbbx zzbbxVar) {
        if (zzbbxVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbbxVar.zzb())) {
                zzbbzVar.zzd(zzbbxVar.zza(), zzbbxVar.zzb(), zzbbxVar.zzc(), zzbbxVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
