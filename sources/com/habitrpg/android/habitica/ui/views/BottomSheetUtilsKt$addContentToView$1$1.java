package com.habitrpg.android.habitica.ui.views;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import dc.w;
import j0.n;
import pc.p;
import pc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetUtils.kt */
/* loaded from: classes4.dex */
public final class BottomSheetUtilsKt$addContentToView$1$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ q<pc.a<w>, j0.l, Integer, w> $content;
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ ViewGroup $viewGroup;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetUtils.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt$addContentToView$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements p<j0.l, Integer, w> {
        final /* synthetic */ q<pc.a<w>, j0.l, Integer, w> $content;
        final /* synthetic */ ComposeView $this_apply;
        final /* synthetic */ ViewGroup $viewGroup;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ViewGroup viewGroup, ComposeView composeView, q<? super pc.a<w>, ? super j0.l, ? super Integer, w> qVar) {
            super(2);
            this.$viewGroup = viewGroup;
            this.$this_apply = composeView;
            this.$content = qVar;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(442229023, i10, -1, "com.habitrpg.android.habitica.ui.views.addContentToView.<anonymous>.<anonymous>.<anonymous> (BottomSheetUtils.kt:59)");
            }
            BottomSheetUtilsKt.BottomSheetWrapper(this.$viewGroup, this.$this_apply, this.$content, lVar, (ComposeView.f2550x << 3) | 8);
            if (n.K()) {
                n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetUtilsKt$addContentToView$1$1(ViewGroup viewGroup, ComposeView composeView, q<? super pc.a<w>, ? super j0.l, ? super Integer, w> qVar) {
        super(2);
        this.$viewGroup = viewGroup;
        this.$this_apply = composeView;
        this.$content = qVar;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1701267500, i10, -1, "com.habitrpg.android.habitica.ui.views.addContentToView.<anonymous>.<anonymous> (BottomSheetUtils.kt:58)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, 442229023, true, new AnonymousClass1(this.$viewGroup, this.$this_apply, this.$content)), lVar, 6);
        if (n.K()) {
            n.U();
        }
    }
}
