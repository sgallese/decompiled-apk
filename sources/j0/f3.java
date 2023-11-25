package j0;

import java.util.ArrayList;

/* compiled from: Stack.kt */
/* loaded from: classes.dex */
public final class f3<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<T> f18635a = new ArrayList<>();

    public final void a() {
        this.f18635a.clear();
    }

    public final int b() {
        return this.f18635a.size();
    }

    public final boolean c() {
        return this.f18635a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final T e() {
        return this.f18635a.get(b() - 1);
    }

    public final T f(int i10) {
        return this.f18635a.get(i10);
    }

    public final T g() {
        return this.f18635a.remove(b() - 1);
    }

    public final boolean h(T t10) {
        return this.f18635a.add(t10);
    }

    public final T[] i() {
        int size = this.f18635a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = this.f18635a.get(i10);
        }
        return tArr;
    }
}
