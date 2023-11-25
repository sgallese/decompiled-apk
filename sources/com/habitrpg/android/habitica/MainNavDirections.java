package com.habitrpg.android.habitica;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class MainNavDirections {

    /* loaded from: classes4.dex */
    public static class ActionGlobalClassSelectionActivity implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ActionGlobalClassSelectionActivity actionGlobalClassSelectionActivity = (ActionGlobalClassSelectionActivity) obj;
            if (this.arguments.containsKey("isClassSelected") != actionGlobalClassSelectionActivity.arguments.containsKey("isClassSelected") || getIsClassSelected() != actionGlobalClassSelectionActivity.getIsClassSelected() || this.arguments.containsKey("className") != actionGlobalClassSelectionActivity.arguments.containsKey("className")) {
                return false;
            }
            if (getClassName() == null ? actionGlobalClassSelectionActivity.getClassName() != null : !getClassName().equals(actionGlobalClassSelectionActivity.getClassName())) {
                return false;
            }
            if (getActionId() == actionGlobalClassSelectionActivity.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.action_global_classSelectionActivity;
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey("isClassSelected")) {
                bundle.putBoolean("isClassSelected", ((Boolean) this.arguments.get("isClassSelected")).booleanValue());
            } else {
                bundle.putBoolean("isClassSelected", false);
            }
            if (this.arguments.containsKey("className")) {
                bundle.putString("className", (String) this.arguments.get("className"));
            } else {
                bundle.putString("className", Stats.WARRIOR);
            }
            return bundle;
        }

        public String getClassName() {
            return (String) this.arguments.get("className");
        }

        public boolean getIsClassSelected() {
            return ((Boolean) this.arguments.get("isClassSelected")).booleanValue();
        }

        public int hashCode() {
            int i10;
            int i11 = ((getIsClassSelected() ? 1 : 0) + 31) * 31;
            if (getClassName() != null) {
                i10 = getClassName().hashCode();
            } else {
                i10 = 0;
            }
            return ((i11 + i10) * 31) + getActionId();
        }

        public ActionGlobalClassSelectionActivity setClassName(String str) {
            if (str != null) {
                this.arguments.put("className", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"className\" is marked as non-null but was passed a null value.");
        }

        public ActionGlobalClassSelectionActivity setIsClassSelected(boolean z10) {
            this.arguments.put("isClassSelected", Boolean.valueOf(z10));
            return this;
        }

        public String toString() {
            return "ActionGlobalClassSelectionActivity(actionId=" + getActionId() + "){isClassSelected=" + getIsClassSelected() + ", className=" + getClassName() + "}";
        }

        private ActionGlobalClassSelectionActivity() {
            this.arguments = new HashMap();
        }
    }

    /* loaded from: classes4.dex */
    public static class ActionGlobalReportMessageActivity implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ActionGlobalReportMessageActivity actionGlobalReportMessageActivity = (ActionGlobalReportMessageActivity) obj;
            if (this.arguments.containsKey("text") != actionGlobalReportMessageActivity.arguments.containsKey("text")) {
                return false;
            }
            if (getText() == null ? actionGlobalReportMessageActivity.getText() != null : !getText().equals(actionGlobalReportMessageActivity.getText())) {
                return false;
            }
            if (this.arguments.containsKey("profileName") != actionGlobalReportMessageActivity.arguments.containsKey("profileName")) {
                return false;
            }
            if (getProfileName() == null ? actionGlobalReportMessageActivity.getProfileName() != null : !getProfileName().equals(actionGlobalReportMessageActivity.getProfileName())) {
                return false;
            }
            if (this.arguments.containsKey("messageID") != actionGlobalReportMessageActivity.arguments.containsKey("messageID")) {
                return false;
            }
            if (getMessageID() == null ? actionGlobalReportMessageActivity.getMessageID() != null : !getMessageID().equals(actionGlobalReportMessageActivity.getMessageID())) {
                return false;
            }
            if (this.arguments.containsKey("groupID") != actionGlobalReportMessageActivity.arguments.containsKey("groupID")) {
                return false;
            }
            if (getGroupID() == null ? actionGlobalReportMessageActivity.getGroupID() != null : !getGroupID().equals(actionGlobalReportMessageActivity.getGroupID())) {
                return false;
            }
            if (getActionId() == actionGlobalReportMessageActivity.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.action_global_reportMessageActivity;
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey("text")) {
                bundle.putString("text", (String) this.arguments.get("text"));
            }
            if (this.arguments.containsKey("profileName")) {
                bundle.putString("profileName", (String) this.arguments.get("profileName"));
            }
            if (this.arguments.containsKey("messageID")) {
                bundle.putString("messageID", (String) this.arguments.get("messageID"));
            }
            if (this.arguments.containsKey("groupID")) {
                bundle.putString("groupID", (String) this.arguments.get("groupID"));
            }
            return bundle;
        }

        public String getGroupID() {
            return (String) this.arguments.get("groupID");
        }

        public String getMessageID() {
            return (String) this.arguments.get("messageID");
        }

        public String getProfileName() {
            return (String) this.arguments.get("profileName");
        }

        public String getText() {
            return (String) this.arguments.get("text");
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            if (getText() != null) {
                i10 = getText().hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (i10 + 31) * 31;
            if (getProfileName() != null) {
                i11 = getProfileName().hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 31;
            if (getMessageID() != null) {
                i12 = getMessageID().hashCode();
            } else {
                i12 = 0;
            }
            int i16 = (i15 + i12) * 31;
            if (getGroupID() != null) {
                i13 = getGroupID().hashCode();
            }
            return ((i16 + i13) * 31) + getActionId();
        }

        public ActionGlobalReportMessageActivity setGroupID(String str) {
            this.arguments.put("groupID", str);
            return this;
        }

        public ActionGlobalReportMessageActivity setMessageID(String str) {
            if (str != null) {
                this.arguments.put("messageID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"messageID\" is marked as non-null but was passed a null value.");
        }

        public ActionGlobalReportMessageActivity setProfileName(String str) {
            if (str != null) {
                this.arguments.put("profileName", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"profileName\" is marked as non-null but was passed a null value.");
        }

        public ActionGlobalReportMessageActivity setText(String str) {
            if (str != null) {
                this.arguments.put("text", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "ActionGlobalReportMessageActivity(actionId=" + getActionId() + "){text=" + getText() + ", profileName=" + getProfileName() + ", messageID=" + getMessageID() + ", groupID=" + getGroupID() + "}";
        }

        private ActionGlobalReportMessageActivity(String str, String str2, String str3, String str4) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put("text", str);
                if (str2 != null) {
                    hashMap.put("profileName", str2);
                    if (str3 != null) {
                        hashMap.put("messageID", str3);
                        hashMap.put("groupID", str4);
                        return;
                    }
                    throw new IllegalArgumentException("Argument \"messageID\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Argument \"profileName\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes4.dex */
    public static class OpenArmoireActivity implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenArmoireActivity openArmoireActivity = (OpenArmoireActivity) obj;
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != openArmoireActivity.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                return false;
            }
            if (getType() == null ? openArmoireActivity.getType() != null : !getType().equals(openArmoireActivity.getType())) {
                return false;
            }
            if (this.arguments.containsKey("text") != openArmoireActivity.arguments.containsKey("text")) {
                return false;
            }
            if (getText() == null ? openArmoireActivity.getText() != null : !getText().equals(openArmoireActivity.getText())) {
                return false;
            }
            if (this.arguments.containsKey("key") != openArmoireActivity.arguments.containsKey("key")) {
                return false;
            }
            if (getKey() == null ? openArmoireActivity.getKey() != null : !getKey().equals(openArmoireActivity.getKey())) {
                return false;
            }
            if (this.arguments.containsKey(AppMeasurementSdk.ConditionalUserProperty.VALUE) != openArmoireActivity.arguments.containsKey(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                return false;
            }
            if (getValue() == null ? openArmoireActivity.getValue() != null : !getValue().equals(openArmoireActivity.getValue())) {
                return false;
            }
            if (getActionId() == openArmoireActivity.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openArmoireActivity;
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
                bundle.putString(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
            }
            if (this.arguments.containsKey("text")) {
                bundle.putString("text", (String) this.arguments.get("text"));
            }
            if (this.arguments.containsKey("key")) {
                bundle.putString("key", (String) this.arguments.get("key"));
            }
            if (this.arguments.containsKey(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) this.arguments.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            return bundle;
        }

        public String getKey() {
            return (String) this.arguments.get("key");
        }

        public String getText() {
            return (String) this.arguments.get("text");
        }

        public String getType() {
            return (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY);
        }

        public String getValue() {
            return (String) this.arguments.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            if (getType() != null) {
                i10 = getType().hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (i10 + 31) * 31;
            if (getText() != null) {
                i11 = getText().hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 31;
            if (getKey() != null) {
                i12 = getKey().hashCode();
            } else {
                i12 = 0;
            }
            int i16 = (i15 + i12) * 31;
            if (getValue() != null) {
                i13 = getValue().hashCode();
            }
            return ((i16 + i13) * 31) + getActionId();
        }

        public OpenArmoireActivity setKey(String str) {
            if (str != null) {
                this.arguments.put("key", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
        }

        public OpenArmoireActivity setText(String str) {
            if (str != null) {
                this.arguments.put("text", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
        }

        public OpenArmoireActivity setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public OpenArmoireActivity setValue(String str) {
            if (str != null) {
                this.arguments.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"value\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "OpenArmoireActivity(actionId=" + getActionId() + "){type=" + getType() + ", text=" + getText() + ", key=" + getKey() + ", value=" + getValue() + "}";
        }

        private OpenArmoireActivity(String str, String str2, String str3, String str4) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put(TaskFormActivity.TASK_TYPE_KEY, str);
                if (str2 != null) {
                    hashMap.put("text", str2);
                    if (str3 != null) {
                        hashMap.put("key", str3);
                        if (str4 != null) {
                            hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str4);
                            return;
                        }
                        throw new IllegalArgumentException("Argument \"value\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes4.dex */
    public static class OpenProfileActivity implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenProfileActivity openProfileActivity = (OpenProfileActivity) obj;
            if (this.arguments.containsKey("userID") != openProfileActivity.arguments.containsKey("userID")) {
                return false;
            }
            if (getUserID() == null ? openProfileActivity.getUserID() != null : !getUserID().equals(openProfileActivity.getUserID())) {
                return false;
            }
            if (getActionId() == openProfileActivity.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openProfileActivity;
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey("userID")) {
                bundle.putString("userID", (String) this.arguments.get("userID"));
            }
            return bundle;
        }

        public String getUserID() {
            return (String) this.arguments.get("userID");
        }

        public int hashCode() {
            int i10;
            if (getUserID() != null) {
                i10 = getUserID().hashCode();
            } else {
                i10 = 0;
            }
            return ((i10 + 31) * 31) + getActionId();
        }

        public OpenProfileActivity setUserID(String str) {
            if (str != null) {
                this.arguments.put("userID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "OpenProfileActivity(actionId=" + getActionId() + "){userID=" + getUserID() + "}";
        }

        private OpenProfileActivity(String str) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put("userID", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }
    }

    private MainNavDirections() {
    }

    public static ActionGlobalClassSelectionActivity actionGlobalClassSelectionActivity() {
        return new ActionGlobalClassSelectionActivity();
    }

    public static ActionGlobalReportMessageActivity actionGlobalReportMessageActivity(String str, String str2, String str3, String str4) {
        return new ActionGlobalReportMessageActivity(str, str2, str3, str4);
    }

    public static OpenArmoireActivity openArmoireActivity(String str, String str2, String str3, String str4) {
        return new OpenArmoireActivity(str, str2, str3, str4);
    }

    public static OpenProfileActivity openProfileActivity(String str) {
        return new OpenProfileActivity(str);
    }
}
