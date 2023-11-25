package com.habitrpg.android.habitica.interactors;

import ad.a1;
import ad.i;
import ad.k0;
import ad.u0;
import android.app.Activity;
import androidx.lifecycle.q;
import com.habitrpg.android.habitica.ui.views.dialogs.AchievementDialog;
import com.habitrpg.common.habitica.models.notifications.AchievementData;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShowNotificationInteractor.kt */
@f(c = "com.habitrpg.android.habitica.interactors.ShowNotificationInteractor$showAchievementDialog$1", f = "ShowNotificationInteractor.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShowNotificationInteractor$showAchievementDialog$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ AchievementData $data;
    final /* synthetic */ long $delayTime;
    int label;
    final /* synthetic */ ShowNotificationInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShowNotificationInteractor.kt */
    @f(c = "com.habitrpg.android.habitica.interactors.ShowNotificationInteractor$showAchievementDialog$1$1", f = "ShowNotificationInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.interactors.ShowNotificationInteractor$showAchievementDialog$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ AchievementData $data;
        int label;
        final /* synthetic */ ShowNotificationInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ShowNotificationInteractor showNotificationInteractor, AchievementData achievementData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = showNotificationInteractor;
            this.$data = achievementData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$data, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Activity activity;
            d.d();
            if (this.label == 0) {
                n.b(obj);
                activity = this.this$0.activity;
                AchievementDialog achievementDialog = new AchievementDialog(activity);
                achievementDialog.setLastOnboardingAchievement(this.$data.isLastOnboardingAchievement());
                String achievement = this.$data.getAchievement();
                if (achievement == null) {
                    achievement = "";
                }
                achievementDialog.setType(achievement, this.$data.getMessage(), this.$data.getModalText());
                achievementDialog.enqueue();
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowNotificationInteractor$showAchievementDialog$1(long j10, ShowNotificationInteractor showNotificationInteractor, AchievementData achievementData, Continuation<? super ShowNotificationInteractor$showAchievementDialog$1> continuation) {
        super(2, continuation);
        this.$delayTime = j10;
        this.this$0 = showNotificationInteractor;
        this.$data = achievementData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShowNotificationInteractor$showAchievementDialog$1(this.$delayTime, this.this$0, this.$data, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShowNotificationInteractor$showAchievementDialog$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        q qVar;
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
            long j10 = this.$delayTime;
            this.label = 1;
            if (u0.a(j10, this) == d10) {
                return d10;
            }
        }
        qVar = this.this$0.lifecycleScope;
        i.d(qVar, a1.c(), null, new AnonymousClass1(this.this$0, this.$data, null), 2, null);
        return w.f13270a;
    }
}
