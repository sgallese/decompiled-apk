package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* compiled from: AppCompatRatingBar.java */
/* loaded from: classes.dex */
public class t extends RatingBar {

    /* renamed from: f  reason: collision with root package name */
    private final r f1687f;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.K);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap b10 = this.f1687f.b();
        if (b10 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b10.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b1.a(this, getContext());
        r rVar = new r(this);
        this.f1687f = rVar;
        rVar.c(attributeSet, i10);
    }
}
