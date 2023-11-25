package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.q;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: QuestDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.QuestDetailFragment$onQuestCancel$1$1$1$1", f = "QuestDetailFragment.kt", l = {277, 278}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class QuestDetailFragment$onQuestCancel$1$1$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $partyID;
    int label;
    final /* synthetic */ QuestDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestDetailFragment$onQuestCancel$1$1$1$1(QuestDetailFragment questDetailFragment, String str, Continuation<? super QuestDetailFragment$onQuestCancel$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = questDetailFragment;
        this.$partyID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new QuestDetailFragment$onQuestCancel$1$1$1$1(this.this$0, this.$partyID, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((QuestDetailFragment$onQuestCancel$1$1$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        q activity;
        FragmentManager supportFragmentManager;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    activity = this.this$0.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        supportFragmentManager.g1();
                    }
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            String str = this.$partyID;
            this.label = 1;
            if (socialRepository.cancelQuest(str, this) == d10) {
                return d10;
            }
        }
        UserRepository userRepository = this.this$0.getUserRepository();
        this.label = 2;
        if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, false, false, this, 6, null) == d10) {
            return d10;
        }
        activity = this.this$0.getActivity();
        if (activity != null) {
            supportFragmentManager.g1();
        }
        return w.f13270a;
    }
}
