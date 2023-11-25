package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdkd implements zzdik {
    private final zzbou zza;
    private final zzcxa zzb;
    private final zzcwg zzc;
    private final zzddu zzd;
    private final Context zze;
    private final zzfbe zzf;
    private final zzcag zzg;
    private final zzfca zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzboq zzl;
    private final zzbor zzm;

    public zzdkd(zzboq zzboqVar, zzbor zzborVar, zzbou zzbouVar, zzcxa zzcxaVar, zzcwg zzcwgVar, zzddu zzdduVar, Context context, zzfbe zzfbeVar, zzcag zzcagVar, zzfca zzfcaVar) {
        this.zzl = zzboqVar;
        this.zzm = zzborVar;
        this.zza = zzbouVar;
        this.zzb = zzcxaVar;
        this.zzc = zzcwgVar;
        this.zzd = zzdduVar;
        this.zze = context;
        this.zzf = zzfbeVar;
        this.zzg = zzcagVar;
        this.zzh = zzfcaVar;
    }

    private final void zzb(View view) {
        try {
            zzbou zzbouVar = this.zza;
            if (zzbouVar != null && !zzbouVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
                return;
            }
            zzboq zzboqVar = this.zzl;
            if (zzboqVar != null && !zzboqVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
                return;
            }
            zzbor zzborVar = this.zzm;
            if (zzborVar != null && !zzborVar.zzv()) {
                this.zzm.zzq(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                    this.zzd.zzbK();
                }
            }
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to call handleClick", e10);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        zzcaa.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        if (!this.zzj) {
            zzcaa.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzM) {
            zzcaa.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (!this.zzk) {
                return;
            }
            zzbou zzbouVar = this.zza;
            if (zzbouVar != null && !zzbouVar.zzB()) {
                this.zza.zzx();
                this.zzb.zza();
                return;
            }
            zzboq zzboqVar = this.zzl;
            if (zzboqVar != null && !zzboqVar.zzy()) {
                this.zzl.zzt();
                this.zzb.zza();
                return;
            }
            zzbor zzborVar = this.zzm;
            if (zzborVar != null && !zzborVar.zzw()) {
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzcaa.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z10 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbu)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbv)).booleanValue() && next.equals("3010")) {
                                zzbou zzbouVar = this.zza;
                                Object obj2 = null;
                                if (zzbouVar != null) {
                                    try {
                                        zzn = zzbouVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzboq zzboqVar = this.zzl;
                                    if (zzboqVar != null) {
                                        zzn = zzboqVar.zzk();
                                    } else {
                                        zzbor zzborVar = this.zzm;
                                        if (zzborVar != null) {
                                            zzn = zzborVar.zzj();
                                        } else {
                                            zzn = null;
                                        }
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbu.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z10 = false;
                        break;
                    }
                }
            }
            this.zzk = z10;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbou zzbouVar2 = this.zza;
            if (zzbouVar2 != null) {
                zzbouVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzboq zzboqVar2 = this.zzl;
            if (zzboqVar2 != null) {
                zzboqVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbor zzborVar2 = this.zzm;
            if (zzborVar2 != null) {
                zzborVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to call trackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbou zzbouVar = this.zza;
            if (zzbouVar != null) {
                zzbouVar.zzz(wrap);
                return;
            }
            zzboq zzboqVar = this.zzl;
            if (zzboqVar != null) {
                zzboqVar.zzw(wrap);
                return;
            }
            zzbor zzborVar = this.zzm;
            if (zzborVar != null) {
                zzborVar.zzu(wrap);
            }
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to call untrackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzx(zzbgq zzbgqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }
}
