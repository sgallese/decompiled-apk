package com.habitrpg.common.habitica.extensions;

import qc.q;

/* compiled from: Optional.kt */
/* loaded from: classes4.dex */
public final class Optional<T> {
    private final boolean isEmpty;
    private final T value;

    public Optional(T t10) {
        boolean z10;
        this.value = t10;
        if (t10 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isEmpty = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Optional copy$default(Optional optional, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = optional.value;
        }
        return optional.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    public final Optional<T> copy(T t10) {
        return new Optional<>(t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Optional) && q.d(this.value, ((Optional) obj).value)) {
            return true;
        }
        return false;
    }

    public final T getAssertedValue() {
        T t10 = this.value;
        q.f(t10);
        return t10;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t10 = this.value;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        return "Optional(value=" + this.value + ")";
    }
}
