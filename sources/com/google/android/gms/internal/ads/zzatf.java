package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzatf extends zzatm {
    public zzatf(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11) {
        super(zzaryVar, "4/SMeJXpDEQUjIN8ctjvaq+191KHQFpFbvfik3xx/Qb+eWbRMHKpllc1rI0p7EXQ", "Jz2tk/JKeGJKcc4wwXH5Pf6ZM64fYgV4wWxByPOgNQE=", zzanvVar, i10, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzart zzartVar = new zzart((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzp(zzartVar.zza.longValue());
            this.zze.zzq(zzartVar.zzb.longValue());
        }
    }
}
