package com.habitrpg.android.habitica.ui.fragments.social.party;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class PartyInviteFragmentKt$PartyInviteView$1$invoke$$inlined$items$default$2 extends qc.r implements pc.l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ pc.l $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragmentKt$PartyInviteView$1$invoke$$inlined$items$default$2(pc.l lVar, List list) {
        super(1);
        this.$key = lVar;
        this.$items = list;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(this.$items.get(i10));
    }
}
