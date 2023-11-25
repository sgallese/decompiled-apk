package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import android.content.Context;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentQuestDetailBinding;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.members.Member;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QuestDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.QuestDetailFragment$updateParty$1", f = "QuestDetailFragment.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class QuestDetailFragment$updateParty$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ QuestDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestDetailFragment$updateParty$1(QuestDetailFragment questDetailFragment, Continuation<? super QuestDetailFragment$updateParty$1> continuation) {
        super(2, continuation);
        this.this$0 = questDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new QuestDetailFragment$updateParty$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((QuestDetailFragment$updateParty$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Quest quest;
        String str;
        TextView textView;
        TextView textView2;
        d10 = ic.d.d();
        int i10 = this.label;
        String str2 = null;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            quest = this.this$0.quest;
            if (quest != null) {
                str = quest.getLeader();
            } else {
                str = null;
            }
            this.label = 1;
            obj = SocialRepository.DefaultImpls.retrieveMember$default(socialRepository, str, false, this, 2, null);
            if (obj == d10) {
                return d10;
            }
        }
        Member member = (Member) obj;
        if (this.this$0.getContext() != null) {
            FragmentQuestDetailBinding binding = this.this$0.getBinding();
            if (binding != null) {
                textView = binding.questLeaderView;
            } else {
                textView = null;
            }
            if (textView != null) {
                FragmentQuestDetailBinding binding2 = this.this$0.getBinding();
                if (binding2 != null) {
                    textView2 = binding2.questLeaderView;
                } else {
                    textView2 = null;
                }
                if (textView2 != null) {
                    Context context = this.this$0.getContext();
                    if (context != null) {
                        Object[] objArr = new Object[1];
                        if (member != null) {
                            str2 = member.getDisplayName();
                        }
                        objArr[0] = str2;
                        str2 = context.getString(R.string.quest_leader_header, objArr);
                    }
                    textView2.setText(str2);
                }
            }
        }
        return w.f13270a;
    }
}
