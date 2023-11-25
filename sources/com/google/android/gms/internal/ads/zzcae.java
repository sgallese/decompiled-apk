package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcae {
    public static Context zza(Context context) throws zzcad {
        return zzc(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, zzcac zzcacVar) throws zzcad {
        try {
            return zzcacVar.zza(zzc(context).instantiate(str));
        } catch (Exception e10) {
            throw new zzcad(e10);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzcad {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e10) {
            throw new zzcad(e10);
        }
    }
}
