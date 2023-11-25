package com.habitrpg.android.habitica.ui.views.tasks.form;

import qc.q;

/* compiled from: TaskFormSelector.kt */
/* loaded from: classes4.dex */
public final class LabeledValue<V> {
    public static final int $stable = 0;
    private final String label;
    private final V value;

    public LabeledValue(String str, V v10) {
        q.i(str, "label");
        this.label = str;
        this.value = v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabeledValue copy$default(LabeledValue labeledValue, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = labeledValue.label;
        }
        if ((i10 & 2) != 0) {
            obj = labeledValue.value;
        }
        return labeledValue.copy(str, obj);
    }

    public final String component1() {
        return this.label;
    }

    public final V component2() {
        return this.value;
    }

    public final LabeledValue<V> copy(String str, V v10) {
        q.i(str, "label");
        return new LabeledValue<>(str, v10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabeledValue)) {
            return false;
        }
        LabeledValue labeledValue = (LabeledValue) obj;
        if (q.d(this.label, labeledValue.label) && q.d(this.value, labeledValue.value)) {
            return true;
        }
        return false;
    }

    public final String getLabel() {
        return this.label;
    }

    public final V getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.label.hashCode() * 31;
        V v10 = this.value;
        if (v10 == null) {
            hashCode = 0;
        } else {
            hashCode = v10.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "LabeledValue(label=" + this.label + ", value=" + this.value + ")";
    }
}
