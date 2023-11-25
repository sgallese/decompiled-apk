package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.w;
import io.realm.o0;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmUserLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmUserLocalRepository$saveMessages$1 extends r implements l<o0, w> {
    final /* synthetic */ List<ChatMessage> $messages;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealmUserLocalRepository$saveMessages$1(List<? extends ChatMessage> list) {
        super(1);
        this.$messages = list;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        o0Var.h1(this.$messages);
    }
}
