package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzast extends zzatm {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    public zzast(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11, Map map, View view, Context context) {
        super(zzaryVar, "7qOZVP58PfP3kLkbSBo98onihlohkIEpZC40FvE5nnCJ8ryn0NERK9JAnlww55zq", "SMfJnKfhfLLyTw7dzHC+3CXVRNFLWK4N2mQHKB3gm/o=", zzanvVar, i10, 85);
        this.zzi = map;
        this.zzj = view;
        this.zzk = context;
    }

    private final long zzc(int i10) {
        Map map = this.zzi;
        Integer valueOf = Integer.valueOf(i10);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzi.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context context = this.zzk;
        if (context == null) {
            context = this.zzb.zzb();
        }
        long[] jArr2 = (long[]) this.zzf.invoke(null, jArr, context, this.zzj);
        long j10 = jArr2[0];
        this.zzi.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.zzi.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zze) {
            this.zze.zzv(j10);
            this.zze.zzu(j11);
        }
    }
}
