package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zztb extends zzst {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhk zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzA(Object obj, zztu zztuVar, zzcw zzcwVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB(final Object obj, zztu zztuVar) {
        zzdy.zzd(!this.zza.containsKey(obj));
        zztt zzttVar = new zztt() { // from class: com.google.android.gms.internal.ads.zzsy
            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zztu zztuVar2, zzcw zzcwVar) {
                zztb.this.zzA(obj, zztuVar2, zzcwVar);
            }
        };
        zzsz zzszVar = new zzsz(this, obj);
        this.zza.put(obj, new zzta(zztuVar, zzttVar, zzszVar));
        Handler handler = this.zzb;
        handler.getClass();
        zztuVar.zzh(handler, zzszVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zztuVar.zzg(handler2, zzszVar);
        zztuVar.zzm(zzttVar, this.zzc, zzb());
        if (!zzu()) {
            zztuVar.zzi(zzttVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzst
    protected final void zzj() {
        for (zzta zztaVar : this.zza.values()) {
            zztaVar.zza.zzi(zztaVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzst
    protected final void zzl() {
        for (zzta zztaVar : this.zza.values()) {
            zztaVar.zza.zzk(zztaVar.zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzst
    public void zzn(zzhk zzhkVar) {
        this.zzc = zzhkVar;
        this.zzb = zzfk.zzu(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzst
    public void zzq() {
        for (zzta zztaVar : this.zza.values()) {
            zztaVar.zza.zzp(zztaVar.zzb);
            zztaVar.zza.zzs(zztaVar.zzc);
            zztaVar.zza.zzr(zztaVar.zzc);
        }
        this.zza.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzw(Object obj, int i10) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzts zzy(Object obj, zzts zztsVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public void zzz() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzta) it.next()).zza.zzz();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long zzx(Object obj, long j10) {
        return j10;
    }
}
