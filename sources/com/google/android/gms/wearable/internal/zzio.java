package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzio extends zzij {
    public zzio(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzfp
    public final void zzn(zzeb zzebVar) {
        zzag zzagVar;
        Status zza = zzib.zza(zzebVar.zza);
        zzas zzasVar = zzebVar.zzb;
        if (zzasVar == null) {
            zzagVar = null;
        } else {
            zzagVar = new zzag(zzasVar);
        }
        zzO(new zzai(zza, zzagVar));
    }
}
