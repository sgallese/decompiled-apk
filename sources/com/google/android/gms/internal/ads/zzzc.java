package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzzc extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzza zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzzc(zzza zzzaVar, SurfaceTexture surfaceTexture, boolean z10, zzzb zzzbVar) {
        super(surfaceTexture);
        this.zzd = zzzaVar;
        this.zza = z10;
    }

    public static zzzc zza(Context context, boolean z10) {
        int i10 = 0;
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzdy.zzf(z11);
        zzza zzzaVar = new zzza();
        if (z10) {
            i10 = zzb;
        }
        return zzzaVar.zza(i10);
    }

    public static synchronized boolean zzb(Context context) {
        int i10;
        int i11;
        synchronized (zzzc.class) {
            if (!zzc) {
                if (zzeh.zzc(context)) {
                    if (zzeh.zzd()) {
                        i11 = 1;
                    } else {
                        i11 = 2;
                    }
                } else {
                    i11 = 0;
                }
                zzb = i11;
                zzc = true;
            }
            i10 = zzb;
        }
        if (i10 == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
