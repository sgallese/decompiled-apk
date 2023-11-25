package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import android.os.Bundle;
import androidx.lifecycle.n0;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class MountDetailRecyclerFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static MountDetailRecyclerFragmentArgs fromBundle(Bundle bundle) {
        MountDetailRecyclerFragmentArgs mountDetailRecyclerFragmentArgs = new MountDetailRecyclerFragmentArgs();
        bundle.setClassLoader(MountDetailRecyclerFragmentArgs.class.getClassLoader());
        if (bundle.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            String string = bundle.getString(TaskFormActivity.TASK_TYPE_KEY);
            if (string != null) {
                mountDetailRecyclerFragmentArgs.arguments.put(TaskFormActivity.TASK_TYPE_KEY, string);
                if (bundle.containsKey("group")) {
                    String string2 = bundle.getString("group");
                    if (string2 != null) {
                        mountDetailRecyclerFragmentArgs.arguments.put("group", string2);
                        if (bundle.containsKey("color")) {
                            mountDetailRecyclerFragmentArgs.arguments.put("color", bundle.getString("color"));
                            return mountDetailRecyclerFragmentArgs;
                        }
                        throw new IllegalArgumentException("Required argument \"color\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"group\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"group\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public static MountDetailRecyclerFragmentArgs fromSavedStateHandle(n0 n0Var) {
        MountDetailRecyclerFragmentArgs mountDetailRecyclerFragmentArgs = new MountDetailRecyclerFragmentArgs();
        if (n0Var.e(TaskFormActivity.TASK_TYPE_KEY)) {
            String str = (String) n0Var.f(TaskFormActivity.TASK_TYPE_KEY);
            if (str != null) {
                mountDetailRecyclerFragmentArgs.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                if (n0Var.e("group")) {
                    String str2 = (String) n0Var.f("group");
                    if (str2 != null) {
                        mountDetailRecyclerFragmentArgs.arguments.put("group", str2);
                        if (n0Var.e("color")) {
                            mountDetailRecyclerFragmentArgs.arguments.put("color", (String) n0Var.f("color"));
                            return mountDetailRecyclerFragmentArgs;
                        }
                        throw new IllegalArgumentException("Required argument \"color\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"group\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"group\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MountDetailRecyclerFragmentArgs mountDetailRecyclerFragmentArgs = (MountDetailRecyclerFragmentArgs) obj;
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != mountDetailRecyclerFragmentArgs.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            return false;
        }
        if (getType() == null ? mountDetailRecyclerFragmentArgs.getType() != null : !getType().equals(mountDetailRecyclerFragmentArgs.getType())) {
            return false;
        }
        if (this.arguments.containsKey("group") != mountDetailRecyclerFragmentArgs.arguments.containsKey("group")) {
            return false;
        }
        if (getGroup() == null ? mountDetailRecyclerFragmentArgs.getGroup() != null : !getGroup().equals(mountDetailRecyclerFragmentArgs.getGroup())) {
            return false;
        }
        if (this.arguments.containsKey("color") != mountDetailRecyclerFragmentArgs.arguments.containsKey("color")) {
            return false;
        }
        if (getColor() == null ? mountDetailRecyclerFragmentArgs.getColor() == null : getColor().equals(mountDetailRecyclerFragmentArgs.getColor())) {
            return true;
        }
        return false;
    }

    public String getColor() {
        return (String) this.arguments.get("color");
    }

    public String getGroup() {
        return (String) this.arguments.get("group");
    }

    public String getType() {
        return (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY);
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        if (getType() != null) {
            i10 = getType().hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i10 + 31) * 31;
        if (getGroup() != null) {
            i11 = getGroup().hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        if (getColor() != null) {
            i12 = getColor().hashCode();
        }
        return i14 + i12;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            bundle.putString(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
        }
        if (this.arguments.containsKey("group")) {
            bundle.putString("group", (String) this.arguments.get("group"));
        }
        if (this.arguments.containsKey("color")) {
            bundle.putString("color", (String) this.arguments.get("color"));
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            n0Var.j(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
        }
        if (this.arguments.containsKey("group")) {
            n0Var.j("group", (String) this.arguments.get("group"));
        }
        if (this.arguments.containsKey("color")) {
            n0Var.j("color", (String) this.arguments.get("color"));
        }
        return n0Var;
    }

    public String toString() {
        return "MountDetailRecyclerFragmentArgs{type=" + getType() + ", group=" + getGroup() + ", color=" + getColor() + "}";
    }

    private MountDetailRecyclerFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(MountDetailRecyclerFragmentArgs mountDetailRecyclerFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(mountDetailRecyclerFragmentArgs.arguments);
        }

        public MountDetailRecyclerFragmentArgs build() {
            return new MountDetailRecyclerFragmentArgs(this.arguments);
        }

        public String getColor() {
            return (String) this.arguments.get("color");
        }

        public String getGroup() {
            return (String) this.arguments.get("group");
        }

        public String getType() {
            return (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY);
        }

        public Builder setColor(String str) {
            this.arguments.put("color", str);
            return this;
        }

        public Builder setGroup(String str) {
            if (str != null) {
                this.arguments.put("group", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"group\" is marked as non-null but was passed a null value.");
        }

        public Builder setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public Builder(String str, String str2, String str3) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put(TaskFormActivity.TASK_TYPE_KEY, str);
                if (str2 != null) {
                    hashMap.put("group", str2);
                    hashMap.put("color", str3);
                    return;
                }
                throw new IllegalArgumentException("Argument \"group\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
    }

    private MountDetailRecyclerFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
