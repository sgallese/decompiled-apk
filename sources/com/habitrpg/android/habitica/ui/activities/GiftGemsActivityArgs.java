package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class GiftGemsActivityArgs implements k3.f {
    private final HashMap arguments;

    public static GiftGemsActivityArgs fromBundle(Bundle bundle) {
        GiftGemsActivityArgs giftGemsActivityArgs = new GiftGemsActivityArgs();
        bundle.setClassLoader(GiftGemsActivityArgs.class.getClassLoader());
        if (bundle.containsKey("userID")) {
            giftGemsActivityArgs.arguments.put("userID", bundle.getString("userID"));
            if (bundle.containsKey("username")) {
                giftGemsActivityArgs.arguments.put("username", bundle.getString("username"));
                return giftGemsActivityArgs;
            }
            throw new IllegalArgumentException("Required argument \"username\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"userID\" is missing and does not have an android:defaultValue");
    }

    public static GiftGemsActivityArgs fromSavedStateHandle(androidx.lifecycle.n0 n0Var) {
        GiftGemsActivityArgs giftGemsActivityArgs = new GiftGemsActivityArgs();
        if (n0Var.e("userID")) {
            giftGemsActivityArgs.arguments.put("userID", (String) n0Var.f("userID"));
            if (n0Var.e("username")) {
                giftGemsActivityArgs.arguments.put("username", (String) n0Var.f("username"));
                return giftGemsActivityArgs;
            }
            throw new IllegalArgumentException("Required argument \"username\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"userID\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GiftGemsActivityArgs giftGemsActivityArgs = (GiftGemsActivityArgs) obj;
        if (this.arguments.containsKey("userID") != giftGemsActivityArgs.arguments.containsKey("userID")) {
            return false;
        }
        if (getUserID() == null ? giftGemsActivityArgs.getUserID() != null : !getUserID().equals(giftGemsActivityArgs.getUserID())) {
            return false;
        }
        if (this.arguments.containsKey("username") != giftGemsActivityArgs.arguments.containsKey("username")) {
            return false;
        }
        if (getUsername() == null ? giftGemsActivityArgs.getUsername() == null : getUsername().equals(giftGemsActivityArgs.getUsername())) {
            return true;
        }
        return false;
    }

    public String getUserID() {
        return (String) this.arguments.get("userID");
    }

    public String getUsername() {
        return (String) this.arguments.get("username");
    }

    public int hashCode() {
        int i10;
        int i11 = 0;
        if (getUserID() != null) {
            i10 = getUserID().hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        if (getUsername() != null) {
            i11 = getUsername().hashCode();
        }
        return i12 + i11;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("userID")) {
            bundle.putString("userID", (String) this.arguments.get("userID"));
        }
        if (this.arguments.containsKey("username")) {
            bundle.putString("username", (String) this.arguments.get("username"));
        }
        return bundle;
    }

    public androidx.lifecycle.n0 toSavedStateHandle() {
        androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0();
        if (this.arguments.containsKey("userID")) {
            n0Var.j("userID", (String) this.arguments.get("userID"));
        }
        if (this.arguments.containsKey("username")) {
            n0Var.j("username", (String) this.arguments.get("username"));
        }
        return n0Var;
    }

    public String toString() {
        return "GiftGemsActivityArgs{userID=" + getUserID() + ", username=" + getUsername() + "}";
    }

    private GiftGemsActivityArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(GiftGemsActivityArgs giftGemsActivityArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(giftGemsActivityArgs.arguments);
        }

        public GiftGemsActivityArgs build() {
            return new GiftGemsActivityArgs(this.arguments);
        }

        public String getUserID() {
            return (String) this.arguments.get("userID");
        }

        public String getUsername() {
            return (String) this.arguments.get("username");
        }

        public Builder setUserID(String str) {
            this.arguments.put("userID", str);
            return this;
        }

        public Builder setUsername(String str) {
            this.arguments.put("username", str);
            return this;
        }

        public Builder(String str, String str2) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.put("userID", str);
            hashMap.put("username", str2);
        }
    }

    private GiftGemsActivityArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
