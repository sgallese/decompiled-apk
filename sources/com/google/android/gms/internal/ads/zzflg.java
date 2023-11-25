package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzflg extends zzfld {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.ads.zzfld
    public final zzfld zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final zzfld zzb(boolean z10) {
        this.zzc = true;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final zzfld zzc(boolean z10) {
        this.zzb = z10;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final zzfle zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzfli(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" clientVersion");
        }
        if ((this.zzd & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
