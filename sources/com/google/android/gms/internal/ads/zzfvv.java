package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfvv extends zzfvm implements Serializable {
    final zzfvm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvv(zzfvm zzfvmVar) {
        this.zza = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvm, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvv) {
            return this.zza.equals(((zzfvv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final zzfvm zza() {
        return this.zza;
    }
}
