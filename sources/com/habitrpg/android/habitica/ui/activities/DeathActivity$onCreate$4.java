package com.habitrpg.android.habitica.ui.activities;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ActivityDeathBinding;
import com.habitrpg.android.habitica.extensions.DateExtensionsKt;
import com.habitrpg.android.habitica.extensions.DateUtils;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.purchases.EventOutcomeSubscriptionBottomSheetFragment;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.util.Calendar;
import java.util.Date;
import kotlin.coroutines.Continuation;

/* compiled from: DeathActivity.kt */
/* loaded from: classes4.dex */
final class DeathActivity$onCreate$4 extends qc.r implements pc.l<User, dc.w> {
    final /* synthetic */ DeathActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeathActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.DeathActivity$onCreate$4$1", f = "DeathActivity.kt", l = {115}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.DeathActivity$onCreate$4$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        Object L$0;
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
            Date time;
            ActivityDeathBinding activityDeathBinding;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    time = (Date) this.L$0;
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                Calendar calendar = Calendar.getInstance();
                qc.q.h(calendar, "getInstance(...)");
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.add(5, 1);
                time = calendar.getTime();
            }
            do {
                activityDeathBinding = this.this$0.binding;
                if (activityDeathBinding == null) {
                    qc.q.z("binding");
                    activityDeathBinding = null;
                }
                TextView textView = activityDeathBinding.subscriberBenefitUsedView;
                DeathActivity deathActivity = this.this$0;
                qc.q.f(time);
                textView.setText(deathActivity.getString(R.string.subscriber_benefit_used_faint, DateExtensionsKt.getShortRemainingString(time)));
                this.L$0 = time;
                this.label = 1;
            } while (ad.u0.a(1000L, this) != d10);
            return d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeathActivity$onCreate$4(DeathActivity deathActivity) {
        super(1);
        this.this$0 = deathActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(DeathActivity deathActivity, View view) {
        qc.q.i(deathActivity, "this$0");
        Analytics.sendEvent$default(Analytics.INSTANCE, "View death sub CTA", EventCategory.BEHAVIOUR, HitType.EVENT, null, null, 24, null);
        EventOutcomeSubscriptionBottomSheetFragment eventOutcomeSubscriptionBottomSheetFragment = new EventOutcomeSubscriptionBottomSheetFragment();
        eventOutcomeSubscriptionBottomSheetFragment.setEventType(EventOutcomeSubscriptionBottomSheetFragment.EVENT_DEATH_SCREEN);
        eventOutcomeSubscriptionBottomSheetFragment.show(deathActivity.getSupportFragmentManager(), EventOutcomeSubscriptionBottomSheetFragment.TAG);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(User user) {
        invoke2(user);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        ActivityDeathBinding activityDeathBinding;
        ActivityDeathBinding activityDeathBinding2;
        ActivityDeathBinding activityDeathBinding3;
        ActivityDeathBinding activityDeathBinding4;
        ActivityDeathBinding activityDeathBinding5;
        ActivityDeathBinding activityDeathBinding6;
        ActivityDeathBinding activityDeathBinding7;
        ActivityDeathBinding activityDeathBinding8;
        ActivityDeathBinding activityDeathBinding9;
        ActivityDeathBinding activityDeathBinding10 = null;
        if (user != null && user.isSubscribed()) {
            activityDeathBinding4 = this.this$0.binding;
            if (activityDeathBinding4 == null) {
                qc.q.z("binding");
                activityDeathBinding4 = null;
            }
            if (activityDeathBinding4.reviveSubscriberWrapper.getVisibility() != 4) {
                if (DateUtils.Companion.isSameDay(new Date(), new Date(this.this$0.getSharedPreferences().getLong("last_sub_revive", 0L)))) {
                    activityDeathBinding8 = this.this$0.binding;
                    if (activityDeathBinding8 == null) {
                        qc.q.z("binding");
                        activityDeathBinding8 = null;
                    }
                    activityDeathBinding8.reviveSubscriberWrapper.setVisibility(8);
                    activityDeathBinding9 = this.this$0.binding;
                    if (activityDeathBinding9 == null) {
                        qc.q.z("binding");
                        activityDeathBinding9 = null;
                    }
                    activityDeathBinding9.subscriberBenefitUsedView.setVisibility(0);
                    ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, null), 1, null);
                } else {
                    activityDeathBinding5 = this.this$0.binding;
                    if (activityDeathBinding5 == null) {
                        qc.q.z("binding");
                        activityDeathBinding5 = null;
                    }
                    activityDeathBinding5.reviveSubscriberWrapper.setVisibility(0);
                    activityDeathBinding6 = this.this$0.binding;
                    if (activityDeathBinding6 == null) {
                        qc.q.z("binding");
                        activityDeathBinding6 = null;
                    }
                    activityDeathBinding6.subscriberBenefitUsedView.setVisibility(8);
                }
                activityDeathBinding7 = this.this$0.binding;
                if (activityDeathBinding7 == null) {
                    qc.q.z("binding");
                } else {
                    activityDeathBinding10 = activityDeathBinding7;
                }
                activityDeathBinding10.unsubbedWrapper.setVisibility(8);
                return;
            }
        }
        if ((user == null || user.isSubscribed()) ? false : true) {
            activityDeathBinding = this.this$0.binding;
            if (activityDeathBinding == null) {
                qc.q.z("binding");
                activityDeathBinding = null;
            }
            activityDeathBinding.reviveSubscriberWrapper.setVisibility(8);
            activityDeathBinding2 = this.this$0.binding;
            if (activityDeathBinding2 == null) {
                qc.q.z("binding");
                activityDeathBinding2 = null;
            }
            activityDeathBinding2.unsubbedWrapper.setVisibility(0);
            activityDeathBinding3 = this.this$0.binding;
            if (activityDeathBinding3 == null) {
                qc.q.z("binding");
            } else {
                activityDeathBinding10 = activityDeathBinding3;
            }
            Button button = activityDeathBinding10.subscribeModalButton;
            final DeathActivity deathActivity = this.this$0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeathActivity$onCreate$4.invoke$lambda$1(DeathActivity.this, view);
                }
            });
        }
    }
}
