package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzajy {
    public final int zza;
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzajy(int i10, String str, List list, byte[] bArr) {
        List unmodifiableList;
        this.zza = i10;
        this.zzb = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zzc = unmodifiableList;
        this.zzd = bArr;
    }
}
