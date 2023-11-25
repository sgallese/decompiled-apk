package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzddq extends zzdbs implements zzauf {
    private final Map zzb;
    private final Context zzc;
    private final zzfbe zzd;

    public zzddq(Context context, Set set, zzfbe zzfbeVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfbeVar;
    }

    public final synchronized void zza(View view) {
        zzaug zzaugVar = (zzaug) this.zzb.get(view);
        if (zzaugVar == null) {
            zzaugVar = new zzaug(this.zzc, view);
            zzaugVar.zzc(this);
            this.zzb.put(view, zzaugVar);
        }
        if (this.zzd.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbl)).booleanValue()) {
                zzaugVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbk)).longValue());
                return;
            }
        }
        zzaugVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzaug) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final synchronized void zzbt(final zzaue zzaueVar) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzddp
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzauf) obj).zzbt(zzaue.this);
            }
        });
    }
}
