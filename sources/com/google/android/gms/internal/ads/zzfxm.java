package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfxm extends zzfxo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxm(zzfty zzftyVar, boolean z10) {
        super(zzftyVar, z10);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        Object obj;
        ArrayList zza = zzfur.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfxn zzfxnVar = (zzfxn) it.next();
            if (zzfxnVar != null) {
                obj = zzfxnVar.zza;
            } else {
                obj = null;
            }
            zza.add(obj);
        }
        return Collections.unmodifiableList(zza);
    }
}
