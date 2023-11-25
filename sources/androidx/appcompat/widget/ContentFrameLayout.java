package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f1289f;

    /* renamed from: m  reason: collision with root package name */
    private TypedValue f1290m;

    /* renamed from: p  reason: collision with root package name */
    private TypedValue f1291p;

    /* renamed from: q  reason: collision with root package name */
    private TypedValue f1292q;

    /* renamed from: r  reason: collision with root package name */
    private TypedValue f1293r;

    /* renamed from: s  reason: collision with root package name */
    private TypedValue f1294s;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f1295t;

    /* renamed from: u  reason: collision with root package name */
    private a f1296u;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f1295t.set(i10, i11, i12, i13);
        if (androidx.core.view.p0.Y(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1293r == null) {
            this.f1293r = new TypedValue();
        }
        return this.f1293r;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1294s == null) {
            this.f1294s = new TypedValue();
        }
        return this.f1294s;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1291p == null) {
            this.f1291p = new TypedValue();
        }
        return this.f1291p;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1292q == null) {
            this.f1292q = new TypedValue();
        }
        return this.f1292q;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1289f == null) {
            this.f1289f = new TypedValue();
        }
        return this.f1289f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1290m == null) {
            this.f1290m = new TypedValue();
        }
        return this.f1290m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1296u;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1296u;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1296u = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1295t = new Rect();
    }
}
