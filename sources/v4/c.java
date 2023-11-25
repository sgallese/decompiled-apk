package v4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import c5.h;
import java.util.ArrayList;
import java.util.List;
import qc.q;
import vc.l;

/* compiled from: MovieDrawable.kt */
/* loaded from: classes.dex */
public final class c extends Drawable implements Animatable {
    public static final a J = new a(null);
    private boolean A;
    private long B;
    private long C;
    private int E;
    private e5.a F;
    private Picture G;
    private boolean I;

    /* renamed from: f  reason: collision with root package name */
    private final Movie f24574f;

    /* renamed from: m  reason: collision with root package name */
    private final Bitmap.Config f24575m;

    /* renamed from: p  reason: collision with root package name */
    private final h f24576p;

    /* renamed from: u  reason: collision with root package name */
    private Canvas f24581u;

    /* renamed from: v  reason: collision with root package name */
    private Bitmap f24582v;

    /* renamed from: y  reason: collision with root package name */
    private float f24585y;

    /* renamed from: z  reason: collision with root package name */
    private float f24586z;

    /* renamed from: q  reason: collision with root package name */
    private final Paint f24577q = new Paint(3);

    /* renamed from: r  reason: collision with root package name */
    private final List<androidx.vectordrawable.graphics.drawable.b> f24578r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private final Rect f24579s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    private final Rect f24580t = new Rect();

    /* renamed from: w  reason: collision with root package name */
    private float f24583w = 1.0f;

    /* renamed from: x  reason: collision with root package name */
    private float f24584x = 1.0f;
    private int D = -1;
    private e5.b H = e5.b.UNCHANGED;

    /* compiled from: MovieDrawable.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public c(Movie movie, Bitmap.Config config, h hVar) {
        this.f24574f = movie;
        this.f24575m = config;
        this.f24576p = hVar;
        if ((!g5.h.g(config)) != false) {
            return;
        }
        throw new IllegalArgumentException("Bitmap config must not be hardware.".toString());
    }

    private final void a(Canvas canvas) {
        Canvas canvas2 = this.f24581u;
        Bitmap bitmap = this.f24582v;
        if (canvas2 != null && bitmap != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            int save = canvas2.save();
            try {
                float f10 = this.f24583w;
                canvas2.scale(f10, f10);
                this.f24574f.draw(canvas2, 0.0f, 0.0f, this.f24577q);
                Picture picture = this.G;
                if (picture != null) {
                    picture.draw(canvas2);
                }
                canvas2.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.translate(this.f24585y, this.f24586z);
                    float f11 = this.f24584x;
                    canvas.scale(f11, f11);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f24577q);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } catch (Throwable th) {
                canvas2.restoreToCount(save);
                throw th;
            }
        }
    }

    private final Rect b(Canvas canvas) {
        Rect rect = this.f24580t;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    private final void f(Rect rect) {
        if (q.d(this.f24579s, rect)) {
            return;
        }
        this.f24579s.set(rect);
        int width = rect.width();
        int height = rect.height();
        int width2 = this.f24574f.width();
        int height2 = this.f24574f.height();
        if (width2 > 0 && height2 > 0) {
            double c10 = t4.h.c(width2, height2, width, height, this.f24576p);
            if (!this.I) {
                c10 = l.f(c10, 1.0d);
            }
            float f10 = (float) c10;
            this.f24583w = f10;
            int i10 = (int) (width2 * f10);
            int i11 = (int) (f10 * height2);
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, this.f24575m);
            q.h(createBitmap, "createBitmap(width, height, config)");
            Bitmap bitmap = this.f24582v;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f24582v = createBitmap;
            this.f24581u = new Canvas(createBitmap);
            if (this.I) {
                this.f24584x = 1.0f;
                this.f24585y = 0.0f;
                this.f24586z = 0.0f;
                return;
            }
            float c11 = (float) t4.h.c(i10, i11, width, height, this.f24576p);
            this.f24584x = c11;
            float f11 = width - (i10 * c11);
            float f12 = 2;
            this.f24585y = rect.left + (f11 / f12);
            this.f24586z = rect.top + ((height - (c11 * i11)) / f12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean g() {
        boolean z10;
        int duration = this.f24574f.duration();
        int i10 = 0;
        if (duration == 0) {
            z10 = 0;
        } else {
            if (this.A) {
                this.C = SystemClock.uptimeMillis();
            }
            int i11 = (int) (this.C - this.B);
            int i12 = i11 / duration;
            this.E = i12;
            int i13 = this.D;
            if (i13 == -1 || i12 <= i13) {
                i10 = 1;
            }
            if (i10 != 0) {
                duration = i11 - (i12 * duration);
            }
            int i14 = i10;
            i10 = duration;
            z10 = i14;
        }
        this.f24574f.setTime(i10);
        return z10;
    }

    public void c(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f24578r.add(bVar);
    }

    public final void d(e5.a aVar) {
        this.F = aVar;
        if (aVar != null && this.f24574f.width() > 0 && this.f24574f.height() > 0) {
            Picture picture = new Picture();
            this.H = aVar.a(picture.beginRecording(this.f24574f.width(), this.f24574f.height()));
            picture.endRecording();
            this.G = picture;
            this.I = true;
        } else {
            this.G = null;
            this.H = e5.b.UNCHANGED;
            this.I = false;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean g10 = g();
        if (this.I) {
            f(b(canvas));
            int save = canvas.save();
            try {
                float f10 = 1 / this.f24583w;
                canvas.scale(f10, f10);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            f(getBounds());
            a(canvas);
        }
        if (this.A && g10) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    public final void e(int i10) {
        boolean z10;
        if (i10 >= -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.D = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f24574f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24574f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        e5.b bVar;
        if (this.f24577q.getAlpha() == 255 && ((bVar = this.H) == e5.b.OPAQUE || (bVar == e5.b.UNCHANGED && this.f24574f.isOpaque()))) {
            return -1;
        }
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 256) {
            z10 = true;
        }
        if (z10) {
            this.f24577q.setAlpha(i10);
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24577q.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.E = 0;
        this.B = SystemClock.uptimeMillis();
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f24578r;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).c(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (!this.A) {
            return;
        }
        this.A = false;
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f24578r;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(this);
        }
    }
}
