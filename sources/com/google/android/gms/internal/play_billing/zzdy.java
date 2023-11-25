package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
final class zzdy implements Iterator {
    final /* synthetic */ zzec zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdy(zzec zzecVar, zzdx zzdxVar) {
        this.zza = zzecVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.zzb + 1;
        list = this.zza.zzb;
        if (i10 >= list.size()) {
            map = this.zza.zzc;
            if (!map.isEmpty() && zza().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        list = this.zza.zzb;
        if (i10 < list.size()) {
            list2 = this.zza.zzb;
            return (Map.Entry) list2.get(this.zzb);
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            int i10 = this.zzb;
            list = this.zza.zzb;
            if (i10 < list.size()) {
                zzec zzecVar = this.zza;
                int i11 = this.zzb;
                this.zzb = i11 - 1;
                zzecVar.zzl(i11);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
