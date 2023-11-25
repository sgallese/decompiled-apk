package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes3.dex */
final class zzgg implements zzft {
    private final zzfw zza;
    private final String zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgg(zzfw zzfwVar, String str, Object[] objArr) {
        this.zza = zzfwVar;
        this.zzc = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i12);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.zzd = (charAt2 << i11) | i10;
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final zzfw zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final boolean zzb() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final int zzc() {
        if ((this.zzd & 1) == 1) {
            return 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
