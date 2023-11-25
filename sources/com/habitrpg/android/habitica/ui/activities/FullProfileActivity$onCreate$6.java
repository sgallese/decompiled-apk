package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.user.User;
import kotlin.coroutines.Continuation;

/* compiled from: FullProfileActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6", f = "FullProfileActivity.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullProfileActivity$onCreate$6 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$onCreate$6(FullProfileActivity fullProfileActivity, Continuation<? super FullProfileActivity$onCreate$6> continuation) {
        super(2, continuation);
        this.this$0 = fullProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new FullProfileActivity$onCreate$6(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((FullProfileActivity$onCreate$6) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (user.collect(anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FullProfileActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements dd.h {
        final /* synthetic */ FullProfileActivity this$0;

        AnonymousClass1(FullProfileActivity fullProfileActivity) {
            this.this$0 = fullProfileActivity;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
        
            if (r8 != false) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.habitrpg.android.habitica.models.user.User r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6$1$emit$1 r0 = (com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6$1$emit$1 r0 = new com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r8 = r0.L$0
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6$1 r8 = (com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6.AnonymousClass1) r8
                dc.n.b(r9)
                goto Lcd
            L2e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L36:
                dc.n.b(r9)
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r9 = r7.this$0
                if (r8 == 0) goto L4a
                com.habitrpg.android.habitica.models.user.Inbox r2 = r8.getInbox()
                if (r2 == 0) goto L4a
                io.realm.x0 r2 = r2.getBlocks()
                if (r2 == 0) goto L4a
                goto L4e
            L4a:
                java.util.List r2 = ec.r.i()
            L4e:
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$setBlocks$p(r9, r2)
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r9 = r7.this$0
                com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r9 = com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$getBinding$p(r9)
                r2 = 0
                java.lang.String r4 = "binding"
                if (r9 != 0) goto L60
                qc.q.z(r4)
                r9 = r2
            L60:
                android.widget.FrameLayout r9 = r9.blockedDisclaimerView
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r5 = r7.this$0
                boolean r5 = com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$isUserBlocked(r5)
                r6 = 0
                if (r5 == 0) goto L6d
                r5 = 0
                goto L6f
            L6d:
                r5 = 8
            L6f:
                r9.setVisibility(r5)
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r9 = r7.this$0
                if (r8 == 0) goto L80
                com.habitrpg.android.habitica.models.user.Permission r5 = com.habitrpg.android.habitica.models.user.Permission.USER_SUPPORT
                boolean r5 = r8.hasPermission(r5)
                if (r5 != r3) goto L80
                r5 = 1
                goto L81
            L80:
                r5 = 0
            L81:
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$setUserSupport$p(r9, r5)
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r9 = r7.this$0
                if (r8 == 0) goto L92
                com.habitrpg.android.habitica.models.user.Permission r5 = com.habitrpg.android.habitica.models.user.Permission.MODERATOR
                boolean r8 = r8.hasPermission(r5)
                if (r8 != r3) goto L92
                r8 = 1
                goto L93
            L92:
                r8 = 0
            L93:
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$setModerator$p(r9, r8)
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r8 = r7.this$0
                boolean r8 = com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$isModerator$p(r8)
                if (r8 != 0) goto La9
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r8 = r7.this$0
                boolean r8 = com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$isUserSupport$p(r8)
                if (r8 == 0) goto La7
                goto La9
            La7:
                r8 = r7
                goto Lcd
            La9:
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r8 = r7.this$0
                com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r8 = com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$getBinding$p(r8)
                if (r8 != 0) goto Lb5
                qc.q.z(r4)
                goto Lb6
            Lb5:
                r2 = r8
            Lb6:
                android.widget.LinearLayout r8 = r2.adminStatusView
                java.lang.String r9 = "adminStatusView"
                qc.q.h(r8, r9)
                r8.setVisibility(r6)
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r8 = r7.this$0
                r0.L$0 = r7
                r0.label = r3
                java.lang.Object r8 = com.habitrpg.android.habitica.ui.activities.FullProfileActivity.access$refresh(r8, r3, r0)
                if (r8 != r1) goto La7
                return r1
            Lcd:
                com.habitrpg.android.habitica.ui.activities.FullProfileActivity r8 = r8.this$0
                r8.invalidateOptionsMenu()
                dc.w r8 = dc.w.f13270a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6.AnonymousClass1.emit(com.habitrpg.android.habitica.models.user.User, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // dd.h
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((User) obj, (Continuation<? super dc.w>) continuation);
        }
    }
}
