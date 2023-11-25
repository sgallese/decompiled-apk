package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class GuildFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static GuildFragmentArgs fromBundle(Bundle bundle) {
        GuildFragmentArgs guildFragmentArgs = new GuildFragmentArgs();
        bundle.setClassLoader(GuildFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("groupID")) {
            String string = bundle.getString("groupID");
            if (string != null) {
                guildFragmentArgs.arguments.put("groupID", string);
                if (bundle.containsKey("isMember")) {
                    guildFragmentArgs.arguments.put("isMember", Boolean.valueOf(bundle.getBoolean("isMember")));
                } else {
                    guildFragmentArgs.arguments.put("isMember", Boolean.FALSE);
                }
                if (bundle.containsKey("tabToOpen")) {
                    guildFragmentArgs.arguments.put("tabToOpen", Integer.valueOf(bundle.getInt("tabToOpen")));
                } else {
                    guildFragmentArgs.arguments.put("tabToOpen", 0);
                }
                return guildFragmentArgs;
            }
            throw new IllegalArgumentException("Argument \"groupID\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"groupID\" is missing and does not have an android:defaultValue");
    }

    public static GuildFragmentArgs fromSavedStateHandle(n0 n0Var) {
        GuildFragmentArgs guildFragmentArgs = new GuildFragmentArgs();
        if (n0Var.e("groupID")) {
            String str = (String) n0Var.f("groupID");
            if (str != null) {
                guildFragmentArgs.arguments.put("groupID", str);
                if (n0Var.e("isMember")) {
                    guildFragmentArgs.arguments.put("isMember", Boolean.valueOf(((Boolean) n0Var.f("isMember")).booleanValue()));
                } else {
                    guildFragmentArgs.arguments.put("isMember", Boolean.FALSE);
                }
                if (n0Var.e("tabToOpen")) {
                    guildFragmentArgs.arguments.put("tabToOpen", Integer.valueOf(((Integer) n0Var.f("tabToOpen")).intValue()));
                } else {
                    guildFragmentArgs.arguments.put("tabToOpen", 0);
                }
                return guildFragmentArgs;
            }
            throw new IllegalArgumentException("Argument \"groupID\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"groupID\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GuildFragmentArgs guildFragmentArgs = (GuildFragmentArgs) obj;
        if (this.arguments.containsKey("groupID") != guildFragmentArgs.arguments.containsKey("groupID")) {
            return false;
        }
        if (getGroupID() == null ? guildFragmentArgs.getGroupID() != null : !getGroupID().equals(guildFragmentArgs.getGroupID())) {
            return false;
        }
        if (this.arguments.containsKey("isMember") == guildFragmentArgs.arguments.containsKey("isMember") && getIsMember() == guildFragmentArgs.getIsMember() && this.arguments.containsKey("tabToOpen") == guildFragmentArgs.arguments.containsKey("tabToOpen") && getTabToOpen() == guildFragmentArgs.getTabToOpen()) {
            return true;
        }
        return false;
    }

    public String getGroupID() {
        return (String) this.arguments.get("groupID");
    }

    public boolean getIsMember() {
        return ((Boolean) this.arguments.get("isMember")).booleanValue();
    }

    public int getTabToOpen() {
        return ((Integer) this.arguments.get("tabToOpen")).intValue();
    }

    public int hashCode() {
        int i10;
        if (getGroupID() != null) {
            i10 = getGroupID().hashCode();
        } else {
            i10 = 0;
        }
        return ((((i10 + 31) * 31) + (getIsMember() ? 1 : 0)) * 31) + getTabToOpen();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("groupID")) {
            bundle.putString("groupID", (String) this.arguments.get("groupID"));
        }
        if (this.arguments.containsKey("isMember")) {
            bundle.putBoolean("isMember", ((Boolean) this.arguments.get("isMember")).booleanValue());
        } else {
            bundle.putBoolean("isMember", false);
        }
        if (this.arguments.containsKey("tabToOpen")) {
            bundle.putInt("tabToOpen", ((Integer) this.arguments.get("tabToOpen")).intValue());
        } else {
            bundle.putInt("tabToOpen", 0);
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey("groupID")) {
            n0Var.j("groupID", (String) this.arguments.get("groupID"));
        }
        if (this.arguments.containsKey("isMember")) {
            n0Var.j("isMember", Boolean.valueOf(((Boolean) this.arguments.get("isMember")).booleanValue()));
        } else {
            n0Var.j("isMember", Boolean.FALSE);
        }
        if (this.arguments.containsKey("tabToOpen")) {
            n0Var.j("tabToOpen", Integer.valueOf(((Integer) this.arguments.get("tabToOpen")).intValue()));
        } else {
            n0Var.j("tabToOpen", 0);
        }
        return n0Var;
    }

    public String toString() {
        return "GuildFragmentArgs{groupID=" + getGroupID() + ", isMember=" + getIsMember() + ", tabToOpen=" + getTabToOpen() + "}";
    }

    private GuildFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(GuildFragmentArgs guildFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(guildFragmentArgs.arguments);
        }

        public GuildFragmentArgs build() {
            return new GuildFragmentArgs(this.arguments);
        }

        public String getGroupID() {
            return (String) this.arguments.get("groupID");
        }

        public boolean getIsMember() {
            return ((Boolean) this.arguments.get("isMember")).booleanValue();
        }

        public int getTabToOpen() {
            return ((Integer) this.arguments.get("tabToOpen")).intValue();
        }

        public Builder setGroupID(String str) {
            if (str != null) {
                this.arguments.put("groupID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"groupID\" is marked as non-null but was passed a null value.");
        }

        public Builder setIsMember(boolean z10) {
            this.arguments.put("isMember", Boolean.valueOf(z10));
            return this;
        }

        public Builder setTabToOpen(int i10) {
            this.arguments.put("tabToOpen", Integer.valueOf(i10));
            return this;
        }

        public Builder(String str) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put("groupID", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"groupID\" is marked as non-null but was passed a null value.");
        }
    }

    private GuildFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
