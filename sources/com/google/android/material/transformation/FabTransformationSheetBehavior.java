package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.p0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import v6.a;
import w6.h;
import w6.j;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    private Map<View, Integer> f10700i;

    public FabTransformationSheetBehavior() {
    }

    private void g0(View view, boolean z10) {
        boolean z11;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            this.f10700i = new HashMap(childCount);
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if ((childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (childAt != view && !z11) {
                if (!z10) {
                    Map<View, Integer> map = this.f10700i;
                    if (map != null && map.containsKey(childAt)) {
                        p0.F0(childAt, this.f10700i.get(childAt).intValue());
                    }
                } else {
                    this.f10700i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    p0.F0(childAt, 4);
                }
            }
        }
        if (!z10) {
            this.f10700i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View view, View view2, boolean z10, boolean z11) {
        g0(view2, z10);
        return super.H(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e e0(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = a.f24621d;
        } else {
            i10 = a.f24620c;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f10693a = h.c(context, i10);
        eVar.f10694b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
