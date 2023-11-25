package o7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f20565i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f20566j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f20567k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f20568l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f20569a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f20570b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f20571c;

    /* renamed from: d  reason: collision with root package name */
    private int f20572d;

    /* renamed from: e  reason: collision with root package name */
    private int f20573e;

    /* renamed from: f  reason: collision with root package name */
    private int f20574f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f20575g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f20576h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10;
        if (f11 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = this.f20575g;
        if (z10) {
            int[] iArr = f20567k;
            iArr[0] = 0;
            iArr[1] = this.f20574f;
            iArr[2] = this.f20573e;
            iArr[3] = this.f20572d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f20567k;
            iArr2[0] = 0;
            iArr2[1] = this.f20572d;
            iArr2[2] = this.f20573e;
            iArr2[3] = this.f20574f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float[] fArr = f20568l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f20570b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f20567k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f20576h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f20570b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f20565i;
        iArr[0] = this.f20574f;
        iArr[1] = this.f20573e;
        iArr[2] = this.f20572d;
        Paint paint = this.f20571c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f20566j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f20571c);
        canvas.restore();
    }

    public Paint c() {
        return this.f20569a;
    }

    public void d(int i10) {
        this.f20572d = androidx.core.graphics.a.k(i10, 68);
        this.f20573e = androidx.core.graphics.a.k(i10, 20);
        this.f20574f = androidx.core.graphics.a.k(i10, 0);
        this.f20569a.setColor(this.f20572d);
    }

    public a(int i10) {
        this.f20575g = new Path();
        Paint paint = new Paint();
        this.f20576h = paint;
        this.f20569a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f20570b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f20571c = new Paint(paint2);
    }
}
