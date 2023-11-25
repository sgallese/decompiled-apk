package ma;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.List;

/* compiled from: Particle.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    protected Bitmap f19811a;

    /* renamed from: b  reason: collision with root package name */
    public float f19812b;

    /* renamed from: c  reason: collision with root package name */
    public float f19813c;

    /* renamed from: d  reason: collision with root package name */
    public float f19814d;

    /* renamed from: e  reason: collision with root package name */
    public int f19815e;

    /* renamed from: f  reason: collision with root package name */
    public float f19816f;

    /* renamed from: g  reason: collision with root package name */
    public float f19817g;

    /* renamed from: h  reason: collision with root package name */
    public float f19818h;

    /* renamed from: i  reason: collision with root package name */
    public float f19819i;

    /* renamed from: j  reason: collision with root package name */
    public float f19820j;

    /* renamed from: k  reason: collision with root package name */
    public float f19821k;

    /* renamed from: l  reason: collision with root package name */
    private Matrix f19822l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f19823m;

    /* renamed from: n  reason: collision with root package name */
    private float f19824n;

    /* renamed from: o  reason: collision with root package name */
    private float f19825o;

    /* renamed from: p  reason: collision with root package name */
    private float f19826p;

    /* renamed from: q  reason: collision with root package name */
    private long f19827q;

    /* renamed from: r  reason: collision with root package name */
    protected long f19828r;

    /* renamed from: s  reason: collision with root package name */
    private int f19829s;

    /* renamed from: t  reason: collision with root package name */
    private int f19830t;

    /* renamed from: u  reason: collision with root package name */
    private List<oa.b> f19831u;

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        this.f19814d = 1.0f;
        this.f19815e = 255;
        this.f19816f = 0.0f;
        this.f19817g = 0.0f;
        this.f19818h = 0.0f;
        this.f19819i = 0.0f;
        this.f19822l = new Matrix();
        this.f19823m = new Paint();
    }

    public b a(long j10, List<oa.b> list) {
        this.f19828r = j10;
        this.f19831u = list;
        return this;
    }

    public void b(long j10, float f10, float f11) {
        this.f19829s = this.f19811a.getWidth() / 2;
        int height = this.f19811a.getHeight() / 2;
        this.f19830t = height;
        float f12 = f10 - this.f19829s;
        this.f19824n = f12;
        float f13 = f11 - height;
        this.f19825o = f13;
        this.f19812b = f12;
        this.f19813c = f13;
        this.f19827q = j10;
    }

    public void c(Canvas canvas) {
        this.f19822l.reset();
        this.f19822l.postRotate(this.f19826p, this.f19829s, this.f19830t);
        Matrix matrix = this.f19822l;
        float f10 = this.f19814d;
        matrix.postScale(f10, f10, this.f19829s, this.f19830t);
        this.f19822l.postTranslate(this.f19812b, this.f19813c);
        this.f19823m.setAlpha(this.f19815e);
        canvas.drawBitmap(this.f19811a, this.f19822l, this.f19823m);
    }

    public void d() {
        this.f19814d = 1.0f;
        this.f19815e = 255;
    }

    public boolean e(long j10) {
        long j11 = j10 - this.f19828r;
        if (j11 > this.f19827q) {
            return false;
        }
        float f10 = (float) j11;
        this.f19812b = this.f19824n + (this.f19818h * f10) + (this.f19820j * f10 * f10);
        this.f19813c = this.f19825o + (this.f19819i * f10) + (this.f19821k * f10 * f10);
        this.f19826p = this.f19816f + ((this.f19817g * f10) / 1000.0f);
        for (int i10 = 0; i10 < this.f19831u.size(); i10++) {
            this.f19831u.get(i10).a(this, j11);
        }
        return true;
    }

    public b(Bitmap bitmap) {
        this();
        this.f19811a = bitmap;
    }
}
