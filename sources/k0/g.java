package k0;

import java.util.List;

/* compiled from: MutableVector.kt */
/* loaded from: classes.dex */
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(List<?> list, int i10) {
        int size = list.size();
        if (i10 >= 0 && i10 < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 <= i11) {
            if (i10 >= 0) {
                if (i11 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than 0.");
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
    }
}
