package com.habitrpg.android.habitica.models.tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import qc.q;

/* compiled from: TaskList.kt */
/* loaded from: classes4.dex */
public final class TaskList {
    public static final int $stable = 8;
    private Map<String, Task> tasks = new LinkedHashMap();

    public final Map<String, Task> getTasks() {
        return this.tasks;
    }

    public final void setTasks(Map<String, Task> map) {
        q.i(map, "<set-?>");
        this.tasks = map;
    }
}
