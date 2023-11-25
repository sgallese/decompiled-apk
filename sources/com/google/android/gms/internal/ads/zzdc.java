package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzdc {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfud zzh;
    private final zzfud zzi;
    private final int zzj;
    private final int zzk;
    private final zzfud zzl;
    private zzfud zzm;
    private int zzn;
    private final HashMap zzo;
    private final HashSet zzp;

    @Deprecated
    public zzdc() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfud.zzl();
        this.zzi = zzfud.zzl();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfud.zzl();
        this.zzm = zzfud.zzl();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public final zzdc zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzfk.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfud.zzm(zzfk.zzy(locale));
            }
        }
        return this;
    }

    public zzdc zze(int i10, int i11, boolean z10) {
        this.zze = i10;
        this.zzf = i11;
        this.zzg = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdc(zzdd zzddVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzddVar.zzl;
        this.zzf = zzddVar.zzm;
        this.zzg = zzddVar.zzn;
        this.zzh = zzddVar.zzo;
        this.zzi = zzddVar.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzddVar.zzu;
        this.zzm = zzddVar.zzw;
        this.zzn = zzddVar.zzx;
        this.zzp = new HashSet(zzddVar.zzD);
        this.zzo = new HashMap(zzddVar.zzC);
    }
}
