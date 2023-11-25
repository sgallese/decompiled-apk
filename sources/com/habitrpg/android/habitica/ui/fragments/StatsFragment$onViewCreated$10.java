package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.shared.habitica.models.tasks.Attribute;

/* compiled from: StatsFragment.kt */
/* loaded from: classes4.dex */
final class StatsFragment$onViewCreated$10 extends qc.r implements pc.a<dc.w> {
    final /* synthetic */ StatsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsFragment$onViewCreated$10(StatsFragment statsFragment) {
        super(0);
        this.this$0 = statsFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ dc.w invoke() {
        invoke2();
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.allocatePoint(Attribute.PERCEPTION);
    }
}
