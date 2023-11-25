package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzate extends zzatm {
    private final StackTraceElement[] zzi;

    public zzate(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzaryVar, "fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", zzanvVar, i10, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            int i10 = 1;
            zzarp zzarpVar = new zzarp((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzF(zzarpVar.zza.longValue());
                if (zzarpVar.zzb.booleanValue()) {
                    zzanv zzanvVar = this.zze;
                    if (true != zzarpVar.zzc.booleanValue()) {
                        i10 = 2;
                    }
                    zzanvVar.zzac(i10);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
