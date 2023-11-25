package y1;

import android.graphics.Paint;
import android.text.Layout;
import qc.q;
import w1.o1;

/* compiled from: IndentationFixSpan.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: IndentationFixSpan.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26176a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26176a = iArr;
        }
    }

    public static final float a(Layout layout, int i10, Paint paint) {
        int i11;
        float abs;
        float width;
        q.i(layout, "<this>");
        q.i(paint, "paint");
        float lineLeft = layout.getLineLeft(i10);
        if (!o1.l(layout, i10) || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment == null) {
            i11 = -1;
        } else {
            i11 = a.f26176a[paragraphAlignment.ordinal()];
        }
        if (i11 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
            q.h(paint, "this.paint");
        }
        return a(layout, i10, paint);
    }

    public static final float c(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        q.i(layout, "<this>");
        q.i(paint, "paint");
        if (o1.l(layout, i10)) {
            int i11 = -1;
            if (layout.getParagraphDirection(i10) == -1 && layout.getWidth() < layout.getLineRight(i10)) {
                float lineRight = (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10))) + paint.measureText("…");
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
                if (paragraphAlignment != null) {
                    i11 = a.f26176a[paragraphAlignment.ordinal()];
                }
                if (i11 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i10);
                    width2 = (layout.getWidth() - lineRight) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i10);
                    width2 = layout.getWidth() - lineRight;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static /* synthetic */ float d(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
            q.h(paint, "this.paint");
        }
        return c(layout, i10, paint);
    }
}
