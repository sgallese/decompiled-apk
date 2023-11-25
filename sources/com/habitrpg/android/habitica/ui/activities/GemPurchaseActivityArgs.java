package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class GemPurchaseActivityArgs implements k3.f {
    private final HashMap arguments;

    public static GemPurchaseActivityArgs fromBundle(Bundle bundle) {
        GemPurchaseActivityArgs gemPurchaseActivityArgs = new GemPurchaseActivityArgs();
        bundle.setClassLoader(GemPurchaseActivityArgs.class.getClassLoader());
        if (bundle.containsKey("openSubscription")) {
            gemPurchaseActivityArgs.arguments.put("openSubscription", Boolean.valueOf(bundle.getBoolean("openSubscription")));
        } else {
            gemPurchaseActivityArgs.arguments.put("openSubscription", Boolean.FALSE);
        }
        return gemPurchaseActivityArgs;
    }

    public static GemPurchaseActivityArgs fromSavedStateHandle(androidx.lifecycle.n0 n0Var) {
        GemPurchaseActivityArgs gemPurchaseActivityArgs = new GemPurchaseActivityArgs();
        if (n0Var.e("openSubscription")) {
            gemPurchaseActivityArgs.arguments.put("openSubscription", Boolean.valueOf(((Boolean) n0Var.f("openSubscription")).booleanValue()));
        } else {
            gemPurchaseActivityArgs.arguments.put("openSubscription", Boolean.FALSE);
        }
        return gemPurchaseActivityArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GemPurchaseActivityArgs gemPurchaseActivityArgs = (GemPurchaseActivityArgs) obj;
        if (this.arguments.containsKey("openSubscription") == gemPurchaseActivityArgs.arguments.containsKey("openSubscription") && getOpenSubscription() == gemPurchaseActivityArgs.getOpenSubscription()) {
            return true;
        }
        return false;
    }

    public boolean getOpenSubscription() {
        return ((Boolean) this.arguments.get("openSubscription")).booleanValue();
    }

    public int hashCode() {
        return 31 + (getOpenSubscription() ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("openSubscription")) {
            bundle.putBoolean("openSubscription", ((Boolean) this.arguments.get("openSubscription")).booleanValue());
        } else {
            bundle.putBoolean("openSubscription", false);
        }
        return bundle;
    }

    public androidx.lifecycle.n0 toSavedStateHandle() {
        androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0();
        if (this.arguments.containsKey("openSubscription")) {
            n0Var.j("openSubscription", Boolean.valueOf(((Boolean) this.arguments.get("openSubscription")).booleanValue()));
        } else {
            n0Var.j("openSubscription", Boolean.FALSE);
        }
        return n0Var;
    }

    public String toString() {
        return "GemPurchaseActivityArgs{openSubscription=" + getOpenSubscription() + "}";
    }

    private GemPurchaseActivityArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(GemPurchaseActivityArgs gemPurchaseActivityArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(gemPurchaseActivityArgs.arguments);
        }

        public GemPurchaseActivityArgs build() {
            return new GemPurchaseActivityArgs(this.arguments);
        }

        public boolean getOpenSubscription() {
            return ((Boolean) this.arguments.get("openSubscription")).booleanValue();
        }

        public Builder setOpenSubscription(boolean z10) {
            this.arguments.put("openSubscription", Boolean.valueOf(z10));
            return this;
        }

        public Builder() {
            this.arguments = new HashMap();
        }
    }

    private GemPurchaseActivityArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
