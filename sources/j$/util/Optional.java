package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class Optional<T> {
    private static final Optional EMPTY = new Optional();
    private final Object value;

    private Optional() {
        this.value = null;
    }

    private Optional(Object obj) {
        this.value = Objects.requireNonNull(obj);
    }

    public static Optional empty() {
        return EMPTY;
    }

    public static Optional of(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t10) {
        return t10 == null ? empty() : of(t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.value, ((Optional) obj).value);
        }
        return false;
    }

    public Object get() {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    public boolean isPresent() {
        return this.value != null;
    }

    public String toString() {
        Object obj = this.value;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
