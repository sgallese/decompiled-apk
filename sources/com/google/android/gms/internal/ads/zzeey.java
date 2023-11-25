package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeey implements zzedt {
    private final Context zza;
    private final zzcqz zzb;
    private View zzc;
    private zzboo zzd;

    public zzeey(Context context, zzcqz zzcqzVar) {
        this.zza = context;
        this.zzb = zzcqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, final zzfbe zzfbeVar, final zzedq zzedqVar) throws zzfcf, zzehf {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view != null) {
                    if (zzf) {
                        try {
                            view = (View) zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeeu
                                @Override // com.google.android.gms.internal.ads.zzfxl
                                public final com.google.common.util.concurrent.a zza(Object obj) {
                                    return zzeey.this.zzc(view, zzfbeVar, obj);
                                }
                            }, zzcan.zze).get();
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new zzfcf(e10);
                        }
                    }
                } else {
                    throw new zzfcf(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
            } catch (RemoteException e11) {
                throw new zzfcf(e11);
            }
        } else {
            view = this.zzc;
        }
        zzcqd zza = this.zzb.zza(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzcqj(view, null, new zzcsc() { // from class: com.google.android.gms.internal.ads.zzeev
            @Override // com.google.android.gms.internal.ads.zzcsc
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                try {
                    return ((zzbqc) zzedq.this.zzb).zze();
                } catch (RemoteException e12) {
                    throw new zzfcf(e12);
                }
            }
        }, (zzfbf) zzfbeVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzefj) zzedqVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            ((zzbqc) zzedqVar.zzb).zzq(zzfbeVar.zzaa);
            zzeew zzeewVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
                ((zzbqc) zzedqVar.zzb).zzk(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeex(this, zzedqVar, zzeewVar), (zzbol) zzedqVar.zzc, zzfbrVar.zza.zza.zze);
            } else {
                ((zzbqc) zzedqVar.zzb).zzj(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeex(this, zzedqVar, zzeewVar), (zzbol) zzedqVar.zzc, zzfbrVar.zza.zza.zze);
            }
        } catch (RemoteException e10) {
            throw new zzfcf(e10);
        }
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzc(View view, zzfbe zzfbeVar, Object obj) throws Exception {
        return zzfye.zzh(zzcrq.zza(this.zza, view, zzfbeVar));
    }
}
