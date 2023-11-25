package com.habitrpg.android.habitica.ui.fragments.social.party;

import a1.p1;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import com.habitrpg.android.habitica.ui.views.LoadingButtonKt;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import com.habitrpg.android.habitica.ui.views.LoadingButtonType;
import dc.w;
import w.a0;

/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
final class PartySeekingFragmentKt$InviteButton$2 extends qc.r implements pc.r<r.d, Boolean, j0.l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.a<w> $onClick;
    final /* synthetic */ LoadingButtonState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingFragmentKt$InviteButton$2(LoadingButtonState loadingButtonState, pc.a<w> aVar, androidx.compose.ui.e eVar, int i10) {
        super(4);
        this.$state = loadingButtonState;
        this.$onClick = aVar;
        this.$modifier = eVar;
        this.$$dirty = i10;
    }

    @Override // pc.r
    public /* bridge */ /* synthetic */ w invoke(r.d dVar, Boolean bool, j0.l lVar, Integer num) {
        invoke(dVar, bool.booleanValue(), lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(r.d dVar, boolean z10, j0.l lVar, int i10) {
        qc.q.i(dVar, "$this$AnimatedContent");
        if (j0.n.K()) {
            j0.n.V(-1540527720, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.InviteButton.<anonymous> (PartySeekingFragment.kt:162)");
        }
        if (z10) {
            lVar.e(1726629272);
            LoadingButtonType loadingButtonType = LoadingButtonType.DESTRUCTIVE;
            f0.f a10 = f0.g.f14733a.a(HabiticaTheme.INSTANCE.getColors(lVar, HabiticaTheme.$stable).m127getErrorBackground0d7_KjU(), p1.f146b.f(), 0L, 0L, lVar, (f0.g.f14744l << 12) | 48, 12);
            LoadingButtonState loadingButtonState = this.$state;
            pc.a<w> aVar = this.$onClick;
            androidx.compose.ui.e eVar = this.$modifier;
            ComposableSingletons$PartySeekingFragmentKt composableSingletons$PartySeekingFragmentKt = ComposableSingletons$PartySeekingFragmentKt.INSTANCE;
            pc.q<a0, j0.l, Integer, w> m104getLambda1$Habitica_2311256681_prodRelease = composableSingletons$PartySeekingFragmentKt.m104getLambda1$Habitica_2311256681_prodRelease();
            pc.q<a0, j0.l, Integer, w> m105getLambda2$Habitica_2311256681_prodRelease = composableSingletons$PartySeekingFragmentKt.m105getLambda2$Habitica_2311256681_prodRelease();
            int i11 = this.$$dirty;
            LoadingButtonKt.LoadingButton(loadingButtonState, aVar, eVar, loadingButtonType, null, null, null, a10, null, m104getLambda1$Habitica_2311256681_prodRelease, null, m105getLambda2$Habitica_2311256681_prodRelease, lVar, (i11 & 14) | 805309440 | (i11 & 112) | (i11 & 896), 48, 1392);
            lVar.N();
        } else {
            lVar.e(1726629875);
            LoadingButtonState loadingButtonState2 = this.$state;
            pc.a<w> aVar2 = this.$onClick;
            androidx.compose.ui.e eVar2 = this.$modifier;
            ComposableSingletons$PartySeekingFragmentKt composableSingletons$PartySeekingFragmentKt2 = ComposableSingletons$PartySeekingFragmentKt.INSTANCE;
            pc.q<a0, j0.l, Integer, w> m106getLambda3$Habitica_2311256681_prodRelease = composableSingletons$PartySeekingFragmentKt2.m106getLambda3$Habitica_2311256681_prodRelease();
            pc.q<a0, j0.l, Integer, w> m107getLambda4$Habitica_2311256681_prodRelease = composableSingletons$PartySeekingFragmentKt2.m107getLambda4$Habitica_2311256681_prodRelease();
            int i12 = this.$$dirty;
            LoadingButtonKt.LoadingButton(loadingButtonState2, aVar2, eVar2, null, null, null, null, null, null, m106getLambda3$Habitica_2311256681_prodRelease, null, m107getLambda4$Habitica_2311256681_prodRelease, lVar, (i12 & 14) | 805306368 | (i12 & 112) | (i12 & 896), 48, 1528);
            lVar.N();
        }
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
