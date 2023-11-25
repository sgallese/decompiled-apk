package fb;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: ObjectsPool.java */
/* loaded from: classes4.dex */
abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Rect f15574a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private static final RectF f15575b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f15576c = new Paint(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Paint a() {
        return f15576c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect b() {
        return f15574a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF c() {
        return f15575b;
    }
}
