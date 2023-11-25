package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfqq extends zzfqp {
    private final char zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqq(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        int i10 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.ads.zzfqt
    public final boolean zzb(char c10) {
        if (c10 == this.zza) {
            return true;
        }
        return false;
    }
}
