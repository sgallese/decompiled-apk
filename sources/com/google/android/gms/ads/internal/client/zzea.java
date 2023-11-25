package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzea {
    final zzaz zza;
    private final zzboc zzb;
    private final zzp zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbu zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;

    public zzea(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzp.zza, null, 0);
    }

    private static zzq zzC(Context context, AdSize[] adSizeArr, int i10) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = zzD(i10);
        return zzqVar;
    }

    private static boolean zzD(int i10) {
        if (i10 == 1) {
            return true;
        }
        return false;
    }

    public final boolean zzA() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                return zzbuVar.zzY();
            }
            return false;
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final AdSize[] zzB() {
        return this.zzh;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    public final AdSize zzb() {
        zzq zzg;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null && (zzg = zzbuVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    public final ResponseInfo zzd() {
        zzdn zzdnVar = null;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzdnVar = zzbuVar.zzk();
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zza(zzdnVar);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    public final AppEventListener zzh() {
        return this.zzi;
    }

    public final zzdq zzi() {
        zzbu zzbuVar = this.zzj;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzl();
            } catch (RemoteException e10) {
                zzcaa.zzl("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbu zzbuVar;
        if (this.zzl == null && (zzbuVar = this.zzj) != null) {
            try {
                this.zzl = zzbuVar.zzr();
            } catch (RemoteException e10) {
                zzcaa.zzl("#007 Could not call remote method.", e10);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzx();
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzm(zzdx zzdxVar) {
        zzbu zzbuVar;
        try {
            if (this.zzj == null) {
                if (this.zzh != null && this.zzl != null) {
                    Context context = this.zzm.getContext();
                    zzq zzC = zzC(context, this.zzh, this.zzn);
                    if ("search_v2".equals(zzC.zza)) {
                        zzbuVar = (zzbu) new zzal(zzay.zza(), context, zzC, this.zzl).zzd(context, false);
                    } else {
                        zzbuVar = (zzbu) new zzaj(zzay.zza(), context, zzC, this.zzl, this.zzb).zzd(context, false);
                    }
                    this.zzj = zzbuVar;
                    zzbuVar.zzD(new zzg(this.zza));
                    zza zzaVar = this.zzf;
                    if (zzaVar != null) {
                        this.zzj.zzC(new zzb(zzaVar));
                    }
                    AppEventListener appEventListener = this.zzi;
                    if (appEventListener != null) {
                        this.zzj.zzG(new zzaut(appEventListener));
                    }
                    if (this.zzk != null) {
                        this.zzj.zzU(new zzfl(this.zzk));
                    }
                    this.zzj.zzP(new zzfe(this.zzp));
                    this.zzj.zzN(this.zzo);
                    zzbu zzbuVar2 = this.zzj;
                    if (zzbuVar2 != null) {
                        try {
                            final IObjectWrapper zzn = zzbuVar2.zzn();
                            if (zzn != null) {
                                if (((Boolean) zzbdi.zzf.zze()).booleanValue()) {
                                    if (((Boolean) zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
                                        zzbzt.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzdy
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzea.this.zzl(zzn);
                                            }
                                        });
                                    }
                                }
                                this.zzm.addView((View) ObjectWrapper.unwrap(zzn));
                            }
                        } catch (RemoteException e10) {
                            zzcaa.zzl("#007 Could not call remote method.", e10);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            zzbu zzbuVar3 = this.zzj;
            zzbuVar3.getClass();
            zzbuVar3.zzaa(this.zzc.zza(this.zzm.getContext(), zzdxVar));
        } catch (RemoteException e11) {
            zzcaa.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzn() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzz();
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzo() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzA();
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzp() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzB();
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzq(zza zzaVar) {
        zzb zzbVar;
        try {
            this.zzf = zzaVar;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                if (zzaVar != null) {
                    zzbVar = new zzb(zzaVar);
                } else {
                    zzbVar = null;
                }
                zzbuVar.zzC(zzbVar);
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.zzh == null) {
            zzt(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zzt(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzF(zzC(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String str) {
        if (this.zzl == null) {
            this.zzl = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void zzv(AppEventListener appEventListener) {
        zzaut zzautVar;
        try {
            this.zzi = appEventListener;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                if (appEventListener != null) {
                    zzautVar = new zzaut(appEventListener);
                } else {
                    zzautVar = null;
                }
                zzbuVar.zzG(zzautVar);
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzw(boolean z10) {
        this.zzo = z10;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzN(z10);
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        zzfl zzflVar;
        this.zzk = videoOptions;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                if (videoOptions == null) {
                    zzflVar = null;
                } else {
                    zzflVar = new zzfl(videoOptions);
                }
                zzbuVar.zzU(zzflVar);
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final boolean zzz(zzbu zzbuVar) {
        try {
            IObjectWrapper zzn = zzbuVar.zzn();
            if (zzn == null || ((View) ObjectWrapper.unwrap(zzn)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) ObjectWrapper.unwrap(zzn));
            this.zzj = zzbuVar;
            return true;
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public zzea(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, zzp.zza, null, i10);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10) {
        this(viewGroup, attributeSet, z10, zzp.zza, null, 0);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, int i10) {
        this(viewGroup, attributeSet, z10, zzp.zza, null, i10);
    }

    zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, zzp zzpVar, zzbu zzbuVar, int i10) {
        zzq zzqVar;
        this.zzb = new zzboc();
        this.zze = new VideoController();
        this.zza = new zzdz(this);
        this.zzm = viewGroup;
        this.zzc = zzpVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.zzh = zzyVar.zzb(z10);
                this.zzl = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    zzbzt zzb = zzay.zzb();
                    AdSize adSize = this.zzh[0];
                    int i11 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVar = zzq.zze();
                    } else {
                        zzq zzqVar2 = new zzq(context, adSize);
                        zzqVar2.zzj = zzD(i11);
                        zzqVar = zzqVar2;
                    }
                    zzb.zzm(viewGroup, zzqVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                zzay.zzb().zzl(viewGroup, new zzq(context, AdSize.BANNER), e10.getMessage(), e10.getMessage());
            }
        }
    }
}
