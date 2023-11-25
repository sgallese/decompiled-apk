package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzep {
    private final zzdz zza;
    private final zzej zzb;
    private final zzen zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzep(Looper looper, zzdz zzdzVar, zzen zzenVar) {
        this(new CopyOnWriteArraySet(), looper, zzdzVar, zzenVar, true);
    }

    public static /* synthetic */ boolean zzg(zzep zzepVar, Message message) {
        Iterator it = zzepVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzeo) it.next()).zzb(zzepVar.zzc);
            if (zzepVar.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        boolean z10;
        if (!this.zzi) {
            return;
        }
        if (Thread.currentThread() == this.zzb.zza().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
    }

    public final zzep zza(Looper looper, zzen zzenVar) {
        return new zzep(this.zzd, looper, this.zza, zzenVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzeo(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(0)) {
            zzej zzejVar = this.zzb;
            zzejVar.zzk(zzejVar.zzb(0));
        }
        boolean z10 = !this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (!z10) {
            while (!this.zze.isEmpty()) {
                ((Runnable) this.zze.peekFirst()).run();
                this.zze.removeFirst();
            }
        }
    }

    public final void zzd(final int i10, final zzem zzemVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzel
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i11 = i10;
                zzem zzemVar2 = zzemVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((zzeo) it.next()).zza(i11, zzemVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzeo) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzeo zzeoVar = (zzeo) it.next();
            if (zzeoVar.zza.equals(obj)) {
                zzeoVar.zzc(this.zzc);
                this.zzd.remove(zzeoVar);
            }
        }
    }

    private zzep(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdz zzdzVar, zzen zzenVar, boolean z10) {
        this.zza = zzdzVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzenVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdzVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzek
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzep.zzg(zzep.this, message);
                return true;
            }
        });
        this.zzi = z10;
    }
}
