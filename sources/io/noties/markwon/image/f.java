package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

/* compiled from: AsyncDrawableScheduler.java */
/* loaded from: classes4.dex */
public abstract class f {

    /* compiled from: AsyncDrawableScheduler.java */
    /* loaded from: classes4.dex */
    private static class b implements Drawable.Callback {

        /* renamed from: f  reason: collision with root package name */
        private final TextView f17208f;

        /* renamed from: m  reason: collision with root package name */
        private final InterfaceC0409b f17209m;

        /* renamed from: p  reason: collision with root package name */
        private Rect f17210p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncDrawableScheduler.java */
        /* loaded from: classes4.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Drawable f17211f;

            a(Drawable drawable) {
                this.f17211f = drawable;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.invalidateDrawable(this.f17211f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncDrawableScheduler.java */
        /* renamed from: io.noties.markwon.image.f$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public interface InterfaceC0409b {
            void invalidate();
        }

        b(TextView textView, InterfaceC0409b interfaceC0409b, Rect rect) {
            this.f17208f = textView;
            this.f17209m = interfaceC0409b;
            this.f17210p = new Rect(rect);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f17208f.post(new a(drawable));
                return;
            }
            Rect bounds = drawable.getBounds();
            if (!this.f17210p.equals(bounds)) {
                this.f17209m.invalidate();
                this.f17210p = new Rect(bounds);
                return;
            }
            this.f17208f.postInvalidate();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            this.f17208f.postDelayed(runnable, j10 - SystemClock.uptimeMillis());
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f17208f.removeCallbacks(runnable);
        }
    }

    /* compiled from: AsyncDrawableScheduler.java */
    /* loaded from: classes4.dex */
    private static class c implements b.InterfaceC0409b, Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final TextView f17213f;

        c(TextView textView) {
            this.f17213f = textView;
        }

        @Override // io.noties.markwon.image.f.b.InterfaceC0409b
        public void invalidate() {
            this.f17213f.removeCallbacks(this);
            this.f17213f.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.f17213f;
            textView.setText(textView.getText());
        }
    }

    private static g[] a(TextView textView) {
        int i10;
        CharSequence text = textView.getText();
        if (text != null) {
            i10 = text.length();
        } else {
            i10 = 0;
        }
        if (i10 != 0 && (text instanceof Spanned)) {
            return (g[]) ((Spanned) text).getSpans(0, i10, g.class);
        }
        return null;
    }

    public static void b(TextView textView) {
        int i10 = cb.p.f8939b;
        Integer num = (Integer) textView.getTag(i10);
        int hashCode = textView.getText().hashCode();
        if (num != null && num.intValue() == hashCode) {
            return;
        }
        textView.setTag(i10, Integer.valueOf(hashCode));
        g[] a10 = a(textView);
        if (a10 != null && a10.length > 0) {
            int i11 = cb.p.f8938a;
            if (textView.getTag(i11) == null) {
                View.OnAttachStateChangeListener aVar = new a(textView);
                textView.addOnAttachStateChangeListener(aVar);
                textView.setTag(i11, aVar);
            }
            c cVar = new c(textView);
            for (g gVar : a10) {
                io.noties.markwon.image.a a11 = gVar.a();
                a11.l(new b(textView, cVar, a11.getBounds()));
            }
        }
    }

    public static void c(TextView textView) {
        int i10 = cb.p.f8939b;
        if (textView.getTag(i10) == null) {
            return;
        }
        textView.setTag(i10, null);
        g[] a10 = a(textView);
        if (a10 != null && a10.length > 0) {
            for (g gVar : a10) {
                gVar.a().l(null);
            }
        }
    }

    /* compiled from: AsyncDrawableScheduler.java */
    /* loaded from: classes4.dex */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TextView f17207f;

        a(TextView textView) {
            this.f17207f = textView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            f.c(this.f17207f);
            view.removeOnAttachStateChangeListener(this);
            view.setTag(cb.p.f8938a, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
