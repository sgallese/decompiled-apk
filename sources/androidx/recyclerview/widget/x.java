package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public class x {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.b0 b0Var, u uVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.V() != 0 && b0Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(pVar.p0(view) - pVar.p0(view2)) + 1;
            }
            return Math.min(uVar.n(), uVar.d(view2) - uVar.g(view));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.b0 b0Var, u uVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        int max;
        if (pVar.V() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.p0(view), pVar.p0(view2));
        int max2 = Math.max(pVar.p0(view), pVar.p0(view2));
        if (z11) {
            max = Math.max(0, (b0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(uVar.d(view2) - uVar.g(view)) / (Math.abs(pVar.p0(view) - pVar.p0(view2)) + 1))) + (uVar.m() - uVar.g(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(RecyclerView.b0 b0Var, u uVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.V() != 0 && b0Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return b0Var.b();
            }
            return (int) (((uVar.d(view2) - uVar.g(view)) / (Math.abs(pVar.p0(view) - pVar.p0(view2)) + 1)) * b0Var.b());
        }
        return 0;
    }
}
