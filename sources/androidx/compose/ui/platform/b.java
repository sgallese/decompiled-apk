package androidx.compose.ui.platform;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public abstract class b implements g {

    /* renamed from: a  reason: collision with root package name */
    protected String f2612a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f2613b = new int[2];

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] c(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 != i11) {
            int[] iArr = this.f2613b;
            iArr[0] = i10;
            iArr[1] = i11;
            return iArr;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d() {
        String str = this.f2612a;
        if (str != null) {
            return str;
        }
        qc.q.z("text");
        return null;
    }

    public void e(String str) {
        qc.q.i(str, "text");
        f(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str) {
        qc.q.i(str, "<set-?>");
        this.f2612a = str;
    }
}
