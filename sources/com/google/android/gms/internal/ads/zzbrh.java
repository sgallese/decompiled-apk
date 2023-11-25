package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbrh extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbrh(zzbeo zzbeoVar) {
        zzbew zzbewVar;
        try {
            this.zzb = zzbeoVar.zzg();
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbeoVar.zzh()) {
                if (obj instanceof IBinder) {
                    zzbewVar = zzbev.zzg((IBinder) obj);
                } else {
                    zzbewVar = null;
                }
                if (zzbewVar != null) {
                    this.zza.add(new zzbrj(zzbewVar));
                }
            }
        } catch (RemoteException e11) {
            zzcaa.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
