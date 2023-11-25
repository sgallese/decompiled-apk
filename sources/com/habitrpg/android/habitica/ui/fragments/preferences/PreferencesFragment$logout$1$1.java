package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.Context;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferencesFragment.kt */
/* loaded from: classes4.dex */
public final class PreferencesFragment$logout$1$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$logout$1$1(Context context, PreferencesFragment preferencesFragment) {
        super(2);
        this.$context = context;
        this.this$0 = preferencesFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        HabiticaBaseApplication.Companion companion = HabiticaBaseApplication.Companion;
        Context context = this.$context;
        q.h(context, "$context");
        companion.logout(context);
        androidx.fragment.app.q activity = this.this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
