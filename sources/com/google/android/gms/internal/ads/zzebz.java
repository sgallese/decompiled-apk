package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzebz extends zzecu {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzl zzb;
    private final String zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzebz(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, String str, String str2, zzeby zzebyVar) {
        this.zza = activity;
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzecu) {
            zzecu zzecuVar = (zzecu) obj;
            if (this.zza.equals(zzecuVar.zza()) && ((zzlVar = this.zzb) != null ? zzlVar.equals(zzecuVar.zzb()) : zzecuVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzecuVar.zzc()) : zzecuVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzecuVar.zzd()) : zzecuVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzb;
        int i10 = 0;
        if (zzlVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzlVar.hashCode();
        }
        int i11 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        String str = this.zzc;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.zzd;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i12 ^ i10;
    }

    public final String toString() {
        return "OfflineUtilsParams{activity=" + this.zza.toString() + ", adOverlay=" + String.valueOf(this.zzb) + ", gwsQueryId=" + this.zzc + ", uri=" + this.zzd + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final com.google.android.gms.ads.internal.overlay.zzl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final String zzd() {
        return this.zzd;
    }
}
