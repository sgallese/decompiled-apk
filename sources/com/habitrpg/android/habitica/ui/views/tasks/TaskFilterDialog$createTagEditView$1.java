package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.models.Tag;
import dc.w;
import java.util.HashMap;
import java.util.List;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFilterDialog.kt */
/* loaded from: classes4.dex */
public final class TaskFilterDialog$createTagEditView$1 extends r implements pc.r<CharSequence, Integer, Integer, Integer, w> {
    final /* synthetic */ int $index;
    final /* synthetic */ TaskFilterDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFilterDialog$createTagEditView$1(int i10, TaskFilterDialog taskFilterDialog) {
        super(4);
        this.$index = i10;
        this.this$0 = taskFilterDialog;
    }

    @Override // pc.r
    public /* bridge */ /* synthetic */ w invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return w.f13270a;
    }

    public final void invoke(CharSequence charSequence, int i10, int i11, int i12) {
        List list;
        List list2;
        HashMap hashMap;
        HashMap hashMap2;
        List list3;
        HashMap hashMap3;
        int i13 = this.$index;
        list = this.this$0.tags;
        if (i13 >= list.size()) {
            return;
        }
        list2 = this.this$0.tags;
        Tag tag = (Tag) list2.get(this.$index);
        tag.setName(String.valueOf(charSequence));
        hashMap = this.this$0.createdTags;
        if (hashMap.containsKey(tag.getId())) {
            hashMap3 = this.this$0.createdTags;
            hashMap3.put(tag.getId(), tag);
        } else {
            hashMap2 = this.this$0.editedTags;
            hashMap2.put(tag.getId(), tag);
        }
        list3 = this.this$0.tags;
        list3.set(this.$index, tag);
    }
}
