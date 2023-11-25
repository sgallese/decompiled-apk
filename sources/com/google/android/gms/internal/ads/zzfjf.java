package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfjf implements zzfji {
    private static final zzfjf zzb = new zzfjf(new zzfjj());
    protected final zzfkd zza = new zzfkd();
    private Date zzc;
    private boolean zzd;
    private final zzfjj zze;
    private boolean zzf;

    private zzfjf(zzfjj zzfjjVar) {
        this.zze = zzfjjVar;
    }

    public static zzfjf zza() {
        return zzb;
    }

    public final Date zzb() {
        Date date = this.zzc;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfji
    public final void zzc(boolean z10) {
        if (!this.zzf && z10) {
            Date date = new Date();
            Date date2 = this.zzc;
            if (date2 == null || date.after(date2)) {
                this.zzc = date;
                if (this.zzd) {
                    Iterator it = zzfjh.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzfit) it.next()).zzg().zze(zzb());
                    }
                }
            }
        }
        this.zzf = z10;
    }

    public final void zzd(Context context) {
        if (!this.zzd) {
            this.zze.zzd(context);
            this.zze.zze(this);
            this.zze.zzf();
            this.zzf = this.zze.zza;
            this.zzd = true;
        }
    }
}
