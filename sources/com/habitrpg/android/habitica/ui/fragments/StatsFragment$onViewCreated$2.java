package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.models.user.User;

/* compiled from: StatsFragment.kt */
/* loaded from: classes4.dex */
final class StatsFragment$onViewCreated$2 extends qc.r implements pc.l<User, dc.w> {
    final /* synthetic */ StatsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsFragment$onViewCreated$2(StatsFragment statsFragment) {
        super(1);
        this.this$0 = statsFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(User user) {
        invoke2(user);
        return dc.w.f13270a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.habitrpg.android.habitica.models.user.User r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            com.habitrpg.android.habitica.ui.fragments.StatsFragment r0 = r4.this$0
            com.habitrpg.android.habitica.models.user.Stats r1 = r5.getStats()
            r2 = 0
            if (r1 == 0) goto L17
            java.lang.Integer r1 = r1.getLvl()
            if (r1 == 0) goto L17
            int r1 = r1.intValue()
            goto L18
        L17:
            r1 = 0
        L18:
            r3 = 10
            if (r1 < r3) goto L32
            com.habitrpg.android.habitica.models.user.Stats r1 = r5.getStats()
            if (r1 == 0) goto L2d
            java.lang.Integer r1 = r1.getPoints()
            if (r1 == 0) goto L2d
            int r1 = r1.intValue()
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 <= 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = 0
        L33:
            com.habitrpg.android.habitica.ui.fragments.StatsFragment.access$setCanAllocatePoints$p(r0, r1)
            com.habitrpg.android.habitica.ui.fragments.StatsFragment r0 = r4.this$0
            com.habitrpg.android.habitica.databinding.FragmentStatsBinding r0 = r0.getBinding()
            if (r0 == 0) goto L41
            android.widget.TextView r0 = r0.unlockAtLevel
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 != 0) goto L45
            goto L5f
        L45:
            com.habitrpg.android.habitica.models.user.Stats r1 = r5.getStats()
            if (r1 == 0) goto L56
            java.lang.Integer r1 = r1.getLvl()
            if (r1 == 0) goto L56
            int r1 = r1.intValue()
            goto L57
        L56:
            r1 = 0
        L57:
            if (r1 >= r3) goto L5a
            goto L5c
        L5a:
            r2 = 8
        L5c:
            r0.setVisibility(r2)
        L5f:
            com.habitrpg.android.habitica.ui.fragments.StatsFragment r0 = r4.this$0
            com.habitrpg.android.habitica.ui.fragments.StatsFragment.access$updateStats(r0, r5)
            com.habitrpg.android.habitica.ui.fragments.StatsFragment r0 = r4.this$0
            com.habitrpg.android.habitica.ui.fragments.StatsFragment.access$updateAttributePoints(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.StatsFragment$onViewCreated$2.invoke2(com.habitrpg.android.habitica.models.user.User):void");
    }
}
