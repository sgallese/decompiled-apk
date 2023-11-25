package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzaj implements zzah {
    private static final zzah zza = new zzah() { // from class: com.google.android.gms.internal.wearable.zzai
        @Override // com.google.android.gms.internal.wearable.zzah
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzah zzb;
    private Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(zzah zzahVar) {
        this.zzb = zzahVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.wearable.zzah
    public final Object zza() {
        zzah zzahVar = this.zzb;
        zzah zzahVar2 = zza;
        if (zzahVar != zzahVar2) {
            synchronized (this) {
                if (this.zzb != zzahVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzahVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
