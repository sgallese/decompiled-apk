package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzcbp extends TextureView implements zzccm {
    protected final zzccd zza;
    protected final zzccn zzb;

    public zzcbp(Context context) {
        super(context);
        this.zza = new zzccd();
        this.zzb = new zzccn(context, this);
    }

    public void zzC(String str, String[] strArr, Integer num) {
        zzs(str);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int i10);

    public abstract void zzr(zzcbo zzcboVar);

    public abstract void zzs(String str);

    public abstract void zzt();

    public abstract void zzu(float f10, float f11);

    public Integer zzw() {
        return null;
    }

    public void zzA(int i10) {
    }

    public void zzB(int i10) {
    }

    public void zzx(int i10) {
    }

    public void zzy(int i10) {
    }

    public void zzz(int i10) {
    }
}
