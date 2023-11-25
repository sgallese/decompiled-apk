package com.habitrpg.android.habitica.receivers;

import ad.k0;
import android.text.SpannableStringBuilder;
import androidx.core.util.d;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.interactors.NotifyUserUseCase;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalNotificationActionReceiver.kt */
@f(c = "com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver$handleLocalNotificationAction$9$1", f = "LocalNotificationActionReceiver.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LocalNotificationActionReceiver$handleLocalNotificationAction$9$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ LocalNotificationActionReceiver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalNotificationActionReceiver.kt */
    /* renamed from: com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver$handleLocalNotificationAction$9$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements pc.l<TaskScoringResult, w> {
        final /* synthetic */ LocalNotificationActionReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LocalNotificationActionReceiver localNotificationActionReceiver) {
            super(1);
            this.this$0 = localNotificationActionReceiver;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(TaskScoringResult taskScoringResult) {
            invoke2(taskScoringResult);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(TaskScoringResult taskScoringResult) {
            q.i(taskScoringResult, "it");
            d<SpannableStringBuilder, HabiticaSnackbar.SnackbarDisplayType> notificationAndAddStatsToUserAsText = NotifyUserUseCase.Companion.getNotificationAndAddStatsToUserAsText(Double.valueOf(taskScoringResult.getExperienceDelta()), Double.valueOf(taskScoringResult.getHealthDelta()), Double.valueOf(taskScoringResult.getGoldDelta()), Double.valueOf(taskScoringResult.getManaDelta()));
            LocalNotificationActionReceiver localNotificationActionReceiver = this.this$0;
            SpannableStringBuilder spannableStringBuilder = notificationAndAddStatsToUserAsText.f4048a;
            q.h(spannableStringBuilder, "first");
            localNotificationActionReceiver.showToast(spannableStringBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalNotificationActionReceiver$handleLocalNotificationAction$9$1(LocalNotificationActionReceiver localNotificationActionReceiver, String str, Continuation<? super LocalNotificationActionReceiver$handleLocalNotificationAction$9$1> continuation) {
        super(2, continuation);
        this.this$0 = localNotificationActionReceiver;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new LocalNotificationActionReceiver$handleLocalNotificationAction$9$1(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((LocalNotificationActionReceiver$handleLocalNotificationAction$9$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            TaskRepository taskRepository = this.this$0.getTaskRepository();
            String str = this.$it;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (taskRepository.taskChecked((User) null, str, true, false, (pc.l<? super TaskScoringResult, w>) anonymousClass1, (Continuation<? super TaskScoringResult>) this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
