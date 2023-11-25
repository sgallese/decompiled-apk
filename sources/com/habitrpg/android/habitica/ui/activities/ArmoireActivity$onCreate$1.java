package com.habitrpg.android.habitica.ui.activities;

import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ActivityArmoireBinding;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import kotlin.coroutines.Continuation;

/* compiled from: ArmoireActivity.kt */
/* loaded from: classes4.dex */
final class ArmoireActivity$onCreate$1 extends qc.r implements pc.l<User, dc.w> {
    final /* synthetic */ ArmoireActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArmoireActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ArmoireActivity$onCreate$1$1", f = "ArmoireActivity.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.ArmoireActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        int label;
        final /* synthetic */ ArmoireActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ArmoireActivity armoireActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = armoireActivity;
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
            int i10;
            ActivityArmoireBinding activityArmoireBinding;
            ActivityArmoireBinding activityArmoireBinding2;
            d10 = ic.d.d();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g<Integer> armoireRemainingCount = this.this$0.getInventoryRepository$Habitica_2311256681_prodRelease().getArmoireRemainingCount();
                this.label = 1;
                obj = dd.i.x(armoireRemainingCount, this);
                if (obj == d10) {
                    return d10;
                }
            }
            Integer num = (Integer) obj;
            int i12 = 0;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            activityArmoireBinding = this.this$0.binding;
            ActivityArmoireBinding activityArmoireBinding3 = null;
            if (activityArmoireBinding == null) {
                qc.q.z("binding");
                activityArmoireBinding = null;
            }
            activityArmoireBinding.equipmentCountView.setText(this.this$0.getString(R.string.equipment_remaining, kotlin.coroutines.jvm.internal.b.d(i10)));
            activityArmoireBinding2 = this.this$0.binding;
            if (activityArmoireBinding2 == null) {
                qc.q.z("binding");
            } else {
                activityArmoireBinding3 = activityArmoireBinding2;
            }
            TextView textView = activityArmoireBinding3.noEquipmentView;
            if (i10 > 0) {
                i12 = 8;
            }
            textView.setVisibility(i12);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArmoireActivity$onCreate$1(ArmoireActivity armoireActivity) {
        super(1);
        this.this$0 = armoireActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(User user) {
        invoke2(user);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        Double d10;
        Stats stats;
        d10 = this.this$0.gold;
        if (d10 == null) {
            this.this$0.gold = (user == null || (stats = user.getStats()) == null) ? null : stats.getGp();
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, null), 1, null);
    }
}
