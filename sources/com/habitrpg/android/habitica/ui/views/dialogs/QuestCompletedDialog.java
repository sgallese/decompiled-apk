package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import pc.p;
import qc.h;
import qc.q;

/* compiled from: QuestCompletedDialog.kt */
/* loaded from: classes4.dex */
public final class QuestCompletedDialog extends HabiticaAlertDialog {
    private static QuestCompletedDialog dialog;
    private QuestContent quest;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestCompletedDialog.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void showWithQuest(Context context, QuestContent questContent) {
            q.i(context, "context");
            q.i(questContent, "quest");
            if (QuestCompletedDialog.dialog == null) {
                QuestCompletedDialog.dialog = new QuestCompletedDialog(context);
                QuestCompletedDialog questCompletedDialog = QuestCompletedDialog.dialog;
                if (questCompletedDialog != null) {
                    questCompletedDialog.setQuest(questContent);
                }
                QuestCompletedDialog questCompletedDialog2 = QuestCompletedDialog.dialog;
                if (questCompletedDialog2 != null) {
                    questCompletedDialog2.setTitle(R.string.quest_completed);
                }
                QuestCompletedDialog questCompletedDialog3 = QuestCompletedDialog.dialog;
                if (questCompletedDialog3 != null) {
                    HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) questCompletedDialog3, (int) R.string.onwards, true, false, false, (p) null, 24, (Object) null);
                }
                QuestCompletedDialog questCompletedDialog4 = QuestCompletedDialog.dialog;
                if (questCompletedDialog4 != null) {
                    questCompletedDialog4.enqueue();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestCompletedDialog(Context context) {
        super(context);
        q.i(context, "context");
    }

    @Override // com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog, androidx.appcompat.app.x, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        dialog = null;
        super.dismiss();
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
        QuestCompletedDialogContent questCompletedDialogContent = new QuestCompletedDialogContent(context);
        questCompletedDialogContent.setQuestContent(questContent);
        setAdditionalContentView(questCompletedDialogContent);
    }
}
