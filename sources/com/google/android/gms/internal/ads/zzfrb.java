package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfrb {
    private final String zza;
    private final zzfqz zzb;
    private zzfqz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfrb(String str, zzfra zzfraVar) {
        zzfqz zzfqzVar = new zzfqz(null);
        this.zzb = zzfqzVar;
        this.zzc = zzfqzVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfqz zzfqzVar = this.zzb.zzb;
        String str = "";
        while (zzfqzVar != null) {
            Object obj = zzfqzVar.zza;
            sb2.append(str);
            if (obj != null && obj.getClass().isArray()) {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            } else {
                sb2.append(obj);
            }
            zzfqzVar = zzfqzVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfrb zza(Object obj) {
        zzfqz zzfqzVar = new zzfqz(null);
        this.zzc.zzb = zzfqzVar;
        this.zzc = zzfqzVar;
        zzfqzVar.zza = obj;
        return this;
    }
}
