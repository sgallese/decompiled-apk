package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.l;
import dc.w;
import ec.n0;
import java.util.Map;
import qc.q;
import qc.r;

/* compiled from: ItemDialogFragment.kt */
/* loaded from: classes4.dex */
final class ItemDialogFragment$onViewCreated$buttonMethod$1 extends r implements pc.a<w> {
    final /* synthetic */ ItemDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDialogFragment$onViewCreated$buttonMethod$1(ItemDialogFragment itemDialogFragment) {
        super(0);
        this.this$0 = itemDialogFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map k10;
        Analytics analytics = Analytics.INSTANCE;
        EventCategory eventCategory = EventCategory.BEHAVIOUR;
        HitType hitType = HitType.EVENT;
        l[] lVarArr = new l[2];
        lVarArr[0] = dc.r.a("area", "empty");
        String itemType = this.this$0.getItemType();
        if (itemType == null) {
            itemType = "";
        }
        lVarArr[1] = dc.r.a(TaskFormActivity.TASK_TYPE_KEY, itemType);
        k10 = n0.k(lVarArr);
        Analytics.sendEvent$default(analytics, "Items CTA tap", eventCategory, hitType, k10, null, 16, null);
        if (!q.d(this.this$0.getItemType(), "quests")) {
            this.this$0.openMarket();
        } else {
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.questShopFragment, null, 2, null);
        }
    }
}
