package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import kotlin.coroutines.Continuation;

/* compiled from: DeathActivity.kt */
/* loaded from: classes4.dex */
final class DeathActivity$onCreate$handler$1 extends qc.r implements pc.l<Boolean, dc.w> {
    final /* synthetic */ DeathActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeathActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.DeathActivity$onCreate$handler$1$1", f = "DeathActivity.kt", l = {79}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.DeathActivity$onCreate$handler$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        int label;
        final /* synthetic */ DeathActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DeathActivity deathActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = deathActivity;
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
                UserRepository userRepository = this.this$0.getUserRepository();
                Integer d11 = kotlin.coroutines.jvm.internal.b.d(1);
                this.label = 1;
                if (userRepository.updateUser("stats.hp", d11, this) == d10) {
                    return d10;
                }
            }
            this.this$0.finish();
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeathActivity$onCreate$handler$1(DeathActivity deathActivity) {
        super(1);
        this.this$0 = deathActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return dc.w.f13270a;
    }

    public final void invoke(boolean z10) {
        if (z10) {
            ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(this.this$0, null), 2, null);
        }
    }
}
