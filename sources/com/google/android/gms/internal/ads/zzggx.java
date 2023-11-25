package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzggx {
    private final Map zza;
    private final Map zzb;

    private zzggx() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzggx zza(zzggu zzgguVar) throws GeneralSecurityException {
        zzggz zzggzVar = new zzggz(zzgguVar.zzc(), zzgguVar.zzd(), null);
        if (this.zza.containsKey(zzggzVar)) {
            zzggu zzgguVar2 = (zzggu) this.zza.get(zzggzVar);
            if (!zzgguVar2.equals(zzgguVar) || !zzgguVar.equals(zzgguVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzggzVar.toString()));
            }
        } else {
            this.zza.put(zzggzVar, zzgguVar);
        }
        return this;
    }

    public final zzggx zzb(zzgap zzgapVar) throws GeneralSecurityException {
        if (zzgapVar != null) {
            Map map = this.zzb;
            Class zzb = zzgapVar.zzb();
            if (map.containsKey(zzb)) {
                zzgap zzgapVar2 = (zzgap) this.zzb.get(zzb);
                if (!zzgapVar2.equals(zzgapVar) || !zzgapVar.equals(zzgapVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
                }
            } else {
                this.zzb.put(zzb, zzgapVar);
            }
            return this;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggx(zzggw zzggwVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggx(zzghb zzghbVar, zzggw zzggwVar) {
        this.zza = new HashMap(zzghb.zzd(zzghbVar));
        this.zzb = new HashMap(zzghb.zze(zzghbVar));
    }
}
