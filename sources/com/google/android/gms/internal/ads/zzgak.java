package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgak {
    private final Object zza;
    private final Object zzb;
    private final byte[] zzc;
    private final zzgnw zzd;
    private final int zze;
    private final String zzf;
    private final zzfzp zzg;
    private final int zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgak(Object obj, Object obj2, byte[] bArr, int i10, zzgnw zzgnwVar, int i11, String str, zzfzp zzfzpVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i10;
        this.zzd = zzgnwVar;
        this.zze = i11;
        this.zzf = str;
        this.zzg = zzfzpVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfzp zzb() {
        return this.zzg;
    }

    public final zzgnw zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zza;
    }

    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}