package com.habitrpg.android.habitica.ui.views;

import ad.k0;
import dc.w;
import j0.j1;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingButton.kt */
/* loaded from: classes4.dex */
public final class LoadingButtonKt$Preview$1$1 extends r implements pc.a<w> {
    final /* synthetic */ k0 $scope;
    final /* synthetic */ j1<LoadingButtonState> $state$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoadingButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.LoadingButtonKt$Preview$1$1$1", f = "LoadingButton.kt", l = {225, 227, 229, 231, 233}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.LoadingButtonKt$Preview$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ j1<LoadingButtonState> $state$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(j1<LoadingButtonState> j1Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$state$delegate = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$state$delegate, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r9.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 2000(0x7d0, double:9.88E-321)
                if (r1 == 0) goto L35
                if (r1 == r6) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                dc.n.b(r10)
                goto L88
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                dc.n.b(r10)
                goto L78
            L29:
                dc.n.b(r10)
                goto L68
            L2d:
                dc.n.b(r10)
                goto L58
            L31:
                dc.n.b(r10)
                goto L48
            L35:
                dc.n.b(r10)
                j0.j1<com.habitrpg.android.habitica.ui.views.LoadingButtonState> r10 = r9.$state$delegate
                com.habitrpg.android.habitica.ui.views.LoadingButtonState r1 = com.habitrpg.android.habitica.ui.views.LoadingButtonState.LOADING
                com.habitrpg.android.habitica.ui.views.LoadingButtonKt.access$Preview$lambda$3(r10, r1)
                r9.label = r6
                java.lang.Object r10 = ad.u0.a(r7, r9)
                if (r10 != r0) goto L48
                return r0
            L48:
                j0.j1<com.habitrpg.android.habitica.ui.views.LoadingButtonState> r10 = r9.$state$delegate
                com.habitrpg.android.habitica.ui.views.LoadingButtonState r1 = com.habitrpg.android.habitica.ui.views.LoadingButtonState.FAILED
                com.habitrpg.android.habitica.ui.views.LoadingButtonKt.access$Preview$lambda$3(r10, r1)
                r9.label = r5
                java.lang.Object r10 = ad.u0.a(r7, r9)
                if (r10 != r0) goto L58
                return r0
            L58:
                j0.j1<com.habitrpg.android.habitica.ui.views.LoadingButtonState> r10 = r9.$state$delegate
                com.habitrpg.android.habitica.ui.views.LoadingButtonState r1 = com.habitrpg.android.habitica.ui.views.LoadingButtonState.LOADING
                com.habitrpg.android.habitica.ui.views.LoadingButtonKt.access$Preview$lambda$3(r10, r1)
                r9.label = r4
                java.lang.Object r10 = ad.u0.a(r7, r9)
                if (r10 != r0) goto L68
                return r0
            L68:
                j0.j1<com.habitrpg.android.habitica.ui.views.LoadingButtonState> r10 = r9.$state$delegate
                com.habitrpg.android.habitica.ui.views.LoadingButtonState r1 = com.habitrpg.android.habitica.ui.views.LoadingButtonState.SUCCESS
                com.habitrpg.android.habitica.ui.views.LoadingButtonKt.access$Preview$lambda$3(r10, r1)
                r9.label = r3
                java.lang.Object r10 = ad.u0.a(r7, r9)
                if (r10 != r0) goto L78
                return r0
            L78:
                j0.j1<com.habitrpg.android.habitica.ui.views.LoadingButtonState> r10 = r9.$state$delegate
                com.habitrpg.android.habitica.ui.views.LoadingButtonState r1 = com.habitrpg.android.habitica.ui.views.LoadingButtonState.DISABLED
                com.habitrpg.android.habitica.ui.views.LoadingButtonKt.access$Preview$lambda$3(r10, r1)
                r9.label = r2
                java.lang.Object r10 = ad.u0.a(r7, r9)
                if (r10 != r0) goto L88
                return r0
            L88:
                j0.j1<com.habitrpg.android.habitica.ui.views.LoadingButtonState> r10 = r9.$state$delegate
                com.habitrpg.android.habitica.ui.views.LoadingButtonState r0 = com.habitrpg.android.habitica.ui.views.LoadingButtonState.CONTENT
                com.habitrpg.android.habitica.ui.views.LoadingButtonKt.access$Preview$lambda$3(r10, r0)
                dc.w r10 = dc.w.f13270a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.LoadingButtonKt$Preview$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingButtonKt$Preview$1$1(k0 k0Var, j1<LoadingButtonState> j1Var) {
        super(0);
        this.$scope = k0Var;
        this.$state$delegate = j1Var;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ad.i.d(this.$scope, null, null, new AnonymousClass1(this.$state$delegate, null), 3, null);
    }
}
