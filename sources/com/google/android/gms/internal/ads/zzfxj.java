package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfws;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
abstract class zzfxj extends zzfws.zzi {
    private static final zzfxf zzbb;
    private static final Logger zzbc = Logger.getLogger(zzfxj.class.getName());
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzfxf zzfxiVar;
        Throwable th;
        zzfxh zzfxhVar = null;
        try {
            zzfxiVar = new zzfxg(AtomicReferenceFieldUpdater.newUpdater(zzfxj.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfxj.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e10) {
            zzfxiVar = new zzfxi(zzfxhVar);
            th = e10;
        }
        zzbb = zzfxiVar;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxj(int i10) {
        this.remaining = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzA() {
        return zzbb.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zze(newSetFromMap);
            zzbb.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            set2.getClass();
            return set2;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
