package com.habitrpg.android.habitica.ui.views.social;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: PartySeekingListItem.kt */
/* loaded from: classes4.dex */
final class PartySeekingListItemKt$Preview$1 extends r implements pc.l<Member, w> {
    public static final PartySeekingListItemKt$Preview$1 INSTANCE = new PartySeekingListItemKt$Preview$1();

    PartySeekingListItemKt$Preview$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Member member) {
        q.i(member, "it");
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Member member) {
        invoke2(member);
        return w.f13270a;
    }
}
