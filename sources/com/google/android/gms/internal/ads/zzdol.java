package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdol {
    private final zzcwg zza;
    private final zzddu zzb;
    private final zzcxp zzc;
    private final zzcyc zzd;
    private final zzcyo zze;
    private final zzdbc zzf;
    private final Executor zzg;
    private final zzddq zzh;
    private final zzcoy zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbxb zzk;
    private final zzaqx zzl;
    private final zzdat zzm;
    private final zzech zzn;
    private final zzfik zzo;
    private final zzdrh zzp;
    private final zzfgo zzq;
    private final zzcob zzr;
    private final zzdor zzs;

    public zzdol(zzcwg zzcwgVar, zzcxp zzcxpVar, zzcyc zzcycVar, zzcyo zzcyoVar, zzdbc zzdbcVar, Executor executor, zzddq zzddqVar, zzcoy zzcoyVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxb zzbxbVar, zzaqx zzaqxVar, zzdat zzdatVar, zzech zzechVar, zzfik zzfikVar, zzdrh zzdrhVar, zzfgo zzfgoVar, zzddu zzdduVar, zzcob zzcobVar, zzdor zzdorVar) {
        this.zza = zzcwgVar;
        this.zzc = zzcxpVar;
        this.zzd = zzcycVar;
        this.zze = zzcyoVar;
        this.zzf = zzdbcVar;
        this.zzg = executor;
        this.zzh = zzddqVar;
        this.zzi = zzcoyVar;
        this.zzj = zzbVar;
        this.zzk = zzbxbVar;
        this.zzl = zzaqxVar;
        this.zzm = zzdatVar;
        this.zzn = zzechVar;
        this.zzo = zzfikVar;
        this.zzp = zzdrhVar;
        this.zzq = zzfgoVar;
        this.zzb = zzdduVar;
        this.zzr = zzcobVar;
        this.zzs = zzdorVar;
    }

    public static final com.google.common.util.concurrent.a zzj(zzcfi zzcfiVar, String str, String str2) {
        final zzcas zzcasVar = new zzcas();
        zzcfiVar.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzcas zzcasVar2 = zzcas.this;
                if (z10) {
                    zzcasVar2.zzc(null);
                    return;
                }
                zzcasVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfiVar.zzab(str, str2, null);
        return zzcasVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcfi zzcfiVar, zzcfi zzcfiVar2, Map map) {
        this.zzi.zzh(zzcfiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzs.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    public final void zzi(final zzcfi zzcfiVar, boolean z10, zzbit zzbitVar) {
        zzcfiVar.zzN().zzM(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdoc
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdol.this.zzc();
            }
        }, this.zzd, this.zze, new zzbhj() { // from class: com.google.android.gms.internal.ads.zzdod
            @Override // com.google.android.gms.internal.ads.zzbhj
            public final void zzb(String str, String str2) {
                zzdol.this.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdoe
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzdol.this.zze();
            }
        }, z10, zzbitVar, this.zzj, new zzdok(this), this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, null, this.zzb, null, null, this.zzr);
        zzcfiVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdof
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdol.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcfiVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdol.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcr)).booleanValue()) {
            this.zzl.zzc().zzo((View) zzcfiVar);
        }
        this.zzh.zzo(zzcfiVar, this.zzg);
        this.zzh.zzo(new zzauf() { // from class: com.google.android.gms.internal.ads.zzdoh
            @Override // com.google.android.gms.internal.ads.zzauf
            public final void zzbt(zzaue zzaueVar) {
                zzcgv zzN = zzcfi.this.zzN();
                Rect rect = zzaueVar.zzd;
                zzN.zzp(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcfiVar);
        zzcfiVar.zzad("/trackActiveViewUnit", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdoi
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdol.this.zzg(zzcfiVar, (zzcfi) obj, map);
            }
        });
        this.zzi.zzi(zzcfiVar);
    }
}
