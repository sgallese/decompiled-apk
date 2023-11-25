package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgn {
    public static final /* synthetic */ int zzj = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbq.zzb("media3.datasource");
    }

    public final String toString() {
        return "DataSpec[GET " + String.valueOf(this.zza) + ", " + this.zzf + ", " + this.zzg + ", null, " + this.zzi + "]";
    }

    public final boolean zza(int i10) {
        if ((this.zzi & i10) == i10) {
            return true;
        }
        return false;
    }

    public zzgn(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    @Deprecated
    public zzgn(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, j10 - j11, 1, null, Collections.emptyMap(), j11, j12, null, i10, null);
    }

    private zzgn(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10 + j11;
        boolean z10 = false;
        zzdy.zzd(j13 >= 0);
        zzdy.zzd(j11 >= 0);
        if (j12 <= 0) {
            j12 = j12 == -1 ? -1L : j12;
            zzdy.zzd(z10);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j11;
            this.zze = j13;
            this.zzg = j12;
            this.zzh = null;
            this.zzi = i11;
        }
        z10 = true;
        zzdy.zzd(z10);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j11;
        this.zze = j13;
        this.zzg = j12;
        this.zzh = null;
        this.zzi = i11;
    }
}
