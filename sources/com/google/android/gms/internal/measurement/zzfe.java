package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzfe extends zzkx implements zzmj {
    private zzfe() {
        super(zzff.zzf());
    }

    public final int zza() {
        return ((zzff) this.zza).zzb();
    }

    public final zzfd zzb(int i10) {
        return ((zzff) this.zza).zzd(i10);
    }

    public final zzfe zzc() {
        zzaH();
        zzff.zzr((zzff) this.zza);
        return this;
    }

    public final zzfe zzd(int i10, zzfc zzfcVar) {
        zzaH();
        zzff.zzq((zzff) this.zza, i10, (zzfd) zzfcVar.zzaD());
        return this;
    }

    public final String zze() {
        return ((zzff) this.zza).zzk();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzff) this.zza).zzm());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzff) this.zza).zzn());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfe(zzez zzezVar) {
        super(zzff.zzf());
    }
}
