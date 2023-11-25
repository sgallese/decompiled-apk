package ec;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.kt */
/* loaded from: classes4.dex */
public abstract class b<T> implements Iterator<T>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private x0 f14159f = x0.NotReady;

    /* renamed from: m  reason: collision with root package name */
    private T f14160m;

    /* compiled from: AbstractIterator.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14161a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14161a = iArr;
        }
    }

    private final boolean e() {
        this.f14159f = x0.Failed;
        a();
        if (this.f14159f == x0.Ready) {
            return true;
        }
        return false;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.f14159f = x0.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(T t10) {
        this.f14160m = t10;
        this.f14159f = x0.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z10;
        x0 x0Var = this.f14159f;
        if (x0Var != x0.Failed) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = a.f14161a[x0Var.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 != 2) {
                return e();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f14159f = x0.NotReady;
            return this.f14160m;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
