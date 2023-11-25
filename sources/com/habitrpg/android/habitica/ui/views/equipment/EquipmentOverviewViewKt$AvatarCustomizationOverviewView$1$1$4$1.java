package com.habitrpg.android.habitica.ui.views.equipment;

import dc.w;
import pc.a;
import pc.p;
import qc.r;

/* compiled from: EquipmentOverviewView.kt */
/* loaded from: classes4.dex */
final class EquipmentOverviewViewKt$AvatarCustomizationOverviewView$1$1$4$1 extends r implements a<w> {
    final /* synthetic */ p<String, String, w> $onCustomizationTap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EquipmentOverviewViewKt$AvatarCustomizationOverviewView$1$1$4$1(p<? super String, ? super String, w> pVar) {
        super(0);
        this.$onCustomizationTap = pVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onCustomizationTap.invoke("skin", null);
    }
}
