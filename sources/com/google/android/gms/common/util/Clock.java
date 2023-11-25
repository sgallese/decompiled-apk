package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public interface Clock {

    /* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
    /* renamed from: com.google.android.gms.common.util.Clock$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
    }

    @KeepForSdk
    long currentThreadTimeMillis();

    @KeepForSdk
    long currentTimeMillis();

    @KeepForSdk
    long elapsedRealtime();

    @KeepForSdk
    long nanoTime();
}
