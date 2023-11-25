package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }
}
