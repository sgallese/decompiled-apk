package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdic {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbeo zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcfi zzi;
    private zzcfi zzj;
    private zzcfi zzk;
    private zzfip zzl;
    private com.google.common.util.concurrent.a zzm;
    private zzcas zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbew zzs;
    private zzbew zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final androidx.collection.g zzv = new androidx.collection.g();
    private final androidx.collection.g zzw = new androidx.collection.g();
    private List zzf = Collections.emptyList();

    public static zzdic zzag(zzboq zzboqVar) {
        try {
            zzdib zzak = zzak(zzboqVar.zzg(), null);
            zzbeo zzh = zzboqVar.zzh();
            View view = (View) zzam(zzboqVar.zzj());
            String zzo = zzboqVar.zzo();
            List zzr = zzboqVar.zzr();
            String zzm = zzboqVar.zzm();
            Bundle zzf = zzboqVar.zzf();
            String zzn = zzboqVar.zzn();
            View view2 = (View) zzam(zzboqVar.zzk());
            IObjectWrapper zzl = zzboqVar.zzl();
            String zzq = zzboqVar.zzq();
            String zzp = zzboqVar.zzp();
            double zze = zzboqVar.zze();
            zzbew zzi = zzboqVar.zzi();
            zzdic zzdicVar = new zzdic();
            zzdicVar.zza = 2;
            zzdicVar.zzb = zzak;
            zzdicVar.zzc = zzh;
            zzdicVar.zzd = view;
            zzdicVar.zzZ("headline", zzo);
            zzdicVar.zze = zzr;
            zzdicVar.zzZ("body", zzm);
            zzdicVar.zzh = zzf;
            zzdicVar.zzZ("call_to_action", zzn);
            zzdicVar.zzo = view2;
            zzdicVar.zzq = zzl;
            zzdicVar.zzZ("store", zzq);
            zzdicVar.zzZ("price", zzp);
            zzdicVar.zzr = zze;
            zzdicVar.zzs = zzi;
            return zzdicVar;
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to get native ad from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdic zzah(zzbor zzborVar) {
        try {
            zzdib zzak = zzak(zzborVar.zzf(), null);
            zzbeo zzg = zzborVar.zzg();
            View view = (View) zzam(zzborVar.zzi());
            String zzo = zzborVar.zzo();
            List zzp = zzborVar.zzp();
            String zzm = zzborVar.zzm();
            Bundle zze = zzborVar.zze();
            String zzn = zzborVar.zzn();
            View view2 = (View) zzam(zzborVar.zzj());
            IObjectWrapper zzk = zzborVar.zzk();
            String zzl = zzborVar.zzl();
            zzbew zzh = zzborVar.zzh();
            zzdic zzdicVar = new zzdic();
            zzdicVar.zza = 1;
            zzdicVar.zzb = zzak;
            zzdicVar.zzc = zzg;
            zzdicVar.zzd = view;
            zzdicVar.zzZ("headline", zzo);
            zzdicVar.zze = zzp;
            zzdicVar.zzZ("body", zzm);
            zzdicVar.zzh = zze;
            zzdicVar.zzZ("call_to_action", zzn);
            zzdicVar.zzo = view2;
            zzdicVar.zzq = zzk;
            zzdicVar.zzZ("advertiser", zzl);
            zzdicVar.zzt = zzh;
            return zzdicVar;
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static zzdic zzai(zzboq zzboqVar) {
        try {
            return zzal(zzak(zzboqVar.zzg(), null), zzboqVar.zzh(), (View) zzam(zzboqVar.zzj()), zzboqVar.zzo(), zzboqVar.zzr(), zzboqVar.zzm(), zzboqVar.zzf(), zzboqVar.zzn(), (View) zzam(zzboqVar.zzk()), zzboqVar.zzl(), zzboqVar.zzq(), zzboqVar.zzp(), zzboqVar.zze(), zzboqVar.zzi(), null, 0.0f);
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdic zzaj(zzbor zzborVar) {
        try {
            return zzal(zzak(zzborVar.zzf(), null), zzborVar.zzg(), (View) zzam(zzborVar.zzi()), zzborVar.zzo(), zzborVar.zzp(), zzborVar.zzm(), zzborVar.zze(), zzborVar.zzn(), (View) zzam(zzborVar.zzj()), zzborVar.zzk(), null, null, -1.0d, zzborVar.zzh(), zzborVar.zzl(), 0.0f);
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static zzdib zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbou zzbouVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdib(zzdqVar, zzbouVar);
    }

    private static zzdic zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbeo zzbeoVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d10, zzbew zzbewVar, String str6, float f10) {
        zzdic zzdicVar = new zzdic();
        zzdicVar.zza = 6;
        zzdicVar.zzb = zzdqVar;
        zzdicVar.zzc = zzbeoVar;
        zzdicVar.zzd = view;
        zzdicVar.zzZ("headline", str);
        zzdicVar.zze = list;
        zzdicVar.zzZ("body", str2);
        zzdicVar.zzh = bundle;
        zzdicVar.zzZ("call_to_action", str3);
        zzdicVar.zzo = view2;
        zzdicVar.zzq = iObjectWrapper;
        zzdicVar.zzZ("store", str4);
        zzdicVar.zzZ("price", str5);
        zzdicVar.zzr = d10;
        zzdicVar.zzs = zzbewVar;
        zzdicVar.zzZ("advertiser", str6);
        zzdicVar.zzR(f10);
        return zzdicVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdic zzt(zzbou zzbouVar) {
        try {
            return zzal(zzak(zzbouVar.zzj(), zzbouVar), zzbouVar.zzk(), (View) zzam(zzbouVar.zzm()), zzbouVar.zzs(), zzbouVar.zzv(), zzbouVar.zzq(), zzbouVar.zzi(), zzbouVar.zzr(), (View) zzam(zzbouVar.zzn()), zzbouVar.zzo(), zzbouVar.zzu(), zzbouVar.zzt(), zzbouVar.zze(), zzbouVar.zzl(), zzbouVar.zzp(), zzbouVar.zzf());
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcfi zzcfiVar = this.zzi;
        if (zzcfiVar != null) {
            zzcfiVar.destroy();
            this.zzi = null;
        }
        zzcfi zzcfiVar2 = this.zzj;
        if (zzcfiVar2 != null) {
            zzcfiVar2.destroy();
            this.zzj = null;
        }
        zzcfi zzcfiVar3 = this.zzk;
        if (zzcfiVar3 != null) {
            zzcfiVar3.destroy();
            this.zzk = null;
        }
        com.google.common.util.concurrent.a aVar = this.zzm;
        if (aVar != null) {
            aVar.cancel(false);
            this.zzm = null;
        }
        zzcas zzcasVar = this.zzn;
        if (zzcasVar != null) {
            zzcasVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbeo zzbeoVar) {
        this.zzc = zzbeoVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzM(zzbew zzbewVar) {
        this.zzs = zzbewVar;
    }

    public final synchronized void zzN(String str, zzbei zzbeiVar) {
        if (zzbeiVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbeiVar);
        }
    }

    public final synchronized void zzO(zzcfi zzcfiVar) {
        this.zzj = zzcfiVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbew zzbewVar) {
        this.zzt = zzbewVar;
    }

    public final synchronized void zzR(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcfi zzcfiVar) {
        this.zzk = zzcfiVar;
    }

    public final synchronized void zzU(com.google.common.util.concurrent.a aVar) {
        this.zzm = aVar;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzfip zzfipVar) {
        this.zzl = zzfipVar;
    }

    public final synchronized void zzX(zzcas zzcasVar) {
        this.zzn = zzcasVar;
    }

    public final synchronized void zzY(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcfi zzcfiVar) {
        this.zzi = zzcfiVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        if (this.zzj != null) {
            return true;
        }
        return false;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized androidx.collection.g zzh() {
        return this.zzv;
    }

    public final synchronized androidx.collection.g zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbeo zzl() {
        return this.zzc;
    }

    public final zzbew zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbev.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbew zzn() {
        return this.zzs;
    }

    public final synchronized zzbew zzo() {
        return this.zzt;
    }

    public final synchronized zzcas zzp() {
        return this.zzn;
    }

    public final synchronized zzcfi zzq() {
        return this.zzj;
    }

    public final synchronized zzcfi zzr() {
        return this.zzk;
    }

    public final synchronized zzcfi zzs() {
        return this.zzi;
    }

    public final synchronized zzfip zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized com.google.common.util.concurrent.a zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
