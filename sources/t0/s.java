package t0;

/* compiled from: SnapshotStateList.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f23359a = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(int i10, int i11) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
    }
}
