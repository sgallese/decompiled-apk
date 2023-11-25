package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfjg extends zzfjj {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfjg zzb = new zzfjg();

    private zzfjg() {
    }

    public static zzfjg zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final void zzb(boolean z10) {
        String str;
        Iterator it = zzfjh.zza().zzc().iterator();
        while (it.hasNext()) {
            zzfju zzg = ((zzfit) it.next()).zzg();
            if (zzg.zzl()) {
                if (true != z10) {
                    str = "backgrounded";
                } else {
                    str = "foregrounded";
                }
                zzfjn.zza().zzb(zzg.zza(), "setState", str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final boolean zzc() {
        Iterator it = zzfjh.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzfit) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
