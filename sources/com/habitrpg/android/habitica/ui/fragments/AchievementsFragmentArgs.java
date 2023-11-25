package com.habitrpg.android.habitica.ui.fragments;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class AchievementsFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static AchievementsFragmentArgs fromBundle(Bundle bundle) {
        AchievementsFragmentArgs achievementsFragmentArgs = new AchievementsFragmentArgs();
        bundle.setClassLoader(AchievementsFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("userID")) {
            achievementsFragmentArgs.arguments.put("userID", bundle.getString("userID"));
            return achievementsFragmentArgs;
        }
        throw new IllegalArgumentException("Required argument \"userID\" is missing and does not have an android:defaultValue");
    }

    public static AchievementsFragmentArgs fromSavedStateHandle(n0 n0Var) {
        AchievementsFragmentArgs achievementsFragmentArgs = new AchievementsFragmentArgs();
        if (n0Var.e("userID")) {
            achievementsFragmentArgs.arguments.put("userID", (String) n0Var.f("userID"));
            return achievementsFragmentArgs;
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
        AchievementsFragmentArgs achievementsFragmentArgs = (AchievementsFragmentArgs) obj;
        if (this.arguments.containsKey("userID") != achievementsFragmentArgs.arguments.containsKey("userID")) {
            return false;
        }
        if (getUserID() == null ? achievementsFragmentArgs.getUserID() == null : getUserID().equals(achievementsFragmentArgs.getUserID())) {
            return true;
        }
        return false;
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
        return 31 + i10;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("userID")) {
            bundle.putString("userID", (String) this.arguments.get("userID"));
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey("userID")) {
            n0Var.j("userID", (String) this.arguments.get("userID"));
        }
        return n0Var;
    }

    public String toString() {
        return "AchievementsFragmentArgs{userID=" + getUserID() + "}";
    }

    private AchievementsFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(AchievementsFragmentArgs achievementsFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(achievementsFragmentArgs.arguments);
        }

        public AchievementsFragmentArgs build() {
            return new AchievementsFragmentArgs(this.arguments);
        }

        public String getUserID() {
            return (String) this.arguments.get("userID");
        }

        public Builder setUserID(String str) {
            this.arguments.put("userID", str);
            return this;
        }

        public Builder(String str) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.put("userID", str);
        }
    }

    private AchievementsFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
