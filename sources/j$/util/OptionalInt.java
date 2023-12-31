package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class OptionalInt {
    private static final OptionalInt EMPTY = new OptionalInt();
    private final boolean isPresent;
    private final int value;

    private OptionalInt() {
        this.isPresent = false;
        this.value = 0;
    }

    private OptionalInt(int i10) {
        this.isPresent = true;
        this.value = i10;
    }

    public static OptionalInt empty() {
        return EMPTY;
    }

    public static OptionalInt of(int i10) {
        return new OptionalInt(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OptionalInt) {
            OptionalInt optionalInt = (OptionalInt) obj;
            boolean z10 = this.isPresent;
            if (z10 && optionalInt.isPresent) {
                if (this.value == optionalInt.value) {
                    return true;
                }
            } else if (z10 == optionalInt.isPresent) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int getAsInt() {
        if (this.isPresent) {
            return this.value;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (this.isPresent) {
            return this.value;
        }
        return 0;
    }

    public boolean isPresent() {
        return this.isPresent;
    }

    public String toString() {
        return this.isPresent ? String.format("OptionalInt[%s]", Integer.valueOf(this.value)) : "OptionalInt.empty";
    }
}
