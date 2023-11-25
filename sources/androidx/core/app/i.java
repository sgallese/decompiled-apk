package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FrameMetricsAggregator.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final b f3648a;

    /* compiled from: FrameMetricsAggregator.java */
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private static HandlerThread f3649e;

        /* renamed from: f  reason: collision with root package name */
        private static Handler f3650f;

        /* renamed from: a  reason: collision with root package name */
        int f3651a;

        /* renamed from: b  reason: collision with root package name */
        SparseIntArray[] f3652b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f3653c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f3654d = new WindowOnFrameMetricsAvailableListenerC0064a();

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: androidx.core.app.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class WindowOnFrameMetricsAvailableListenerC0064a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0064a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f3651a & 1) != 0) {
                    aVar.e(aVar.f3652b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f3651a & 2) != 0) {
                    aVar2.e(aVar2.f3652b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f3651a & 4) != 0) {
                    aVar3.e(aVar3.f3652b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f3651a & 8) != 0) {
                    aVar4.e(aVar4.f3652b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f3651a & 16) != 0) {
                    aVar5.e(aVar5.f3652b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f3651a & 64) != 0) {
                    aVar6.e(aVar6.f3652b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f3651a & 32) != 0) {
                    aVar7.e(aVar7.f3652b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f3651a & 128) != 0) {
                    aVar8.e(aVar8.f3652b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f3651a & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    aVar9.e(aVar9.f3652b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f3651a = i10;
        }

        @Override // androidx.core.app.i.b
        public void a(Activity activity) {
            if (f3649e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f3649e = handlerThread;
                handlerThread.start();
                f3650f = new Handler(f3649e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f3652b;
                if (sparseIntArrayArr[i10] == null && (this.f3651a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f3654d, f3650f);
            this.f3653c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] b() {
            return this.f3652b;
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f3653c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f3653c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3654d);
            return this.f3652b;
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f3652b;
            this.f3652b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    public i() {
        this(1);
    }

    public void a(Activity activity) {
        this.f3648a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f3648a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f3648a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f3648a.d();
    }

    public i(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3648a = new a(i10);
        } else {
            this.f3648a = new b();
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    /* loaded from: classes.dex */
    private static class b {
        b() {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public void a(Activity activity) {
        }
    }
}
