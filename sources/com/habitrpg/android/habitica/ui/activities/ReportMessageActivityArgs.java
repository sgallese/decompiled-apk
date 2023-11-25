package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ReportMessageActivityArgs implements k3.f {
    private final HashMap arguments;

    public static ReportMessageActivityArgs fromBundle(Bundle bundle) {
        ReportMessageActivityArgs reportMessageActivityArgs = new ReportMessageActivityArgs();
        bundle.setClassLoader(ReportMessageActivityArgs.class.getClassLoader());
        if (bundle.containsKey("text")) {
            String string = bundle.getString("text");
            if (string != null) {
                reportMessageActivityArgs.arguments.put("text", string);
                if (bundle.containsKey("profileName")) {
                    String string2 = bundle.getString("profileName");
                    if (string2 != null) {
                        reportMessageActivityArgs.arguments.put("profileName", string2);
                        if (bundle.containsKey("messageID")) {
                            String string3 = bundle.getString("messageID");
                            if (string3 != null) {
                                reportMessageActivityArgs.arguments.put("messageID", string3);
                                if (bundle.containsKey("groupID")) {
                                    reportMessageActivityArgs.arguments.put("groupID", bundle.getString("groupID"));
                                    return reportMessageActivityArgs;
                                }
                                throw new IllegalArgumentException("Required argument \"groupID\" is missing and does not have an android:defaultValue");
                            }
                            throw new IllegalArgumentException("Argument \"messageID\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"messageID\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"profileName\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"profileName\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"text\" is missing and does not have an android:defaultValue");
    }

    public static ReportMessageActivityArgs fromSavedStateHandle(androidx.lifecycle.n0 n0Var) {
        ReportMessageActivityArgs reportMessageActivityArgs = new ReportMessageActivityArgs();
        if (n0Var.e("text")) {
            String str = (String) n0Var.f("text");
            if (str != null) {
                reportMessageActivityArgs.arguments.put("text", str);
                if (n0Var.e("profileName")) {
                    String str2 = (String) n0Var.f("profileName");
                    if (str2 != null) {
                        reportMessageActivityArgs.arguments.put("profileName", str2);
                        if (n0Var.e("messageID")) {
                            String str3 = (String) n0Var.f("messageID");
                            if (str3 != null) {
                                reportMessageActivityArgs.arguments.put("messageID", str3);
                                if (n0Var.e("groupID")) {
                                    reportMessageActivityArgs.arguments.put("groupID", (String) n0Var.f("groupID"));
                                    return reportMessageActivityArgs;
                                }
                                throw new IllegalArgumentException("Required argument \"groupID\" is missing and does not have an android:defaultValue");
                            }
                            throw new IllegalArgumentException("Argument \"messageID\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"messageID\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"profileName\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"profileName\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"text\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportMessageActivityArgs reportMessageActivityArgs = (ReportMessageActivityArgs) obj;
        if (this.arguments.containsKey("text") != reportMessageActivityArgs.arguments.containsKey("text")) {
            return false;
        }
        if (getText() == null ? reportMessageActivityArgs.getText() != null : !getText().equals(reportMessageActivityArgs.getText())) {
            return false;
        }
        if (this.arguments.containsKey("profileName") != reportMessageActivityArgs.arguments.containsKey("profileName")) {
            return false;
        }
        if (getProfileName() == null ? reportMessageActivityArgs.getProfileName() != null : !getProfileName().equals(reportMessageActivityArgs.getProfileName())) {
            return false;
        }
        if (this.arguments.containsKey("messageID") != reportMessageActivityArgs.arguments.containsKey("messageID")) {
            return false;
        }
        if (getMessageID() == null ? reportMessageActivityArgs.getMessageID() != null : !getMessageID().equals(reportMessageActivityArgs.getMessageID())) {
            return false;
        }
        if (this.arguments.containsKey("groupID") != reportMessageActivityArgs.arguments.containsKey("groupID")) {
            return false;
        }
        if (getGroupID() == null ? reportMessageActivityArgs.getGroupID() == null : getGroupID().equals(reportMessageActivityArgs.getGroupID())) {
            return true;
        }
        return false;
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
        return i16 + i13;
    }

    public Bundle toBundle() {
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

    public androidx.lifecycle.n0 toSavedStateHandle() {
        androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0();
        if (this.arguments.containsKey("text")) {
            n0Var.j("text", (String) this.arguments.get("text"));
        }
        if (this.arguments.containsKey("profileName")) {
            n0Var.j("profileName", (String) this.arguments.get("profileName"));
        }
        if (this.arguments.containsKey("messageID")) {
            n0Var.j("messageID", (String) this.arguments.get("messageID"));
        }
        if (this.arguments.containsKey("groupID")) {
            n0Var.j("groupID", (String) this.arguments.get("groupID"));
        }
        return n0Var;
    }

    public String toString() {
        return "ReportMessageActivityArgs{text=" + getText() + ", profileName=" + getProfileName() + ", messageID=" + getMessageID() + ", groupID=" + getGroupID() + "}";
    }

    private ReportMessageActivityArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(ReportMessageActivityArgs reportMessageActivityArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(reportMessageActivityArgs.arguments);
        }

        public ReportMessageActivityArgs build() {
            return new ReportMessageActivityArgs(this.arguments);
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

        public Builder setGroupID(String str) {
            this.arguments.put("groupID", str);
            return this;
        }

        public Builder setMessageID(String str) {
            if (str != null) {
                this.arguments.put("messageID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"messageID\" is marked as non-null but was passed a null value.");
        }

        public Builder setProfileName(String str) {
            if (str != null) {
                this.arguments.put("profileName", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"profileName\" is marked as non-null but was passed a null value.");
        }

        public Builder setText(String str) {
            if (str != null) {
                this.arguments.put("text", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
        }

        public Builder(String str, String str2, String str3, String str4) {
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

    private ReportMessageActivityArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
