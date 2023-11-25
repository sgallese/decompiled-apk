package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeog implements zzesj {
    private final zzeyc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeog(zzeyc zzeycVar) {
        this.zza = zzeycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        zzeyc zzeycVar = this.zza;
        zzesi zzesiVar = null;
        if (zzeycVar != null && zzeycVar.zza() != null && !zzeycVar.zza().isEmpty()) {
            zzesiVar = new zzesi() { // from class: com.google.android.gms.internal.ads.zzeof
                @Override // com.google.android.gms.internal.ads.zzesi
                public final void zzj(Object obj) {
                    zzeog.this.zzc((Bundle) obj);
                }
            };
        }
        return zzfye.zzh(zzesiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
