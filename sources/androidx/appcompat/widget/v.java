package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBar.java */
/* loaded from: classes.dex */
public class v extends SeekBar {

    /* renamed from: f  reason: collision with root package name */
    private final w f1688f;

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.M);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1688f.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1688f.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1688f.g(canvas);
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b1.a(this, getContext());
        w wVar = new w(this);
        this.f1688f = wVar;
        wVar.c(attributeSet, i10);
    }
}
