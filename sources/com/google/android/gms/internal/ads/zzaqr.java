package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaqr implements Runnable {
    final /* synthetic */ zzaqs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqr(zzaqs zzaqsVar) {
        this.zza = zzaqsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z10;
        zzary zzaryVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb == null) {
            conditionVariable = zzaqs.zzc;
            synchronized (conditionVariable) {
                if (this.zza.zzb != null) {
                    return;
                }
                boolean z11 = false;
                try {
                    z10 = ((Boolean) zzbbr.zzcm.zze()).booleanValue();
                } catch (IllegalStateException unused) {
                    z10 = false;
                }
                if (z10) {
                    try {
                        zzaryVar = this.zza.zze;
                        zzaqs.zza = zzfne.zzb(zzaryVar.zza, "ADSHIELD", null);
                    } catch (Throwable unused2) {
                    }
                }
                z11 = z10;
                this.zza.zzb = Boolean.valueOf(z11);
                conditionVariable2 = zzaqs.zzc;
                conditionVariable2.open();
            }
        }
    }
}
