package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.Intent;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: PreferencesFragment.kt */
/* loaded from: classes4.dex */
final class PreferencesFragment$onPreferenceTreeClick$2$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$onPreferenceTreeClick$2$1(PreferencesFragment preferencesFragment, Intent intent) {
        super(2);
        this.this$0 = preferencesFragment;
        this.$intent = intent;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        androidx.activity.result.b bVar;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        bVar = this.this$0.classSelectionResult;
        bVar.a(this.$intent);
    }
}
