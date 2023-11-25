package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import java.util.Iterator;
import java.util.List;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeDetailFragment.kt */
/* loaded from: classes4.dex */
public final class ChallengeDetailFragment$showEndChallengeDialog$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ChallengeDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailFragment$showEndChallengeDialog$1(ChallengeDetailFragment challengeDetailFragment, Context context) {
        super(2);
        this.this$0 = challengeDetailFragment;
        this.$context = context;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        Object obj;
        boolean K;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://habitica.com/challenges/" + this.this$0.getChallengeID()));
        List<ResolveInfo> queryIntentActivities = this.$context.getPackageManager().queryIntentActivities(intent, 65536);
        q.h(queryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = queryIntentActivities.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = ((ResolveInfo) next).activityInfo.processName;
            q.h(str, "processName");
            K = yc.w.K(str, "habitica", false, 2, null);
            if ((!K) != false) {
                obj = next;
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo != null) {
            intent.setPackage(resolveInfo.activityInfo.processName);
        }
        this.this$0.startActivity(intent);
    }
}
