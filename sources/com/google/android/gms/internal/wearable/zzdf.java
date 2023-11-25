package com.google.android.gms.internal.wearable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzdf implements zzdz {
    private static final zzdl zza = new zzdd();
    private final zzdl zzb;

    public zzdf() {
        zzdl zzdlVar;
        zzdl[] zzdlVarArr = new zzdl[2];
        zzdlVarArr[0] = zzcc.zza();
        try {
            zzdlVar = (zzdl) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzdlVar = zza;
        }
        zzdlVarArr[1] = zzdlVar;
        zzde zzdeVar = new zzde(zzdlVarArr);
        byte[] bArr = zzco.zzd;
        this.zzb = zzdeVar;
    }

    private static boolean zzb(zzdk zzdkVar) {
        if (zzdkVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.zzdz
    public final zzdy zza(Class cls) {
        zzea.zzq(cls);
        zzdk zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzcg.class.isAssignableFrom(cls)) {
                return zzdr.zzc(zzea.zzn(), zzbx.zzb(), zzb.zza());
            }
            return zzdr.zzc(zzea.zzm(), zzbx.zza(), zzb.zza());
        } else if (zzcg.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzdq.zzl(cls, zzb, zzdt.zzb(), zzdb.zzd(), zzea.zzn(), zzbx.zzb(), zzdj.zzb());
            }
            return zzdq.zzl(cls, zzb, zzdt.zzb(), zzdb.zzd(), zzea.zzn(), null, zzdj.zzb());
        } else if (zzb(zzb)) {
            return zzdq.zzl(cls, zzb, zzdt.zza(), zzdb.zzc(), zzea.zzm(), zzbx.zza(), zzdj.zza());
        } else {
            return zzdq.zzl(cls, zzb, zzdt.zza(), zzdb.zzc(), zzea.zzm(), null, zzdj.zza());
        }
    }
}
