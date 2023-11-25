package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ArmoireActivityArgs implements k3.f {
    private final HashMap arguments;

    public static ArmoireActivityArgs fromBundle(Bundle bundle) {
        ArmoireActivityArgs armoireActivityArgs = new ArmoireActivityArgs();
        bundle.setClassLoader(ArmoireActivityArgs.class.getClassLoader());
        if (bundle.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            String string = bundle.getString(TaskFormActivity.TASK_TYPE_KEY);
            if (string != null) {
                armoireActivityArgs.arguments.put(TaskFormActivity.TASK_TYPE_KEY, string);
                if (bundle.containsKey("text")) {
                    String string2 = bundle.getString("text");
                    if (string2 != null) {
                        armoireActivityArgs.arguments.put("text", string2);
                        if (bundle.containsKey("key")) {
                            String string3 = bundle.getString("key");
                            if (string3 != null) {
                                armoireActivityArgs.arguments.put("key", string3);
                                if (bundle.containsKey(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                                    String string4 = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                    if (string4 != null) {
                                        armoireActivityArgs.arguments.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, string4);
                                        return armoireActivityArgs;
                                    }
                                    throw new IllegalArgumentException("Argument \"value\" is marked as non-null but was passed a null value.");
                                }
                                throw new IllegalArgumentException("Required argument \"value\" is missing and does not have an android:defaultValue");
                            }
                            throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"text\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public static ArmoireActivityArgs fromSavedStateHandle(androidx.lifecycle.n0 n0Var) {
        ArmoireActivityArgs armoireActivityArgs = new ArmoireActivityArgs();
        if (n0Var.e(TaskFormActivity.TASK_TYPE_KEY)) {
            String str = (String) n0Var.f(TaskFormActivity.TASK_TYPE_KEY);
            if (str != null) {
                armoireActivityArgs.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                if (n0Var.e("text")) {
                    String str2 = (String) n0Var.f("text");
                    if (str2 != null) {
                        armoireActivityArgs.arguments.put("text", str2);
                        if (n0Var.e("key")) {
                            String str3 = (String) n0Var.f("key");
                            if (str3 != null) {
                                armoireActivityArgs.arguments.put("key", str3);
                                if (n0Var.e(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                                    String str4 = (String) n0Var.f(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                    if (str4 != null) {
                                        armoireActivityArgs.arguments.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str4);
                                        return armoireActivityArgs;
                                    }
                                    throw new IllegalArgumentException("Argument \"value\" is marked as non-null but was passed a null value.");
                                }
                                throw new IllegalArgumentException("Required argument \"value\" is missing and does not have an android:defaultValue");
                            }
                            throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"text\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArmoireActivityArgs armoireActivityArgs = (ArmoireActivityArgs) obj;
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY) != armoireActivityArgs.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            return false;
        }
        if (getType() == null ? armoireActivityArgs.getType() != null : !getType().equals(armoireActivityArgs.getType())) {
            return false;
        }
        if (this.arguments.containsKey("text") != armoireActivityArgs.arguments.containsKey("text")) {
            return false;
        }
        if (getText() == null ? armoireActivityArgs.getText() != null : !getText().equals(armoireActivityArgs.getText())) {
            return false;
        }
        if (this.arguments.containsKey("key") != armoireActivityArgs.arguments.containsKey("key")) {
            return false;
        }
        if (getKey() == null ? armoireActivityArgs.getKey() != null : !getKey().equals(armoireActivityArgs.getKey())) {
            return false;
        }
        if (this.arguments.containsKey(AppMeasurementSdk.ConditionalUserProperty.VALUE) != armoireActivityArgs.arguments.containsKey(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            return false;
        }
        if (getValue() == null ? armoireActivityArgs.getValue() == null : getValue().equals(armoireActivityArgs.getValue())) {
            return true;
        }
        return false;
    }

    public String getKey() {
        return (String) this.arguments.get("key");
    }

    public String getText() {
        return (String) this.arguments.get("text");
    }

    public String getType() {
        return (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY);
    }

    public String getValue() {
        return (String) this.arguments.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (getType() != null) {
            i10 = getType().hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i10 + 31) * 31;
        if (getText() != null) {
            i11 = getText().hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        if (getKey() != null) {
            i12 = getKey().hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        if (getValue() != null) {
            i13 = getValue().hashCode();
        }
        return i16 + i13;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            bundle.putString(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
        }
        if (this.arguments.containsKey("text")) {
            bundle.putString("text", (String) this.arguments.get("text"));
        }
        if (this.arguments.containsKey("key")) {
            bundle.putString("key", (String) this.arguments.get("key"));
        }
        if (this.arguments.containsKey(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) this.arguments.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        }
        return bundle;
    }

    public androidx.lifecycle.n0 toSavedStateHandle() {
        androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0();
        if (this.arguments.containsKey(TaskFormActivity.TASK_TYPE_KEY)) {
            n0Var.j(TaskFormActivity.TASK_TYPE_KEY, (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY));
        }
        if (this.arguments.containsKey("text")) {
            n0Var.j("text", (String) this.arguments.get("text"));
        }
        if (this.arguments.containsKey("key")) {
            n0Var.j("key", (String) this.arguments.get("key"));
        }
        if (this.arguments.containsKey(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            n0Var.j(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) this.arguments.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        }
        return n0Var;
    }

    public String toString() {
        return "ArmoireActivityArgs{type=" + getType() + ", text=" + getText() + ", key=" + getKey() + ", value=" + getValue() + "}";
    }

    private ArmoireActivityArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(ArmoireActivityArgs armoireActivityArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(armoireActivityArgs.arguments);
        }

        public ArmoireActivityArgs build() {
            return new ArmoireActivityArgs(this.arguments);
        }

        public String getKey() {
            return (String) this.arguments.get("key");
        }

        public String getText() {
            return (String) this.arguments.get("text");
        }

        public String getType() {
            return (String) this.arguments.get(TaskFormActivity.TASK_TYPE_KEY);
        }

        public String getValue() {
            return (String) this.arguments.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }

        public Builder setKey(String str) {
            if (str != null) {
                this.arguments.put("key", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
        }

        public Builder setText(String str) {
            if (str != null) {
                this.arguments.put("text", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
        }

        public Builder setType(String str) {
            if (str != null) {
                this.arguments.put(TaskFormActivity.TASK_TYPE_KEY, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        public Builder setValue(String str) {
            if (str != null) {
                this.arguments.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"value\" is marked as non-null but was passed a null value.");
        }

        public Builder(String str, String str2, String str3, String str4) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put(TaskFormActivity.TASK_TYPE_KEY, str);
                if (str2 != null) {
                    hashMap.put("text", str2);
                    if (str3 != null) {
                        hashMap.put("key", str3);
                        if (str4 != null) {
                            hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str4);
                            return;
                        }
                        throw new IllegalArgumentException("Argument \"value\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
    }

    private ArmoireActivityArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
