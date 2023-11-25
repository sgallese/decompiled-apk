package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaba implements zzace {
    private final byte[] zza = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];

    @Override // com.google.android.gms.internal.ads.zzace
    public final /* synthetic */ int zze(zzt zztVar, int i10, boolean z10) {
        return zzacc.zza(this, zztVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzf(zzt zztVar, int i10, boolean z10, int i11) throws IOException {
        int zza = zztVar.zza(this.zza, 0, Math.min((int) RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, i10));
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final /* synthetic */ void zzq(zzfb zzfbVar, int i10) {
        zzacc.zzb(this, zzfbVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzr(zzfb zzfbVar, int i10, int i11) {
        zzfbVar.zzH(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzk(zzam zzamVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzs(long j10, int i10, int i11, int i12, zzacd zzacdVar) {
    }
}
