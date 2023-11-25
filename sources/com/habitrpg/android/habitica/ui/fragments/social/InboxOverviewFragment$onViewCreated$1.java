package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: InboxOverviewFragment.kt */
/* loaded from: classes4.dex */
final class InboxOverviewFragment$onViewCreated$1 extends r implements l<User, w> {
    final /* synthetic */ InboxOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxOverviewFragment$onViewCreated$1(InboxOverviewFragment inboxOverviewFragment) {
        super(1);
        this.this$0 = inboxOverviewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r4.getOptOut() == true) goto L16;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.habitrpg.android.habitica.models.user.User r4) {
        /*
            r3 = this;
            com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment r0 = r3.this$0
            com.habitrpg.android.habitica.databinding.FragmentInboxBinding r0 = r0.getBinding()
            if (r0 == 0) goto Lb
            android.widget.LinearLayout r0 = r0.optOutView
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto Lf
            goto L29
        Lf:
            r1 = 0
            if (r4 == 0) goto L20
            com.habitrpg.android.habitica.models.user.Inbox r4 = r4.getInbox()
            if (r4 == 0) goto L20
            boolean r4 = r4.getOptOut()
            r2 = 1
            if (r4 != r2) goto L20
            goto L21
        L20:
            r2 = 0
        L21:
            if (r2 == 0) goto L24
            goto L26
        L24:
            r1 = 8
        L26:
            r0.setVisibility(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment$onViewCreated$1.invoke2(com.habitrpg.android.habitica.models.user.User):void");
    }
}
