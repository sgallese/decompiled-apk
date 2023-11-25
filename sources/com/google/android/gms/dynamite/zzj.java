package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
/* loaded from: classes.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int zzb;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int zza = iVersions.zza(context, str);
        selectionResult.localVersion = zza;
        int i10 = 0;
        if (zza != 0) {
            zzb = iVersions.zzb(context, str, false);
            selectionResult.remoteVersion = zzb;
        } else {
            zzb = iVersions.zzb(context, str, true);
            selectionResult.remoteVersion = zzb;
        }
        int i11 = selectionResult.localVersion;
        if (i11 == 0) {
            if (zzb == 0) {
                selectionResult.selection = 0;
                return selectionResult;
            }
        } else {
            i10 = i11;
        }
        if (i10 >= zzb) {
            selectionResult.selection = -1;
        } else {
            selectionResult.selection = 1;
        }
        return selectionResult;
    }
}
