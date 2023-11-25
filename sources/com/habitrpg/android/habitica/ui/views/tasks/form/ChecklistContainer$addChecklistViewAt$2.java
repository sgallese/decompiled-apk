package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChecklistContainer.kt */
/* loaded from: classes4.dex */
public final class ChecklistContainer$addChecklistViewAt$2 extends r implements pc.l<String, w> {
    final /* synthetic */ ChecklistItemFormView $view;
    final /* synthetic */ ChecklistContainer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChecklistContainer$addChecklistViewAt$2(ChecklistContainer checklistContainer, ChecklistItemFormView checklistItemFormView) {
        super(1);
        this.this$0 = checklistContainer;
        this.$view = checklistItemFormView;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        boolean isLastChild;
        boolean shouldBecomeNewAddButton;
        q.i(str, "it");
        isLastChild = this.this$0.isLastChild(this.$view);
        if (!isLastChild) {
            shouldBecomeNewAddButton = this.this$0.shouldBecomeNewAddButton(this.$view);
            if (shouldBecomeNewAddButton) {
                ChecklistContainer checklistContainer = this.this$0;
                checklistContainer.removeViewAt(checklistContainer.getChildCount() - 1);
                this.$view.setAnimDuration(300L);
                this.$view.setAddButton(true);
                this.this$0.removeViewDraggable(this.$view);
                return;
            }
            return;
        }
        ChecklistContainer.addChecklistViewAt$default(this.this$0, -1, null, 2, null);
        this.$view.setAnimDuration(300L);
        this.$view.setAddButton(false);
        ChecklistContainer checklistContainer2 = this.this$0;
        ChecklistItemFormView checklistItemFormView = this.$view;
        checklistContainer2.setViewDraggable(checklistItemFormView, checklistItemFormView.getDragGrip());
    }
}
