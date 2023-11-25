package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.interactors.ShareAvatarUseCase;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$6;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import j0.g3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class MainActivity$onCreate$6$1$1$1$1$1$3 extends qc.r implements pc.a<dc.w> {
    final /* synthetic */ pc.a<dc.w> $dismiss;
    final /* synthetic */ g3<User> $user$delegate;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActivity$onCreate$6$1$1$1$1$1$3(pc.a<dc.w> aVar, g3<? extends User> g3Var, MainActivity mainActivity) {
        super(0);
        this.$dismiss = aVar;
        this.$user$delegate = g3Var;
        this.this$0 = mainActivity;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ dc.w invoke() {
        invoke2();
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dismiss.invoke();
        User invoke$lambda$0 = MainActivity$onCreate$6.AnonymousClass1.invoke$lambda$0(this.$user$delegate);
        if (invoke$lambda$0 != null) {
            MainActivity mainActivity = this.this$0;
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(mainActivity), null, new MainActivity$onCreate$6$1$1$1$1$1$3$1$1(new ShareAvatarUseCase(), mainActivity, invoke$lambda$0, null), 1, null);
        }
    }
}
