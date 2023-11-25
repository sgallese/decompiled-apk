package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzub {
    public final int zza;
    public final zzts zzb;
    private final CopyOnWriteArrayList zzc;

    private zzub(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzts zztsVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztsVar;
    }

    public final zzub zza(int i10, zzts zztsVar) {
        return new zzub(this.zzc, 0, zztsVar);
    }

    public final void zzb(Handler handler, zzuc zzucVar) {
        this.zzc.add(new zzua(handler, zzucVar));
    }

    public final void zzc(final zzto zztoVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzua zzuaVar = (zzua) it.next();
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztv
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = zzub.this;
                    zzucVar.zzac(0, zzubVar.zzb, zztoVar);
                }
            });
        }
    }

    public final void zzd(final zztj zztjVar, final zzto zztoVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzua zzuaVar = (zzua) it.next();
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztw
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = zzub.this;
                    zzucVar.zzad(0, zzubVar.zzb, zztjVar, zztoVar);
                }
            });
        }
    }

    public final void zze(final zztj zztjVar, final zzto zztoVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzua zzuaVar = (zzua) it.next();
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztz
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = zzub.this;
                    zzucVar.zzae(0, zzubVar.zzb, zztjVar, zztoVar);
                }
            });
        }
    }

    public final void zzf(final zztj zztjVar, final zzto zztoVar, final IOException iOException, final boolean z10) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzua zzuaVar = (zzua) it.next();
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztx
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = zzub.this;
                    zzucVar.zzaf(0, zzubVar.zzb, zztjVar, zztoVar, iOException, z10);
                }
            });
        }
    }

    public final void zzg(final zztj zztjVar, final zzto zztoVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzua zzuaVar = (zzua) it.next();
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzty
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = zzub.this;
                    zzucVar.zzag(0, zzubVar.zzb, zztjVar, zztoVar);
                }
            });
        }
    }

    public final void zzh(zzuc zzucVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzua zzuaVar = (zzua) it.next();
            if (zzuaVar.zzb == zzucVar) {
                this.zzc.remove(zzuaVar);
            }
        }
    }

    public zzub() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
