package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzavh implements Comparator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavh(zzavj zzavjVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzavn zzavnVar = (zzavn) obj;
        zzavn zzavnVar2 = (zzavn) obj2;
        int i10 = zzavnVar.zzc - zzavnVar2.zzc;
        if (i10 != 0) {
            return i10;
        }
        return (zzavnVar.zza > zzavnVar2.zza ? 1 : (zzavnVar.zza == zzavnVar2.zza ? 0 : -1));
    }
}
