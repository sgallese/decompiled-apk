package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgss implements zzgtu {
    private static final zzgsy zza = new zzgsq();
    private final zzgsy zzb;

    public zzgss() {
        zzgsy zzgsyVar;
        zzgsy[] zzgsyVarArr = new zzgsy[2];
        zzgsyVarArr[0] = zzgrl.zza();
        try {
            zzgsyVar = (zzgsy) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgsyVar = zza;
        }
        zzgsyVarArr[1] = zzgsyVar;
        zzgsr zzgsrVar = new zzgsr(zzgsyVarArr);
        byte[] bArr = zzgsa.zzd;
        this.zzb = zzgsrVar;
    }

    private static boolean zzb(zzgsx zzgsxVar) {
        if (zzgsxVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgtu
    public final zzgtt zza(Class cls) {
        zzgtv.zzr(cls);
        zzgsx zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzgrq.class.isAssignableFrom(cls)) {
                return zzgte.zzc(zzgtv.zzn(), zzgrf.zzb(), zzb.zza());
            }
            return zzgte.zzc(zzgtv.zzm(), zzgrf.zza(), zzb.zza());
        } else if (zzgrq.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzgtd.zzl(cls, zzb, zzgtg.zzb(), zzgso.zze(), zzgtv.zzn(), zzgrf.zzb(), zzgsw.zzb());
            }
            return zzgtd.zzl(cls, zzb, zzgtg.zzb(), zzgso.zze(), zzgtv.zzn(), null, zzgsw.zzb());
        } else if (zzb(zzb)) {
            return zzgtd.zzl(cls, zzb, zzgtg.zza(), zzgso.zzd(), zzgtv.zzm(), zzgrf.zza(), zzgsw.zza());
        } else {
            return zzgtd.zzl(cls, zzb, zzgtg.zza(), zzgso.zzd(), zzgtv.zzm(), null, zzgsw.zza());
        }
    }
}
