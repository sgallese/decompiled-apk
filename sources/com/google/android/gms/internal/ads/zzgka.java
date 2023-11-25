package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgka {
    private final zzgjt zza;
    private final List zzb;
    private final Integer zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgka(zzgjt zzgjtVar, List list, Integer num, zzgjz zzgjzVar) {
        this.zza = zzgjtVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgka)) {
            return false;
        }
        zzgka zzgkaVar = (zzgka) obj;
        if (this.zza.equals(zzgkaVar.zza) && this.zzb.equals(zzgkaVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzgkaVar.zzc;
            if (num != num2) {
                if (num != null && num.equals(num2)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
