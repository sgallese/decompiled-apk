package com.google.android.gms.internal.ads;

import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfrv {
    private final zzfqt zza;
    private final zzfru zzb;

    private zzfrv(zzfru zzfruVar) {
        zzfqs zzfqsVar = zzfqs.zza;
        this.zzb = zzfruVar;
        this.zza = zzfqsVar;
    }

    public static zzfrv zzb(int i10) {
        return new zzfrv(new zzfrr(WearableStatusCodes.TARGET_NODE_NOT_CONNECTED));
    }

    public static zzfrv zzc(zzfqt zzfqtVar) {
        return new zzfrv(new zzfrp(zzfqtVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfrs(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
