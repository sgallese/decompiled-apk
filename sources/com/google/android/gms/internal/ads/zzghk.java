package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzghk {
    private final Class zza;
    private final zzgpo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzghk(Class cls, zzgpo zzgpoVar, zzghj zzghjVar) {
        this.zza = cls;
        this.zzb = zzgpoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghk)) {
            return false;
        }
        zzghk zzghkVar = (zzghk) obj;
        if (!zzghkVar.zza.equals(this.zza) || !zzghkVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(this.zzb);
    }
}
