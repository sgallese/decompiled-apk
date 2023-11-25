package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.MainActivity$displayDeathDialogIfNeeded$1", f = "MainActivity.kt", l = {694}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActivity$displayDeathDialogIfNeeded$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ long $now;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$displayDeathDialogIfNeeded$1(MainActivity mainActivity, long j10, Continuation<? super MainActivity$displayDeathDialogIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
        this.$now = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$displayDeathDialogIfNeeded$1(this.this$0, this.$now, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((MainActivity$displayDeathDialogIfNeeded$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        long j10;
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
            this.label = 1;
            if (ad.u0.a(1000L, this) == d10) {
                return d10;
            }
        }
        if (!this.this$0.isFinishing()) {
            MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
            if (mainNavigationController.isReady()) {
                long j11 = this.$now;
                j10 = this.this$0.lastDeathDialogDisplay;
                if (j11 - j10 > 10000) {
                    this.this$0.lastDeathDialogDisplay = this.$now;
                    MainNavigationController.navigate$default(mainNavigationController, R.id.deathActivity, null, 2, null);
                }
            }
        }
        return dc.w.f13270a;
    }
}
