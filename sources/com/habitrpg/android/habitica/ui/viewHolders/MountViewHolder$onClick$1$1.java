package com.habitrpg.android.habitica.ui.viewHolders;

import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.ui.views.stable.MountBottomSheetKt;
import dc.w;
import pc.q;
import qc.r;
import yc.v;

/* compiled from: MountViewHolder.kt */
/* loaded from: classes4.dex */
final class MountViewHolder$onClick$1$1 extends r implements q<pc.a<? extends w>, j0.l, Integer, w> {
    final /* synthetic */ Mount $pet;
    final /* synthetic */ MountViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MountViewHolder$onClick$1$1(Mount mount, MountViewHolder mountViewHolder) {
        super(3);
        this.$pet = mount;
        this.this$0 = mountViewHolder;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(pc.a<? extends w> aVar, j0.l lVar, Integer num) {
        invoke((pc.a<w>) aVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(pc.a<w> aVar, j0.l lVar, int i10) {
        String str;
        boolean s10;
        pc.l lVar2;
        qc.q.i(aVar, "it");
        if ((i10 & 14) == 0) {
            i10 |= lVar.l(aVar) ? 4 : 2;
        }
        if ((i10 & 91) == 18 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(278277382, i10, -1, "com.habitrpg.android.habitica.ui.viewHolders.MountViewHolder.onClick.<anonymous>.<anonymous> (MountViewHolder.kt:65)");
        }
        Mount mount = this.$pet;
        str = this.this$0.currentMount;
        Mount animal = this.this$0.getAnimal();
        s10 = v.s(str, animal != null ? animal.getKey() : null, false, 2, null);
        lVar2 = this.this$0.onEquip;
        MountBottomSheetKt.MountBottomSheet(mount, s10, lVar2, aVar, null, lVar, ((i10 << 9) & 7168) | 8, 16);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
