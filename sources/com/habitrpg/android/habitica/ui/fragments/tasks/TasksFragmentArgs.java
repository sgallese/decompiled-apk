package com.habitrpg.android.habitica.ui.fragments.tasks;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class TasksFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static TasksFragmentArgs fromBundle(Bundle bundle) {
        TasksFragmentArgs tasksFragmentArgs = new TasksFragmentArgs();
        bundle.setClassLoader(TasksFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("taskType")) {
            tasksFragmentArgs.arguments.put("taskType", bundle.getString("taskType"));
        } else {
            tasksFragmentArgs.arguments.put("taskType", "");
        }
        if (bundle.containsKey("ownerID")) {
            tasksFragmentArgs.arguments.put("ownerID", bundle.getString("ownerID"));
        } else {
            tasksFragmentArgs.arguments.put("ownerID", "");
        }
        return tasksFragmentArgs;
    }

    public static TasksFragmentArgs fromSavedStateHandle(n0 n0Var) {
        TasksFragmentArgs tasksFragmentArgs = new TasksFragmentArgs();
        if (n0Var.e("taskType")) {
            tasksFragmentArgs.arguments.put("taskType", (String) n0Var.f("taskType"));
        } else {
            tasksFragmentArgs.arguments.put("taskType", "");
        }
        if (n0Var.e("ownerID")) {
            tasksFragmentArgs.arguments.put("ownerID", (String) n0Var.f("ownerID"));
        } else {
            tasksFragmentArgs.arguments.put("ownerID", "");
        }
        return tasksFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TasksFragmentArgs tasksFragmentArgs = (TasksFragmentArgs) obj;
        if (this.arguments.containsKey("taskType") != tasksFragmentArgs.arguments.containsKey("taskType")) {
            return false;
        }
        if (getTaskType() == null ? tasksFragmentArgs.getTaskType() != null : !getTaskType().equals(tasksFragmentArgs.getTaskType())) {
            return false;
        }
        if (this.arguments.containsKey("ownerID") != tasksFragmentArgs.arguments.containsKey("ownerID")) {
            return false;
        }
        if (getOwnerID() == null ? tasksFragmentArgs.getOwnerID() == null : getOwnerID().equals(tasksFragmentArgs.getOwnerID())) {
            return true;
        }
        return false;
    }

    public String getOwnerID() {
        return (String) this.arguments.get("ownerID");
    }

    public String getTaskType() {
        return (String) this.arguments.get("taskType");
    }

    public int hashCode() {
        int i10;
        int i11 = 0;
        if (getTaskType() != null) {
            i10 = getTaskType().hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        if (getOwnerID() != null) {
            i11 = getOwnerID().hashCode();
        }
        return i12 + i11;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("taskType")) {
            bundle.putString("taskType", (String) this.arguments.get("taskType"));
        } else {
            bundle.putString("taskType", "");
        }
        if (this.arguments.containsKey("ownerID")) {
            bundle.putString("ownerID", (String) this.arguments.get("ownerID"));
        } else {
            bundle.putString("ownerID", "");
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey("taskType")) {
            n0Var.j("taskType", (String) this.arguments.get("taskType"));
        } else {
            n0Var.j("taskType", "");
        }
        if (this.arguments.containsKey("ownerID")) {
            n0Var.j("ownerID", (String) this.arguments.get("ownerID"));
        } else {
            n0Var.j("ownerID", "");
        }
        return n0Var;
    }

    public String toString() {
        return "TasksFragmentArgs{taskType=" + getTaskType() + ", ownerID=" + getOwnerID() + "}";
    }

    private TasksFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(TasksFragmentArgs tasksFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(tasksFragmentArgs.arguments);
        }

        public TasksFragmentArgs build() {
            return new TasksFragmentArgs(this.arguments);
        }

        public String getOwnerID() {
            return (String) this.arguments.get("ownerID");
        }

        public String getTaskType() {
            return (String) this.arguments.get("taskType");
        }

        public Builder setOwnerID(String str) {
            this.arguments.put("ownerID", str);
            return this;
        }

        public Builder setTaskType(String str) {
            this.arguments.put("taskType", str);
            return this;
        }

        public Builder() {
            this.arguments = new HashMap();
        }
    }

    private TasksFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
