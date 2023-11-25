package com.habitrpg.android.habitica.ui.views;

import ad.k0;
import ad.u0;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import dc.n;
import dc.w;
import f0.y0;
import f0.z0;
import j0.j1;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetUtils.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt$BottomSheetWrapper$4", f = "BottomSheetUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BottomSheetUtilsKt$BottomSheetWrapper$4 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ComposeView $composeView;
    final /* synthetic */ k0 $coroutineScope;
    final /* synthetic */ j1<Boolean> $isSheetOpened$delegate;
    final /* synthetic */ y0 $modalBottomSheetState;
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ long $statusBarColor;
    final /* synthetic */ d6.d $systemUiController;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetUtils.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt$BottomSheetWrapper$4$1", f = "BottomSheetUtils.kt", l = {136, 137}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt$BottomSheetWrapper$4$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ y0 $modalBottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(y0 y0Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$modalBottomSheetState = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$modalBottomSheetState, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        n.b(obj);
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            } else {
                n.b(obj);
                this.label = 1;
                if (u0.a(100L, this) == d10) {
                    return d10;
                }
            }
            y0 y0Var = this.$modalBottomSheetState;
            this.label = 2;
            if (y0Var.q(this) == d10) {
                return d10;
            }
            return w.f13270a;
        }
    }

    /* compiled from: BottomSheetUtils.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[z0.values().length];
            try {
                iArr[z0.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetUtilsKt$BottomSheetWrapper$4(y0 y0Var, d6.d dVar, long j10, ViewGroup viewGroup, ComposeView composeView, k0 k0Var, j1<Boolean> j1Var, Continuation<? super BottomSheetUtilsKt$BottomSheetWrapper$4> continuation) {
        super(2, continuation);
        this.$modalBottomSheetState = y0Var;
        this.$systemUiController = dVar;
        this.$statusBarColor = j10;
        this.$parent = viewGroup;
        this.$composeView = composeView;
        this.$coroutineScope = k0Var;
        this.$isSheetOpened$delegate = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new BottomSheetUtilsKt$BottomSheetWrapper$4(this.$modalBottomSheetState, this.$systemUiController, this.$statusBarColor, this.$parent, this.$composeView, this.$coroutineScope, this.$isSheetOpened$delegate, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((BottomSheetUtilsKt$BottomSheetWrapper$4) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean BottomSheetWrapper$lambda$2;
        ic.d.d();
        if (this.label == 0) {
            n.b(obj);
            if (WhenMappings.$EnumSwitchMapping$0[this.$modalBottomSheetState.f().ordinal()] == 1) {
                BottomSheetWrapper$lambda$2 = BottomSheetUtilsKt.BottomSheetWrapper$lambda$2(this.$isSheetOpened$delegate);
                if (!BottomSheetWrapper$lambda$2) {
                    BottomSheetUtilsKt.BottomSheetWrapper$lambda$3(this.$isSheetOpened$delegate, true);
                    ad.i.d(this.$coroutineScope, null, null, new AnonymousClass1(this.$modalBottomSheetState, null), 3, null);
                } else {
                    d6.c.b(this.$systemUiController, this.$statusBarColor, false, null, 4, null);
                    this.$parent.removeView(this.$composeView);
                }
            }
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
