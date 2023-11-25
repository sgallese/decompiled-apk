package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzag extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbof zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(zzaw zzawVar, Context context, zzbof zzbofVar) {
        this.zza = context;
        this.zzb = zzbofVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzl(ObjectWrapper.wrap(this.zza), this.zzb, 233012000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbry) zzcae.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzcac() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcac
                public final Object zza(Object obj) {
                    return zzbrx.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 233012000);
        } catch (RemoteException | zzcad | NullPointerException unused) {
            return null;
        }
    }
}
