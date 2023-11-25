package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
/* loaded from: classes4.dex */
public final class GroupViewModel$postGroupChat$1$1 extends r implements l<Throwable, w> {
    final /* synthetic */ pc.a<w> $onError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$postGroupChat$1$1(pc.a<w> aVar) {
        super(1);
        this.$onError = aVar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        q.i(th, "it");
        ExceptionHandler.Companion.reportError(th);
        this.$onError.invoke();
    }
}
