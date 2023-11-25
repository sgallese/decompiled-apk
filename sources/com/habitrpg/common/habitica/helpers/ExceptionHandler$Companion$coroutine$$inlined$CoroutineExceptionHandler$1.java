package com.habitrpg.common.habitica.helpers;

import ad.h0;
import pc.l;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes4.dex */
public final class ExceptionHandler$Companion$coroutine$$inlined$CoroutineExceptionHandler$1 extends hc.a implements h0 {
    final /* synthetic */ l $handler$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionHandler$Companion$coroutine$$inlined$CoroutineExceptionHandler$1(h0.a aVar, l lVar) {
        super(aVar);
        this.$handler$inlined = lVar;
    }

    @Override // ad.h0
    public void handleException(hc.f fVar, Throwable th) {
        ExceptionHandler.Companion.reportError(th);
        l lVar = this.$handler$inlined;
        if (lVar != null) {
            lVar.invoke(th);
        }
    }
}
