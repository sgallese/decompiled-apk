package com.habitrpg.android.habitica.ui.activities;

import androidx.recyclerview.widget.m;
import com.habitrpg.android.habitica.data.UserRepository;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetupActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SetupActivity$confirmNames$1", f = "SetupActivity.kt", l = {m.e.DEFAULT_SWIPE_ANIMATION_DURATION, 251}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SetupActivity$confirmNames$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $displayName;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ SetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupActivity$confirmNames$1(SetupActivity setupActivity, String str, String str2, Continuation<? super SetupActivity$confirmNames$1> continuation) {
        super(2, continuation);
        this.this$0 = setupActivity;
        this.$displayName = str;
        this.$username = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new SetupActivity$confirmNames$1(this.this$0, this.$displayName, this.$username, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((SetupActivity$confirmNames$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    dc.n.b(obj);
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dc.n.b(obj);
        } else {
            dc.n.b(obj);
            UserRepository userRepository = this.this$0.getUserRepository();
            String str = this.$displayName;
            this.label = 1;
            if (userRepository.updateUser("profile.name", str, this) == d10) {
                return d10;
            }
        }
        UserRepository userRepository2 = this.this$0.getUserRepository();
        String str2 = this.$username;
        this.label = 2;
        if (UserRepository.DefaultImpls.updateLoginName$default(userRepository2, str2, null, this, 2, null) == d10) {
            return d10;
        }
        return dc.w.f13270a;
    }
}
