package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzatg extends zzatm {
    private final zzasf zzi;
    private long zzj;

    public zzatg(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11, zzasf zzasfVar) {
        super(zzaryVar, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", zzanvVar, i10, 53);
        this.zzi = zzasfVar;
        if (zzasfVar != null) {
            this.zzj = zzasfVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
