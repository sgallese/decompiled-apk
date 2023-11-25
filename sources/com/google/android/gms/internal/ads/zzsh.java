package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzsh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzsh(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzsh.class) {
            zzsh zzshVar = (zzsh) obj;
            if (TextUtils.equals(this.zza, zzshVar.zza) && this.zzb == zzshVar.zzb && this.zzc == zzshVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zza.hashCode() + 31;
        int i11 = 1237;
        if (true != this.zzb) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        if (true == this.zzc) {
            i11 = 1231;
        }
        return (((hashCode * 31) + i10) * 31) + i11;
    }
}
