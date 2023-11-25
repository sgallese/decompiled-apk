package com.google.android.gms.internal.wearable;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzad {
    private final String zza;
    private final zzab zzb;
    private zzab zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzad(String str, zzac zzacVar) {
        zzab zzabVar = new zzab(null);
        this.zzb = zzabVar;
        this.zzc = zzabVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzab zzabVar = this.zzb.zzc;
        String str = "";
        while (zzabVar != null) {
            Object obj = zzabVar.zzb;
            sb2.append(str);
            String str2 = zzabVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            } else {
                sb2.append(obj);
            }
            zzabVar = zzabVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzad zza(String str, int i10) {
        String valueOf = String.valueOf(i10);
        zzz zzzVar = new zzz(null);
        this.zzc.zzc = zzzVar;
        this.zzc = zzzVar;
        zzzVar.zzb = valueOf;
        zzzVar.zza = "filterType";
        return this;
    }

    public final zzad zzb(String str, Object obj) {
        zzab zzabVar = new zzab(null);
        this.zzc.zzc = zzabVar;
        this.zzc = zzabVar;
        zzabVar.zzb = obj;
        zzabVar.zza = str;
        return this;
    }
}
