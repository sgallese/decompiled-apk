package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class GiftSubscriptionActivityArgs implements k3.f {
    private final HashMap arguments;

    public static GiftSubscriptionActivityArgs fromBundle(Bundle bundle) {
        GiftSubscriptionActivityArgs giftSubscriptionActivityArgs = new GiftSubscriptionActivityArgs();
        bundle.setClassLoader(GiftSubscriptionActivityArgs.class.getClassLoader());
        if (bundle.containsKey("userID")) {
            giftSubscriptionActivityArgs.arguments.put("userID", bundle.getString("userID"));
            if (bundle.containsKey("username")) {
                giftSubscriptionActivityArgs.arguments.put("username", bundle.getString("username"));
                return giftSubscriptionActivityArgs;
            }
            throw new IllegalArgumentException("Required argument \"username\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"userID\" is missing and does not have an android:defaultValue");
    }

    public static GiftSubscriptionActivityArgs fromSavedStateHandle(androidx.lifecycle.n0 n0Var) {
        GiftSubscriptionActivityArgs giftSubscriptionActivityArgs = new GiftSubscriptionActivityArgs();
        if (n0Var.e("userID")) {
            giftSubscriptionActivityArgs.arguments.put("userID", (String) n0Var.f("userID"));
            if (n0Var.e("username")) {
                giftSubscriptionActivityArgs.arguments.put("username", (String) n0Var.f("username"));
                return giftSubscriptionActivityArgs;
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
        GiftSubscriptionActivityArgs giftSubscriptionActivityArgs = (GiftSubscriptionActivityArgs) obj;
        if (this.arguments.containsKey("userID") != giftSubscriptionActivityArgs.arguments.containsKey("userID")) {
            return false;
        }
        if (getUserID() == null ? giftSubscriptionActivityArgs.getUserID() != null : !getUserID().equals(giftSubscriptionActivityArgs.getUserID())) {
            return false;
        }
        if (this.arguments.containsKey("username") != giftSubscriptionActivityArgs.arguments.containsKey("username")) {
            return false;
        }
        if (getUsername() == null ? giftSubscriptionActivityArgs.getUsername() == null : getUsername().equals(giftSubscriptionActivityArgs.getUsername())) {
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
        return "GiftSubscriptionActivityArgs{userID=" + getUserID() + ", username=" + getUsername() + "}";
    }

    private GiftSubscriptionActivityArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(GiftSubscriptionActivityArgs giftSubscriptionActivityArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(giftSubscriptionActivityArgs.arguments);
        }

        public GiftSubscriptionActivityArgs build() {
            return new GiftSubscriptionActivityArgs(this.arguments);
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

    private GiftSubscriptionActivityArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
