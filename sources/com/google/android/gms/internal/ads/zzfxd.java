package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfxd extends zzfxj {
    private static final Logger zza = Logger.getLogger(zzfxd.class.getName());
    private zzfty zzb;
    private final boolean zzc;
    private final boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxd(zzfty zzftyVar, boolean z10, boolean z11) {
        super(zzftyVar.size());
        this.zzb = zzftyVar;
        this.zzc = z10;
        this.zze = z11;
    }

    private final void zzG(int i10, Future future) {
        try {
            zzf(i10, zzfye.zzp(future));
        } catch (Error e10) {
            e = e10;
            zzI(e);
        } catch (RuntimeException e11) {
            e = e11;
            zzI(e);
        } catch (ExecutionException e12) {
            zzI(e12.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH  reason: merged with bridge method [inline-methods] */
    public final void zzx(zzfty zzftyVar) {
        boolean z10;
        int zzA = zzA();
        int i10 = 0;
        if (zzA >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfri.zzj(z10, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzftyVar != null) {
                zzfwd it = zzftyVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfws
    public final String zza() {
        zzfty zzftyVar = this.zzb;
        if (zzftyVar != null) {
            return "futures=".concat(zzftyVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        zzfty zzftyVar = this.zzb;
        boolean z10 = true;
        zzy(1);
        boolean isCancelled = isCancelled();
        if (zzftyVar == null) {
            z10 = false;
        }
        if (z10 & isCancelled) {
            boolean zzt = zzt();
            zzfwd it = zzftyVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    final void zze(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable zzl = zzl();
            zzl.getClass();
            zzK(set, zzl);
        }
    }

    abstract void zzf(int i10, Object obj);

    abstract void zzu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv() {
        final zzfty zzftyVar;
        zzfty zzftyVar2 = this.zzb;
        zzftyVar2.getClass();
        if (zzftyVar2.isEmpty()) {
            zzu();
        } else if (this.zzc) {
            zzfwd it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final com.google.common.util.concurrent.a aVar = (com.google.common.util.concurrent.a) it.next();
                aVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfxd.this.zzw(aVar, i10);
                    }
                }, zzfxs.INSTANCE);
                i10++;
            }
        } else {
            if (this.zze) {
                zzftyVar = this.zzb;
            } else {
                zzftyVar = null;
            }
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxc
                @Override // java.lang.Runnable
                public final void run() {
                    zzfxd.this.zzx(zzftyVar);
                }
            };
            zzfwd it2 = this.zzb.iterator();
            while (it2.hasNext()) {
                ((com.google.common.util.concurrent.a) it2.next()).addListener(runnable, zzfxs.INSTANCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(com.google.common.util.concurrent.a aVar, int i10) {
        try {
            if (aVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, aVar);
            }
        } finally {
            zzx(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzy(int i10) {
        this.zzb = null;
    }
}
