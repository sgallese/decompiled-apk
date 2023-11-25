package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzasz extends zzatm {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzasz(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11) {
        super(zzaryVar, "hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", zzanvVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzB("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
