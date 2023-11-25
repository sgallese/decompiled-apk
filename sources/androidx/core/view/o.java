package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: GestureDetectorCompat.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final a f4175a;

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    interface a {
        boolean a(MotionEvent motionEvent);
    }

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final GestureDetector f4176a;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f4176a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.o.a
        public boolean a(MotionEvent motionEvent) {
            return this.f4176a.onTouchEvent(motionEvent);
        }
    }

    public o(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f4175a.a(motionEvent);
    }

    public o(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f4175a = new b(context, onGestureListener, handler);
    }
}
