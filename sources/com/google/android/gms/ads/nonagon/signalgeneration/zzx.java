package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfya;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzx implements zzfya {
    final /* synthetic */ zzbsr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzaa zzaaVar, zzbsr zzbsrVar, boolean z10) {
        this.zzc = zzaaVar;
        this.zza = zzbsrVar;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        String str;
        Uri zzW;
        zzfik zzfikVar;
        zzfik zzfikVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z10 = this.zzc.zzt;
            if (z10 || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzO(uri)) {
                        str = this.zzc.zzC;
                        zzW = zzaa.zzW(uri, str, "1");
                        zzfikVar = this.zzc.zzs;
                        zzfikVar.zzc(zzW.toString(), null);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbbr.zzhp)).booleanValue()) {
                            zzfikVar2 = this.zzc.zzs;
                            zzfikVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }
}
