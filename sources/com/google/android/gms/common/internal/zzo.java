package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
/* loaded from: classes.dex */
public final class zzo {
    private static final Uri zza = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final String zzb;
    private final String zzc;
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzo(ComponentName componentName, int i10) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = 4225;
        this.zzf = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        if (Objects.equal(this.zzb, zzoVar.zzb) && Objects.equal(this.zzc, zzoVar.zzc) && Objects.equal(this.zzd, zzoVar.zzd) && this.zzf == zzoVar.zzf) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd, 4225, Boolean.valueOf(this.zzf));
    }

    public final String toString() {
        String str = this.zzb;
        if (str == null) {
            Preconditions.checkNotNull(this.zzd);
            return this.zzd.flattenToString();
        }
        return str;
    }

    public final ComponentName zza() {
        return this.zzd;
    }

    public final Intent zzb(Context context) {
        Bundle bundle;
        if (this.zzb != null) {
            Intent intent = null;
            if (this.zzf) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.zzb);
                try {
                    bundle = context.getContentResolver().call(zza, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.zzb)));
                }
            }
            if (intent == null) {
                return new Intent(this.zzb).setPackage(this.zzc);
            }
            return intent;
        }
        return new Intent().setComponent(this.zzd);
    }

    public final String zzc() {
        return this.zzc;
    }

    public zzo(String str, int i10, boolean z10) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public zzo(String str, String str2, int i10, boolean z10) {
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = 4225;
        this.zzf = z10;
    }
}
