package com.habitrpg.android.habitica.interactors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.habitrpg.android.habitica.interactors.UseCase;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity;
import dc.w;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: CheckClassSelectionUseCase.kt */
/* loaded from: classes4.dex */
public final class CheckClassSelectionUseCase extends UseCase<RequestValues, w> {
    public static final int $stable = 0;

    /* compiled from: CheckClassSelectionUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final Activity activity;
        private final String currentClass;
        private final boolean isClassSelected;
        private final User user;

        public RequestValues(User user, boolean z10, String str, Activity activity) {
            q.i(activity, "activity");
            this.user = user;
            this.isClassSelected = z10;
            this.currentClass = str;
            this.activity = activity;
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final String getCurrentClass() {
            return this.currentClass;
        }

        public final User getUser() {
            return this.user;
        }

        public final boolean isClassSelected() {
            return this.isClassSelected;
        }
    }

    private final void displayClassSelectionActivity(boolean z10, String str, Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isClassSelected", z10);
        bundle.putString("currentClass", str);
        Intent intent = new Intent(activity, ClassSelectionActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    public Object run(RequestValues requestValues, Continuation<? super w> continuation) {
        Flags flags;
        Preferences preferences;
        Stats stats;
        Integer lvl;
        User user = requestValues.getUser();
        if (requestValues.getCurrentClass() == null) {
            if (((user == null || (stats = user.getStats()) == null || (lvl = stats.getLvl()) == null) ? 0 : lvl.intValue()) >= 9) {
                if (!((user == null || (preferences = user.getPreferences()) == null || !preferences.getDisableClasses()) ? false : true)) {
                    if (!((user == null || (flags = user.getFlags()) == null || !flags.getClassSelected()) ? false : true)) {
                        displayClassSelectionActivity(false, null, requestValues.getActivity());
                    }
                }
            }
        } else {
            displayClassSelectionActivity(requestValues.isClassSelected(), requestValues.getCurrentClass(), requestValues.getActivity());
        }
        return w.f13270a;
    }
}
