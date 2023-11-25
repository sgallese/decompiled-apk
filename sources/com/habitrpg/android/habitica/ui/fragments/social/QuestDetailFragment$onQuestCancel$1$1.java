package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QuestDetailFragment.kt */
/* loaded from: classes4.dex */
public final class QuestDetailFragment$onQuestCancel$1$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ QuestDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestDetailFragment$onQuestCancel$1$1(QuestDetailFragment questDetailFragment) {
        super(2);
        this.this$0 = questDetailFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        Group group;
        String id2;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        group = this.this$0.party;
        if (group == null || (id2 = group.getId()) == null) {
            return;
        }
        QuestDetailFragment questDetailFragment = this.this$0;
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(questDetailFragment), null, new QuestDetailFragment$onQuestCancel$1$1$1$1(questDetailFragment, id2, null), 1, null);
    }
}
