package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class HashAccumulator {
    @VisibleForTesting
    static int zaa = 31;
    private int zab = 1;

    @KeepForSdk
    public HashAccumulator addObject(Object obj) {
        int hashCode;
        int i10 = zaa * this.zab;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.zab = i10 + hashCode;
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zab;
    }

    public final HashAccumulator zaa(boolean z10) {
        this.zab = (zaa * this.zab) + (z10 ? 1 : 0);
        return this;
    }
}
