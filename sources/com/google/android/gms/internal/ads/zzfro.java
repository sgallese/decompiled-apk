package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfro extends zzfrt {
    final /* synthetic */ zzfrp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfro(zzfrp zzfrpVar, zzfrv zzfrvVar, CharSequence charSequence) {
        super(zzfrvVar, charSequence);
        this.zza = zzfrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    final int zzd(int i10) {
        zzfqt zzfqtVar = this.zza.zza;
        CharSequence charSequence = ((zzfrt) this).zzb;
        int length = charSequence.length();
        zzfri.zzb(i10, length, "index");
        while (i10 < length) {
            if (!zzfqtVar.zzb(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }
}
