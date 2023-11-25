package com.habitrpg.android.habitica.extensions;

import ad.l0;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import qc.q;
import zc.d;

/* compiled from: BaseExtensions.kt */
/* loaded from: classes4.dex */
public final class BaseExtensionsKt {
    public static final void runDelayed(long j10, d dVar, pc.a<w> aVar) {
        q.i(dVar, "timeUnit");
        q.i(aVar, "function");
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new BaseExtensionsKt$runDelayed$1(j10, dVar, aVar, null), 1, null);
    }
}
