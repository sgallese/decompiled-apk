package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfrp implements zzfru {
    final /* synthetic */ zzfqt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrp(zzfqt zzfqtVar) {
        this.zza = zzfqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final /* synthetic */ Iterator zza(zzfrv zzfrvVar, CharSequence charSequence) {
        return new zzfro(this, zzfrvVar, charSequence);
    }
}
