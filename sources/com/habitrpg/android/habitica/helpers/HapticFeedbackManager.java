package com.habitrpg.android.habitica.helpers;

import android.view.View;
import qc.q;

/* compiled from: HapticFeedbackManager.kt */
/* loaded from: classes4.dex */
public final class HapticFeedbackManager {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: HapticFeedbackManager.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final void longPress(View view) {
            q.i(view, "view");
            view.performHapticFeedback(0);
        }

        public final void tap(View view) {
            q.i(view, "view");
            view.performHapticFeedback(1);
        }
    }
}
