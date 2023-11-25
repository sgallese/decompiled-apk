package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import com.habitrpg.android.habitica.models.user.Stats;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ClassSelectionActivityArgs implements k3.f {
    private final HashMap arguments;

    public static ClassSelectionActivityArgs fromBundle(Bundle bundle) {
        ClassSelectionActivityArgs classSelectionActivityArgs = new ClassSelectionActivityArgs();
        bundle.setClassLoader(ClassSelectionActivityArgs.class.getClassLoader());
        if (bundle.containsKey("isClassSelected")) {
            classSelectionActivityArgs.arguments.put("isClassSelected", Boolean.valueOf(bundle.getBoolean("isClassSelected")));
        } else {
            classSelectionActivityArgs.arguments.put("isClassSelected", Boolean.FALSE);
        }
        if (bundle.containsKey("className")) {
            String string = bundle.getString("className");
            if (string != null) {
                classSelectionActivityArgs.arguments.put("className", string);
            } else {
                throw new IllegalArgumentException("Argument \"className\" is marked as non-null but was passed a null value.");
            }
        } else {
            classSelectionActivityArgs.arguments.put("className", Stats.WARRIOR);
        }
        return classSelectionActivityArgs;
    }

    public static ClassSelectionActivityArgs fromSavedStateHandle(androidx.lifecycle.n0 n0Var) {
        ClassSelectionActivityArgs classSelectionActivityArgs = new ClassSelectionActivityArgs();
        if (n0Var.e("isClassSelected")) {
            classSelectionActivityArgs.arguments.put("isClassSelected", Boolean.valueOf(((Boolean) n0Var.f("isClassSelected")).booleanValue()));
        } else {
            classSelectionActivityArgs.arguments.put("isClassSelected", Boolean.FALSE);
        }
        if (n0Var.e("className")) {
            String str = (String) n0Var.f("className");
            if (str != null) {
                classSelectionActivityArgs.arguments.put("className", str);
            } else {
                throw new IllegalArgumentException("Argument \"className\" is marked as non-null but was passed a null value.");
            }
        } else {
            classSelectionActivityArgs.arguments.put("className", Stats.WARRIOR);
        }
        return classSelectionActivityArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassSelectionActivityArgs classSelectionActivityArgs = (ClassSelectionActivityArgs) obj;
        if (this.arguments.containsKey("isClassSelected") != classSelectionActivityArgs.arguments.containsKey("isClassSelected") || getIsClassSelected() != classSelectionActivityArgs.getIsClassSelected() || this.arguments.containsKey("className") != classSelectionActivityArgs.arguments.containsKey("className")) {
            return false;
        }
        if (getClassName() == null ? classSelectionActivityArgs.getClassName() == null : getClassName().equals(classSelectionActivityArgs.getClassName())) {
            return true;
        }
        return false;
    }

    public String getClassName() {
        return (String) this.arguments.get("className");
    }

    public boolean getIsClassSelected() {
        return ((Boolean) this.arguments.get("isClassSelected")).booleanValue();
    }

    public int hashCode() {
        int i10;
        int i11 = ((getIsClassSelected() ? 1 : 0) + 31) * 31;
        if (getClassName() != null) {
            i10 = getClassName().hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("isClassSelected")) {
            bundle.putBoolean("isClassSelected", ((Boolean) this.arguments.get("isClassSelected")).booleanValue());
        } else {
            bundle.putBoolean("isClassSelected", false);
        }
        if (this.arguments.containsKey("className")) {
            bundle.putString("className", (String) this.arguments.get("className"));
        } else {
            bundle.putString("className", Stats.WARRIOR);
        }
        return bundle;
    }

    public androidx.lifecycle.n0 toSavedStateHandle() {
        androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0();
        if (this.arguments.containsKey("isClassSelected")) {
            n0Var.j("isClassSelected", Boolean.valueOf(((Boolean) this.arguments.get("isClassSelected")).booleanValue()));
        } else {
            n0Var.j("isClassSelected", Boolean.FALSE);
        }
        if (this.arguments.containsKey("className")) {
            n0Var.j("className", (String) this.arguments.get("className"));
        } else {
            n0Var.j("className", Stats.WARRIOR);
        }
        return n0Var;
    }

    public String toString() {
        return "ClassSelectionActivityArgs{isClassSelected=" + getIsClassSelected() + ", className=" + getClassName() + "}";
    }

    private ClassSelectionActivityArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(ClassSelectionActivityArgs classSelectionActivityArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(classSelectionActivityArgs.arguments);
        }

        public ClassSelectionActivityArgs build() {
            return new ClassSelectionActivityArgs(this.arguments);
        }

        public String getClassName() {
            return (String) this.arguments.get("className");
        }

        public boolean getIsClassSelected() {
            return ((Boolean) this.arguments.get("isClassSelected")).booleanValue();
        }

        public Builder setClassName(String str) {
            if (str != null) {
                this.arguments.put("className", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"className\" is marked as non-null but was passed a null value.");
        }

        public Builder setIsClassSelected(boolean z10) {
            this.arguments.put("isClassSelected", Boolean.valueOf(z10));
            return this;
        }

        public Builder() {
            this.arguments = new HashMap();
        }
    }

    private ClassSelectionActivityArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
