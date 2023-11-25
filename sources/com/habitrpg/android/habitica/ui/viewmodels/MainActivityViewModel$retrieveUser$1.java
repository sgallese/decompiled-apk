package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivityViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel$retrieveUser$1", f = "MainActivityViewModel.kt", l = {95, 96, 119, 120}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActivityViewModel$retrieveUser$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ boolean $forced;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$retrieveUser$1(MainActivityViewModel mainActivityViewModel, boolean z10, Continuation<? super MainActivityViewModel$retrieveUser$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivityViewModel;
        this.$forced = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MainActivityViewModel$retrieveUser$1(this.this$0, this.$forced, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MainActivityViewModel$retrieveUser$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel$retrieveUser$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
