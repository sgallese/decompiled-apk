package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzau extends zzax {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzawVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbth zzbthVar;
        zzbgw zzbgwVar;
        zzbbr.zza(this.zza.getContext());
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            zzbgwVar = this.zzd.zzg;
            return zzbgwVar.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbff.zze(((zzbfj) zzcae.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzcac() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcac
                public final Object zza(Object obj) {
                    return zzbfi.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzcad | NullPointerException e10) {
            this.zzd.zzh = zzbtf.zza(this.zza.getContext());
            zzbthVar = this.zzd.zzh;
            zzbthVar.zzf(e10, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
