package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import o2.e;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class h extends View {

    /* renamed from: f  reason: collision with root package name */
    private int f3389f;

    /* renamed from: m  reason: collision with root package name */
    private View f3390m;

    /* renamed from: p  reason: collision with root package name */
    private int f3391p;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f3390m == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f3390m.getLayoutParams();
        bVar2.f3248n0.D0(0);
        e.b y10 = bVar.f3248n0.y();
        e.b bVar3 = e.b.FIXED;
        if (y10 != bVar3) {
            bVar.f3248n0.E0(bVar2.f3248n0.P());
        }
        if (bVar.f3248n0.M() != bVar3) {
            bVar.f3248n0.h0(bVar2.f3248n0.v());
        }
        bVar2.f3248n0.D0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f3389f == -1 && !isInEditMode()) {
            setVisibility(this.f3391p);
        }
        View findViewById = constraintLayout.findViewById(this.f3389f);
        this.f3390m = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f3224b0 = true;
            this.f3390m.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f3390m;
    }

    public int getEmptyVisibility() {
        return this.f3391p;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f3389f == i10) {
            return;
        }
        View view = this.f3390m;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f3390m.getLayoutParams()).f3224b0 = false;
            this.f3390m = null;
        }
        this.f3389f = i10;
        if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i10) {
        this.f3391p = i10;
    }
}
