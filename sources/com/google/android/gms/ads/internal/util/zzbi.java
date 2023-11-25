package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzamt;
import com.google.android.gms.internal.ads.zzbzz;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzbi extends zzamt {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzbzz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbo zzboVar, int i10, String str, zzalu zzaluVar, zzalt zzaltVar, byte[] bArr, Map map, zzbzz zzbzzVar) {
        super(i10, str, zzaluVar, zzaltVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final Map zzl() throws zzakx {
        Map map = this.zzb;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzamt, com.google.android.gms.internal.ads.zzalp
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final byte[] zzx() throws zzakx {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzamt
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
