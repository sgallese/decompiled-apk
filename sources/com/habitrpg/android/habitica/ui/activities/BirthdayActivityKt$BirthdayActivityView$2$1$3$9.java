package com.habitrpg.android.habitica.ui.activities;

import android.app.Activity;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import kotlin.coroutines.Continuation;

/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
final class BirthdayActivityKt$BirthdayActivityView$2$1$3$9 extends qc.r implements pc.a<dc.w> {
    final /* synthetic */ Activity $activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BirthdayActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.BirthdayActivityKt$BirthdayActivityView$2$1$3$9$1", f = "BirthdayActivity.kt", l = {448}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.BirthdayActivityKt$BirthdayActivityView$2$1$3$9$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                Activity activity = this.$activity;
                if (activity != null) {
                    activity.finish();
                }
                this.label = 1;
                if (ad.u0.a(500L, this) == d10) {
                    return d10;
                }
            }
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.marketFragment, null, 2, null);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivityKt$BirthdayActivityView$2$1$3$9(Activity activity) {
        super(0);
        this.$activity = activity;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ dc.w invoke() {
        invoke2();
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExceptionHandlerKt.launchCatching$default(ad.l0.b(), null, new AnonymousClass1(this.$activity, null), 1, null);
    }
}
