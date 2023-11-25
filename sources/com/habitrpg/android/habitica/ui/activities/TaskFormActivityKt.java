package com.habitrpg.android.habitica.ui.activities;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
public final class TaskFormActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer toIntCatchOverflow(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
