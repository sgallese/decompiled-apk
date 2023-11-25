package w0;

import android.view.ViewStructure;

/* compiled from: AndroidAutofill.android.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f25262a = new n();

    private n() {
    }

    public final int a(ViewStructure viewStructure, int i10) {
        int addChildCount;
        qc.q.i(viewStructure, "structure");
        addChildCount = viewStructure.addChildCount(i10);
        return addChildCount;
    }

    public final ViewStructure b(ViewStructure viewStructure, int i10) {
        ViewStructure newChild;
        qc.q.i(viewStructure, "structure");
        newChild = viewStructure.newChild(i10);
        return newChild;
    }

    public final void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        qc.q.i(viewStructure, "structure");
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    public final void d(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
        qc.q.i(viewStructure, "structure");
        viewStructure.setId(i10, str, str2, str3);
    }
}
