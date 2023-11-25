package com.habitrpg.android.habitica.ui.views.stable;

import com.habitrpg.android.habitica.R;
import dc.w;
import f0.f2;
import j0.l;
import j0.n;
import pc.p;
import qc.r;
import s1.h;

/* compiled from: MountBottomSheet.kt */
/* loaded from: classes4.dex */
final class MountBottomSheetKt$MountBottomSheet$1$4 extends r implements p<l, Integer, w> {
    final /* synthetic */ boolean $isCurrentMount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MountBottomSheetKt$MountBottomSheet$1$4(boolean z10) {
        super(2);
        this.$isCurrentMount = z10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1929518735, i10, -1, "com.habitrpg.android.habitica.ui.views.stable.MountBottomSheet.<anonymous>.<anonymous> (MountBottomSheet.kt:179)");
        }
        if (this.$isCurrentMount) {
            lVar.e(1580071784);
            f2.b(h.a(R.string.unequip, lVar, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
            lVar.N();
        } else {
            lVar.e(1580071865);
            f2.b(h.a(R.string.equip, lVar, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
            lVar.N();
        }
        if (n.K()) {
            n.U();
        }
    }
}
