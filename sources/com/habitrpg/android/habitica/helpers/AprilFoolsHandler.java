package com.habitrpg.android.habitica.helpers;

import java.util.Date;
import qc.q;

/* compiled from: AprilFoolsHandler.kt */
/* loaded from: classes4.dex */
public final class AprilFoolsHandler {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static Date eventEnd;

    /* compiled from: AprilFoolsHandler.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final void handle(String str, Date date) {
            if (date != null) {
                AprilFoolsHandler.eventEnd = date;
            }
            if (q.d(str, "invert")) {
                invertFools();
            }
        }

        private final void invertFools() {
        }
    }
}
