package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.lang.ref.WeakReference;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeathActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.DeathActivity$onCreate$6$1", f = "DeathActivity.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DeathActivity$onCreate$6$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ DeathActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeathActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.DeathActivity$onCreate$6$1$1", f = "DeathActivity.kt", l = {169}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.DeathActivity$onCreate$6$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        final /* synthetic */ Equipment $brokenItem;
        int label;
        final /* synthetic */ DeathActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DeathActivity deathActivity, Equipment equipment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = deathActivity;
            this.$brokenItem = equipment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$brokenItem, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            BaseActivity baseActivity;
            WeakReference<BaseActivity> currentActivity;
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
                if (ad.u0.a(500L, this) == d10) {
                    return d10;
                }
            }
            HabiticaBaseApplication companion = HabiticaBaseApplication.Companion.getInstance(this.this$0);
            SnackbarActivity snackbarActivity = null;
            if (companion != null && (currentActivity = companion.getCurrentActivity()) != null) {
                baseActivity = currentActivity.get();
            } else {
                baseActivity = null;
            }
            if (baseActivity instanceof SnackbarActivity) {
                snackbarActivity = (SnackbarActivity) baseActivity;
            }
            if (snackbarActivity != null) {
                HabiticaSnackbar.Companion.showSnackbar(snackbarActivity.snackbarContainer(), this.this$0.getString(R.string.revive_broken_equipment, this.$brokenItem.getText()), HabiticaSnackbar.SnackbarDisplayType.BLACK, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeathActivity$onCreate$6$1(DeathActivity deathActivity, Continuation<? super DeathActivity$onCreate$6$1> continuation) {
        super(2, continuation);
        this.this$0 = deathActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new DeathActivity$onCreate$6$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((DeathActivity$onCreate$6$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            this.label = 1;
            obj = userRepository.revive(this);
            if (obj == d10) {
                return d10;
            }
        }
        Equipment equipment = (Equipment) obj;
        if (equipment != null) {
            ExceptionHandlerKt.launchCatching$default(ad.l0.b(), null, new AnonymousClass1(this.this$0, equipment, null), 1, null);
        }
        this.this$0.finish();
        return dc.w.f13270a;
    }
}
