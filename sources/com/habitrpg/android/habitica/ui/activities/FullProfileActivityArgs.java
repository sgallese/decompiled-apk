package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FullProfileActivityArgs implements k3.f {
    private final HashMap arguments;

    public static FullProfileActivityArgs fromBundle(Bundle bundle) {
        FullProfileActivityArgs fullProfileActivityArgs = new FullProfileActivityArgs();
        bundle.setClassLoader(FullProfileActivityArgs.class.getClassLoader());
        if (bundle.containsKey("userID")) {
            String string = bundle.getString("userID");
            if (string != null) {
                fullProfileActivityArgs.arguments.put("userID", string);
                return fullProfileActivityArgs;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"userID\" is missing and does not have an android:defaultValue");
    }

    public static FullProfileActivityArgs fromSavedStateHandle(androidx.lifecycle.n0 n0Var) {
        FullProfileActivityArgs fullProfileActivityArgs = new FullProfileActivityArgs();
        if (n0Var.e("userID")) {
            String str = (String) n0Var.f("userID");
            if (str != null) {
                fullProfileActivityArgs.arguments.put("userID", str);
                return fullProfileActivityArgs;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
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
        FullProfileActivityArgs fullProfileActivityArgs = (FullProfileActivityArgs) obj;
        if (this.arguments.containsKey("userID") != fullProfileActivityArgs.arguments.containsKey("userID")) {
            return false;
        }
        if (getUserID() == null ? fullProfileActivityArgs.getUserID() == null : getUserID().equals(fullProfileActivityArgs.getUserID())) {
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

    public androidx.lifecycle.n0 toSavedStateHandle() {
        androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0();
        if (this.arguments.containsKey("userID")) {
            n0Var.j("userID", (String) this.arguments.get("userID"));
        }
        return n0Var;
    }

    public String toString() {
        return "FullProfileActivityArgs{userID=" + getUserID() + "}";
    }

    private FullProfileActivityArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(FullProfileActivityArgs fullProfileActivityArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(fullProfileActivityArgs.arguments);
        }

        public FullProfileActivityArgs build() {
            return new FullProfileActivityArgs(this.arguments);
        }

        public String getUserID() {
            return (String) this.arguments.get("userID");
        }

        public Builder setUserID(String str) {
            if (str != null) {
                this.arguments.put("userID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }

        public Builder(String str) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put("userID", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }
    }

    private FullProfileActivityArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
