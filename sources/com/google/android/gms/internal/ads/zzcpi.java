package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcpi implements zzauf {
    private zzcfi zza;
    private final Executor zzb;
    private final zzcou zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcox zzg = new zzcox();

    public zzcpi(Executor executor, zzcou zzcouVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcouVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcph
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcpi.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e10);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaueVar) {
        boolean z10;
        zzcox zzcoxVar = this.zzg;
        if (this.zzf) {
            z10 = false;
        } else {
            z10 = zzaueVar.zzj;
        }
        zzcoxVar.zza = z10;
        zzcoxVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzaueVar;
        if (this.zze) {
            zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcfi zzcfiVar) {
        this.zza = zzcfiVar;
    }
}
