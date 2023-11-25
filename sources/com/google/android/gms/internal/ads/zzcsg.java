package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcsg implements zzcsh {
    private final Map zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsg(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcsh
    public final zzedn zza(int i10, String str) {
        return (zzedn) this.zza.get(str);
    }
}
