package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaqs {
    protected volatile Boolean zzb;
    private final zzary zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfne zza = null;
    private static volatile Random zzd = null;

    public zzaqs(zzary zzaryVar) {
        this.zze = zzaryVar;
        zzaryVar.zzk().execute(new zzaqr(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzaqs.class) {
                if (zzd == null) {
                    zzd = new Random();
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzc.block();
            if (this.zzb.booleanValue() && zza != null) {
                zzanh zza2 = zzanl.zza();
                zza2.zza(this.zze.zza.getPackageName());
                zza2.zze(j10);
                if (str != null) {
                    zza2.zzb(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    zza2.zzf(stringWriter.toString());
                    zza2.zzd(exc.getClass().getName());
                }
                zzfnd zza3 = zza.zza(((zzanl) zza2.zzal()).zzax());
                zza3.zza(i10);
                if (i11 != -1) {
                    zza3.zzb(i11);
                }
                zza3.zzc();
            }
        } catch (Exception unused) {
        }
    }
}
