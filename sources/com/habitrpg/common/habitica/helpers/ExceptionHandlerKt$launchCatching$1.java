package com.habitrpg.common.habitica.helpers;

import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExceptionHandler.kt */
/* loaded from: classes4.dex */
public final class ExceptionHandlerKt$launchCatching$1 extends r implements l<Throwable, w> {
    final /* synthetic */ l<Throwable, w> $errorHandler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionHandlerKt$launchCatching$1(l<? super Throwable, w> lVar) {
        super(1);
        this.$errorHandler = lVar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        q.i(th, "it");
        l<Throwable, w> lVar = this.$errorHandler;
        if (lVar != null) {
            lVar.invoke(th);
        }
    }
}
