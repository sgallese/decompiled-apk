package com.habitrpg.android.habitica.models.tasks;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.Tag;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.r5;

/* compiled from: TaskTag.kt */
/* loaded from: classes4.dex */
public class TaskTag extends d1 implements BaseObject, r5 {
    public static final int $stable = 8;
    private Tag tag;
    private Task task;

    public TaskTag() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Tag getTag() {
        return realmGet$tag();
    }

    public final Task getTask() {
        return realmGet$task();
    }

    @Override // io.realm.r5
    public Tag realmGet$tag() {
        return this.tag;
    }

    @Override // io.realm.r5
    public Task realmGet$task() {
        return this.task;
    }

    @Override // io.realm.r5
    public void realmSet$tag(Tag tag) {
        this.tag = tag;
    }

    @Override // io.realm.r5
    public void realmSet$task(Task task) {
        this.task = task;
    }

    public final void setTag(Tag tag) {
        realmSet$tag(tag);
    }

    public final void setTask(Task task) {
        realmSet$task(task);
    }
}
