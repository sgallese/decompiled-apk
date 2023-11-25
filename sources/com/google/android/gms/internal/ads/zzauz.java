package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzauz {
    private final Object zza = new Object();
    private zzaux zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzaux zzauxVar = this.zzb;
            if (zzauxVar != null) {
                return zzauxVar.zza();
            }
            return null;
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzaux zzauxVar = this.zzb;
            if (zzauxVar != null) {
                return zzauxVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzauy zzauyVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzaux();
            }
            this.zzb.zzf(zzauyVar);
        }
    }

    public final void zzd(Context context) {
        Application application;
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                if (application == null) {
                    zzcaa.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzaux();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzauy zzauyVar) {
        synchronized (this.zza) {
            zzaux zzauxVar = this.zzb;
            if (zzauxVar == null) {
                return;
            }
            zzauxVar.zzh(zzauyVar);
        }
    }
}
