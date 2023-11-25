package l4;

import android.content.Context;
import androidx.work.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f19530f = l.f("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    protected final p4.a f19531a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f19532b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f19533c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<j4.a<T>> f19534d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    T f19535e;

    /* compiled from: ConstraintTracker.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f19536f;

        a(List list) {
            this.f19536f = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f19536f.iterator();
            while (it.hasNext()) {
                ((j4.a) it.next()).a(d.this.f19535e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, p4.a aVar) {
        this.f19532b = context.getApplicationContext();
        this.f19531a = aVar;
    }

    public void a(j4.a<T> aVar) {
        synchronized (this.f19533c) {
            if (this.f19534d.add(aVar)) {
                if (this.f19534d.size() == 1) {
                    this.f19535e = b();
                    l.c().a(f19530f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f19535e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f19535e);
            }
        }
    }

    public abstract T b();

    public void c(j4.a<T> aVar) {
        synchronized (this.f19533c) {
            if (this.f19534d.remove(aVar) && this.f19534d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t10) {
        synchronized (this.f19533c) {
            T t11 = this.f19535e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f19535e = t10;
                this.f19531a.a().execute(new a(new ArrayList(this.f19534d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
