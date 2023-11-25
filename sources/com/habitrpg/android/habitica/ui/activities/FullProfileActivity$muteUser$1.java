package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullProfileActivity.kt */
/* loaded from: classes4.dex */
public final class FullProfileActivity$muteUser$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
    final /* synthetic */ boolean $isMuted;
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FullProfileActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity$muteUser$1$1", f = "FullProfileActivity.kt", l = {322, 323}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$muteUser$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        final /* synthetic */ boolean $isMuted;
        int label;
        final /* synthetic */ FullProfileActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, FullProfileActivity fullProfileActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isMuted = z10;
            this.this$0 = fullProfileActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$isMuted, this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                dc.n.b(r6)
                goto L6c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                dc.n.b(r6)
                goto L5f
            L1e:
                dc.n.b(r6)
                boolean r6 = r5.$isMuted
                r6 = r6 ^ r3
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
                java.lang.String r1 = "chatRevoked"
                dc.l r6 = dc.r.a(r1, r6)
                java.util.Map r6 = ec.k0.e(r6)
                java.lang.String r1 = "flags"
                dc.l r6 = dc.r.a(r1, r6)
                java.util.Map r6 = ec.k0.e(r6)
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r1 = r5.this$0
                j0.j1 r1 = com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$getMember$p(r1)
                java.lang.Object r1 = r1.getValue()
                com.habitrpg.android.habitica.models.members.Member r1 = (com.habitrpg.android.habitica.models.members.Member) r1
                if (r1 == 0) goto L61
                java.lang.String r1 = r1.getId()
                if (r1 == 0) goto L61
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r4 = r5.this$0
                com.habitrpg.android.habitica.data.SocialRepository r4 = r4.getSocialRepository()
                r5.label = r3
                java.lang.Object r6 = r4.updateMember(r1, r6, r5)
                if (r6 != r0) goto L5f
                return r0
            L5f:
                com.habitrpg.android.habitica.models.members.Member r6 = (com.habitrpg.android.habitica.models.members.Member) r6
            L61:
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r6 = r5.this$0
                r5.label = r2
                java.lang.Object r6 = com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$refresh(r6, r3, r5)
                if (r6 != r0) goto L6c
                return r0
            L6c:
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r6 = r5.this$0
                r6.invalidateOptionsMenu()
                dc.w r6 = dc.w.f13270a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$muteUser$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$muteUser$1(FullProfileActivity fullProfileActivity, boolean z10) {
        super(2);
        this.this$0 = fullProfileActivity;
        this.$isMuted = z10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.$isMuted, this.this$0, null), 1, null);
    }
}
