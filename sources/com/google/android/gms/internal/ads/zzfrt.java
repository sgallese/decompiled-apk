package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
abstract class zzfrt extends zzfqn {
    final CharSequence zzb;
    final zzfqt zzc;
    int zzd = 0;
    int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfrt(zzfrv zzfrvVar, CharSequence charSequence) {
        zzfqt zzfqtVar;
        zzfqtVar = zzfrvVar.zza;
        this.zzc = zzfqtVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i10 = this.zzd;
        while (true) {
            int i11 = this.zzd;
            if (i11 != -1) {
                int zzd = zzd(i11);
                if (zzd == -1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    zzc = -1;
                } else {
                    zzc = zzc(zzd);
                    this.zzd = zzc;
                }
                if (zzc == i10) {
                    int i12 = zzc + 1;
                    this.zzd = i12;
                    if (i12 > this.zzb.length()) {
                        this.zzd = -1;
                    }
                } else {
                    if (i10 < zzd) {
                        this.zzb.charAt(i10);
                    }
                    if (i10 < zzd) {
                        this.zzb.charAt(zzd - 1);
                    }
                    int i13 = this.zze;
                    if (i13 == 1) {
                        zzd = this.zzb.length();
                        this.zzd = -1;
                        if (zzd > i10) {
                            this.zzb.charAt(zzd - 1);
                        }
                    } else {
                        this.zze = i13 - 1;
                    }
                    return this.zzb.subSequence(i10, zzd).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    abstract int zzc(int i10);

    abstract int zzd(int i10);
}
