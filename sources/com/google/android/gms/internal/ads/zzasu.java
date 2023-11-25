package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzasu extends zzatm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzasu(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11) {
        super(zzaryVar, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", zzanvVar, i10, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzy(zzi.longValue());
        }
    }
}
