package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengesOverviewFragmentDirections;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import kotlin.coroutines.Continuation;

/* compiled from: ChallengeFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$onOptionsItemSelected$2", f = "ChallengeFormActivity.kt", l = {142, 144, 148}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChallengeFormActivity$onOptionsItemSelected$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ HabiticaProgressDialog $dialog;
    int label;
    final /* synthetic */ ChallengeFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChallengeFormActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$onOptionsItemSelected$2$1", f = "ChallengeFormActivity.kt", l = {155}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$onOptionsItemSelected$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        int label;
        final /* synthetic */ ChallengeFormActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChallengeFormActivity challengeFormActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = challengeFormActivity;
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
            String str;
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
            MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
            str = this.this$0.challengeId;
            if (str == null) {
                str = "";
            }
            ChallengesOverviewFragmentDirections.OpenChallengeDetail openChallengeDetail = ChallengesOverviewFragmentDirections.openChallengeDetail(str);
            qc.q.h(openChallengeDetail, "openChallengeDetail(...)");
            mainNavigationController.navigate(openChallengeDetail);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFormActivity$onOptionsItemSelected$2(ChallengeFormActivity challengeFormActivity, HabiticaProgressDialog habiticaProgressDialog, Continuation<? super ChallengeFormActivity$onOptionsItemSelected$2> continuation) {
        super(2, continuation);
        this.this$0 = challengeFormActivity;
        this.$dialog = habiticaProgressDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeFormActivity$onOptionsItemSelected$2(this.this$0, this.$dialog, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ChallengeFormActivity$onOptionsItemSelected$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r10.label
            r2 = 0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L27
            if (r1 == r6) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            dc.n.b(r11)
            goto L69
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            dc.n.b(r11)
            goto L4b
        L23:
            dc.n.b(r11)
            goto L3d
        L27:
            dc.n.b(r11)
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            boolean r11 = com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity.access$getEditMode$p(r11)
            if (r11 == 0) goto L40
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            r10.label = r6
            java.lang.Object r11 = com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity.access$updateChallenge(r11, r10)
            if (r11 != r0) goto L3d
            return r0
        L3d:
            com.habitrpg.android.habitica.models.social.Challenge r11 = (com.habitrpg.android.habitica.models.social.Challenge) r11
            goto L4d
        L40:
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            r10.label = r5
            java.lang.Object r11 = com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity.access$createChallenge(r11, r10)
            if (r11 != r0) goto L4b
            return r0
        L4b:
            com.habitrpg.android.habitica.models.social.Challenge r11 = (com.habitrpg.android.habitica.models.social.Challenge) r11
        L4d:
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r1 = r10.this$0
            if (r11 == 0) goto L56
            java.lang.String r11 = r11.getId()
            goto L57
        L56:
            r11 = r3
        L57:
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity.access$setChallengeId$p(r1, r11)
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            com.habitrpg.android.habitica.data.ChallengeRepository r11 = r11.getChallengeRepository$Habitica_2311256681_prodRelease()
            r10.label = r4
            java.lang.Object r11 = r11.retrieveChallenges(r2, r6, r10)
            if (r11 != r0) goto L69
            return r0
        L69:
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog r11 = r10.$dialog
            if (r11 == 0) goto L70
            r11.dismiss()
        L70:
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity.access$setSavingInProgress$p(r11, r2)
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            r11.finish()
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            boolean r11 = com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity.access$getEditMode$p(r11)
            if (r11 != 0) goto L99
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            androidx.lifecycle.q r4 = androidx.lifecycle.w.a(r11)
            ad.i2 r5 = ad.a1.c()
            r6 = 0
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$onOptionsItemSelected$2$1 r7 = new com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$onOptionsItemSelected$2$1
            com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity r11 = r10.this$0
            r7.<init>(r11, r3)
            r8 = 2
            r9 = 0
            ad.g.d(r4, r5, r6, r7, r8, r9)
        L99:
            dc.w r11 = dc.w.f13270a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$onOptionsItemSelected$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
