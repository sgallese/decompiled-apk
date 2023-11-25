package com.habitrpg.android.habitica.ui.fragments.social;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class InboxMessageListFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static InboxMessageListFragmentArgs fromBundle(Bundle bundle) {
        InboxMessageListFragmentArgs inboxMessageListFragmentArgs = new InboxMessageListFragmentArgs();
        bundle.setClassLoader(InboxMessageListFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("userID")) {
            String string = bundle.getString("userID");
            if (string != null) {
                inboxMessageListFragmentArgs.arguments.put("userID", string);
                if (bundle.containsKey("username")) {
                    inboxMessageListFragmentArgs.arguments.put("username", bundle.getString("username"));
                    return inboxMessageListFragmentArgs;
                }
                throw new IllegalArgumentException("Required argument \"username\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"userID\" is missing and does not have an android:defaultValue");
    }

    public static InboxMessageListFragmentArgs fromSavedStateHandle(n0 n0Var) {
        InboxMessageListFragmentArgs inboxMessageListFragmentArgs = new InboxMessageListFragmentArgs();
        if (n0Var.e("userID")) {
            String str = (String) n0Var.f("userID");
            if (str != null) {
                inboxMessageListFragmentArgs.arguments.put("userID", str);
                if (n0Var.e("username")) {
                    inboxMessageListFragmentArgs.arguments.put("username", (String) n0Var.f("username"));
                    return inboxMessageListFragmentArgs;
                }
                throw new IllegalArgumentException("Required argument \"username\" is missing and does not have an android:defaultValue");
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
        InboxMessageListFragmentArgs inboxMessageListFragmentArgs = (InboxMessageListFragmentArgs) obj;
        if (this.arguments.containsKey("userID") != inboxMessageListFragmentArgs.arguments.containsKey("userID")) {
            return false;
        }
        if (getUserID() == null ? inboxMessageListFragmentArgs.getUserID() != null : !getUserID().equals(inboxMessageListFragmentArgs.getUserID())) {
            return false;
        }
        if (this.arguments.containsKey("username") != inboxMessageListFragmentArgs.arguments.containsKey("username")) {
            return false;
        }
        if (getUsername() == null ? inboxMessageListFragmentArgs.getUsername() == null : getUsername().equals(inboxMessageListFragmentArgs.getUsername())) {
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

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey("userID")) {
            n0Var.j("userID", (String) this.arguments.get("userID"));
        }
        if (this.arguments.containsKey("username")) {
            n0Var.j("username", (String) this.arguments.get("username"));
        }
        return n0Var;
    }

    public String toString() {
        return "InboxMessageListFragmentArgs{userID=" + getUserID() + ", username=" + getUsername() + "}";
    }

    private InboxMessageListFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(InboxMessageListFragmentArgs inboxMessageListFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(inboxMessageListFragmentArgs.arguments);
        }

        public InboxMessageListFragmentArgs build() {
            return new InboxMessageListFragmentArgs(this.arguments);
        }

        public String getUserID() {
            return (String) this.arguments.get("userID");
        }

        public String getUsername() {
            return (String) this.arguments.get("username");
        }

        public Builder setUserID(String str) {
            if (str != null) {
                this.arguments.put("userID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }

        public Builder setUsername(String str) {
            this.arguments.put("username", str);
            return this;
        }

        public Builder(String str, String str2) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put("userID", str);
                hashMap.put("username", str2);
                return;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }
    }

    private InboxMessageListFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
