package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfrx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    private final void zzB(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e10) {
            zzcaa.zzh("Unable to set request configuration parcel.", e10);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (zza == null) {
                zza = new zzej();
            }
            zzejVar = zza;
        }
        return zzejVar;
    }

    public static InitializationStatus zzy(List list) {
        AdapterStatus.State state;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbko zzbkoVar = (zzbko) it.next();
            String str = zzbkoVar.zza;
            if (zzbkoVar.zzb) {
                state = AdapterStatus.State.READY;
            } else {
                state = AdapterStatus.State.NOT_READY;
            }
            hashMap.put(str, new zzbkw(state, zzbkoVar.zzd, zzbkoVar.zzc));
        }
        return new zzbkx(hashMap);
    }

    private final void zzz(Context context, String str) {
        try {
            zzbny.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            zzcaa.zzk("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float f10 = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                f10 = zzcoVar.zze();
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to get app volume.", e10);
            }
            return f10;
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        boolean z10;
        InitializationStatus zzy;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzy = zzy(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzcaa.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        zzej zzejVar = zzej.this;
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzee(zzejVar));
                        return hashMap;
                    }
                };
            }
        }
        return zzy;
    }

    public final String zzh() {
        boolean z10;
        String zzc;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzfrx.zzc(this.zzg.zzf());
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to get internal version.", e10);
                return "";
            }
        }
        return zzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzA(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzcaa.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(boolean z10) {
        boolean z11;
        String str;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.zzg.zzj(z10);
            } catch (RemoteException e10) {
                if (z10) {
                    str = "enable";
                } else {
                    str = "disable";
                }
                zzcaa.zzh("Unable to " + str + " Same App Key.", e10);
                if (e10.getMessage() != null && e10.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e10);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.ads.internal.client.zzeh, java.lang.String] */
    public final void zzn(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zzd) {
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
            } else if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
            } else {
                this.zzd = true;
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                if (context != null) {
                    synchronized (this.zzf) {
                        ?? r52 = 0;
                        try {
                            zzA(context);
                            this.zzg.zzs(new zzei(this, r52));
                            this.zzg.zzo(new zzboc());
                            if (this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                                zzB(this.zzi);
                            }
                        } catch (RemoteException e10) {
                            zzcaa.zzk("MobileAdsSettingManager initialization failed", e10);
                        }
                        zzbbr.zza(context);
                        if (((Boolean) zzbdi.zza.zze()).booleanValue()) {
                            if (((Boolean) zzba.zzc().zzb(zzbbr.zzkb)).booleanValue()) {
                                zzcaa.zze("Initializing on bg thread");
                                zzbzp.zza.execute(new Runnable(context, r52) { // from class: com.google.android.gms.ads.internal.client.zzec
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzej.this.zzo(this.zzb, null);
                                    }
                                });
                            }
                        }
                        if (((Boolean) zzbdi.zzb.zze()).booleanValue()) {
                            if (((Boolean) zzba.zzc().zzb(zzbbr.zzkb)).booleanValue()) {
                                zzbzp.zzb.execute(new Runnable(context, r52) { // from class: com.google.android.gms.ads.internal.client.zzed
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzej.this.zzp(this.zzb, null);
                                    }
                                });
                            }
                        }
                        zzcaa.zze("Initializing on calling thread");
                        zzz(context, null);
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    public final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final /* synthetic */ void zzp(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final void zzq(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzA(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                zzcaa.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzr(Context context, String str) {
        boolean z10;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to open debug menu.", e10);
            }
        }
    }

    public final void zzs(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final void zzt(boolean z10) {
        boolean z11;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z10);
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to set app mute state.", e10);
            }
        }
    }

    public final void zzu(float f10) {
        boolean z10;
        boolean z11 = true;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z11 = false;
            }
            Preconditions.checkState(z11, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f10);
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to set app volume.", e10);
            }
        }
    }

    public final void zzv(String str) {
        boolean z10;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to set plugin.", e10);
            }
        }
    }

    public final void zzw(RequestConfiguration requestConfiguration) {
        boolean z10;
        if (requestConfiguration != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzB(requestConfiguration);
            }
        }
    }

    public final boolean zzx() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean z10 = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                z10 = zzcoVar.zzv();
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to get app mute state.", e10);
            }
            return z10;
        }
    }
}
