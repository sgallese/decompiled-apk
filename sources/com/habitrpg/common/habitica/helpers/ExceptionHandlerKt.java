package com.habitrpg.common.habitica.helpers;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: ExceptionHandler.kt */
/* loaded from: classes4.dex */
public final class ExceptionHandlerKt {
    public static final void launchCatching(k0 k0Var, l<? super Throwable, w> lVar, p<? super k0, ? super Continuation<? super w>, ? extends Object> pVar) {
        q.i(k0Var, "<this>");
        q.i(pVar, "function");
        ad.i.d(k0Var, ExceptionHandler.Companion.coroutine(new ExceptionHandlerKt$launchCatching$1(lVar)), null, pVar, 2, null);
    }

    public static /* synthetic */ void launchCatching$default(k0 k0Var, l lVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        launchCatching(k0Var, lVar, pVar);
    }
}
