package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbsz {
    private final View zza;
    private final Map zzb;
    private final zzbyr zzc;

    public zzbsz(zzbsy zzbsyVar) {
        View view;
        Map map;
        View view2;
        view = zzbsyVar.zza;
        this.zza = view;
        map = zzbsyVar.zzb;
        this.zzb = map;
        view2 = zzbsyVar.zza;
        zzbyr zza = zzbst.zza(view2.getContext());
        this.zzc = zza;
        if (zza != null && !map.isEmpty()) {
            try {
                zza.zzf(new zzbta(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
            } catch (RemoteException unused) {
                zzcaa.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list != null && !list.isEmpty()) {
            if (this.zzc == null) {
                zzcaa.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbsx(this, list));
                return;
            } catch (RemoteException e10) {
                zzcaa.zzg("RemoteException recording click: ".concat(e10.toString()));
                return;
            }
        }
        zzcaa.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list) {
        if (list != null && !list.isEmpty()) {
            zzbyr zzbyrVar = this.zzc;
            if (zzbyrVar != null) {
                try {
                    zzbyrVar.zzh(list, ObjectWrapper.wrap(this.zza), new zzbsw(this, list));
                    return;
                } catch (RemoteException e10) {
                    zzcaa.zzg("RemoteException recording impression urls: ".concat(e10.toString()));
                    return;
                }
            }
            zzcaa.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        zzcaa.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbyr zzbyrVar = this.zzc;
        if (zzbyrVar != null) {
            try {
                zzbyrVar.zzj(ObjectWrapper.wrap(motionEvent));
                return;
            } catch (RemoteException unused) {
                zzcaa.zzg("Failed to call remote method.");
                return;
            }
        }
        zzcaa.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbsv(this, updateClickUrlCallback));
        } catch (RemoteException e10) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e10.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbsu(this, updateImpressionUrlsCallback));
        } catch (RemoteException e10) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e10.toString()));
        }
    }
}
