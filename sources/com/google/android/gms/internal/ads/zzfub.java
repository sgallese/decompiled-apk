package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfub extends zzfsd {
    private final zzfud zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfub(zzfud zzfudVar, int i10) {
        super(zzfudVar.size(), i10);
        this.zza = zzfudVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
