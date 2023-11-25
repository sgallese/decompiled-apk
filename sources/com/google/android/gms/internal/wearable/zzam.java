package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzam extends zzan {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zza(float[] fArr, float f10, int i10, int i11) {
        while (i10 < i11) {
            if (fArr[i10] != f10) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    public static List zzb(float... fArr) {
        int length = fArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzal(fArr, 0, length);
    }
}
