package k1;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionEventAdapter.android.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private long f19198a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseLongArray f19199b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f19200c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    private final List<f0> f19201d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f19202e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f19203f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.f19199b.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.f19199b;
                    long j10 = this.f19198a;
                    this.f19198a = 1 + j10;
                    sparseLongArray.put(pointerId, j10);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f19199b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f19199b;
            long j11 = this.f19198a;
            this.f19198a = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f19200c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType != this.f19202e || source != this.f19203f) {
            this.f19202e = toolType;
            this.f19203f = source;
            this.f19200c.clear();
            this.f19199b.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final k1.f0 d(k1.r0 r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.k.d(k1.r0, android.view.MotionEvent, int, boolean):k1.f0");
    }

    private final long f(int i10) {
        long j10;
        int indexOfKey = this.f19199b.indexOfKey(i10);
        if (indexOfKey >= 0) {
            j10 = this.f19199b.valueAt(indexOfKey);
        } else {
            j10 = this.f19198a;
            this.f19198a = 1 + j10;
            this.f19199b.put(i10, j10);
        }
        return b0.b(j10);
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f19200c.get(pointerId, false)) {
                this.f19199b.delete(pointerId);
                this.f19200c.delete(pointerId);
            }
        }
        if (this.f19199b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f19199b.size() - 1; -1 < size; size--) {
                int keyAt = this.f19199b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.f19199b.removeAt(size);
                    this.f19200c.delete(keyAt);
                }
            }
        }
    }

    public final e0 c(MotionEvent motionEvent, r0 r0Var) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        qc.q.i(motionEvent, "motionEvent");
        qc.q.i(r0Var, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f19199b.clear();
            this.f19200c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        if (actionMasked != 10 && actionMasked != 7 && actionMasked != 9) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (actionMasked == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            this.f19200c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                i10 = -1;
            } else {
                i10 = motionEvent.getActionIndex();
            }
        } else {
            i10 = 0;
        }
        this.f19201d.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            List<f0> list = this.f19201d;
            if (!z10 && i11 != i10 && (!z11 || motionEvent.getButtonState() != 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
            list.add(d(r0Var, motionEvent, i11, z12));
        }
        h(motionEvent);
        return new e0(motionEvent.getEventTime(), this.f19201d, motionEvent);
    }

    public final void e(int i10) {
        this.f19200c.delete(i10);
        this.f19199b.delete(i10);
    }
}
