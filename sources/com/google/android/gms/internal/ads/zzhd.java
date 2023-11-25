package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzhd extends zzhb {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzhd(int i10, String str, IOException iOException, Map map, zzgn zzgnVar, byte[] bArr) {
        super("Response code: " + i10, iOException, zzgnVar, 2004, 1);
        this.zzd = i10;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
