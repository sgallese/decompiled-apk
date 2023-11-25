package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzasp extends zzatm {
    private final long zzi;

    public zzasp(zzary zzaryVar, String str, String str2, zzanv zzanvVar, long j10, int i10, int i11) {
        super(zzaryVar, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", zzanvVar, i10, 25);
        this.zzi = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(longValue);
            long j10 = this.zzi;
            if (j10 != 0) {
                this.zze.zzT(longValue - j10);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
