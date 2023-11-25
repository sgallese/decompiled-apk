package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.user.User;
import kotlin.coroutines.Continuation;
import zc.a;

/* compiled from: SetupActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SetupActivity$onCreate$1", f = "SetupActivity.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SetupActivity$onCreate$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ SetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupActivity$onCreate$1(SetupActivity setupActivity, Continuation<? super SetupActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = setupActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new SetupActivity$onCreate$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((SetupActivity$onCreate$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            dd.g<User> user = this.this$0.getUserRepository().getUser();
            a.C0609a c0609a = zc.a.f26431m;
            dd.g k10 = dd.i.k(user, zc.c.o(500, zc.d.MILLISECONDS));
            final SetupActivity setupActivity = this.this$0;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.SetupActivity$onCreate$1.1
                public final Object emit(User user2, Continuation<? super dc.w> continuation) {
                    SetupActivity.this.onUserReceived(user2);
                    return dc.w.f13270a;
                }

                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((User) obj2, (Continuation<? super dc.w>) continuation);
                }
            };
            this.label = 1;
            if (k10.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
