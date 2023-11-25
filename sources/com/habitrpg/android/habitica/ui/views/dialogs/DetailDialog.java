package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogQuestContent;
import qc.q;

/* compiled from: DetailDialog.kt */
/* loaded from: classes4.dex */
public final class DetailDialog extends HabiticaAlertDialog {
    public static final int $stable = 8;
    private QuestContent quest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailDialog(Context context) {
        super(context);
        q.i(context, "context");
        AlertDialogExtensionsKt.addCloseButton$default(this, false, null, 3, null);
    }

    public final QuestContent getQuest() {
        return this.quest;
    }

    public final void setQuest(QuestContent questContent) {
        this.quest = questContent;
        if (questContent == null) {
            return;
        }
        Context context = getContext();
        q.h(context, "getContext(...)");
        PurchaseDialogQuestContent purchaseDialogQuestContent = new PurchaseDialogQuestContent(context);
        purchaseDialogQuestContent.setQuestContentItem(questContent);
        setAdditionalContentView(purchaseDialogQuestContent);
    }
}
