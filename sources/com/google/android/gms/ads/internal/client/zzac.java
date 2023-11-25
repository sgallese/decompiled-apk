package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbof zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzaw zzawVar, Context context, zzbof zzbofVar) {
        this.zza = context;
        this.zzb = zzbofVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbbr.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbbr.zziY)).booleanValue()) {
            return zzceVar.zzh(wrap, this.zzb, 233012000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbbr.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zziY)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdk) zzcae.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzcac() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcac
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    if (queryLocalInterface instanceof zzdk) {
                        return (zzdk) queryLocalInterface;
                    }
                    return new zzdk(obj);
                }
            })).zze(wrap, this.zzb, 233012000);
        } catch (RemoteException | zzcad | NullPointerException e10) {
            zzbtf.zza(this.zza).zzf(e10, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
