package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class OptionalLong {
    private static final OptionalLong EMPTY = new OptionalLong();
    private final boolean isPresent;
    private final long value;

    private OptionalLong() {
        this.isPresent = false;
        this.value = 0L;
    }

    private OptionalLong(long j10) {
        this.isPresent = true;
        this.value = j10;
    }

    public static OptionalLong empty() {
        return EMPTY;
    }

    public static OptionalLong of(long j10) {
        return new OptionalLong(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OptionalLong) {
            OptionalLong optionalLong = (OptionalLong) obj;
            boolean z10 = this.isPresent;
            if (z10 && optionalLong.isPresent) {
                if (this.value == optionalLong.value) {
                    return true;
                }
            } else if (z10 == optionalLong.isPresent) {
                return true;
            }
            return false;
        }
        return false;
    }

    public long getAsLong() {
        if (this.isPresent) {
            return this.value;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (this.isPresent) {
            return OptionalLong$$ExternalSyntheticBackport0.m(this.value);
        }
        return 0;
    }

    public boolean isPresent() {
        return this.isPresent;
    }

    public String toString() {
        return this.isPresent ? String.format("OptionalLong[%s]", Long.valueOf(this.value)) : "OptionalLong.empty";
    }
}
