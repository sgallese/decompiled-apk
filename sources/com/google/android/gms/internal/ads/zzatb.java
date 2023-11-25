package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzatb extends zzatm {
    public zzatb(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11) {
        super(zzaryVar, "gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", zzanvVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzanv zzanvVar = this.zze;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzanvVar.zzaf(i10);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
