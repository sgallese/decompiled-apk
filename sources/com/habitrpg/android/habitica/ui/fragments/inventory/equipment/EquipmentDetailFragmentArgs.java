package com.habitrpg.android.habitica.ui.fragments.inventory.equipment;

import android.os.Bundle;
import androidx.lifecycle.n0;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.HashMap;
import k3.f;

/* loaded from: classes4.dex */
public class EquipmentDetailFragmentArgs implements f {
    private final HashMap arguments;

    public static EquipmentDetailFragmentArgs fromBundle(Bundle bundle) {
        EquipmentDetailFragmentArgs equipmentDetailFragmentArgs = new EquipmentDetailFragmentArgs();
        bundle.setClassLoader(EquipmentDetailFragmentArgs.class.getClassLoader());
        if (bundle.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            String string = bundle.getString(TaskFormActivity.TASK_TYPE_KEY);
            if (string != null) {
                equipmentDetailFragmentArgs.arguments.put(TaskFormActivity.TASK_TYPE_KEY, string);
                if (bundle.containsKey("isCostume")) {
                    equipmentDetailFragmentArgs.arguments.put("isCostume", Boolean.valueOf(bundle.getBoolean("isCostume")));
                    if (bundle.containsKey("equippedGear")) {
                        String string2 = bundle.getString("equippedGear");
                        if (string2 != null) {
                            equipmentDetailFragmentArgs.arguments.put("equippedGear", string2);
                            return equipmentDetailFragmentArgs;
                        }
                        throw new IllegalArgumentException("Argument \"equippedGear\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Required argument \"equippedGear\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"isCostume\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public static EquipmentDetailFragmentArgs fromSavedStateHandle(n0 n0Var) {
        EquipmentDetailFragmentArgs equipmentDetailFragmentArgs = new EquipmentDetailFragmentArgs();
        if (n0Var.e(TaskFormActivity.TASK_TYPE_KEY)) {
            String str = (String) n0Var.f(TaskFormActivity.TASK_TYPE_KEY);
            if (str != null) {
                equipmentDetailFragmentArgs.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                if (n0Var.e("isCostume")) {
                    equipmentDetailFragmentArgs.arguments.put("isCostume", Boolean.valueOf(((Boolean) n0Var.f("isCostume")).booleanValue()));
                    if (n0Var.e("equippedGear")) {
                        String str2 = (String) n0Var.f("equippedGear");
                        if (str2 != null) {
                            equipmentDetailFragmentArgs.arguments.put("equippedGear", str2);
                            return equipmentDetailFragmentArgs;
                        }
                        throw new IllegalArgumentException("Argument \"equippedGear\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Required argument \"equippedGear\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"isCostume\" is missing and does not have an android:defaultValue");
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
        EquipmentDetailFragmentArgs equipmentDetailFragmentArgs = (EquipmentDetailFragmentArgs) obj;
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != equipmentDetailFragmentArgs.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            return false;
        }
        if (getType() == null ? equipmentDetailFragmentArgs.getType() != null : !getType().equals(equipmentDetailFragmentArgs.getType())) {
            return false;
        }
        if (this.arguments.containsKey("isCostume") != equipmentDetailFragmentArgs.arguments.containsKey("isCostume") || getIsCostume() != equipmentDetailFragmentArgs.getIsCostume() || this.arguments.containsKey("equippedGear") != equipmentDetailFragmentArgs.arguments.containsKey("equippedGear")) {
            return false;
        }
        if (getEquippedGear() == null ? equipmentDetailFragmentArgs.getEquippedGear() == null : getEquippedGear().equals(equipmentDetailFragmentArgs.getEquippedGear())) {
            return true;
        }
        return false;
    }

    public String getEquippedGear() {
        return (String) this.arguments.get("equippedGear");
    }

    public boolean getIsCostume() {
        return ((Boolean) this.arguments.get("isCostume")).booleanValue();
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
        int i12 = (((i10 + 31) * 31) + (getIsCostume() ? 1 : 0)) * 31;
        if (getEquippedGear() != null) {
            i11 = getEquippedGear().hashCode();
        }
        return i12 + i11;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            bundle.putString(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
        }
        if (this.arguments.containsKey("isCostume")) {
            bundle.putBoolean("isCostume", ((Boolean) this.arguments.get("isCostume")).booleanValue());
        }
        if (this.arguments.containsKey("equippedGear")) {
            bundle.putString("equippedGear", (String) this.arguments.get("equippedGear"));
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            n0Var.j(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
        }
        if (this.arguments.containsKey("isCostume")) {
            n0Var.j("isCostume", Boolean.valueOf(((Boolean) this.arguments.get("isCostume")).booleanValue()));
        }
        if (this.arguments.containsKey("equippedGear")) {
            n0Var.j("equippedGear", (String) this.arguments.get("equippedGear"));
        }
        return n0Var;
    }

    public String toString() {
        return "EquipmentDetailFragmentArgs{type=" + getType() + ", isCostume=" + getIsCostume() + ", equippedGear=" + getEquippedGear() + "}";
    }

    private EquipmentDetailFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(EquipmentDetailFragmentArgs equipmentDetailFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(equipmentDetailFragmentArgs.arguments);
        }

        public EquipmentDetailFragmentArgs build() {
            return new EquipmentDetailFragmentArgs(this.arguments);
        }

        public String getEquippedGear() {
            return (String) this.arguments.get("equippedGear");
        }

        public boolean getIsCostume() {
            return ((Boolean) this.arguments.get("isCostume")).booleanValue();
        }

        public String getType() {
            return (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY);
        }

        public Builder setEquippedGear(String str) {
            if (str != null) {
                this.arguments.put("equippedGear", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"equippedGear\" is marked as non-null but was passed a null value.");
        }

        public Builder setIsCostume(boolean z10) {
            this.arguments.put("isCostume", Boolean.valueOf(z10));
            return this;
        }

        public Builder setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public Builder(String str, boolean z10, String str2) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put(TaskFormActivity.TASK_TYPE_KEY, str);
                hashMap.put("isCostume", Boolean.valueOf(z10));
                if (str2 != null) {
                    hashMap.put("equippedGear", str2);
                    return;
                }
                throw new IllegalArgumentException("Argument \"equippedGear\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
    }

    private EquipmentDetailFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
