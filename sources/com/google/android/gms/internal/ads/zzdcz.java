package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdcz extends zzdbs implements zzddb {
    public zzdcz(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        zzt(new zzdbr(str2) { // from class: com.google.android.gms.internal.ads.zzdcy
            public final /* synthetic */ String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzddb) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzb(final String str, final String str2) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdcw
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzddb) obj).zzb(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzc(final String str) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdcv
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzddb) obj).zzc(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzd(final String str) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdcx
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzddb) obj).zzd(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zze() {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdcu
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzddb) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzf() {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdct
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzddb) obj).zzf();
            }
        });
    }
}
