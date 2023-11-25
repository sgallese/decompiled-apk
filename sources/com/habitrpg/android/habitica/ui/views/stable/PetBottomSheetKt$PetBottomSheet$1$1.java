package com.habitrpg.android.habitica.ui.views.stable;

import ad.k0;
import dc.n;
import dc.w;
import ic.d;
import j0.g1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetBottomSheet.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.stable.PetBottomSheetKt$PetBottomSheet$1$1", f = "PetBottomSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PetBottomSheetKt$PetBottomSheet$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ g1 $feedValue$delegate;
    final /* synthetic */ int $trained;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetBottomSheetKt$PetBottomSheet$1$1(int i10, g1 g1Var, Continuation<? super PetBottomSheetKt$PetBottomSheet$1$1> continuation) {
        super(2, continuation);
        this.$trained = i10;
        this.$feedValue$delegate = g1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PetBottomSheetKt$PetBottomSheet$1$1(this.$trained, this.$feedValue$delegate, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PetBottomSheetKt$PetBottomSheet$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d.d();
        if (this.label == 0) {
            n.b(obj);
            this.$feedValue$delegate.i(this.$trained);
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
