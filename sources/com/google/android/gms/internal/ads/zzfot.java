package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfot extends zzfpm {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfot(IBinder iBinder, boolean z10, String str, int i10, float f10, int i11, String str2, int i12, String str3, zzfos zzfosVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = f10;
        this.zze = i12;
        this.zzf = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfpm) {
            zzfpm zzfpmVar = (zzfpm) obj;
            if (this.zza.equals(zzfpmVar.zze())) {
                zzfpmVar.zzi();
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfpmVar.zzg()) : zzfpmVar.zzg() == null) {
                    if (this.zzc == zzfpmVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfpmVar.zza())) {
                        zzfpmVar.zzb();
                        zzfpmVar.zzh();
                        if (this.zze == zzfpmVar.zzd() && ((str = this.zzf) != null ? str.equals(zzfpmVar.zzf()) : zzfpmVar.zzf() == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = ((((((((((hashCode2 * 1000003) ^ 1237) * 1000003) ^ hashCode) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 583896283) ^ this.zze) * 1000003;
        String str2 = this.zzf;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return floatToIntBits ^ i10;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.zza.toString() + ", stableSessionToken=false, appId=" + this.zzb + ", layoutGravity=" + this.zzc + ", layoutVerticalMargin=" + this.zzd + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.zze + ", adFieldEnifd=" + this.zzf + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final int zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final IBinder zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final String zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final String zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final boolean zzi() {
        return false;
    }
}
