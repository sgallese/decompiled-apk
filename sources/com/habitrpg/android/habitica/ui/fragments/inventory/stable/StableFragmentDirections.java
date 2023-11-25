package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import android.os.Bundle;
import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.HashMap;
import k3.k;

/* loaded from: classes4.dex */
public class StableFragmentDirections {

    /* loaded from: classes4.dex */
    public static class OpenMountDetail implements k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenMountDetail openMountDetail = (OpenMountDetail) obj;
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != openMountDetail.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                return false;
            }
            if (getType() == null ? openMountDetail.getType() != null : !getType().equals(openMountDetail.getType())) {
                return false;
            }
            if (this.arguments.containsKey("group") != openMountDetail.arguments.containsKey("group")) {
                return false;
            }
            if (getGroup() == null ? openMountDetail.getGroup() != null : !getGroup().equals(openMountDetail.getGroup())) {
                return false;
            }
            if (this.arguments.containsKey("color") != openMountDetail.arguments.containsKey("color")) {
                return false;
            }
            if (getColor() == null ? openMountDetail.getColor() != null : !getColor().equals(openMountDetail.getColor())) {
                return false;
            }
            if (getActionId() == openMountDetail.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openMountDetail;
        }

        @Override // k3.k
        public Bundle getArguments() {
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
            return ((i14 + i12) * 31) + getActionId();
        }

        public OpenMountDetail setColor(String str) {
            this.arguments.put("color", str);
            return this;
        }

        public OpenMountDetail setGroup(String str) {
            if (str != null) {
                this.arguments.put("group", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"group\" is marked as non-null but was passed a null value.");
        }

        public OpenMountDetail setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "OpenMountDetail(actionId=" + getActionId() + "){type=" + getType() + ", group=" + getGroup() + ", color=" + getColor() + "}";
        }

        private OpenMountDetail(String str, String str2, String str3) {
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

    /* loaded from: classes4.dex */
    public static class OpenPetDetail implements k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenPetDetail openPetDetail = (OpenPetDetail) obj;
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != openPetDetail.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                return false;
            }
            if (getType() == null ? openPetDetail.getType() != null : !getType().equals(openPetDetail.getType())) {
                return false;
            }
            if (this.arguments.containsKey("group") != openPetDetail.arguments.containsKey("group")) {
                return false;
            }
            if (getGroup() == null ? openPetDetail.getGroup() != null : !getGroup().equals(openPetDetail.getGroup())) {
                return false;
            }
            if (this.arguments.containsKey("color") != openPetDetail.arguments.containsKey("color")) {
                return false;
            }
            if (getColor() == null ? openPetDetail.getColor() != null : !getColor().equals(openPetDetail.getColor())) {
                return false;
            }
            if (getActionId() == openPetDetail.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openPetDetail;
        }

        @Override // k3.k
        public Bundle getArguments() {
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
            return ((i14 + i12) * 31) + getActionId();
        }

        public OpenPetDetail setColor(String str) {
            this.arguments.put("color", str);
            return this;
        }

        public OpenPetDetail setGroup(String str) {
            if (str != null) {
                this.arguments.put("group", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"group\" is marked as non-null but was passed a null value.");
        }

        public OpenPetDetail setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "OpenPetDetail(actionId=" + getActionId() + "){type=" + getType() + ", group=" + getGroup() + ", color=" + getColor() + "}";
        }

        private OpenPetDetail(String str, String str2, String str3) {
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

    private StableFragmentDirections() {
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

    public static OpenMountDetail openMountDetail(String str, String str2, String str3) {
        return new OpenMountDetail(str, str2, str3);
    }

    public static OpenPetDetail openPetDetail(String str, String str2, String str3) {
        return new OpenPetDetail(str, str2, str3);
    }

    public static MainNavDirections.OpenProfileActivity openProfileActivity(String str) {
        return MainNavDirections.openProfileActivity(str);
    }
}
