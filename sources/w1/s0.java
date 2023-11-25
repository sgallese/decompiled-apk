package w1;

import android.text.Layout;

/* compiled from: TextLayout.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f25341a = new s0();

    /* renamed from: b  reason: collision with root package name */
    private static final Layout.Alignment f25342b;

    /* renamed from: c  reason: collision with root package name */
    private static final Layout.Alignment f25343c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (qc.q.d(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (qc.q.d(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f25342b = alignment;
        f25343c = alignment2;
    }

    private s0() {
    }

    public final Layout.Alignment a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        return f25343c;
                    }
                    return f25342b;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
