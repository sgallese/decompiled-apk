package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfko implements zzfjp {
    private static final zzfko zza = new zzfko();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfkk();
    private static final Runnable zze = new zzfkl();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfkh zzk = new zzfkh();
    private final zzfjr zzj = new zzfjr();
    private final zzfki zzl = new zzfki(new zzfkr());

    zzfko() {
    }

    public static zzfko zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzg(zzfko zzfkoVar) {
        zzfkoVar.zzg = 0;
        zzfkoVar.zzi.clear();
        zzfkoVar.zzh = false;
        for (zzfit zzfitVar : zzfjh.zza().zzb()) {
        }
        zzfkoVar.zzm = System.nanoTime();
        zzfkoVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfjq zza2 = zzfkoVar.zzj.zza();
        if (zzfkoVar.zzk.zze().size() > 0) {
            Iterator it = zzfkoVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzfkoVar.zzk.zza(str);
                zzfjq zzb2 = zzfkoVar.zzj.zzb();
                String zzc2 = zzfkoVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfjz.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e10) {
                        zzfka.zza("Error with setting not visible reason", e10);
                    }
                    zzfjz.zzc(zza3, zza5);
                }
                zzfjz.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfkoVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfkoVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzfkoVar.zzk(null, zza2, zza6, 1, false);
            zzfjz.zzf(zza6);
            zzfkoVar.zzl.zzd(zza6, zzfkoVar.zzk.zzf(), nanoTime);
        } else {
            zzfkoVar.zzl.zzb();
        }
        zzfkoVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfkoVar.zzm;
        if (zzfkoVar.zzf.size() > 0) {
            for (zzfkn zzfknVar : zzfkoVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfknVar.zzb();
                if (zzfknVar instanceof zzfkm) {
                    ((zzfkm) zzfknVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfjq zzfjqVar, JSONObject jSONObject, int i10, boolean z10) {
        boolean z11;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzfjqVar.zzb(view, jSONObject, this, z11, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    public final void zza(View view, zzfjq zzfjqVar, JSONObject jSONObject, boolean z10) {
        int zzk;
        boolean z11;
        boolean z12;
        if (zzfkf.zzb(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfjqVar.zza(view);
        zzfjz.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzfjz.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e10) {
                zzfka.zza("Error with setting has window focus", e10);
            }
            this.zzk.zzh();
        } else {
            zzfkg zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfjk zza3 = zzb2.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzb3 = zzb2.zzb();
                int size = zzb3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) zzb3.get(i10));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zza3.zzd());
                    zza2.put("friendlyObstructionPurpose", zza3.zza());
                    zza2.put("friendlyObstructionReason", zza3.zzc());
                } catch (JSONException e11) {
                    zzfka.zza("Error with setting friendly obstruction", e11);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && !z11) {
                z12 = false;
            } else {
                z12 = true;
            }
            zzk(view, zzfjqVar, zza2, zzk, z12);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfkj(this));
    }
}
