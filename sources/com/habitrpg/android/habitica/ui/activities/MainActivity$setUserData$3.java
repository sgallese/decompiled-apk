package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.views.dialogs.QuestCompletedDialog;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.MainActivity$setUserData$3", f = "MainActivity.kt", l = {606}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActivity$setUserData$3 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$setUserData$3(MainActivity mainActivity, User user, Continuation<? super MainActivity$setUserData$3> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$setUserData$3(this.this$0, this.$user, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((MainActivity$setUserData$3) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
        Quest quest;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            InventoryRepository inventoryRepository$Habitica_2311256681_prodRelease = this.this$0.getInventoryRepository$Habitica_2311256681_prodRelease();
            UserParty party = this.$user.getParty();
            if (party == null || (quest = party.getQuest()) == null || (str = quest.getCompleted()) == null) {
                str = "";
            }
            dd.g<QuestContent> questContent = inventoryRepository$Habitica_2311256681_prodRelease.getQuestContent(str);
            this.label = 1;
            obj = dd.i.x(questContent, this);
            if (obj == d10) {
                return d10;
            }
        }
        QuestContent questContent2 = (QuestContent) obj;
        if (questContent2 != null) {
            QuestCompletedDialog.Companion.showWithQuest(this.this$0, questContent2);
        }
        this.this$0.getViewModel().updateUser("party.quest.completed", "");
        return dc.w.f13270a;
    }
}
