package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClassSelectionActivity.kt */
/* loaded from: classes4.dex */
public final class ClassSelectionActivity$optOutSelected$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
    final /* synthetic */ ClassSelectionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassSelectionActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity$optOutSelected$1$1", f = "ClassSelectionActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity$optOutSelected$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        int label;
        final /* synthetic */ ClassSelectionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ClassSelectionActivity classSelectionActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = classSelectionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Boolean unused;
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                unused = this.this$0.classWasUnset;
                this.this$0.optOutOfClasses();
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassSelectionActivity$optOutSelected$1(ClassSelectionActivity classSelectionActivity) {
        super(2);
        this.this$0 = classSelectionActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(this.this$0, null), 2, null);
    }
}
