package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dc.w;
import pc.p;
import pc.q;
import qc.r;

/* compiled from: AvatarOverviewFragment.kt */
/* loaded from: classes4.dex */
final class AvatarOverviewFragmentKt$AvatarOverviewView$1$5$1 extends r implements p<String, String, w> {
    final /* synthetic */ q<String, String, Boolean, w> $onEquipmentTap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AvatarOverviewFragmentKt$AvatarOverviewView$1$5$1(q<? super String, ? super String, ? super Boolean, w> qVar) {
        super(2);
        this.$onEquipmentTap = qVar;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(String str, String str2) {
        invoke2(str, str2);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        qc.q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        this.$onEquipmentTap.invoke(str, str2, Boolean.TRUE);
    }
}
