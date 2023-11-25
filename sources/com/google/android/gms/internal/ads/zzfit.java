package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfit extends zzfip {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfir zzb;
    private final zzfiq zzc;
    private zzfkv zze;
    private zzfju zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfit(zzfiq zzfiqVar, zzfir zzfirVar) {
        this.zzc = zzfiqVar;
        this.zzb = zzfirVar;
        zzk(null);
        if (zzfirVar.zzd() != zzfis.HTML && zzfirVar.zzd() != zzfis.JAVASCRIPT) {
            this.zzf = new zzfjx(zzfirVar.zzi(), null);
        } else {
            this.zzf = new zzfjv(zzfirVar.zza());
        }
        this.zzf.zzk();
        zzfjh.zza().zzd(this);
        zzfjn.zza().zzd(this.zzf.zza(), zzfiqVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfkv(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfip
    public final void zzb(View view, zzfiw zzfiwVar, String str) {
        zzfjk zzfjkVar;
        if (!this.zzh) {
            if (zza.matcher("Ad overlay").matches()) {
                Iterator it = this.zzd.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzfjkVar = (zzfjk) it.next();
                        if (zzfjkVar.zzb().get() == view) {
                            break;
                        }
                    } else {
                        zzfjkVar = null;
                        break;
                    }
                }
                if (zzfjkVar == null) {
                    this.zzd.add(new zzfjk(view, zzfiwVar, "Ad overlay"));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfip
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfjn.zza().zzc(this.zzf.zza());
        zzfjh.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfip
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzfit> zzc = zzfjh.zza().zzc();
        if (zzc != null && !zzc.isEmpty()) {
            for (zzfit zzfitVar : zzc) {
                if (zzfitVar != this && zzfitVar.zzf() == view) {
                    zzfitVar.zze.clear();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfip
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzfjh.zza().zzf(this);
        this.zzf.zzi(zzfjo.zzb().zza());
        this.zzf.zze(zzfjf.zza().zzb());
        this.zzf.zzg(this, this.zzb);
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfju zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        if (this.zzg && !this.zzh) {
            return true;
        }
        return false;
    }
}
