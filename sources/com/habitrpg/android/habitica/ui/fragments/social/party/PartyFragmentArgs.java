package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class PartyFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static PartyFragmentArgs fromBundle(Bundle bundle) {
        PartyFragmentArgs partyFragmentArgs = new PartyFragmentArgs();
        bundle.setClassLoader(PartyFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("tabToOpen")) {
            partyFragmentArgs.arguments.put("tabToOpen", Integer.valueOf(bundle.getInt("tabToOpen")));
        } else {
            partyFragmentArgs.arguments.put("tabToOpen", 0);
        }
        if (bundle.containsKey("partyID")) {
            partyFragmentArgs.arguments.put("partyID", bundle.getString("partyID"));
        } else {
            partyFragmentArgs.arguments.put("partyID", " ");
        }
        return partyFragmentArgs;
    }

    public static PartyFragmentArgs fromSavedStateHandle(n0 n0Var) {
        PartyFragmentArgs partyFragmentArgs = new PartyFragmentArgs();
        if (n0Var.e("tabToOpen")) {
            partyFragmentArgs.arguments.put("tabToOpen", Integer.valueOf(((Integer) n0Var.f("tabToOpen")).intValue()));
        } else {
            partyFragmentArgs.arguments.put("tabToOpen", 0);
        }
        if (n0Var.e("partyID")) {
            partyFragmentArgs.arguments.put("partyID", (String) n0Var.f("partyID"));
        } else {
            partyFragmentArgs.arguments.put("partyID", " ");
        }
        return partyFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartyFragmentArgs partyFragmentArgs = (PartyFragmentArgs) obj;
        if (this.arguments.containsKey("tabToOpen") != partyFragmentArgs.arguments.containsKey("tabToOpen") || getTabToOpen() != partyFragmentArgs.getTabToOpen() || this.arguments.containsKey("partyID") != partyFragmentArgs.arguments.containsKey("partyID")) {
            return false;
        }
        if (getPartyID() == null ? partyFragmentArgs.getPartyID() == null : getPartyID().equals(partyFragmentArgs.getPartyID())) {
            return true;
        }
        return false;
    }

    public String getPartyID() {
        return (String) this.arguments.get("partyID");
    }

    public int getTabToOpen() {
        return ((Integer) this.arguments.get("tabToOpen")).intValue();
    }

    public int hashCode() {
        int i10;
        int tabToOpen = (getTabToOpen() + 31) * 31;
        if (getPartyID() != null) {
            i10 = getPartyID().hashCode();
        } else {
            i10 = 0;
        }
        return tabToOpen + i10;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("tabToOpen")) {
            bundle.putInt("tabToOpen", ((Integer) this.arguments.get("tabToOpen")).intValue());
        } else {
            bundle.putInt("tabToOpen", 0);
        }
        if (this.arguments.containsKey("partyID")) {
            bundle.putString("partyID", (String) this.arguments.get("partyID"));
        } else {
            bundle.putString("partyID", " ");
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey("tabToOpen")) {
            n0Var.j("tabToOpen", Integer.valueOf(((Integer) this.arguments.get("tabToOpen")).intValue()));
        } else {
            n0Var.j("tabToOpen", 0);
        }
        if (this.arguments.containsKey("partyID")) {
            n0Var.j("partyID", (String) this.arguments.get("partyID"));
        } else {
            n0Var.j("partyID", " ");
        }
        return n0Var;
    }

    public String toString() {
        return "PartyFragmentArgs{tabToOpen=" + getTabToOpen() + ", partyID=" + getPartyID() + "}";
    }

    private PartyFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(PartyFragmentArgs partyFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(partyFragmentArgs.arguments);
        }

        public PartyFragmentArgs build() {
            return new PartyFragmentArgs(this.arguments);
        }

        public String getPartyID() {
            return (String) this.arguments.get("partyID");
        }

        public int getTabToOpen() {
            return ((Integer) this.arguments.get("tabToOpen")).intValue();
        }

        public Builder setPartyID(String str) {
            this.arguments.put("partyID", str);
            return this;
        }

        public Builder setTabToOpen(int i10) {
            this.arguments.put("tabToOpen", Integer.valueOf(i10));
            return this;
        }

        public Builder() {
            this.arguments = new HashMap();
        }
    }

    private PartyFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
