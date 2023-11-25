package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzalp implements Comparable {
    private final zzama zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzalt zzf;
    private Integer zzg;
    private zzals zzh;
    private boolean zzi;
    private zzaky zzj;
    private zzalo zzk;
    private final zzald zzl;

    public zzalp(int i10, String str, zzalt zzaltVar) {
        zzama zzamaVar;
        Uri parse;
        String host;
        if (zzama.zza) {
            zzamaVar = new zzama();
        } else {
            zzamaVar = null;
        }
        this.zza = zzamaVar;
        this.zze = new Object();
        int i11 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzaltVar;
        this.zzl = new zzald();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i11 = host.hashCode();
        }
        this.zzd = i11;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzalp) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaky zzd() {
        return this.zzj;
    }

    public final zzalp zze(zzaky zzakyVar) {
        this.zzj = zzakyVar;
        return this;
    }

    public final zzalp zzf(zzals zzalsVar) {
        this.zzh = zzalsVar;
        return this;
    }

    public final zzalp zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzalv zzh(zzall zzallVar);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb != 0) {
            return Integer.toString(1) + "-" + str;
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzakx {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzama.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaly zzalyVar) {
        zzalt zzaltVar;
        synchronized (this.zze) {
            zzaltVar = this.zzf;
        }
        zzaltVar.zza(zzalyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzals zzalsVar = this.zzh;
        if (zzalsVar != null) {
            zzalsVar.zzb(this);
        }
        if (zzama.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaln(this, str, id2));
                return;
            }
            this.zza.zza(str, id2);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr() {
        zzalo zzaloVar;
        synchronized (this.zze) {
            zzaloVar = this.zzk;
        }
        if (zzaloVar != null) {
            zzaloVar.zza(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs(zzalv zzalvVar) {
        zzalo zzaloVar;
        synchronized (this.zze) {
            zzaloVar = this.zzk;
        }
        if (zzaloVar != null) {
            zzaloVar.zzb(this, zzalvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt(int i10) {
        zzals zzalsVar = this.zzh;
        if (zzalsVar != null) {
            zzalsVar.zzc(this, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(zzalo zzaloVar) {
        synchronized (this.zze) {
            this.zzk = zzaloVar;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzakx {
        return null;
    }

    public final zzald zzy() {
        return this.zzl;
    }
}
