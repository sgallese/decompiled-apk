package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import android.os.Bundle;
import androidx.lifecycle.n0;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class AvatarEquipmentFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static AvatarEquipmentFragmentArgs fromBundle(Bundle bundle) {
        AvatarEquipmentFragmentArgs avatarEquipmentFragmentArgs = new AvatarEquipmentFragmentArgs();
        bundle.setClassLoader(AvatarEquipmentFragmentArgs.class.getClassLoader());
        if (bundle.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            String string = bundle.getString(TaskFormActivity.TASK_TYPE_KEY);
            if (string != null) {
                avatarEquipmentFragmentArgs.arguments.put(TaskFormActivity.TASK_TYPE_KEY, string);
                if (bundle.containsKey("category")) {
                    String string2 = bundle.getString("category");
                    if (string2 != null) {
                        avatarEquipmentFragmentArgs.arguments.put("category", string2);
                        return avatarEquipmentFragmentArgs;
                    }
                    throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public static AvatarEquipmentFragmentArgs fromSavedStateHandle(n0 n0Var) {
        AvatarEquipmentFragmentArgs avatarEquipmentFragmentArgs = new AvatarEquipmentFragmentArgs();
        if (n0Var.e(TaskFormActivity.TASK_TYPE_KEY)) {
            String str = (String) n0Var.f(TaskFormActivity.TASK_TYPE_KEY);
            if (str != null) {
                avatarEquipmentFragmentArgs.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                if (n0Var.e("category")) {
                    String str2 = (String) n0Var.f("category");
                    if (str2 != null) {
                        avatarEquipmentFragmentArgs.arguments.put("category", str2);
                        return avatarEquipmentFragmentArgs;
                    }
                    throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
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
        AvatarEquipmentFragmentArgs avatarEquipmentFragmentArgs = (AvatarEquipmentFragmentArgs) obj;
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != avatarEquipmentFragmentArgs.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            return false;
        }
        if (getType() == null ? avatarEquipmentFragmentArgs.getType() != null : !getType().equals(avatarEquipmentFragmentArgs.getType())) {
            return false;
        }
        if (this.arguments.containsKey("category") != avatarEquipmentFragmentArgs.arguments.containsKey("category")) {
            return false;
        }
        if (getCategory() == null ? avatarEquipmentFragmentArgs.getCategory() == null : getCategory().equals(avatarEquipmentFragmentArgs.getCategory())) {
            return true;
        }
        return false;
    }

    public String getCategory() {
        return (String) this.arguments.get("category");
    }

    public String getType() {
        return (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY);
    }

    public int hashCode() {
        int i10;
        int i11 = 0;
        if (getType() != null) {
            i10 = getType().hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        if (getCategory() != null) {
            i11 = getCategory().hashCode();
        }
        return i12 + i11;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            bundle.putString(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
        }
        if (this.arguments.containsKey("category")) {
            bundle.putString("category", (String) this.arguments.get("category"));
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            n0Var.j(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
        }
        if (this.arguments.containsKey("category")) {
            n0Var.j("category", (String) this.arguments.get("category"));
        }
        return n0Var;
    }

    public String toString() {
        return "AvatarEquipmentFragmentArgs{type=" + getType() + ", category=" + getCategory() + "}";
    }

    private AvatarEquipmentFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(AvatarEquipmentFragmentArgs avatarEquipmentFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(avatarEquipmentFragmentArgs.arguments);
        }

        public AvatarEquipmentFragmentArgs build() {
            return new AvatarEquipmentFragmentArgs(this.arguments);
        }

        public String getCategory() {
            return (String) this.arguments.get("category");
        }

        public String getType() {
            return (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY);
        }

        public Builder setCategory(String str) {
            if (str != null) {
                this.arguments.put("category", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
        }

        public Builder setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public Builder(String str, String str2) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put(TaskFormActivity.TASK_TYPE_KEY, str);
                if (str2 != null) {
                    hashMap.put("category", str2);
                    return;
                }
                throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
    }

    private AvatarEquipmentFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
