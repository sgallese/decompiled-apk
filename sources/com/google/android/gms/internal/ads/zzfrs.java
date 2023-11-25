package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfrs implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfrv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrs(zzfrv zzfrvVar, CharSequence charSequence) {
        this.zzb = zzfrvVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzfqx.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
