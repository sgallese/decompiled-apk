package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdmc extends zzblc implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbeh {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzdhx zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdmc(zzdhx zzdhxVar, zzdic zzdicVar) {
        this.zza = zzdicVar.zzf();
        this.zzb = zzdicVar.zzj();
        this.zzc = zzdhxVar;
        if (zzdicVar.zzs() != null) {
            zzdicVar.zzs().zzam(this);
        }
    }

    private final void zzg() {
        View view;
        zzdhx zzdhxVar = this.zzc;
        if (zzdhxVar != null && (view = this.zza) != null) {
            zzdhxVar.zzz(view, Collections.emptyMap(), Collections.emptyMap(), zzdhx.zzV(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzblg zzblgVar, int i10) {
        try {
            zzblgVar.zze(i10);
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final com.google.android.gms.ads.internal.client.zzdq zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcaa.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final zzbet zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcaa.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdhx zzdhxVar = this.zzc;
        if (zzdhxVar == null || zzdhxVar.zzc() == null) {
            return null;
        }
        return zzdhxVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdhx zzdhxVar = this.zzc;
        if (zzdhxVar != null) {
            zzdhxVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdmb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final void zzf(IObjectWrapper iObjectWrapper, zzblg zzblgVar) throws RemoteException {
        String str;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcaa.zzg("Instream ad can not be shown after destroy().");
            zzi(zzblgVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                zzcaa.zzg("Instream ad should not be used again.");
                zzi(zzblgVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcba.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcba.zzb(this.zza, this);
            zzg();
            try {
                zzblgVar.zzf();
                return;
            } catch (RemoteException e10) {
                zzcaa.zzl("#007 Could not call remote method.", e10);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        zzcaa.zzg("Instream internal error: ".concat(str));
        zzi(zzblgVar, 0);
    }
}
