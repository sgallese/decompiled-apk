package com.habitrpg.android.habitica.interactors;

import ad.k0;
import ad.l0;
import com.habitrpg.android.habitica.interactors.LevelUpUseCase;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LevelUpUseCase.kt */
/* loaded from: classes4.dex */
public final class LevelUpUseCase$run$3 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ LevelUpUseCase.RequestValues $requestValues;
    final /* synthetic */ LevelUpUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LevelUpUseCase.kt */
    @f(c = "com.habitrpg.android.habitica.interactors.LevelUpUseCase$run$3$1", f = "LevelUpUseCase.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.interactors.LevelUpUseCase$run$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ LevelUpUseCase.RequestValues $requestValues;
        int label;
        final /* synthetic */ LevelUpUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LevelUpUseCase levelUpUseCase, LevelUpUseCase.RequestValues requestValues, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = levelUpUseCase;
            this.$requestValues = requestValues;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$requestValues, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            Object showClassSelection;
            d10 = d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                LevelUpUseCase levelUpUseCase = this.this$0;
                LevelUpUseCase.RequestValues requestValues = this.$requestValues;
                this.label = 1;
                showClassSelection = levelUpUseCase.showClassSelection(requestValues, this);
                if (showClassSelection == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelUpUseCase$run$3(LevelUpUseCase levelUpUseCase, LevelUpUseCase.RequestValues requestValues) {
        super(2);
        this.this$0 = levelUpUseCase;
        this.$requestValues = requestValues;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AnonymousClass1(this.this$0, this.$requestValues, null), 1, null);
    }
}
