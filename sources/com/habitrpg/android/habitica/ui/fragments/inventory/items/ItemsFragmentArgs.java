package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.HashMap;
import k3.f;

/* loaded from: classes4.dex */
public class ItemsFragmentArgs implements f {
    private final HashMap arguments;

    public static ItemsFragmentArgs fromBundle(Bundle bundle) {
        ItemsFragmentArgs itemsFragmentArgs = new ItemsFragmentArgs();
        bundle.setClassLoader(ItemsFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("itemType")) {
            itemsFragmentArgs.arguments.put("itemType", bundle.getString("itemType"));
        } else {
            itemsFragmentArgs.arguments.put("itemType", "eggs");
        }
        return itemsFragmentArgs;
    }

    public static ItemsFragmentArgs fromSavedStateHandle(n0 n0Var) {
        ItemsFragmentArgs itemsFragmentArgs = new ItemsFragmentArgs();
        if (n0Var.e("itemType")) {
            itemsFragmentArgs.arguments.put("itemType", (String) n0Var.f("itemType"));
        } else {
            itemsFragmentArgs.arguments.put("itemType", "eggs");
        }
        return itemsFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemsFragmentArgs itemsFragmentArgs = (ItemsFragmentArgs) obj;
        if (this.arguments.containsKey("itemType") != itemsFragmentArgs.arguments.containsKey("itemType")) {
            return false;
        }
        if (getItemType() == null ? itemsFragmentArgs.getItemType() == null : getItemType().equals(itemsFragmentArgs.getItemType())) {
            return true;
        }
        return false;
    }

    public String getItemType() {
        return (String) this.arguments.get("itemType");
    }

    public int hashCode() {
        int i10;
        if (getItemType() != null) {
            i10 = getItemType().hashCode();
        } else {
            i10 = 0;
        }
        return 31 + i10;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("itemType")) {
            bundle.putString("itemType", (String) this.arguments.get("itemType"));
        } else {
            bundle.putString("itemType", "eggs");
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey("itemType")) {
            n0Var.j("itemType", (String) this.arguments.get("itemType"));
        } else {
            n0Var.j("itemType", "eggs");
        }
        return n0Var;
    }

    public String toString() {
        return "ItemsFragmentArgs{itemType=" + getItemType() + "}";
    }

    private ItemsFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(ItemsFragmentArgs itemsFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(itemsFragmentArgs.arguments);
        }

        public ItemsFragmentArgs build() {
            return new ItemsFragmentArgs(this.arguments);
        }

        public String getItemType() {
            return (String) this.arguments.get("itemType");
        }

        public Builder setItemType(String str) {
            this.arguments.put("itemType", str);
            return this;
        }

        public Builder() {
            this.arguments = new HashMap();
        }
    }

    private ItemsFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
