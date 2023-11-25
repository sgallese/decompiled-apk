package com.habitrpg.android.habitica.ui.views;

import ad.k0;
import dc.n;
import dc.w;
import f0.y0;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetUtils.kt */
/* loaded from: classes4.dex */
public final class BottomSheetUtilsKt$BottomSheetWrapper$3 extends r implements pc.a<w> {
    final /* synthetic */ k0 $coroutineScope;
    final /* synthetic */ y0 $modalBottomSheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetUtils.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt$BottomSheetWrapper$3$1", f = "BottomSheetUtils.kt", l = {120}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt$BottomSheetWrapper$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ y0 $modalBottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(y0 y0Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$modalBottomSheetState = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$modalBottomSheetState, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                y0 y0Var = this.$modalBottomSheetState;
                this.label = 1;
                if (y0Var.k(this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetUtilsKt$BottomSheetWrapper$3(k0 k0Var, y0 y0Var) {
        super(0);
        this.$coroutineScope = k0Var;
        this.$modalBottomSheetState = y0Var;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ad.i.d(this.$coroutineScope, null, null, new AnonymousClass1(this.$modalBottomSheetState, null), 3, null);
    }
}
