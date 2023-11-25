package com.habitrpg.android.habitica.ui.views.tasks.form;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.t0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.ui.views.DragLinearLayout;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qc.q;
import xc.o;

/* compiled from: ChecklistContainer.kt */
/* loaded from: classes4.dex */
public final class ChecklistContainer extends DragLinearLayout {
    public static final int $stable = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChecklistContainer(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistContainer.<init>(android.content.Context):void");
    }

    private final void addChecklistViewAt(int i10, ChecklistItem checklistItem) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        q.h(context, "getContext(...)");
        ChecklistItemFormView checklistItemFormView = new ChecklistItemFormView(context, null, 0, 6, null);
        if (checklistItem != null) {
            checklistItemFormView.setItem(checklistItem);
            checklistItemFormView.setAddButton(false);
        }
        checklistItemFormView.setTextChangedListener(new ChecklistContainer$addChecklistViewAt$2(this, checklistItemFormView));
        if (i10 < 0) {
            i10 = getChildCount() - i10;
        }
        if (getChildCount() <= i10) {
            addView(checklistItemFormView);
            checklistItemFormView.setAddButton(true);
        } else {
            addView(checklistItemFormView, i10);
            setViewDraggable(checklistItemFormView, checklistItemFormView.getDragGrip());
        }
        ViewGroup.LayoutParams layoutParams2 = checklistItemFormView.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, IntExtensionsKt.dpToPx(8, getContext()));
        }
        checklistItemFormView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void addChecklistViewAt$default(ChecklistContainer checklistContainer, int i10, ChecklistItem checklistItem, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            checklistItem = null;
        }
        checklistContainer.addChecklistViewAt(i10, checklistItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLastChild(View view) {
        Object v10;
        v10 = o.v(t0.a(this));
        return q.d(v10, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldBecomeNewAddButton(com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistItemFormView r5) {
        /*
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 2
            if (r0 <= r2) goto L60
            com.habitrpg.android.habitica.models.tasks.ChecklistItem r0 = r5.getItem()
            java.lang.String r0 = r0.getText()
            r3 = 1
            if (r0 == 0) goto L20
            int r0 = r0.length()
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L60
            xc.g r0 = androidx.core.view.t0.a(r4)
            int r5 = xc.j.q(r0, r5)
            int r0 = r4.getChildCount()
            int r0 = r0 - r2
            if (r5 != r0) goto L60
            int r5 = r4.getChildCount()
            int r5 = r5 - r3
            android.view.View r5 = r4.getChildAt(r5)
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistItemFormView
            if (r0 == 0) goto L42
            com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistItemFormView r5 = (com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistItemFormView) r5
            goto L43
        L42:
            r5 = 0
        L43:
            if (r5 == 0) goto L60
            com.habitrpg.android.habitica.models.tasks.ChecklistItem r5 = r5.getItem()
            java.lang.String r5 = r5.getText()
            if (r5 == 0) goto L5c
            int r5 = r5.length()
            if (r5 != 0) goto L57
            r5 = 1
            goto L58
        L57:
            r5 = 0
        L58:
            if (r5 != 0) goto L5c
            r5 = 1
            goto L5d
        L5c:
            r5 = 0
        L5d:
            if (r5 != 0) goto L60
            return r3
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistContainer.shouldBecomeNewAddButton(com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistItemFormView):boolean");
    }

    public final List<ChecklistItem> getChecklistItems() {
        ChecklistItemFormView checklistItemFormView;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (View view : t0.a(this)) {
            if (view instanceof ChecklistItemFormView) {
                checklistItemFormView = (ChecklistItemFormView) view;
            } else {
                checklistItemFormView = null;
            }
            if (checklistItemFormView != null) {
                String text = checklistItemFormView.getItem().getText();
                boolean z11 = false;
                if (text != null) {
                    if (text.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                }
                if (z11) {
                    arrayList.add(checklistItemFormView.getItem());
                }
            }
        }
        return arrayList;
    }

    public final void setChecklistItems(List<? extends ChecklistItem> list) {
        xc.g A;
        q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(4);
        layoutTransition.disableTransitionType(3);
        setLayoutTransition(layoutTransition);
        if (getChildCount() > 1) {
            A = o.A(t0.a(this), getChildCount() - 1);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                removeView((View) it.next());
            }
        }
        Iterator<? extends ChecklistItem> it2 = list.iterator();
        while (it2.hasNext()) {
            addChecklistViewAt(getChildCount() - 1, it2.next());
        }
        setLayoutTransition(new LayoutTransition());
    }

    public /* synthetic */ ChecklistContainer(Context context, AttributeSet attributeSet, int i10, qc.h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChecklistContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        setOrientation(1);
        addChecklistViewAt$default(this, 0, null, 2, null);
    }
}
