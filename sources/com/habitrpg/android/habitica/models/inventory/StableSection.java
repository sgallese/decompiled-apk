package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import qc.q;

/* compiled from: StableSection.kt */
/* loaded from: classes4.dex */
public final class StableSection {
    public static final int $stable = 8;
    private final String key;
    private int ownedCount;
    private int totalCount;
    private final String type;

    public StableSection(String str, String str2) {
        q.i(str2, TaskFormActivity.TASK_TYPE_KEY);
        this.key = str;
        this.type = str2;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getOwnedCount() {
        return this.ownedCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final String getType() {
        return this.type;
    }

    public final void setOwnedCount(int i10) {
        this.ownedCount = i10;
    }

    public final void setTotalCount(int i10) {
        this.totalCount = i10;
    }
}
