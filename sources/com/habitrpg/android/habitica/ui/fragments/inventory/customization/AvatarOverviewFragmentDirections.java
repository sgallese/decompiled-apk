package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import android.os.Bundle;
import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class AvatarOverviewFragmentDirections {

    /* loaded from: classes4.dex */
    public static class OpenAvatarDetail implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenAvatarDetail openAvatarDetail = (OpenAvatarDetail) obj;
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != openAvatarDetail.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                return false;
            }
            if (getType() == null ? openAvatarDetail.getType() != null : !getType().equals(openAvatarDetail.getType())) {
                return false;
            }
            if (this.arguments.containsKey("category") != openAvatarDetail.arguments.containsKey("category")) {
                return false;
            }
            if (getCategory() == null ? openAvatarDetail.getCategory() != null : !getCategory().equals(openAvatarDetail.getCategory())) {
                return false;
            }
            if (getActionId() == openAvatarDetail.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openAvatarDetail;
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                bundle.putString(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
            }
            if (this.arguments.containsKey("category")) {
                bundle.putString("category", (String) this.arguments.get("category"));
            }
            return bundle;
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
            return ((i12 + i11) * 31) + getActionId();
        }

        public OpenAvatarDetail setCategory(String str) {
            if (str != null) {
                this.arguments.put("category", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
        }

        public OpenAvatarDetail setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "OpenAvatarDetail(actionId=" + getActionId() + "){type=" + getType() + ", category=" + getCategory() + "}";
        }

        private OpenAvatarDetail(String str, String str2) {
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

    /* loaded from: classes4.dex */
    public static class OpenAvatarEquipment implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenAvatarEquipment openAvatarEquipment = (OpenAvatarEquipment) obj;
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != openAvatarEquipment.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                return false;
            }
            if (getType() == null ? openAvatarEquipment.getType() != null : !getType().equals(openAvatarEquipment.getType())) {
                return false;
            }
            if (this.arguments.containsKey("category") != openAvatarEquipment.arguments.containsKey("category")) {
                return false;
            }
            if (getCategory() == null ? openAvatarEquipment.getCategory() != null : !getCategory().equals(openAvatarEquipment.getCategory())) {
                return false;
            }
            if (getActionId() == openAvatarEquipment.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openAvatarEquipment;
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                bundle.putString(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
            }
            if (this.arguments.containsKey("category")) {
                bundle.putString("category", (String) this.arguments.get("category"));
            }
            return bundle;
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
            return ((i12 + i11) * 31) + getActionId();
        }

        public OpenAvatarEquipment setCategory(String str) {
            if (str != null) {
                this.arguments.put("category", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
        }

        public OpenAvatarEquipment setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "OpenAvatarEquipment(actionId=" + getActionId() + "){type=" + getType() + ", category=" + getCategory() + "}";
        }

        private OpenAvatarEquipment(String str, String str2) {
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

    /* loaded from: classes4.dex */
    public static class OpenEquipmentDetail implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenEquipmentDetail openEquipmentDetail = (OpenEquipmentDetail) obj;
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != openEquipmentDetail.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                return false;
            }
            if (getType() == null ? openEquipmentDetail.getType() != null : !getType().equals(openEquipmentDetail.getType())) {
                return false;
            }
            if (this.arguments.containsKey("isCostume") != openEquipmentDetail.arguments.containsKey("isCostume") || getIsCostume() != openEquipmentDetail.getIsCostume() || this.arguments.containsKey("equippedGear") != openEquipmentDetail.arguments.containsKey("equippedGear")) {
                return false;
            }
            if (getEquippedGear() == null ? openEquipmentDetail.getEquippedGear() != null : !getEquippedGear().equals(openEquipmentDetail.getEquippedGear())) {
                return false;
            }
            if (getActionId() == openEquipmentDetail.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openEquipmentDetail;
        }

        @Override // k3.k
        public Bundle getArguments() {
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
            return ((i12 + i11) * 31) + getActionId();
        }

        public OpenEquipmentDetail setEquippedGear(String str) {
            if (str != null) {
                this.arguments.put("equippedGear", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"equippedGear\" is marked as non-null but was passed a null value.");
        }

        public OpenEquipmentDetail setIsCostume(boolean z10) {
            this.arguments.put("isCostume", Boolean.valueOf(z10));
            return this;
        }

        public OpenEquipmentDetail setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "OpenEquipmentDetail(actionId=" + getActionId() + "){type=" + getType() + ", isCostume=" + getIsCostume() + ", equippedGear=" + getEquippedGear() + "}";
        }

        private OpenEquipmentDetail(String str, boolean z10, String str2) {
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

    private AvatarOverviewFragmentDirections() {
    }

    public static MainNavDirections.ActionGlobalClassSelectionActivity actionGlobalClassSelectionActivity() {
        return MainNavDirections.actionGlobalClassSelectionActivity();
    }

    public static MainNavDirections.ActionGlobalReportMessageActivity actionGlobalReportMessageActivity(String str, String str2, String str3, String str4) {
        return MainNavDirections.actionGlobalReportMessageActivity(str, str2, str3, str4);
    }

    public static MainNavDirections.OpenArmoireActivity openArmoireActivity(String str, String str2, String str3, String str4) {
        return MainNavDirections.openArmoireActivity(str, str2, str3, str4);
    }

    public static OpenAvatarDetail openAvatarDetail(String str, String str2) {
        return new OpenAvatarDetail(str, str2);
    }

    public static OpenAvatarEquipment openAvatarEquipment(String str, String str2) {
        return new OpenAvatarEquipment(str, str2);
    }

    public static OpenEquipmentDetail openEquipmentDetail(String str, boolean z10, String str2) {
        return new OpenEquipmentDetail(str, z10, str2);
    }

    public static MainNavDirections.OpenProfileActivity openProfileActivity(String str) {
        return MainNavDirections.openProfileActivity(str);
    }
}
