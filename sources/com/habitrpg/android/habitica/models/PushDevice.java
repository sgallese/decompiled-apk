package com.habitrpg.android.habitica.models;

import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import fa.a;
import fa.c;

/* compiled from: PushDevice.kt */
/* loaded from: classes4.dex */
public final class PushDevice {
    public static final int $stable = 8;
    @a
    @c("regId")
    private String regId;
    @a
    @c(TaskFormActivity.TASK_TYPE_KEY)
    private String type;

    public final String getRegId() {
        return this.regId;
    }

    public final String getType() {
        return this.type;
    }

    public final void setRegId(String str) {
        this.regId = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
