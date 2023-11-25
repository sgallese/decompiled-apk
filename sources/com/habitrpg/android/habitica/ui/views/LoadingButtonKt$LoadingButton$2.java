package com.habitrpg.android.habitica.ui.views;

import a1.p1;
import a2.c0;
import com.habitrpg.android.habitica.R;
import dc.w;
import f0.d1;
import f0.f2;
import j0.g3;
import j0.n;
import j2.t;
import pc.p;
import pc.q;
import qc.r;
import t.u;
import v1.k0;
import w.a0;
import w.s;

/* compiled from: LoadingButton.kt */
/* loaded from: classes4.dex */
final class LoadingButtonKt$LoadingButton$2 extends r implements q<a0, j0.l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ q<a0, j0.l, Integer, w> $content;
    final /* synthetic */ g3<p1> $contentColor;
    final /* synthetic */ s $contentPadding;
    final /* synthetic */ q<a0, j0.l, Integer, w> $failedContent;
    final /* synthetic */ LoadingButtonState $state;
    final /* synthetic */ q<a0, j0.l, Integer, w> $successContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoadingButton.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.LoadingButtonKt$LoadingButton$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements p<j0.l, Integer, w> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty$1;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ q<a0, j0.l, Integer, w> $content;
        final /* synthetic */ g3<p1> $contentColor;
        final /* synthetic */ s $contentPadding;
        final /* synthetic */ q<a0, j0.l, Integer, w> $failedContent;
        final /* synthetic */ LoadingButtonState $state;
        final /* synthetic */ q<a0, j0.l, Integer, w> $successContent;
        final /* synthetic */ a0 $this_Button;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoadingButton.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.views.LoadingButtonKt$LoadingButton$2$1$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends r implements pc.r<r.d, LoadingButtonState, j0.l, Integer, w> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ q<a0, j0.l, Integer, w> $content;
            final /* synthetic */ g3<p1> $contentColor;
            final /* synthetic */ q<a0, j0.l, Integer, w> $failedContent;
            final /* synthetic */ q<a0, j0.l, Integer, w> $successContent;
            final /* synthetic */ a0 $this_Button;

            /* compiled from: LoadingButton.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.views.LoadingButtonKt$LoadingButton$2$1$2$WhenMappings */
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LoadingButtonState.values().length];
                    try {
                        iArr[LoadingButtonState.LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LoadingButtonState.SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[LoadingButtonState.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(g3<p1> g3Var, q<? super a0, ? super j0.l, ? super Integer, w> qVar, q<? super a0, ? super j0.l, ? super Integer, w> qVar2, a0 a0Var, int i10, int i11, q<? super a0, ? super j0.l, ? super Integer, w> qVar3) {
                super(4);
                this.$contentColor = g3Var;
                this.$successContent = qVar;
                this.$content = qVar2;
                this.$this_Button = a0Var;
                this.$$dirty = i10;
                this.$$dirty1 = i11;
                this.$failedContent = qVar3;
            }

            @Override // pc.r
            public /* bridge */ /* synthetic */ w invoke(r.d dVar, LoadingButtonState loadingButtonState, j0.l lVar, Integer num) {
                invoke(dVar, loadingButtonState, lVar, num.intValue());
                return w.f13270a;
            }

            public final void invoke(r.d dVar, LoadingButtonState loadingButtonState, j0.l lVar, int i10) {
                w wVar;
                qc.q.i(dVar, "$this$AnimatedContent");
                qc.q.i(loadingButtonState, "state");
                if (n.K()) {
                    n.V(1827556029, i10, -1, "com.habitrpg.android.habitica.ui.views.LoadingButton.<anonymous>.<anonymous>.<anonymous> (LoadingButton.kt:188)");
                }
                int i11 = WhenMappings.$EnumSwitchMapping$0[loadingButtonState.ordinal()];
                if (i11 != 1) {
                    w wVar2 = null;
                    if (i11 == 2) {
                        lVar.e(-1047445639);
                        q<a0, j0.l, Integer, w> qVar = this.$successContent;
                        lVar.e(-1047445623);
                        if (qVar != null) {
                            qVar.invoke(this.$this_Button, lVar, Integer.valueOf(this.$$dirty & 14));
                            wVar2 = w.f13270a;
                        }
                        lVar.N();
                        if (wVar2 == null) {
                            this.$content.invoke(this.$this_Button, lVar, Integer.valueOf((this.$$dirty & 14) | (this.$$dirty1 & 112)));
                        }
                        lVar.N();
                    } else if (i11 != 3) {
                        lVar.e(-1047445235);
                        this.$content.invoke(this.$this_Button, lVar, Integer.valueOf((this.$$dirty & 14) | (this.$$dirty1 & 112)));
                        lVar.N();
                    } else {
                        lVar.e(-1047445524);
                        q<a0, j0.l, Integer, w> qVar2 = this.$failedContent;
                        lVar.e(-1047445509);
                        if (qVar2 == null) {
                            wVar = null;
                        } else {
                            qVar2.invoke(this.$this_Button, lVar, Integer.valueOf(this.$$dirty & 14));
                            wVar = w.f13270a;
                        }
                        lVar.N();
                        if (wVar == null) {
                            u.a(s1.f.d(R.drawable.failed_loading, lVar, 6), s1.h.a(R.string.failed, lVar, 6), androidx.compose.foundation.layout.j.k(androidx.compose.ui.e.f2335a, j2.h.j(8), 0.0f, 2, null), null, null, 0.0f, null, lVar, 392, 120);
                        }
                        lVar.N();
                    }
                } else {
                    lVar.e(-1047445859);
                    d1.a(androidx.compose.foundation.layout.m.o(androidx.compose.ui.e.f2335a, j2.h.j(16)), this.$contentColor.getValue().y(), 0.0f, 0L, 0, lVar, 6, 28);
                    lVar.N();
                }
                if (n.K()) {
                    n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(s sVar, LoadingButtonState loadingButtonState, q<? super a0, ? super j0.l, ? super Integer, w> qVar, int i10, g3<p1> g3Var, q<? super a0, ? super j0.l, ? super Integer, w> qVar2, a0 a0Var, int i11, int i12, q<? super a0, ? super j0.l, ? super Integer, w> qVar3) {
            super(2);
            this.$contentPadding = sVar;
            this.$state = loadingButtonState;
            this.$successContent = qVar;
            this.$$dirty = i10;
            this.$contentColor = g3Var;
            this.$content = qVar2;
            this.$this_Button = a0Var;
            this.$$dirty$1 = i11;
            this.$$dirty1 = i12;
            this.$failedContent = qVar3;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v0, types: [j0.l] */
        /* JADX WARN: Type inference failed for: r6v2 */
        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(-509110535, i10, -1, "com.habitrpg.android.habitica.ui.views.LoadingButton.<anonymous>.<anonymous> (LoadingButton.kt:156)");
            }
            v0.b d10 = v0.b.f24258a.d();
            androidx.compose.ui.e h10 = androidx.compose.foundation.layout.j.h(androidx.compose.ui.e.f2335a, this.$contentPadding);
            LoadingButtonState loadingButtonState = this.$state;
            q<a0, j0.l, Integer, w> qVar = this.$successContent;
            lVar.e(1157296644);
            boolean Q = lVar.Q(qVar);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = new LoadingButtonKt$LoadingButton$2$1$1$1(qVar);
                lVar.J(f10);
            }
            lVar.N();
            r.b.a(loadingButtonState, h10, f10, d10, null, null, q0.c.b(lVar, 1827556029, true, new AnonymousClass2(this.$contentColor, this.$successContent, this.$content, this.$this_Button, this.$$dirty$1, this.$$dirty1, this.$failedContent)), lVar, (this.$$dirty & 14) | 1575936, 48);
            if (n.K()) {
                n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LoadingButtonKt$LoadingButton$2(s sVar, LoadingButtonState loadingButtonState, q<? super a0, ? super j0.l, ? super Integer, w> qVar, int i10, g3<p1> g3Var, q<? super a0, ? super j0.l, ? super Integer, w> qVar2, int i11, q<? super a0, ? super j0.l, ? super Integer, w> qVar3) {
        super(3);
        this.$contentPadding = sVar;
        this.$state = loadingButtonState;
        this.$successContent = qVar;
        this.$$dirty = i10;
        this.$contentColor = g3Var;
        this.$content = qVar2;
        this.$$dirty1 = i11;
        this.$failedContent = qVar3;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(a0 a0Var, j0.l lVar, Integer num) {
        invoke(a0Var, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(a0 a0Var, j0.l lVar, int i10) {
        int i11;
        qc.q.i(a0Var, "$this$Button");
        if ((i10 & 14) == 0) {
            i11 = i10 | (lVar.Q(a0Var) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(719223050, i11, -1, "com.habitrpg.android.habitica.ui.views.LoadingButton.<anonymous> (LoadingButton.kt:155)");
        }
        f2.a(new k0(0L, t.g(16), c0.f239m.f(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777209, null), q0.c.b(lVar, -509110535, true, new AnonymousClass1(this.$contentPadding, this.$state, this.$successContent, this.$$dirty, this.$contentColor, this.$content, a0Var, i11, this.$$dirty1, this.$failedContent)), lVar, 54);
        if (n.K()) {
            n.U();
        }
    }
}
